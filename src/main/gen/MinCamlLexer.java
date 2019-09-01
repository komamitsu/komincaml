// Generated from /Users/komamitsu/src/komincaml/src/main/antlr/MinCamlLexer.g4 by ANTLR 4.7.2

package org.komamitsu.mincaml;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinCamlLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "LOWER", "UPPER", "SPACE", "LPAREN", "RPAREN", "BOOL", "NOT", 
			"INT", "FLOAT", "MINUS", "PLUS", "MINUS_DOT", "PLUS_DOT", "AST_DOT", 
			"SLASH_DOT", "EQUAL", "LESS_GREATER", "LESS_EQUAL", "GREATER_EQUAL", 
			"LESS", "GREATER", "IF", "THEN", "ELSE", "LET", "IN", "REC", "COMMA", 
			"IDENT_UNIT", "ARRAY_CREATE", "DOT", "LESS_MINUS", "SEMICOLON", "IDENT", 
			"COMMENT"
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


	public MinCamlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinCamlLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3\t\3\t"+
		"\3\t\3\t\3\n\6\nj\n\n\r\n\16\nk\3\13\6\13o\n\13\r\13\16\13p\3\13\3\13"+
		"\7\13u\n\13\f\13\16\13x\13\13\5\13z\n\13\3\13\3\13\5\13~\n\13\3\13\6\13"+
		"\u0081\n\13\r\13\16\13\u0082\5\13\u0085\n\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u00d8\n \3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\7$\u00e6\n$\f$\16$\u00e9\13$\3%\3%"+
		"\3%\3%\7%\u00ef\n%\f%\16%\u00f2\13%\3%\3%\3%\3%\3%\3\u00f0\2&\3\2\5\2"+
		"\7\2\t\3\13\4\r\5\17\6\21\7\23\b\25\t\27\n\31\13\33\f\35\r\37\16!\17#"+
		"\20%\21\'\22)\23+\24-\25/\26\61\27\63\30\65\31\67\329\33;\34=\35?\36A"+
		"\37C E!G\"I#\3\2\b\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\"\4\2GGgg\4\2"+
		"--//\2\u0102\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2"+
		"\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2\17b\3\2\2\2\21"+
		"d\3\2\2\2\23i\3\2\2\2\25n\3\2\2\2\27\u0086\3\2\2\2\31\u0088\3\2\2\2\33"+
		"\u008a\3\2\2\2\35\u008d\3\2\2\2\37\u0090\3\2\2\2!\u0093\3\2\2\2#\u0096"+
		"\3\2\2\2%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a1\3\2\2\2"+
		"-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a8\3\2\2\2\63\u00ad\3\2\2\2\65\u00b2"+
		"\3\2\2\2\67\u00b6\3\2\2\29\u00b9\3\2\2\2;\u00bd\3\2\2\2=\u00bf\3\2\2\2"+
		"?\u00d7\3\2\2\2A\u00d9\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G\u00e0\3"+
		"\2\2\2I\u00ea\3\2\2\2KL\t\2\2\2L\4\3\2\2\2MN\t\3\2\2N\6\3\2\2\2OP\t\4"+
		"\2\2P\b\3\2\2\2QR\t\5\2\2RS\3\2\2\2ST\b\5\2\2T\n\3\2\2\2UV\7*\2\2V\f\3"+
		"\2\2\2WX\7+\2\2X\16\3\2\2\2YZ\7v\2\2Z[\7t\2\2[\\\7w\2\2\\c\7g\2\2]^\7"+
		"h\2\2^_\7c\2\2_`\7n\2\2`a\7u\2\2ac\7g\2\2bY\3\2\2\2b]\3\2\2\2c\20\3\2"+
		"\2\2de\7p\2\2ef\7q\2\2fg\7v\2\2g\22\3\2\2\2hj\5\3\2\2ih\3\2\2\2jk\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2l\24\3\2\2\2mo\5\3\2\2nm\3\2\2\2op\3\2\2\2pn\3"+
		"\2\2\2pq\3\2\2\2qy\3\2\2\2rv\7\60\2\2su\5\3\2\2ts\3\2\2\2ux\3\2\2\2vt"+
		"\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yr\3\2\2\2yz\3\2\2\2z\u0084\3\2"+
		"\2\2{}\t\6\2\2|~\t\7\2\2}|\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177\u0081"+
		"\5\3\2\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084{\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\26\3\2\2\2\u0086\u0087\7/\2\2\u0087\30\3\2\2\2\u0088\u0089\7-\2"+
		"\2\u0089\32\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c\7\60\2\2\u008c\34\3"+
		"\2\2\2\u008d\u008e\7-\2\2\u008e\u008f\7\60\2\2\u008f\36\3\2\2\2\u0090"+
		"\u0091\7,\2\2\u0091\u0092\7\60\2\2\u0092 \3\2\2\2\u0093\u0094\7\61\2\2"+
		"\u0094\u0095\7\60\2\2\u0095\"\3\2\2\2\u0096\u0097\7?\2\2\u0097$\3\2\2"+
		"\2\u0098\u0099\7>\2\2\u0099\u009a\7@\2\2\u009a&\3\2\2\2\u009b\u009c\7"+
		">\2\2\u009c\u009d\7?\2\2\u009d(\3\2\2\2\u009e\u009f\7@\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7"+
		"@\2\2\u00a4.\3\2\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7h\2\2\u00a7\60\3"+
		"\2\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7j\2\2\u00aa\u00ab\7g\2\2\u00ab"+
		"\u00ac\7p\2\2\u00ac\62\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\64\3\2\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4\u00b5\7v\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b88\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7g\2\2\u00bb"+
		"\u00bc\7e\2\2\u00bc:\3\2\2\2\u00bd\u00be\7.\2\2\u00be<\3\2\2\2\u00bf\u00c0"+
		"\7a\2\2\u00c0>\3\2\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7{\2\2\u00c6\u00c7\7\60\2\2\u00c7"+
		"\u00c8\7e\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7v\2\2\u00cc\u00d8\7g\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf"+
		"\7t\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7{\2\2\u00d2"+
		"\u00d3\7\60\2\2\u00d3\u00d4\7o\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6\7m\2"+
		"\2\u00d6\u00d8\7g\2\2\u00d7\u00c1\3\2\2\2\u00d7\u00cd\3\2\2\2\u00d8@\3"+
		"\2\2\2\u00d9\u00da\7\60\2\2\u00daB\3\2\2\2\u00db\u00dc\7>\2\2\u00dc\u00dd"+
		"\7/\2\2\u00ddD\3\2\2\2\u00de\u00df\7=\2\2\u00dfF\3\2\2\2\u00e0\u00e7\5"+
		"\5\3\2\u00e1\u00e6\5\3\2\2\u00e2\u00e6\5\5\3\2\u00e3\u00e6\5\7\4\2\u00e4"+
		"\u00e6\7a\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8H\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7*\2\2\u00eb"+
		"\u00ec\7,\2\2\u00ec\u00f0\3\2\2\2\u00ed\u00ef\13\2\2\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f3\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\7+\2"+
		"\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b%\2\2\u00f7J\3\2\2\2\17\2bkpvy}\u0082"+
		"\u0084\u00d7\u00e5\u00e7\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}