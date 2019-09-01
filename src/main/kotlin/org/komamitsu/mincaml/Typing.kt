package org.komamitsu.mincaml

import org.slf4j.LoggerFactory

import java.util.HashMap
import java.util.concurrent.atomic.AtomicReference
import java.util.stream.Collectors

class Typing internal constructor(syntax: Syntax) {
    companion object {
        private val LOGGER = LoggerFactory.getLogger(Typing::class.java)
    }
    private val extenv = Env()
    private val syntax: Syntax

    init {
        unify(Type.Primitive.Unit, infer(Env(), syntax))
        extenv.updateValue(this::derefType)
        this.syntax = derefTerm(syntax)
    }

    private class Env : HashMap<Id, Type>() {
        internal fun addList(xs: List<IdWithType>): Env {
            for (x in xs) {
                put(x.id, x.type)
            }
            return this
        }

        internal fun updateValue(f: (Type) -> Type) {
            for (entry in entries) {
                put(entry.key, f(entry.value))
            }
        }
    }

    private fun derefType(t: Type): Type {
        return when (t) {
            is Type.Fun -> {
                Type.Fun(
                    t.args.stream()
                        .map(this::derefType)
                        .collect(Collectors.toList()),
                    derefType(t.result)
                )
            }
            is Type.Tuple -> {
                Type.Tuple(
                    t.types.stream()
                        .map(this::derefType)
                        .collect(Collectors.toList())
                )
            }
            is Type.Array -> {
                Type.Array(t.type)
            }
            is Type.Var -> {
                val type = t.type
                if (type == null) {
                    LOGGER.warn("Uninstantiated type variable detected; assuming Int")
                    t.type = Type.Primitive.Int
                    Type.Primitive.Int
                } else {
                    val newType = derefType(type)
                    t.type = newType
                    newType
                }
            }
            else -> t
        }
    }

    private fun derefTerm(s: Syntax): Syntax {
        return when (s) {
            is Syntax.Not -> {
                Syntax.Not(derefTerm(s))
            }
            is Syntax.Neg -> {
                Syntax.Neg(derefTerm(s))
            }
            is Syntax.Add -> {
                Syntax.Add(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.Sub -> {
                Syntax.Sub(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.Eq -> {
                Syntax.Eq(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.LE -> {
                Syntax.LE(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.FNeg -> {
                Syntax.FNeg(derefTerm(s))
            }
            is Syntax.FAdd -> {
                Syntax.FAdd(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.FSub -> {
                Syntax.FSub(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.FMul -> {
                Syntax.FMul(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.FDiv -> {
                Syntax.FDiv(derefTerm(s.left), derefTerm(s.right))
            }
            is Syntax.If -> {
                Syntax.If(
                    derefTerm(s.cond),
                    derefTerm(s.trueExpr),
                    derefTerm(s.falseExpr)
                )
            }
            is Syntax.Let -> {
                Syntax.Let(
                    derefIdWithType(s.idWithType),
                    derefTerm(s.expr0),
                    derefTerm(s.expr1)
                )
            }
            is Syntax.LetRec -> {
                val funDef = s.funDef
                Syntax.LetRec(
                    Syntax.FunDef(
                        derefIdWithType(funDef.idWithType),
                        funDef.args.stream()
                            .map(this::derefIdWithType)
                            .collect(Collectors.toList()),
                        derefTerm(funDef.body)
                    ),
                    derefTerm(s.expr)
                )
            }
            is Syntax.App -> {
                Syntax.App(
                    derefTerm(s.expr),
                    s.args.stream()
                        .map(this::derefTerm)
                        .collect(Collectors.toList())
                )
            }
            is Syntax.Tuple -> {
                Syntax.Tuple(
                    s.syntaxList.stream()
                        .map(this::derefTerm)
                        .collect(Collectors.toList())
                )
            }
            is Syntax.LetTuple -> {
                Syntax.LetTuple(
                    s.idWithTypeList.stream()
                        .map(this::derefIdWithType)
                        .collect(Collectors.toList()),
                    derefTerm(s.expr0),
                    derefTerm(s.expr1)
                )
            }
            is Syntax.Array -> {
                Syntax.Array(derefTerm(s.number), derefTerm(s.value))
            }
            is Syntax.Get -> {
                Syntax.Get(derefTerm(s.array), derefTerm(s.pos))
            }
            is Syntax.Put -> {
                Syntax.Put(
                    derefTerm(s.array),
                    derefTerm(s.pos),
                    derefTerm(s.value)
                )
            }
            else -> s
        }
    }

    private fun derefIdWithType(idWithType: IdWithType): IdWithType {
        return IdWithType(idWithType.id, derefType(idWithType.type))
    }

    private fun occur(r: AtomicReference<Type>, t: Type): Boolean {
        return when (t) {
            is Type.Fun -> {
                t.args.stream().anyMatch { occur(r, it) } || occur(r, t.result)
            }
            is Type.Tuple -> {
                t.types.stream().anyMatch { occur(r, it) }
            }
            is Type.Array -> {
                occur(r, t.type)
            }
            is Type.Var -> {
                when {
                    t.typeContainer === r -> true
                    t.type == null -> false
                    else -> occur(r, t.type!!)
                }
            }
            else -> return false
        }
    }

    private fun unifyList(t1: List<Type>, t2: List<Type>) {
        require(t1.size == t2.size) { "The types of lists don't match: t1=$t1, t2=$t2" }

        for (i in t1.indices) {
            unify(t1[i], t2[i])
        }
    }

    private fun unify(t1: Type, t2: Type) {
        when {
            t1 is Type.Primitive && t2 is Type.Primitive && t1 == t2 -> {
                // Valid
            }
            t1 is Type.Fun && t2 is Type.Fun -> {
                unifyList(t1.args, t2.args)
                unify(t1.result, t2.result)
            }
            t1 is Type.Tuple && t2 is Type.Tuple -> {
                unifyList(t1.types, t2.types)
            }
            t1 is Type.Array && t2 is Type.Array -> {
                unify(t1.type, t2.type)
            }
            t1 is Type.Var && t2 is Type.Var
                // Var's typeContainer is distinguished by its identity
                && t1.typeContainer === t2.typeContainer -> {
                // Valid
            }
            t1 is Type.Var && t1.type != null -> {
                unify(t1.type!!, t2)
            }
            t2 is Type.Var && t2.type != null -> {
                unify(t1, t2.type!!)
            }
            t1 is Type.Var && t1.type == null -> {
                val typeOfT1 = t1.typeContainer
                require(!occur(typeOfT1, t2)) { "Failed to unify. t1=$t1, t2=$t2" }
                typeOfT1.set(t2)
            }
            t2 is Type.Var && t2.type == null -> {
                val typeOfT2 = t2.typeContainer
                require(!occur(typeOfT2, t1)) { "Failed to unify. t1=$t1, t2=$t2" }
                typeOfT2.set(t1)
            }
            else -> throw IllegalArgumentException("Unification error. t1=$t1, t2=$t2")
        }
    }

    private fun infer(env: Env, s: Syntax): Type {
        return when (s) {
            is Syntax.Unit -> {
                Type.Primitive.Unit
            }
            is Syntax.Bool -> {
                Type.Primitive.Bool
            }
            is Syntax.Int -> {
                Type.Primitive.Int
            }
            is Syntax.Float -> {
                Type.Primitive.Float
            }
            is Syntax.Not -> {
                infer(env, s.value)
            }
            is Syntax.Neg -> {
                infer(env, s.value)
            }
            is Syntax.Add -> {
                val type = Type.Primitive.Int
                unify(type, infer(env, s.left))
                unify(type, infer(env, s.right))
                type
            }
            is Syntax.FNeg -> {
                infer(env, s.value)
            }
            is Syntax.FAdd -> {
                val type = Type.Primitive.Float
                unify(type, infer(env, s.left))
                unify(type, infer(env, s.right))
                type
            }
            is Syntax.Eq -> {
                unify(
                    infer(env, s.left),
                    infer(env, s.right)
                )
                Type.Primitive.Bool
            }
            is Syntax.If -> {
                unify(Type.Primitive.Bool, infer(env, s.cond))
                val inferredTrueExpr = infer(env, s.trueExpr)
                val inferredFalseExpr = infer(env, s.falseExpr)
                unify(inferredTrueExpr, inferredFalseExpr)
                inferredTrueExpr
            }
            is Syntax.Let -> {
                val idWithType = s.idWithType
                val type = idWithType.type
                unify(type, infer(env, s.expr0))
                env[idWithType.id] = type
                infer(env, s.expr1)
            }
            is Syntax.Var -> {
                if (env.containsKey(s.id)) {
                    return env[s.id]!!
                }
                if (extenv.containsKey(s.id)) {
                    return extenv[s.id]!!
                }
                LOGGER.warn(
                    String.format("Free variable %s assumed as external.", s.id)
                )
                val t = Type.Var()
                extenv[s.id] = t
                t
            }
            is Syntax.LetRec -> {
                val f = s.funDef
                val idWithType = f.idWithType
                // Should make env immutable?
                env[idWithType.id] = idWithType.type

                unify(
                    idWithType.type,
                    Type.Fun(
                        f.args.stream()
                            .map(IdWithType::type)
                            .collect(Collectors.toList()),
                        infer(env.addList(f.args), f.body)
                    )
                )
                infer(env, s.expr)
            }
            is Syntax.App -> {
                val t = Type.Var()
                unify(
                    infer(env, s.expr),
                    Type.Fun(
                        s.args.stream()
                            .map { infer(env, it) }
                            .collect(Collectors.toList()), t
                    )
                )
                t
            }
            is Syntax.Tuple -> {
                Type.Tuple(
                    s.syntaxList.stream()
                        .map { infer(env, it) }
                        .collect(Collectors.toList())
                )
            }
            is Syntax.LetTuple -> {
                unify(
                    Type.Tuple(
                        s.idWithTypeList.stream()
                            .map(IdWithType::type)
                            .collect(Collectors.toList())
                    ),
                    infer(env, s.expr0)
                )
                infer(env.addList(s.idWithTypeList), s.expr1)
            }
            is Syntax.Array -> {
                unify(infer(env, s.number), Type.Primitive.Int)
                Type.Array(infer(env, s.value))
            }
            is Syntax.Get -> {
                val t = Type.Var()
                unify(infer(env, s.array), Type.Array(t))
                unify(infer(env, s.pos), Type.Primitive.Int)
                t
            }
            is Syntax.Put -> {
                val t = infer(env, s.value)
                unify(infer(env, s.array), Type.Array(t))
                unify(infer(env, s.pos), Type.Primitive.Int)
                Type.Primitive.Unit
            }
            else -> throw IllegalArgumentException("Shouldn't reach here. env=$env, syntax=$s")
        }
    }

    override fun toString(): String {
        return "Typing(extenv=$extenv, syntax=$syntax)"
    }
}
