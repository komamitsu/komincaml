package org.komamitsu.mincaml

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleFile
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.dsl.ReportPolymorphism
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.frame.VirtualFrame
import com.oracle.truffle.api.instrumentation.InstrumentableNode
import com.oracle.truffle.api.instrumentation.ProbeNode
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import com.oracle.truffle.api.interop.TruffleObject
import com.oracle.truffle.api.nodes.Node
import com.oracle.truffle.api.nodes.NodeInfo
import com.oracle.truffle.api.nodes.RootNode
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.nio.charset.Charset

import java.util.BitSet

class KMCContext(KMCLanguage: KMCLanguage, env: TruffleLanguage.Env)

class MinCamlFileDetector : TruffleFile.FileTypeDetector {
    override fun findMimeType(file: TruffleFile): String? {
        return null
    }

    override fun findEncoding(file: TruffleFile): Charset? {
        return null
    }
}

@NodeInfo(language = "MinCaml", description = "The abstract base node for all MinCaml statements")
//@GenerateWrapper
@ReportPolymorphism
abstract class KMCNode : Node(), InstrumentableNode {
    abstract fun executeGeneric(frame: VirtualFrame): Any
}

class KMCDummyNode : KMCNode(), InstrumentableNode {
    override fun isInstrumentable(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun createWrapper(probe: ProbeNode?): InstrumentableNode.WrapperNode {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun executeGeneric(frame: VirtualFrame): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

@NodeInfo(language = "MinCaml", description = "The root of all MinCaml execution trees")
class KMCRootNode(
    language: KMCLanguage,
    frameDescriptor: FrameDescriptor,
    /** The function body that is executed, and specialized during execution.  */
    @field:Child private val bodyNode: KMCNode
) : RootNode(language, frameDescriptor) {

    override fun execute(frame: VirtualFrame): Any {
        assert(lookupContextReference(KMCLanguage::class.java!!).get() != null)
        return bodyNode.executeGeneric(frame)
    }
}

@TruffleLanguage.Registration(
    id = KMCLanguage.ID,
    name = "MinCaml",
    defaultMimeType = KMCLanguage.MIME_TYPE,
    characterMimeTypes = arrayOf(KMCLanguage.MIME_TYPE),
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = arrayOf(MinCamlFileDetector::class)
)
@ProvidedTags(
    StandardTags.CallTag::class,
    StandardTags.StatementTag::class,
    StandardTags.RootTag::class,
    StandardTags.ExpressionTag::class,
    DebuggerTags.AlwaysHalt::class
)
class KMCLanguage : TruffleLanguage<KMCContext>() {
    companion object {
        const val ID = "mincaml"
        const val MIME_TYPE = "application/x-mincaml"
    }

    override fun createContext(env: Env): KMCContext {
        return KMCContext(this, env)
    }

    override fun isObjectOfLanguage(`object`: Any): Boolean {
        return if (`object` !is TruffleObject) {
            false
        } else {
            false
        }
    }

    override fun parse(request: ParsingRequest): CallTarget {
        val source = request.getSource()

        val antlrIn = ANTLRInputStream(source.getInputStream())
        val lexer = MinCamlLexer(antlrIn)
        val commonTokenStream = CommonTokenStream(lexer)
        val parser = MinCamlParser(commonTokenStream)
        parser.addErrorListener(ErrorListener())
//        val root = parser.exp().accept<Any>(MinCamlSyntaxVisitor())
//        val typing = MinCamlTyping(root)
//        val rootNode = MinCamlRootNode(this, FrameDescriptor(), null)
        val rootNode = KMCRootNode(this, FrameDescriptor(), KMCDummyNode())
        return Truffle.getRuntime().createCallTarget(rootNode)
    }

    private class ErrorListener : ANTLRErrorListener {
        override fun syntaxError(
            recognizer: Recognizer<*, *>,
            offendingSymbol: Any,
            line: Int,
            charPositionInLine: Int,
            msg: String,
            e: RecognitionException
        ) {
            throw IllegalStateException(
                String.format(
                    "Syntax error. Line=%d, Position=%d, Message=%s",
                    line, charPositionInLine, msg
                )
            )
        }

        override fun reportAmbiguity(
            recognizer: Parser,
            dfa: DFA,
            startIndex: Int,
            stopIndex: Int,
            exact: Boolean,
            ambigAlts: BitSet,
            configs: ATNConfigSet
        ) {
        }

        override fun reportAttemptingFullContext(
            recognizer: Parser,
            dfa: DFA,
            startIndex: Int,
            stopIndex: Int,
            conflictingAlts: BitSet,
            configs: ATNConfigSet
        ) {
        }

        override fun reportContextSensitivity(
            recognizer: Parser,
            dfa: DFA,
            startIndex: Int,
            stopIndex: Int,
            prediction: Int,
            configs: ATNConfigSet
        ) {
        }
    }

}
