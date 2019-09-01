package org.komamitsu.mincaml


data class FunDef(val name: IdWithType, val args: List<IdWithType>, val body: KNormal)

sealed class KNormal {
    object Unit : KNormal()
    data class Int(val value: kotlin.Int) : KNormal()
    data class Float(val value: kotlin.Float) : KNormal()
    data class Neg(val id: Id) : KNormal()
    data class Add(val left: Id, val right: Id) : KNormal()
    data class Sub(val left: Id, val right: Id) : KNormal()
    data class FNeg(val left: Id, val right: Id) : KNormal()
    data class FAdd(val left: Id, val right: Id) : KNormal()
    data class FSub(val left: Id, val right: Id) : KNormal()
    data class FMul(val left: Id, val right: Id) : KNormal()
    data class FDiv(val left: Id, val right: Id) : KNormal()
    data class IfEq(val left: Id, val right: Id, val trueExpr: KNormal, val falseExpr: KNormal) : KNormal()
    data class IfLE(val left: Id, val right: Id, val trueExpr: KNormal, val falseExpr: KNormal) : KNormal()
    data class Let(val idWithType: IdWithType, val expr0: KNormal, val expr1: KNormal) : KNormal()
    data class Var(val id: Id) : KNormal()
    data class LetRec(val funDef: FunDef) : KNormal()
    data class App(val id: Id, val args: List<Id>) : KNormal()
    data class Tuple(val idList: List<Id>) : KNormal()
    data class LetTuple(val idWithTypeList: List<IdWithType>, val id: Id, val body: KNormal) : KNormal()
    data class Get(val id: Id, val pos: Id) : KNormal()
    data class Put(val id: Id, val pos: Id, val value: Id) : KNormal()
    data class ExtArray(val id: Id) : KNormal()
    data class ExtFunApp(val id: Id, val args: List<Id>) : KNormal()
}
