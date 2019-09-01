// Generated from /Users/komamitsu/src/komincaml/src/main/antlr/MinCamlParser.g4 by ANTLR 4.7.2

package org.komamitsu.mincaml;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MinCamlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MinCamlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(MinCamlParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(MinCamlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MinCamlParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayGet}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayGet(MinCamlParser.ArrayGetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MinCamlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(MinCamlParser.UnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MinCamlParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code App}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(MinCamlParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(MinCamlParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEq(MinCamlParser.GreaterEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FNeg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFNeg(MinCamlParser.FNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FDiv}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFDiv(MinCamlParser.FDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq(MinCamlParser.EqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(MinCamlParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Elems}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(MinCamlParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAdd}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAdd(MinCamlParser.FAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayPut}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayPut(MinCamlParser.ArrayPutContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess(MinCamlParser.LessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetRec}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetRec(MinCamlParser.LetRecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(MinCamlParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessGreater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessGreater(MinCamlParser.LessGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SeqExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqExpression(MinCamlParser.SeqExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEq(MinCamlParser.LessEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(MinCamlParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(MinCamlParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreate(MinCamlParser.ArrayCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(MinCamlParser.LetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetTuple}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetTuple(MinCamlParser.LetTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreater(MinCamlParser.GreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FSub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFSub(MinCamlParser.FSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(MinCamlParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FMul}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFMul(MinCamlParser.FMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link MinCamlParser#varname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarname(MinCamlParser.VarnameContext ctx);
}