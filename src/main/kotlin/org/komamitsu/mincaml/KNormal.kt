package org.komamitsu.mincaml

import java.lang.IllegalStateException
import java.lang.RuntimeException


data class FunDef(val name: IdWithType, val args: List<IdWithType>, val body: KNormal)

sealed class KNormal {
    object Unit : KNormal()
    data class Int(val value: kotlin.Int) : KNormal()
    data class Float(val value: kotlin.Float) : KNormal()
    data class Neg(val id: Id) : KNormal()
    data class Add(val left: Id, val right: Id) : KNormal()
    data class Sub(val left: Id, val right: Id) : KNormal()
    data class FNeg(val id: Id) : KNormal()
    data class FAdd(val left: Id, val right: Id) : KNormal()
    data class FSub(val left: Id, val right: Id) : KNormal()
    data class FMul(val left: Id, val right: Id) : KNormal()
    data class FDiv(val left: Id, val right: Id) : KNormal()
    data class IfEq(val left: Id, val right: Id, val trueExpr: KNormal, val falseExpr: KNormal) : KNormal()
    data class IfLE(val left: Id, val right: Id, val trueExpr: KNormal, val falseExpr: KNormal) : KNormal()
    data class Let(val idWithType: IdWithType, val expr0: KNormal, val expr1: KNormal) : KNormal()
    data class Var(val id: Id) : KNormal()
    data class LetRec(val funDef: FunDef, val expr: KNormal) : KNormal()
    data class App(val id: Id, val args: List<Id>) : KNormal()
    data class Tuple(val idList: List<Id>) : KNormal()
    data class LetTuple(val idWithTypeList: List<IdWithType>, val id: Id, val body: KNormal) : KNormal()
    data class Get(val id: Id, val pos: Id) : KNormal()
    data class Put(val id: Id, val pos: Id, val value: Id) : KNormal()
    data class ExtArray(val id: Id) : KNormal()
    data class ExtFunApp(val id: Id, val args: List<Id>) : KNormal()

    companion object {
        private fun insertLet(
            kNormAndType: Pair<KNormal, Type>,
            k: (Id) -> Pair<KNormal, Type>
        ): Pair<KNormal, Type> {

            val kNormal = kNormAndType.first
            return when (kNormal) {
                is Var -> k(kNormal.id)
                else -> {
                    val type = kNormAndType.second
                    val id = Id.gentmp(type)
                    val (result, resultType) = k(id)
                    Pair(Let(IdWithType(id, type), kNormal, result), resultType)
                }
            }
        }

        fun conv(env: Env, s: Syntax): Pair<KNormal, Type> {
            return when (s) {
                is Syntax.Unit -> Pair(Unit, Type.Primitive.Unit)
                is Syntax.Bool -> Pair(Int(if (s.isValue) 1 else 0), Type.Primitive.Int)
                is Syntax.Int-> Pair(Int(s.value), Type.Primitive.Int)
                is Syntax.Float -> Pair(Float(s.value), Type.Primitive.Float)
                is Syntax.Not -> conv(env, Syntax.If(s, Syntax.Bool(false), Syntax.Bool(true)))
                is Syntax.Neg -> insertLet(conv(env, s)) { k ->
                    Pair(Neg(k), Type.Primitive.Int)
                }
                is Syntax.Add -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(Add(l, r), Type.Primitive.Int)
                    }
                }
                is Syntax.Sub -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(Sub(l, r), Type.Primitive.Int)
                    }
                }
                is Syntax.FNeg -> insertLet(conv(env, s)) { k ->
                    Pair(FNeg(k), Type.Primitive.Float)
                }
                is Syntax.FAdd -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(FAdd(l, r), Type.Primitive.Float)
                    }
                }
                is Syntax.FSub -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(FSub(l, r), Type.Primitive.Float)
                    }
                }
                is Syntax.FMul -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(FMul(l, r), Type.Primitive.Float)
                    }
                }
                is Syntax.FDiv -> insertLet(conv(env, s.left)) { l ->
                    insertLet(conv(env, s.right)) { r ->
                        Pair(FDiv(l, r), Type.Primitive.Float)
                    }
                }
                is Syntax.Eq, is Syntax.LE -> conv(env, Syntax.If(s, Syntax.Bool(true), Syntax.Bool(false)))
                is Syntax.If -> when (s.cond) {
                    is Syntax.Not -> conv(env, Syntax.If(s.cond, s.falseExpr, s.trueExpr))
                    is Syntax.Eq -> insertLet(conv(env, s.cond.left)) { l ->
                        insertLet(conv(env, s.cond.right)) { r ->
                            val (trueExpr, t) = conv(env, s.trueExpr)
                            val (falseExpr, _) = conv(env, s.falseExpr)
                            Pair(IfEq(l, r, trueExpr, falseExpr), t)
                        }
                    }
                    is Syntax.LE -> insertLet(conv(env, s.cond.left)) { l ->
                        insertLet(conv(env, s.cond.right)) { r ->
                            val (trueExpr, t) = conv(env, s.trueExpr)
                            val (falseExpr, _) = conv(env, s.falseExpr)
                            Pair(IfLE(l, r, trueExpr, falseExpr), t)
                        }
                    }
                    else -> conv(env, Syntax.If(Syntax.Eq(s.cond, Syntax.Bool(false)), s.falseExpr, s.trueExpr))
                }
                is Syntax.Let -> {
                    val (e0, _) = conv(env, s.expr0)
                    env[s.idWithType.id] = s.idWithType.type
                    val (e1, t1) = conv(env, s.expr1)
                    Pair(Let(s.idWithType, e0, e1), t1)
                }
                is Syntax.Var -> {
                    if (env.contains(s.id)) {
                        Pair(Var(s.id), env[s.id]!!)
                    }
                    else if (env.ext.contains(s.id)) {
                        when (val t = env.ext[s.id]!!) {
                            is Type.Array -> Pair(ExtArray(s.id), t)
                            else -> throw IllegalStateException("External variable ${s.id} does not have an array type")
                        }
                    }
                }
                is Syntax.LetRec -> {
                    env[s.funDef.idWithType.id] = s.funDef.idWithType.type
                    val (e1, t1) = conv(env, s.expr)
                    env.addList(s.funDef.args)
                    val (e0, _) = conv(env, s.funDef.body)
                    Pair(LetRec(FunDef(IdWithType(s.funDef.idWithType.id, s.funDef.idWithType.type), s.funDef.args, e0), e1), t1)
                }
                is Syntax.App -> {
                    when {
                        s.expr is Syntax.Var && !env.contains(s.expr.id) -> {
                            when (val t = env.ext[s.expr.id]) {
                                is Type.Fun -> {
                                    fun bind(acc: List<Id>, xs: List<Syntax>): Pair<KNormal, Type> {
                                        when {
                                            xs.isEmpty() -> Pair(ExtFunApp(s.expr.id, acc), t)
                                            else -> {
                                                insertLet(conv(env, xs.first())) { id ->
                                                    bind(acc + id, xs.takeLast(xs.size - 1))
                                                }
                                            }

                                        }
                                    }
                                    bind(listOf(), s.args)
                                }
                            }
                        }
                        else -> throw RuntimeException("Not implemented yet")
                    }
                }
                else -> throw RuntimeException("Not implemented yet")
            }
        }
    }
}
