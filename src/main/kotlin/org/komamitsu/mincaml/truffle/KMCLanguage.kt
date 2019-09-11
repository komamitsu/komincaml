package org.komamitsu.mincaml.truffle

import com.oracle.truffle.api.CallTarget
import com.oracle.truffle.api.Truffle
import com.oracle.truffle.api.TruffleLanguage
import com.oracle.truffle.api.debug.DebuggerTags
import com.oracle.truffle.api.frame.FrameDescriptor
import com.oracle.truffle.api.instrumentation.ProvidedTags
import com.oracle.truffle.api.instrumentation.StandardTags
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import org.komamitsu.mincaml.MinCamlLexer
import org.komamitsu.mincaml.MinCamlParser
import java.util.BitSet


@TruffleLanguage.Registration(
    id = KMCLanguage.ID,
    name = "MinCaml",
    defaultMimeType = KMCLanguage.MIME_TYPE,
    characterMimeTypes = arrayOf(KMCLanguage.MIME_TYPE),
    contextPolicy = TruffleLanguage.ContextPolicy.SHARED,
    fileTypeDetectors = arrayOf(KMCFileDetector::class)
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

    override fun isObjectOfLanguage(obj: Any): Boolean {
        return false
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
        val rootNode = KMCRootNode(
            this,
            FrameDescriptor(),
            KMCAddNodeFactory.create(KMCNodeInteger(42), KMCNodeInteger(57))
        )
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
