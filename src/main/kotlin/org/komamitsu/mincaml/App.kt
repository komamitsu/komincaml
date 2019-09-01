package org.komamitsu.mincaml

import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.atn.ATNConfigSet
import org.antlr.v4.runtime.dfa.DFA
import java.util.BitSet

fun main() {
    val s = "let rec f x y = x + y in f 4 2"

    val antlrIn = ANTLRInputStream(s.byteInputStream())
    val lexer = MinCamlLexer(antlrIn)
    val commonTokenStream = CommonTokenStream(lexer)
    val parser = MinCamlParser(commonTokenStream)
    parser.addErrorListener(ErrorListener())
    val root = parser.exp().accept(SyntaxVisitor())

    println(Typing(root))
}

private class ErrorListener : ANTLRErrorListener {
    override fun syntaxError(
        recognizer: Recognizer<*, *>,
        offendingSymbol: Any,
        line: Int,
        charPositionInLine: Int,
        msg: String,
        e: RecognitionException) {

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
        configs: ATNConfigSet) {}

    override fun reportAttemptingFullContext(
        recognizer: Parser,
        dfa: DFA,
        startIndex: Int,
        stopIndex: Int,
        conflictingAlts: BitSet,
        configs: ATNConfigSet) {}

    override fun reportContextSensitivity(
        recognizer: Parser,
        dfa: DFA,
        startIndex: Int,
        stopIndex: Int,
        prediction: Int,
        configs: ATNConfigSet) {}
}
