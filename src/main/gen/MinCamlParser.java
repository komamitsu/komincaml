// Generated from /Users/komamitsu/src/komincaml/src/main/antlr/MinCamlParser.g4 by ANTLR 4.7.2

package org.komamitsu.mincaml;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinCamlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, LPAREN=2, RPAREN=3, BOOL=4, NOT=5, INT=6, FLOAT=7, MINUS=8, PLUS=9, 
		MINUS_DOT=10, PLUS_DOT=11, AST_DOT=12, SLASH_DOT=13, EQUAL=14, LESS_GREATER=15, 
		LESS_EQUAL=16, GREATER_EQUAL=17, LESS=18, GREATER=19, IF=20, THEN=21, 
		ELSE=22, LET=23, IN=24, REC=25, COMMA=26, IDENT_UNIT=27, ARRAY_CREATE=28, 
		DOT=29, LESS_MINUS=30, SEMICOLON=31, IDENT=32, COMMENT=33;
	public static final int
		RULE_simpleExp = 0, RULE_exp = 1, RULE_varname = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"simpleExp", "exp", "varname"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", null, "'not'", null, null, "'-'", "'+'", "'-.'", 
			"'+.'", "'*.'", "'/.'", "'='", "'<>'", "'<='", "'>='", "'<'", "'>'", 
			"'if'", "'then'", "'else'", "'let'", "'in'", "'rec'", "','", "'_'", null, 
			"'.'", "'<-'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACE", "LPAREN", "RPAREN", "BOOL", "NOT", "INT", "FLOAT", "MINUS", 
			"PLUS", "MINUS_DOT", "PLUS_DOT", "AST_DOT", "SLASH_DOT", "EQUAL", "LESS_GREATER", 
			"LESS_EQUAL", "GREATER_EQUAL", "LESS", "GREATER", "IF", "THEN", "ELSE", 
			"LET", "IN", "REC", "COMMA", "IDENT_UNIT", "ARRAY_CREATE", "DOT", "LESS_MINUS", 
			"SEMICOLON", "IDENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MinCamlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinCamlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SimpleExpContext extends ParserRuleContext {
		public SimpleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExp; }
	 
		public SimpleExpContext() { }
		public void copyFrom(SimpleExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatContext extends SimpleExpContext {
		public TerminalNode FLOAT() { return getToken(MinCamlParser.FLOAT, 0); }
		public FloatContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentContext extends SimpleExpContext {
		public TerminalNode IDENT() { return getToken(MinCamlParser.IDENT, 0); }
		public IdentContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends SimpleExpContext {
		public TerminalNode BOOL() { return getToken(MinCamlParser.BOOL, 0); }
		public BoolContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayGetContext extends SimpleExpContext {
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MinCamlParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(MinCamlParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MinCamlParser.RPAREN, 0); }
		public ArrayGetContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterArrayGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitArrayGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitArrayGet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends SimpleExpContext {
		public TerminalNode LPAREN() { return getToken(MinCamlParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MinCamlParser.RPAREN, 0); }
		public BlockContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitContext extends SimpleExpContext {
		public TerminalNode LPAREN() { return getToken(MinCamlParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MinCamlParser.RPAREN, 0); }
		public UnitContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends SimpleExpContext {
		public TerminalNode INT() { return getToken(MinCamlParser.INT, 0); }
		public IntContext(SimpleExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpContext simpleExp() throws RecognitionException {
		return simpleExp(0);
	}

	private SimpleExpContext simpleExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExpContext _localctx = new SimpleExpContext(_ctx, _parentState);
		SimpleExpContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_simpleExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(7);
				match(LPAREN);
				setState(8);
				exp(0);
				setState(9);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new UnitContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(11);
				match(LPAREN);
				setState(12);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(13);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(14);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(15);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new IdentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(16);
				match(IDENT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayGetContext(new SimpleExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_simpleExp);
					setState(19);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(20);
					match(DOT);
					setState(21);
					match(LPAREN);
					setState(22);
					exp(0);
					setState(23);
					match(RPAREN);
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AppContext extends ExpContext {
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public List<SimpleExpContext> simpleExp() {
			return getRuleContexts(SimpleExpContext.class);
		}
		public SimpleExpContext simpleExp(int i) {
			return getRuleContext(SimpleExpContext.class,i);
		}
		public AppContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MinCamlParser.PLUS, 0); }
		public AddContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterEqContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER_EQUAL() { return getToken(MinCamlParser.GREATER_EQUAL, 0); }
		public GreaterEqContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterGreaterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitGreaterEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitGreaterEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FNegContext extends ExpContext {
		public TerminalNode MINUS_DOT() { return getToken(MinCamlParser.MINUS_DOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FNegContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FDivContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SLASH_DOT() { return getToken(MinCamlParser.SLASH_DOT, 0); }
		public FDivContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(MinCamlParser.EQUAL, 0); }
		public EqContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleExpressionContext extends ExpContext {
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public SimpleExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElemsContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(MinCamlParser.COMMA, 0); }
		public ElemsContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterElems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitElems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitElems(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FAddContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS_DOT() { return getToken(MinCamlParser.PLUS_DOT, 0); }
		public FAddContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayPutContext extends ExpContext {
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MinCamlParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(MinCamlParser.LPAREN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(MinCamlParser.RPAREN, 0); }
		public TerminalNode LESS_MINUS() { return getToken(MinCamlParser.LESS_MINUS, 0); }
		public ArrayPutContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterArrayPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitArrayPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitArrayPut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS() { return getToken(MinCamlParser.LESS, 0); }
		public LessContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetRecContext extends ExpContext {
		public TerminalNode LET() { return getToken(MinCamlParser.LET, 0); }
		public TerminalNode REC() { return getToken(MinCamlParser.REC, 0); }
		public VarnameContext varname() {
			return getRuleContext(VarnameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(MinCamlParser.EQUAL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(MinCamlParser.IN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MinCamlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MinCamlParser.IDENT, i);
		}
		public LetRecContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLetRec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLetRec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLetRec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(MinCamlParser.MINUS, 0); }
		public SubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessGreaterContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS_GREATER() { return getToken(MinCamlParser.LESS_GREATER, 0); }
		public LessGreaterContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLessGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLessGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLessGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SeqExpressionContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(MinCamlParser.SEMICOLON, 0); }
		public SeqExpressionContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterSeqExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitSeqExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitSeqExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESS_EQUAL() { return getToken(MinCamlParser.LESS_EQUAL, 0); }
		public LessEqContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLessEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLessEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLessEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegContext extends ExpContext {
		public TerminalNode MINUS() { return getToken(MinCamlParser.MINUS, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NegContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpContext {
		public TerminalNode NOT() { return getToken(MinCamlParser.NOT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayCreateContext extends ExpContext {
		public TerminalNode ARRAY_CREATE() { return getToken(MinCamlParser.ARRAY_CREATE, 0); }
		public List<SimpleExpContext> simpleExp() {
			return getRuleContexts(SimpleExpContext.class);
		}
		public SimpleExpContext simpleExp(int i) {
			return getRuleContext(SimpleExpContext.class,i);
		}
		public ArrayCreateContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterArrayCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitArrayCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitArrayCreate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends ExpContext {
		public TerminalNode LET() { return getToken(MinCamlParser.LET, 0); }
		public TerminalNode IDENT() { return getToken(MinCamlParser.IDENT, 0); }
		public TerminalNode EQUAL() { return getToken(MinCamlParser.EQUAL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(MinCamlParser.IN, 0); }
		public LetContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetTupleContext extends ExpContext {
		public TerminalNode LET() { return getToken(MinCamlParser.LET, 0); }
		public TerminalNode LPAREN() { return getToken(MinCamlParser.LPAREN, 0); }
		public List<TerminalNode> IDENT() { return getTokens(MinCamlParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(MinCamlParser.IDENT, i);
		}
		public TerminalNode RPAREN() { return getToken(MinCamlParser.RPAREN, 0); }
		public TerminalNode EQUAL() { return getToken(MinCamlParser.EQUAL, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode IN() { return getToken(MinCamlParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MinCamlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MinCamlParser.COMMA, i);
		}
		public LetTupleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterLetTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitLetTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitLetTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode GREATER() { return getToken(MinCamlParser.GREATER, 0); }
		public GreaterContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitGreater(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FSubContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS_DOT() { return getToken(MinCamlParser.MINUS_DOT, 0); }
		public FSubContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends ExpContext {
		public TerminalNode IF() { return getToken(MinCamlParser.IF, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode THEN() { return getToken(MinCamlParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(MinCamlParser.ELSE, 0); }
		public IfContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FMulContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AST_DOT() { return getToken(MinCamlParser.AST_DOT, 0); }
		public FMulContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterFMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitFMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitFMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new SimpleExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(31);
				simpleExp(0);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(32);
				match(NOT);
				setState(33);
				exp(24);
				}
				break;
			case 3:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(34);
				match(MINUS);
				setState(35);
				exp(23);
				}
				break;
			case 4:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(IF);
				setState(37);
				exp(0);
				setState(38);
				match(THEN);
				setState(39);
				exp(0);
				setState(40);
				match(ELSE);
				setState(41);
				exp(14);
				}
				break;
			case 5:
				{
				_localctx = new FNegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(MINUS_DOT);
				setState(44);
				exp(13);
				}
				break;
			case 6:
				{
				_localctx = new AppContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				varname();
				setState(47); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(46);
						simpleExp(0);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(49); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 7:
				{
				_localctx = new ArrayCreateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(ARRAY_CREATE);
				setState(52);
				simpleExp(0);
				setState(53);
				simpleExp(0);
				}
				break;
			case 8:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(LET);
				setState(56);
				match(IDENT);
				setState(57);
				match(EQUAL);
				setState(58);
				exp(0);
				setState(59);
				match(IN);
				setState(60);
				exp(4);
				}
				break;
			case 9:
				{
				_localctx = new LetRecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(LET);
				setState(63);
				match(REC);
				setState(64);
				varname();
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(65);
					match(IDENT);
					}
					}
					setState(68); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENT );
				setState(70);
				match(EQUAL);
				setState(71);
				exp(0);
				setState(72);
				match(IN);
				setState(73);
				exp(3);
				}
				break;
			case 10:
				{
				_localctx = new ArrayPutContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				simpleExp(0);
				setState(76);
				match(DOT);
				setState(77);
				match(LPAREN);
				setState(78);
				exp(0);
				setState(79);
				match(RPAREN);
				setState(80);
				match(LESS_MINUS);
				setState(81);
				exp(2);
				}
				break;
			case 11:
				{
				_localctx = new LetTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(LET);
				setState(84);
				match(LPAREN);
				setState(85);
				match(IDENT);
				setState(88); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					match(COMMA);
					setState(87);
					match(IDENT);
					}
					}
					setState(90); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(92);
				match(RPAREN);
				setState(93);
				match(EQUAL);
				setState(94);
				exp(0);
				setState(95);
				match(IN);
				setState(96);
				exp(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(100);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(101);
						match(PLUS);
						setState(102);
						exp(23);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(103);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(104);
						match(MINUS);
						setState(105);
						exp(22);
						}
						break;
					case 3:
						{
						_localctx = new EqContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(106);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(107);
						match(EQUAL);
						setState(108);
						exp(21);
						}
						break;
					case 4:
						{
						_localctx = new LessGreaterContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(109);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(110);
						match(LESS_GREATER);
						setState(111);
						exp(20);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(112);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(113);
						match(LESS);
						setState(114);
						exp(19);
						}
						break;
					case 6:
						{
						_localctx = new GreaterContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(115);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(116);
						match(GREATER);
						setState(117);
						exp(18);
						}
						break;
					case 7:
						{
						_localctx = new LessEqContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(118);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(119);
						match(LESS_EQUAL);
						setState(120);
						exp(17);
						}
						break;
					case 8:
						{
						_localctx = new GreaterEqContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(121);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(122);
						match(GREATER_EQUAL);
						setState(123);
						exp(16);
						}
						break;
					case 9:
						{
						_localctx = new FAddContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(124);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(125);
						match(PLUS_DOT);
						setState(126);
						exp(13);
						}
						break;
					case 10:
						{
						_localctx = new FSubContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(127);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(128);
						match(MINUS_DOT);
						setState(129);
						exp(12);
						}
						break;
					case 11:
						{
						_localctx = new FMulContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						match(AST_DOT);
						setState(132);
						exp(11);
						}
						break;
					case 12:
						{
						_localctx = new FDivContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(134);
						match(SLASH_DOT);
						setState(135);
						exp(10);
						}
						break;
					case 13:
						{
						_localctx = new ElemsContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(136);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(137);
						match(COMMA);
						setState(138);
						exp(8);
						}
						break;
					case 14:
						{
						_localctx = new SeqExpressionContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(139);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(140);
						match(SEMICOLON);
						setState(141);
						exp(7);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarnameContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MinCamlParser.IDENT, 0); }
		public VarnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).enterVarname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinCamlParserListener ) ((MinCamlParserListener)listener).exitVarname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MinCamlParserVisitor ) return ((MinCamlParserVisitor<? extends T>)visitor).visitVarname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarnameContext varname() throws RecognitionException {
		VarnameContext _localctx = new VarnameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return simpleExp_sempred((SimpleExpContext)_localctx, predIndex);
		case 1:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean simpleExp_sempred(SimpleExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 22);
		case 2:
			return precpred(_ctx, 21);
		case 3:
			return precpred(_ctx, 20);
		case 4:
			return precpred(_ctx, 19);
		case 5:
			return precpred(_ctx, 18);
		case 6:
			return precpred(_ctx, 17);
		case 7:
			return precpred(_ctx, 16);
		case 8:
			return precpred(_ctx, 15);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\24\n\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\62\n\3\r\3\16\3"+
		"\63\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3E\n"+
		"\3\r\3\16\3F\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\6\3[\n\3\r\3\16\3\\\3\3\3\3\3\3\3\3\3\3\3\3\5\3e\n\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0091\n\3\f\3\16\3\u0094\13\3\3\4\3\4\3"+
		"\4\2\4\2\4\5\2\4\6\2\2\2\u00b5\2\23\3\2\2\2\4d\3\2\2\2\6\u0095\3\2\2\2"+
		"\b\t\b\2\1\2\t\n\7\4\2\2\n\13\5\4\3\2\13\f\7\5\2\2\f\24\3\2\2\2\r\16\7"+
		"\4\2\2\16\24\7\5\2\2\17\24\7\6\2\2\20\24\7\b\2\2\21\24\7\t\2\2\22\24\7"+
		"\"\2\2\23\b\3\2\2\2\23\r\3\2\2\2\23\17\3\2\2\2\23\20\3\2\2\2\23\21\3\2"+
		"\2\2\23\22\3\2\2\2\24\35\3\2\2\2\25\26\f\3\2\2\26\27\7\37\2\2\27\30\7"+
		"\4\2\2\30\31\5\4\3\2\31\32\7\5\2\2\32\34\3\2\2\2\33\25\3\2\2\2\34\37\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 !\b\3\1"+
		"\2!e\5\2\2\2\"#\7\7\2\2#e\5\4\3\32$%\7\n\2\2%e\5\4\3\31&\'\7\26\2\2\'"+
		"(\5\4\3\2()\7\27\2\2)*\5\4\3\2*+\7\30\2\2+,\5\4\3\20,e\3\2\2\2-.\7\f\2"+
		"\2.e\5\4\3\17/\61\5\6\4\2\60\62\5\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2\63"+
		"\61\3\2\2\2\63\64\3\2\2\2\64e\3\2\2\2\65\66\7\36\2\2\66\67\5\2\2\2\67"+
		"8\5\2\2\28e\3\2\2\29:\7\31\2\2:;\7\"\2\2;<\7\20\2\2<=\5\4\3\2=>\7\32\2"+
		"\2>?\5\4\3\6?e\3\2\2\2@A\7\31\2\2AB\7\33\2\2BD\5\6\4\2CE\7\"\2\2DC\3\2"+
		"\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\20\2\2IJ\5\4\3\2JK\7"+
		"\32\2\2KL\5\4\3\5Le\3\2\2\2MN\5\2\2\2NO\7\37\2\2OP\7\4\2\2PQ\5\4\3\2Q"+
		"R\7\5\2\2RS\7 \2\2ST\5\4\3\4Te\3\2\2\2UV\7\31\2\2VW\7\4\2\2WZ\7\"\2\2"+
		"XY\7\34\2\2Y[\7\"\2\2ZX\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3\2"+
		"\2\2^_\7\5\2\2_`\7\20\2\2`a\5\4\3\2ab\7\32\2\2bc\5\4\3\3ce\3\2\2\2d \3"+
		"\2\2\2d\"\3\2\2\2d$\3\2\2\2d&\3\2\2\2d-\3\2\2\2d/\3\2\2\2d\65\3\2\2\2"+
		"d9\3\2\2\2d@\3\2\2\2dM\3\2\2\2dU\3\2\2\2e\u0092\3\2\2\2fg\f\30\2\2gh\7"+
		"\13\2\2h\u0091\5\4\3\31ij\f\27\2\2jk\7\n\2\2k\u0091\5\4\3\30lm\f\26\2"+
		"\2mn\7\20\2\2n\u0091\5\4\3\27op\f\25\2\2pq\7\21\2\2q\u0091\5\4\3\26rs"+
		"\f\24\2\2st\7\24\2\2t\u0091\5\4\3\25uv\f\23\2\2vw\7\25\2\2w\u0091\5\4"+
		"\3\24xy\f\22\2\2yz\7\22\2\2z\u0091\5\4\3\23{|\f\21\2\2|}\7\23\2\2}\u0091"+
		"\5\4\3\22~\177\f\16\2\2\177\u0080\7\r\2\2\u0080\u0091\5\4\3\17\u0081\u0082"+
		"\f\r\2\2\u0082\u0083\7\f\2\2\u0083\u0091\5\4\3\16\u0084\u0085\f\f\2\2"+
		"\u0085\u0086\7\16\2\2\u0086\u0091\5\4\3\r\u0087\u0088\f\13\2\2\u0088\u0089"+
		"\7\17\2\2\u0089\u0091\5\4\3\f\u008a\u008b\f\t\2\2\u008b\u008c\7\34\2\2"+
		"\u008c\u0091\5\4\3\n\u008d\u008e\f\b\2\2\u008e\u008f\7!\2\2\u008f\u0091"+
		"\5\4\3\t\u0090f\3\2\2\2\u0090i\3\2\2\2\u0090l\3\2\2\2\u0090o\3\2\2\2\u0090"+
		"r\3\2\2\2\u0090u\3\2\2\2\u0090x\3\2\2\2\u0090{\3\2\2\2\u0090~\3\2\2\2"+
		"\u0090\u0081\3\2\2\2\u0090\u0084\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008a"+
		"\3\2\2\2\u0090\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\5\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\"\2\2"+
		"\u0096\7\3\2\2\2\n\23\35\63F\\d\u0090\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}