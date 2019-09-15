package org.komamitsu.mincaml.truffle

import java.util.logging.Level

import com.oracle.truffle.api.Assumption
import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.RootCallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLogger
import com.oracle.truffle.api.dsl.Cached
import com.oracle.truffle.api.dsl.Specialization
import com.oracle.truffle.api.interop.InteropLibrary
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.library.ExportLibrary
import com.oracle.truffle.api.library.ExportMessage
import com.oracle.truffle.api.nodes.DirectCallNode
import com.oracle.truffle.api.nodes.IndirectCallNode
import com.oracle.truffle.api.source.SourceSection
import com.oracle.truffle.api.utilities.CyclicAssumption

@ExportLibrary(InteropLibrary::class)
class KMCFunction(
    language: KMCLanguage,
    val name: String
) : TruffleObject {

    /** The current implementation of this function.  */
    internal var callTarget: RootCallTarget? = null

    /**
     * Manages the assumption that the [.callTarget] is stable. We use the utility class
     * [CyclicAssumption], which automatically creates a new [Assumption] when the old
     * one gets invalidated.
     */
    private val callTargetStable: CyclicAssumption

    /**
     * [KMCFunction] instances are always visible as executable to other languages.
     */
    val declaredLocation: SourceSection
        get() = getCallTarget()!!.rootNode.sourceSection

    /**
     * [KMCFunction] instances are always visible as executable to other languages.
     */
    internal val isExecutable: Boolean
        @ExportMessage
        get() = true

    init {
        this.callTarget = Truffle.getRuntime().createCallTarget(KMCUndefinedFunctionRootNode(language, name))
        this.callTargetStable = CyclicAssumption(name)
    }

    fun setCallTarget(callTarget: RootCallTarget) {
        this.callTarget = callTarget
        /*
         * We have a new call target. Invalidate all code that speculated that the old call target
         * was stable.
         */
        LOG.log(Level.FINE, "Installed call target for: {0}", name)
        callTargetStable.invalidate()
    }

    fun getCallTarget(): RootCallTarget? {
        return callTarget
    }

    fun getCallTargetStable(): Assumption {
        return callTargetStable.assumption
    }

    /**
     * This method is, e.g., called when using a function literal in a string concatenation. So
     * changing it has an effect on SL programs.
     */
    override fun toString(): String {
        return name
    }

    /**
     * We allow languages to execute this function. We implement the interop execute message that
     * forwards to a function dispatch.
     */
    @ExportMessage
    internal object Execute {
        /**
         * Inline cached specialization of the dispatch.
         *
         *
         *
         * Since SL is a quite simple language, the benefit of the inline cache seems small: after
         * checking that the actual function to be executed is the same as the cachedFuntion, we can
         * safely execute the cached call target. You can reasonably argue that caching the call
         * target is overkill, since we could just retrieve it via `function.getCallTarget()`.
         * However, caching the call target and using a [DirectCallNode] allows Truffle to
         * perform method inlining. In addition, in a more complex language the lookup of the call
         * target is usually much more complicated than in SL.
         *
         *
         *
         *
         * `limit = "INLINE_CACHE_SIZE"` Specifies the limit number of inline cache
         * specialization instantiations.
         *
         *
         *
         * `guards = "function.getCallTarget() == cachedTarget"` The inline cache check. Note
         * that cachedTarget is a final field so that the compiler can optimize the check.
         *
         *
         *
         * `assumptions = "callTargetStable"` Support for function redefinition: When a
         * function is redefined, the call target maintained by the SLFunction object is changed. To
         * avoid a check for that, we use an Assumption that is invalidated by the SLFunction when
         * the change is performed. Since checking an assumption is a no-op in compiled code, the
         * assumption check performed by the DSL does not add any overhead during optimized
         * execution.
         *
         *
         * @see Cached
         *
         * @see Specialization
         *
         *
         * @param function the dynamically provided function
         * @param cachedFunction the cached function of the specialization instance
         * @param callNode the [DirectCallNode] specifically created for the
         * [CallTarget] in cachedFunction.
         */
        @Specialization(
            limit = "INLINE_CACHE_SIZE",
            guards = ["function.getCallTarget() == cachedTarget"],
            assumptions = ["callTargetStable"]
        )//
        //
        fun doDirect(
            function: KMCFunction, arguments: Array<Any>,
            @Cached("function.getCallTargetStable()") callTargetStable: Assumption,
            @Cached("function.getCallTarget()") cachedTarget: RootCallTarget,
            @Cached("create(cachedTarget)") callNode: DirectCallNode
        ): Any {

            /* Inline cache hit, we are safe to execute the cached call target. */
            return callNode.call(*arguments)
        }

        /**
         * Slow-path code for a call, used when the polymorphic inline cache exceeded its maximum
         * size specified in `INLINE_CACHE_SIZE`. Such calls are not optimized any
         * further, e.g., no method inlining is performed.
         */
        @Specialization(replaces = ["doDirect"])
        fun doIndirect(
            function: KMCFunction, arguments: Array<Any>,
            @Cached callNode: IndirectCallNode
        ): Any {
            /*
             * SL has a quite simple call lookup: just ask the function for the current call target,
             * and call it.
             */
            return callNode.call(function.getCallTarget(), *arguments)
        }
    }

    companion object {
        private val LOG = TruffleLogger.getLogger(KMCLanguage.ID, KMCFunction::class.java)
    }
}
