// Generated from /Users/komamitsu/src/komincaml/src/main/antlr/MinCamlParser.g4 by ANTLR 4.7.2

package org.komamitsu.mincaml;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinCamlParser}.
 */
public interface MinCamlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterFloat(MinCamlParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitFloat(MinCamlParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterIdent(MinCamlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ident}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitIdent(MinCamlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterBool(MinCamlParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitBool(MinCamlParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayGet}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterArrayGet(MinCamlParser.ArrayGetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayGet}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitArrayGet(MinCamlParser.ArrayGetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MinCamlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MinCamlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterUnit(MinCamlParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unit}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitUnit(MinCamlParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterInt(MinCamlParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link MinCamlParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitInt(MinCamlParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code App}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterApp(MinCamlParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code App}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitApp(MinCamlParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MinCamlParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MinCamlParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEq(MinCamlParser.GreaterEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEq(MinCamlParser.GreaterEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FNeg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFNeg(MinCamlParser.FNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FNeg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFNeg(MinCamlParser.FNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FDiv}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFDiv(MinCamlParser.FDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FDiv}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFDiv(MinCamlParser.FDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterEq(MinCamlParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Eq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitEq(MinCamlParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MinCamlParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MinCamlParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Elems}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterElems(MinCamlParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Elems}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitElems(MinCamlParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FAdd}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFAdd(MinCamlParser.FAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FAdd}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFAdd(MinCamlParser.FAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayPut}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayPut(MinCamlParser.ArrayPutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayPut}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayPut(MinCamlParser.ArrayPutContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Less}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLess(MinCamlParser.LessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Less}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLess(MinCamlParser.LessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetRec}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetRec(MinCamlParser.LetRecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetRec}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetRec(MinCamlParser.LetRecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSub(MinCamlParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSub(MinCamlParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessGreater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLessGreater(MinCamlParser.LessGreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessGreater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLessGreater(MinCamlParser.LessGreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SeqExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSeqExpression(MinCamlParser.SeqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SeqExpression}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSeqExpression(MinCamlParser.SeqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLessEq(MinCamlParser.LessEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEq}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLessEq(MinCamlParser.LessEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNeg(MinCamlParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNeg(MinCamlParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNot(MinCamlParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNot(MinCamlParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreate(MinCamlParser.ArrayCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreate(MinCamlParser.ArrayCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Let}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLet(MinCamlParser.LetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Let}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLet(MinCamlParser.LetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetTuple}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetTuple(MinCamlParser.LetTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetTuple}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetTuple(MinCamlParser.LetTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterGreater(MinCamlParser.GreaterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greater}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitGreater(MinCamlParser.GreaterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FSub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFSub(MinCamlParser.FSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FSub}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFSub(MinCamlParser.FSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code If}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIf(MinCamlParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code If}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIf(MinCamlParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FMul}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFMul(MinCamlParser.FMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FMul}
	 * labeled alternative in {@link MinCamlParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFMul(MinCamlParser.FMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinCamlParser#varname}.
	 * @param ctx the parse tree
	 */
	void enterVarname(MinCamlParser.VarnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinCamlParser#varname}.
	 * @param ctx the parse tree
	 */
	void exitVarname(MinCamlParser.VarnameContext ctx);
}