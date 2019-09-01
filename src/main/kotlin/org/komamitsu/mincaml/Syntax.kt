package org.komamitsu.mincaml

sealed class Syntax {
    data class Add(val left: Syntax, val right: Syntax) : Syntax()

    data class App(val expr: Syntax, val args: List<Syntax>) : Syntax()

    data class Array(val number: Syntax, val value: Syntax) : Syntax()

    data class Bool(val isValue: Boolean) : Syntax()

    data class Eq(val left: Syntax, val right: Syntax) : Syntax()

    data class FAdd(val left: Syntax, val right: Syntax) : Syntax()

    data class FDiv(val left: Syntax, val right: Syntax) : Syntax()

    data class FMul(val left: Syntax, val right: Syntax) : Syntax()

    data class FNeg(val value: Syntax) : Syntax()

    data class FSub(val left: Syntax, val right: Syntax) : Syntax()

    data class Float(val value: kotlin.Float) : Syntax()

    data class FunDef(val idWithType: IdWithType, val args: List<IdWithType>, val body: Syntax) : Syntax()

    // TODO: This should be handled as a function?
    data class Get(val array: Syntax, val pos: Syntax) : Syntax()

    data class If(val cond: Syntax, val trueExpr: Syntax, val falseExpr: Syntax) : Syntax()

    data class Int(val value: kotlin.Int) : Syntax()

    data class LE(val left: Syntax, val right: Syntax) : Syntax()

    data class Let(val idWithType: IdWithType, val expr0: Syntax, val expr1: Syntax) : Syntax()

    data class LetRec(val funDef: FunDef, val expr: Syntax) : Syntax()

    data class LetTuple(val idWithTypeList: List<IdWithType>, val expr0: Syntax, val expr1: Syntax) : Syntax()

    data class Neg(val value: Syntax) : Syntax()

    data class Not(val value: Syntax) : Syntax()

    // TODO: This should be handled as a function?
    data class Put(val array: Syntax, val pos: Syntax, val value: Syntax) : Syntax()

    data class Sub(val left: Syntax, val right: Syntax) : Syntax()

    data class Tuple(val syntaxList: List<Syntax>) : Syntax()

    object Unit : Syntax()

    data class Var(val id: Id) : Syntax()
}
