package pl.edu.pw.elka.wjanaszek.asist.generated;// Generated from /Users/wjanaszek/Workspace/IdeaProjects/asist/src/main/antlr4/Asist.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsistLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, TRUE=24, FALSE=25, 
		ALL=26, IMPORT=27, NOTIFY=28, IDENTIFIER=29, SEARCH_FUNCTION=30, STRING=31, 
		INTEGER_NUMBER=32, HOUR=33, MINUTE=34, DAY=35, MONTH=36, YEAR=37, BOOLEAN=38, 
		OBJECT_PROPERTIES=39, TIME=40, DATE=41, ADDITION_OPERATOR=42, MULTIPLICATION_OPERATOR=43, 
		RELATIVE_OPERATOR=44, WHITESPACE=45, LINE_COMMENT=46, COMMENT=47, NEW_LINE=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "TRUE", "FALSE", 
		"ALL", "IMPORT", "NOTIFY", "IDENTIFIER", "SEARCH_FUNCTION", "STRING", 
		"INTEGER_NUMBER", "HOUR", "MINUTE", "DAY", "MONTH", "YEAR", "BOOLEAN", 
		"OBJECT_PROPERTIES", "TIME", "DATE", "ADDITION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"RELATIVE_OPERATOR", "WHITESPACE", "LINE_COMMENT", "COMMENT", "NEW_LINE", 
		"SPECIAL_CHARACTER", "DIGIT", "NON_ZERO_DIGIT", "LETTER", "A", "B", "C", 
		"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
		"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'with'", "'on'", "'when'", "'every'", "'in'", "'second'", "'seconds'", 
		"'minute'", "'minutes'", "'hour'", "'hours'", "'='", "'| grep'", "'->'", 
		"'('", "')'", "'if ('", "') then'", "'else'", "'endif'", "'or'", "'and'", 
		"'not'", null, null, null, null, null, null, "'list all'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"TRUE", "FALSE", "ALL", "IMPORT", "NOTIFY", "IDENTIFIER", "SEARCH_FUNCTION", 
		"STRING", "INTEGER_NUMBER", "HOUR", "MINUTE", "DAY", "MONTH", "YEAR", 
		"BOOLEAN", "OBJECT_PROPERTIES", "TIME", "DATE", "ADDITION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"RELATIVE_OPERATOR", "WHITESPACE", "LINE_COMMENT", "COMMENT", "NEW_LINE"
	};
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


	public AsistLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asist.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0202\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\7\36\u0132\n\36\f\36\16\36\u0135\13\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u0143\n \f \16 \u0146\13 \3 \3 "+
		"\3 \3 \7 \u014c\n \f \16 \u014f\13 \3 \5 \u0152\n \3!\3!\7!\u0156\n!\f"+
		"!\16!\u0159\13!\3!\5!\u015c\n!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0178\n\'\3(\3"+
		"(\3(\3(\3(\7(\u017f\n(\f(\16(\u0182\13(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*"+
		"\3+\3+\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u019b\n-\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\7/\u01a5\n/\f/\16/\u01a8\13/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7"+
		"\60\u01b2\n\60\f\60\16\60\u01b5\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\5\61\u01be\n\61\3\61\5\61\u01c1\n\61\3\61\3\61\3\62\3\62\3\63\3\63"+
		"\5\63\u01c9\n\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3"+
		":\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3"+
		"E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\6\u0144"+
		"\u014d\u01a6\u01b3\2P\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2"+
		"e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2"+
		"\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097"+
		"\2\u0099\2\u009b\2\u009d\2\3\2#\4\2BBaa\4\2--//\4\2,,<<\4\2>>@@\4\2\13"+
		"\13\"\"\n\2##&\'*\60<@BB]`}}\177\177\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee"+
		"\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2N"+
		"Nnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u01f8\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3\u009f"+
		"\3\2\2\2\5\u00a4\3\2\2\2\7\u00a7\3\2\2\2\t\u00ac\3\2\2\2\13\u00b2\3\2"+
		"\2\2\r\u00b5\3\2\2\2\17\u00bc\3\2\2\2\21\u00c4\3\2\2\2\23\u00cb\3\2\2"+
		"\2\25\u00d3\3\2\2\2\27\u00d8\3\2\2\2\31\u00de\3\2\2\2\33\u00e0\3\2\2\2"+
		"\35\u00e7\3\2\2\2\37\u00ea\3\2\2\2!\u00ec\3\2\2\2#\u00ee\3\2\2\2%\u00f3"+
		"\3\2\2\2\'\u00fa\3\2\2\2)\u00ff\3\2\2\2+\u0105\3\2\2\2-\u0108\3\2\2\2"+
		"/\u010c\3\2\2\2\61\u0110\3\2\2\2\63\u0115\3\2\2\2\65\u011b\3\2\2\2\67"+
		"\u011f\3\2\2\29\u0126\3\2\2\2;\u012d\3\2\2\2=\u0136\3\2\2\2?\u0151\3\2"+
		"\2\2A\u015b\3\2\2\2C\u015d\3\2\2\2E\u0160\3\2\2\2G\u0163\3\2\2\2I\u0166"+
		"\3\2\2\2K\u0169\3\2\2\2M\u0177\3\2\2\2O\u0179\3\2\2\2Q\u0183\3\2\2\2S"+
		"\u0187\3\2\2\2U\u018d\3\2\2\2W\u018f\3\2\2\2Y\u019a\3\2\2\2[\u019c\3\2"+
		"\2\2]\u01a0\3\2\2\2_\u01ad\3\2\2\2a\u01c0\3\2\2\2c\u01c4\3\2\2\2e\u01c8"+
		"\3\2\2\2g\u01ca\3\2\2\2i\u01cc\3\2\2\2k\u01ce\3\2\2\2m\u01d0\3\2\2\2o"+
		"\u01d2\3\2\2\2q\u01d4\3\2\2\2s\u01d6\3\2\2\2u\u01d8\3\2\2\2w\u01da\3\2"+
		"\2\2y\u01dc\3\2\2\2{\u01de\3\2\2\2}\u01e0\3\2\2\2\177\u01e2\3\2\2\2\u0081"+
		"\u01e4\3\2\2\2\u0083\u01e6\3\2\2\2\u0085\u01e8\3\2\2\2\u0087\u01ea\3\2"+
		"\2\2\u0089\u01ec\3\2\2\2\u008b\u01ee\3\2\2\2\u008d\u01f0\3\2\2\2\u008f"+
		"\u01f2\3\2\2\2\u0091\u01f4\3\2\2\2\u0093\u01f6\3\2\2\2\u0095\u01f8\3\2"+
		"\2\2\u0097\u01fa\3\2\2\2\u0099\u01fc\3\2\2\2\u009b\u01fe\3\2\2\2\u009d"+
		"\u0200\3\2\2\2\u009f\u00a0\7y\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7v\2"+
		"\2\u00a2\u00a3\7j\2\2\u00a3\4\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7"+
		"p\2\2\u00a6\6\3\2\2\2\u00a7\u00a8\7y\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7p\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae"+
		"\7x\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7{\2\2\u00b1"+
		"\n\3\2\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7p\2\2\u00b4\f\3\2\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7q\2\2"+
		"\u00b9\u00ba\7p\2\2\u00ba\u00bb\7f\2\2\u00bb\16\3\2\2\2\u00bc\u00bd\7"+
		"u\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7e\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7p\2\2\u00c1\u00c2\7f\2\2\u00c2\u00c3\7u\2\2\u00c3\20\3\2\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7w\2\2\u00c8"+
		"\u00c9\7v\2\2\u00c9\u00ca\7g\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7v\2\2"+
		"\u00d0\u00d1\7g\2\2\u00d1\u00d2\7u\2\2\u00d2\24\3\2\2\2\u00d3\u00d4\7"+
		"j\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6\u00d7\7t\2\2\u00d7\26"+
		"\3\2\2\2\u00d8\u00d9\7j\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7t\2\2\u00dc\u00dd\7u\2\2\u00dd\30\3\2\2\2\u00de\u00df\7?\2\2\u00df"+
		"\32\3\2\2\2\u00e0\u00e1\7~\2\2\u00e1\u00e2\7\"\2\2\u00e2\u00e3\7i\2\2"+
		"\u00e3\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7r\2\2\u00e6\34\3\2"+
		"\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9\7@\2\2\u00e9\36\3\2\2\2\u00ea\u00eb"+
		"\7*\2\2\u00eb \3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\"\3\2\2\2\u00ee\u00ef"+
		"\7k\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7\"\2\2\u00f1\u00f2\7*\2\2\u00f2"+
		"$\3\2\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\7v\2\2\u00f6"+
		"\u00f7\7j\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9&\3\2\2\2\u00fa"+
		"\u00fb\7g\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7g\2\2"+
		"\u00fe(\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7p\2\2\u0101\u0102\7f\2"+
		"\2\u0102\u0103\7k\2\2\u0103\u0104\7h\2\2\u0104*\3\2\2\2\u0105\u0106\7"+
		"q\2\2\u0106\u0107\7t\2\2\u0107,\3\2\2\2\u0108\u0109\7c\2\2\u0109\u010a"+
		"\7p\2\2\u010a\u010b\7f\2\2\u010b.\3\2\2\2\u010c\u010d\7p\2\2\u010d\u010e"+
		"\7q\2\2\u010e\u010f\7v\2\2\u010f\60\3\2\2\2\u0110\u0111\5\u0091I\2\u0111"+
		"\u0112\5\u008dG\2\u0112\u0113\5\u0093J\2\u0113\u0114\5s:\2\u0114\62\3"+
		"\2\2\2\u0115\u0116\5u;\2\u0116\u0117\5k\66\2\u0117\u0118\5\u0081A\2\u0118"+
		"\u0119\5\u008fH\2\u0119\u011a\5s:\2\u011a\64\3\2\2\2\u011b\u011c\5k\66"+
		"\2\u011c\u011d\5\u0081A\2\u011d\u011e\5\u0081A\2\u011e\66\3\2\2\2\u011f"+
		"\u0120\5{>\2\u0120\u0121\5\u0083B\2\u0121\u0122\5\u0089E\2\u0122\u0123"+
		"\5\u0087D\2\u0123\u0124\5\u008dG\2\u0124\u0125\5\u0091I\2\u01258\3\2\2"+
		"\2\u0126\u0127\5\u0085C\2\u0127\u0128\5\u0087D\2\u0128\u0129\5\u0091I"+
		"\2\u0129\u012a\5{>\2\u012a\u012b\5u;\2\u012b\u012c\5\u009bN\2\u012c:\3"+
		"\2\2\2\u012d\u0133\5i\65\2\u012e\u0132\5i\65\2\u012f\u0132\5e\63\2\u0130"+
		"\u0132\t\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"<\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7n\2\2\u0137\u0138\7k\2\2\u0138"+
		"\u0139\7u\2\2\u0139\u013a\7v\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7c\2"+
		"\2\u013c\u013d\7n\2\2\u013d\u013e\7n\2\2\u013e>\3\2\2\2\u013f\u0144\7"+
		"$\2\2\u0140\u0143\5i\65\2\u0141\u0143\13\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0152\7$\2\2\u0148"+
		"\u014d\7)\2\2\u0149\u014c\5i\65\2\u014a\u014c\13\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0152\7)"+
		"\2\2\u0151\u013f\3\2\2\2\u0151\u0148\3\2\2\2\u0152@\3\2\2\2\u0153\u0157"+
		"\5g\64\2\u0154\u0156\5e\63\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015c\3\2\2\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015c\5e\63\2\u015b\u0153\3\2\2\2\u015b\u015a\3\2\2\2\u015c"+
		"B\3\2\2\2\u015d\u015e\5e\63\2\u015e\u015f\5e\63\2\u015fD\3\2\2\2\u0160"+
		"\u0161\5e\63\2\u0161\u0162\5e\63\2\u0162F\3\2\2\2\u0163\u0164\5e\63\2"+
		"\u0164\u0165\5e\63\2\u0165H\3\2\2\2\u0166\u0167\5e\63\2\u0167\u0168\5"+
		"e\63\2\u0168J\3\2\2\2\u0169\u016a\5e\63\2\u016a\u016b\5e\63\2\u016b\u016c"+
		"\5e\63\2\u016c\u016d\5e\63\2\u016dL\3\2\2\2\u016e\u016f\7v\2\2\u016f\u0170"+
		"\7t\2\2\u0170\u0171\7w\2\2\u0171\u0178\7g\2\2\u0172\u0173\7h\2\2\u0173"+
		"\u0174\7c\2\2\u0174\u0175\7n\2\2\u0175\u0176\7u\2\2\u0176\u0178\7g\2\2"+
		"\u0177\u016e\3\2\2\2\u0177\u0172\3\2\2\2\u0178N\3\2\2\2\u0179\u017a\5"+
		";\36\2\u017a\u017b\7\60\2\2\u017b\u0180\5;\36\2\u017c\u017d\7\60\2\2\u017d"+
		"\u017f\5;\36\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181P\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184"+
		"\5C\"\2\u0184\u0185\7\61\2\2\u0185\u0186\5E#\2\u0186R\3\2\2\2\u0187\u0188"+
		"\5G$\2\u0188\u0189\7\61\2\2\u0189\u018a\5I%\2\u018a\u018b\7\61\2\2\u018b"+
		"\u018c\5K&\2\u018cT\3\2\2\2\u018d\u018e\t\3\2\2\u018eV\3\2\2\2\u018f\u0190"+
		"\t\4\2\2\u0190X\3\2\2\2\u0191\u0192\7?\2\2\u0192\u019b\7?\2\2\u0193\u019b"+
		"\t\5\2\2\u0194\u0195\7>\2\2\u0195\u019b\7?\2\2\u0196\u0197\7#\2\2\u0197"+
		"\u019b\7?\2\2\u0198\u0199\7@\2\2\u0199\u019b\7?\2\2\u019a\u0191\3\2\2"+
		"\2\u019a\u0193\3\2\2\2\u019a\u0194\3\2\2\2\u019a\u0196\3\2\2\2\u019a\u0198"+
		"\3\2\2\2\u019bZ\3\2\2\2\u019c\u019d\t\6\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019f\b.\2\2\u019f\\\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1\u01a2\7\61\2"+
		"\2\u01a2\u01a6\3\2\2\2\u01a3\u01a5\13\2\2\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01a9\3\2"+
		"\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\5a\61\2\u01aa\u01ab\3\2\2\2\u01ab"+
		"\u01ac\b/\2\2\u01ac^\3\2\2\2\u01ad\u01ae\7\61\2\2\u01ae\u01af\7,\2\2\u01af"+
		"\u01b3\3\2\2\2\u01b0\u01b2\13\2\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3"+
		"\2\2\2\u01b3\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b6\u01b7\7,\2\2\u01b7\u01b8\7\61\2\2\u01b8\u01b9\3\2"+
		"\2\2\u01b9\u01ba\b\60\2\2\u01ba`\3\2\2\2\u01bb\u01c1\7\17\2\2\u01bc\u01be"+
		"\7\17\2\2\u01bd\u01bc\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\3\2\2\2"+
		"\u01bf\u01c1\7\f\2\2\u01c0\u01bb\3\2\2\2\u01c0\u01bd\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\u01c3\b\61\2\2\u01c3b\3\2\2\2\u01c4\u01c5\t\7\2\2\u01c5"+
		"d\3\2\2\2\u01c6\u01c9\7\62\2\2\u01c7\u01c9\5g\64\2\u01c8\u01c6\3\2\2\2"+
		"\u01c8\u01c7\3\2\2\2\u01c9f\3\2\2\2\u01ca\u01cb\4\63;\2\u01cbh\3\2\2\2"+
		"\u01cc\u01cd\t\b\2\2\u01cdj\3\2\2\2\u01ce\u01cf\t\t\2\2\u01cfl\3\2\2\2"+
		"\u01d0\u01d1\t\n\2\2\u01d1n\3\2\2\2\u01d2\u01d3\t\13\2\2\u01d3p\3\2\2"+
		"\2\u01d4\u01d5\t\f\2\2\u01d5r\3\2\2\2\u01d6\u01d7\t\r\2\2\u01d7t\3\2\2"+
		"\2\u01d8\u01d9\t\16\2\2\u01d9v\3\2\2\2\u01da\u01db\t\17\2\2\u01dbx\3\2"+
		"\2\2\u01dc\u01dd\t\20\2\2\u01ddz\3\2\2\2\u01de\u01df\t\21\2\2\u01df|\3"+
		"\2\2\2\u01e0\u01e1\t\22\2\2\u01e1~\3\2\2\2\u01e2\u01e3\t\23\2\2\u01e3"+
		"\u0080\3\2\2\2\u01e4\u01e5\t\24\2\2\u01e5\u0082\3\2\2\2\u01e6\u01e7\t"+
		"\25\2\2\u01e7\u0084\3\2\2\2\u01e8\u01e9\t\26\2\2\u01e9\u0086\3\2\2\2\u01ea"+
		"\u01eb\t\27\2\2\u01eb\u0088\3\2\2\2\u01ec\u01ed\t\30\2\2\u01ed\u008a\3"+
		"\2\2\2\u01ee\u01ef\t\31\2\2\u01ef\u008c\3\2\2\2\u01f0\u01f1\t\32\2\2\u01f1"+
		"\u008e\3\2\2\2\u01f2\u01f3\t\33\2\2\u01f3\u0090\3\2\2\2\u01f4\u01f5\t"+
		"\34\2\2\u01f5\u0092\3\2\2\2\u01f6\u01f7\t\35\2\2\u01f7\u0094\3\2\2\2\u01f8"+
		"\u01f9\t\36\2\2\u01f9\u0096\3\2\2\2\u01fa\u01fb\t\37\2\2\u01fb\u0098\3"+
		"\2\2\2\u01fc\u01fd\t \2\2\u01fd\u009a\3\2\2\2\u01fe\u01ff\t!\2\2\u01ff"+
		"\u009c\3\2\2\2\u0200\u0201\t\"\2\2\u0201\u009e\3\2\2\2\24\2\u0131\u0133"+
		"\u0142\u0144\u014b\u014d\u0151\u0157\u015b\u0177\u0180\u019a\u01a6\u01b3"+
		"\u01bd\u01c0\u01c8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}