package org.komamitsu.mincaml

import java.util.stream.Collectors

class SyntaxVisitor : MinCamlParserBaseVisitor<Syntax>() {
    private fun newType(name: String): IdWithType {
        return IdWithType(Id(name), Type.Var())
    }

    override fun visitBool(ctx: MinCamlParser.BoolContext): Syntax {
        return Syntax.Bool(ctx.BOOL().text == "true")
    }

    override fun visitInt(ctx: MinCamlParser.IntContext): Syntax {
        return Syntax.Int(ctx.INT().text.toInt())
    }

    override fun visitFloat(ctx: MinCamlParser.FloatContext): Syntax {
        return Syntax.Float(ctx.FLOAT().text.toFloat())
    }

    override fun visitIdent(ctx: MinCamlParser.IdentContext): Syntax {
        return Syntax.Var(Id(ctx.IDENT().text))
    }

    override fun visitArrayGet(ctx: MinCamlParser.ArrayGetContext): Syntax {
        return Syntax.Get(ctx.simpleExp().accept(this), ctx.exp().accept(this))
    }

    override fun visitUnit(ctx: MinCamlParser.UnitContext): Syntax {
        return Syntax.Unit
    }

    override fun visitBlock(ctx: MinCamlParser.BlockContext): Syntax {
        return ctx.accept(this)
    }

    override fun visitApp(ctx: MinCamlParser.AppContext): Syntax {
        return Syntax.App(
            Syntax.Var(Id(ctx.varname().text)),
            ctx.simpleExp().stream()
                .map { it.accept(this) }
                .collect(Collectors.toList())
        )
    }

    override fun visitAdd(ctx: MinCamlParser.AddContext): Syntax {
        return Syntax.Add(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitGreaterEq(ctx: MinCamlParser.GreaterEqContext): Syntax {
        return Syntax.LE(ctx.exp(1).accept(this), ctx.exp(0).accept(this))
    }

    override fun visitFNeg(ctx: MinCamlParser.FNegContext): Syntax {
        return Syntax.FNeg(ctx.exp().accept(this))
    }

    override fun visitFDiv(ctx: MinCamlParser.FDivContext): Syntax {
        return Syntax.FDiv(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitEq(ctx: MinCamlParser.EqContext): Syntax {
        return Syntax.Eq(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitElems(ctx: MinCamlParser.ElemsContext): Syntax {
        return Syntax.Tuple(ctx.exp().stream()
            .map { it.accept(this) }
            .collect(Collectors.toList())
        )
    }

    override fun visitFAdd(ctx: MinCamlParser.FAddContext): Syntax {
        return Syntax.FAdd(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitArrayPut(ctx: MinCamlParser.ArrayPutContext): Syntax {
        return Syntax.Put(
            ctx.exp(0).accept(this),
            ctx.exp(1).accept(this),
            ctx.exp(2).accept(this)
        )
    }

    override fun visitLess(ctx: MinCamlParser.LessContext): Syntax {
        return Syntax.Not(
            Syntax.LE(ctx.exp(1).accept(this), ctx.exp(0).accept(this))
        )
    }

    override fun visitLetRec(ctx: MinCamlParser.LetRecContext): Syntax {
        return Syntax.LetRec(
            Syntax.FunDef(
                newType(ctx.varname().IDENT().text),
                ctx.IDENT().stream()
                    .map { newType(it.text) }
                    .collect(Collectors.toList()),
                ctx.exp(0).accept(this)
            ),
            ctx.exp(1).accept(this)
        )
    }

    override fun visitSub(ctx: MinCamlParser.SubContext): Syntax {
        return Syntax.Sub(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitLessGreater(ctx: MinCamlParser.LessGreaterContext): Syntax {
        return Syntax.Not(
            Syntax.Eq(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
        )
    }

    override fun visitSeqExpression(ctx: MinCamlParser.SeqExpressionContext): Syntax {
        return Syntax.Let(
            IdWithType(Id.gentmp(Type.Primitive.Unit), Type.Primitive.Unit),
            ctx.exp(0).accept(this), ctx.exp(1).accept(this)
        )
    }

    override fun visitLessEq(ctx: MinCamlParser.LessEqContext): Syntax {
        return Syntax.LE(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitNeg(ctx: MinCamlParser.NegContext): Syntax {
        return Syntax.Neg(ctx.exp().accept(this))
    }

    override fun visitNot(ctx: MinCamlParser.NotContext): Syntax {
        return Syntax.Not(ctx.exp().accept(this))
    }

    override fun visitArrayCreate(ctx: MinCamlParser.ArrayCreateContext): Syntax {
        return Syntax.Array(
            ctx.simpleExp(0).accept(this),
            ctx.simpleExp(1).accept(this)
        )
    }

    override fun visitLet(ctx: MinCamlParser.LetContext): Syntax {
        return Syntax.Let(
            newType(ctx.IDENT().text),
            ctx.exp(0).accept(this), ctx.exp(1).accept(this)
        )
    }

    override fun visitLetTuple(ctx: MinCamlParser.LetTupleContext): Syntax {
        return Syntax.LetTuple(
            ctx.IDENT().stream()
                .map { newType(it.text) }
                .collect(Collectors.toList()),
            ctx.exp(0).accept(this), ctx.exp(1).accept(this)
        )
    }

    override fun visitGreater(ctx: MinCamlParser.GreaterContext): Syntax {
        return Syntax.Not(
            Syntax.LE(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
        )
    }

    override fun visitFSub(ctx: MinCamlParser.FSubContext): Syntax {
        return Syntax.FSub(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }

    override fun visitIf(ctx: MinCamlParser.IfContext): Syntax {
        return Syntax.If(
            ctx.exp(0).accept(this),
            ctx.exp(1).accept(this),
            ctx.exp(2).accept(this)
        )
    }

    override fun visitFMul(ctx: MinCamlParser.FMulContext): Syntax {
        return Syntax.FMul(ctx.exp(0).accept(this), ctx.exp(1).accept(this))
    }
}
