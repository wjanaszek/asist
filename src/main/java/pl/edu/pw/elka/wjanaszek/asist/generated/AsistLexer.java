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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		TRUE=25, FALSE=26, ALL=27, IMPORT=28, NOTIFY=29, IDENTIFIER=30, SEARCH_FUNCTION=31, 
		STRING=32, INTEGER_NUMBER=33, HOUR=34, MINUTE=35, DAY=36, MONTH=37, YEAR=38, 
		BOOLEAN=39, OBJECT_PROPERTIES=40, TIME=41, DATE=42, ADDITION_OPERATOR=43, 
		MULTIPLICATION_OPERATOR=44, RELATIVE_OPERATOR=45, WHITESPACE=46, LINE_COMMENT=47, 
		COMMENT=48, NEW_LINE=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "TRUE", 
		"FALSE", "ALL", "IMPORT", "NOTIFY", "IDENTIFIER", "SEARCH_FUNCTION", "STRING", 
		"INTEGER_NUMBER", "HOUR", "MINUTE", "DAY", "MONTH", "YEAR", "BOOLEAN", 
		"OBJECT_PROPERTIES", "TIME", "DATE", "ADDITION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"RELATIVE_OPERATOR", "WHITESPACE", "LINE_COMMENT", "COMMENT", "NEW_LINE", 
		"SPECIAL_CHARACTER", "DIGIT", "NON_ZERO_DIGIT", "LETTER", "A", "B", "C", 
		"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
		"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'with'", "'os_notification'", "'on'", "'when'", "'every'", "'in'", 
		"'second'", "'seconds'", "'minute'", "'minutes'", "'hour'", "'hours'", 
		"'='", "'| grep'", "'->'", "'('", "')'", "'if ('", "') then'", "'else'", 
		"'endif'", "'or'", "'and'", "'not'", null, null, null, null, null, null, 
		"'list all'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "TRUE", "FALSE", "ALL", "IMPORT", "NOTIFY", "IDENTIFIER", "SEARCH_FUNCTION", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0214\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\7\37\u0144\n\37\f\37\16\37\u0147\13\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\7!\u0155\n!\f!\16!\u0158\13!\3!\3!\3!\3!\7!\u015e"+
		"\n!\f!\16!\u0161\13!\3!\5!\u0164\n!\3\"\3\"\7\"\u0168\n\"\f\"\16\"\u016b"+
		"\13\"\3\"\5\"\u016e\n\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u018a\n(\3)\3)\3)\3)\3)\7)\u0191"+
		"\n)\f)\16)\u0194\13)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u01ad\n.\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u01b7"+
		"\n\60\f\60\16\60\u01ba\13\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7"+
		"\61\u01c4\n\61\f\61\16\61\u01c7\13\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\5\62\u01d0\n\62\3\62\5\62\u01d3\n\62\3\62\3\62\3\63\3\63\3\64\3\64"+
		"\5\64\u01db\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3"+
		";\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3"+
		"G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\6\u0156\u015f"+
		"\u01b8\u01c5\2Q\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\2"+
		"g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099"+
		"\2\u009b\2\u009d\2\u009f\2\3\2#\4\2BBaa\4\2--//\4\2,,<<\4\2>>@@\4\2\13"+
		"\13\"\"\n\2##&\'*\60<@BB]`}}\177\177\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEee"+
		"\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2N"+
		"Nnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u020a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\3\u00a1\3\2\2\2\5\u00a6\3\2\2\2\7\u00b6\3\2\2\2\t\u00b9\3\2\2\2\13"+
		"\u00be\3\2\2\2\r\u00c4\3\2\2\2\17\u00c7\3\2\2\2\21\u00ce\3\2\2\2\23\u00d6"+
		"\3\2\2\2\25\u00dd\3\2\2\2\27\u00e5\3\2\2\2\31\u00ea\3\2\2\2\33\u00f0\3"+
		"\2\2\2\35\u00f2\3\2\2\2\37\u00f9\3\2\2\2!\u00fc\3\2\2\2#\u00fe\3\2\2\2"+
		"%\u0100\3\2\2\2\'\u0105\3\2\2\2)\u010c\3\2\2\2+\u0111\3\2\2\2-\u0117\3"+
		"\2\2\2/\u011a\3\2\2\2\61\u011e\3\2\2\2\63\u0122\3\2\2\2\65\u0127\3\2\2"+
		"\2\67\u012d\3\2\2\29\u0131\3\2\2\2;\u0138\3\2\2\2=\u013f\3\2\2\2?\u0148"+
		"\3\2\2\2A\u0163\3\2\2\2C\u016d\3\2\2\2E\u016f\3\2\2\2G\u0172\3\2\2\2I"+
		"\u0175\3\2\2\2K\u0178\3\2\2\2M\u017b\3\2\2\2O\u0189\3\2\2\2Q\u018b\3\2"+
		"\2\2S\u0195\3\2\2\2U\u0199\3\2\2\2W\u019f\3\2\2\2Y\u01a1\3\2\2\2[\u01ac"+
		"\3\2\2\2]\u01ae\3\2\2\2_\u01b2\3\2\2\2a\u01bf\3\2\2\2c\u01d2\3\2\2\2e"+
		"\u01d6\3\2\2\2g\u01da\3\2\2\2i\u01dc\3\2\2\2k\u01de\3\2\2\2m\u01e0\3\2"+
		"\2\2o\u01e2\3\2\2\2q\u01e4\3\2\2\2s\u01e6\3\2\2\2u\u01e8\3\2\2\2w\u01ea"+
		"\3\2\2\2y\u01ec\3\2\2\2{\u01ee\3\2\2\2}\u01f0\3\2\2\2\177\u01f2\3\2\2"+
		"\2\u0081\u01f4\3\2\2\2\u0083\u01f6\3\2\2\2\u0085\u01f8\3\2\2\2\u0087\u01fa"+
		"\3\2\2\2\u0089\u01fc\3\2\2\2\u008b\u01fe\3\2\2\2\u008d\u0200\3\2\2\2\u008f"+
		"\u0202\3\2\2\2\u0091\u0204\3\2\2\2\u0093\u0206\3\2\2\2\u0095\u0208\3\2"+
		"\2\2\u0097\u020a\3\2\2\2\u0099\u020c\3\2\2\2\u009b\u020e\3\2\2\2\u009d"+
		"\u0210\3\2\2\2\u009f\u0212\3\2\2\2\u00a1\u00a2\7y\2\2\u00a2\u00a3\7k\2"+
		"\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7j\2\2\u00a5\4\3\2\2\2\u00a6\u00a7\7"+
		"q\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7a\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00b0\7e\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7v\2\2"+
		"\u00b2\u00b3\7k\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7p\2\2\u00b5\6\3\2"+
		"\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7p\2\2\u00b8\b\3\2\2\2\u00b9\u00ba"+
		"\7y\2\2\u00ba\u00bb\7j\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"\n\3\2\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\u00c2\7t\2\2\u00c2\u00c3\7{\2\2\u00c3\f\3\2\2\2\u00c4\u00c5\7k\2\2\u00c5"+
		"\u00c6\7p\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7e\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7f\2\2"+
		"\u00cd\20\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7"+
		"e\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4\7f\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5\22\3\2\2\2\u00d6\u00d7\7o\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7p\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc"+
		"\24\3\2\2\2\u00dd\u00de\7o\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0"+
		"\u00e1\7w\2\2\u00e1\u00e2\7v\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7u\2\2"+
		"\u00e4\26\3\2\2\2\u00e5\u00e6\7j\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7"+
		"w\2\2\u00e8\u00e9\7t\2\2\u00e9\30\3\2\2\2\u00ea\u00eb\7j\2\2\u00eb\u00ec"+
		"\7q\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7t\2\2\u00ee\u00ef\7u\2\2\u00ef"+
		"\32\3\2\2\2\u00f0\u00f1\7?\2\2\u00f1\34\3\2\2\2\u00f2\u00f3\7~\2\2\u00f3"+
		"\u00f4\7\"\2\2\u00f4\u00f5\7i\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2"+
		"\2\u00f7\u00f8\7r\2\2\u00f8\36\3\2\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb"+
		"\7@\2\2\u00fb \3\2\2\2\u00fc\u00fd\7*\2\2\u00fd\"\3\2\2\2\u00fe\u00ff"+
		"\7+\2\2\u00ff$\3\2\2\2\u0100\u0101\7k\2\2\u0101\u0102\7h\2\2\u0102\u0103"+
		"\7\"\2\2\u0103\u0104\7*\2\2\u0104&\3\2\2\2\u0105\u0106\7+\2\2\u0106\u0107"+
		"\7\"\2\2\u0107\u0108\7v\2\2\u0108\u0109\7j\2\2\u0109\u010a\7g\2\2\u010a"+
		"\u010b\7p\2\2\u010b(\3\2\2\2\u010c\u010d\7g\2\2\u010d\u010e\7n\2\2\u010e"+
		"\u010f\7u\2\2\u010f\u0110\7g\2\2\u0110*\3\2\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7p\2\2\u0113\u0114\7f\2\2\u0114\u0115\7k\2\2\u0115\u0116\7h\2\2"+
		"\u0116,\3\2\2\2\u0117\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119.\3\2\2\2\u011a"+
		"\u011b\7c\2\2\u011b\u011c\7p\2\2\u011c\u011d\7f\2\2\u011d\60\3\2\2\2\u011e"+
		"\u011f\7p\2\2\u011f\u0120\7q\2\2\u0120\u0121\7v\2\2\u0121\62\3\2\2\2\u0122"+
		"\u0123\5\u0093J\2\u0123\u0124\5\u008fH\2\u0124\u0125\5\u0095K\2\u0125"+
		"\u0126\5u;\2\u0126\64\3\2\2\2\u0127\u0128\5w<\2\u0128\u0129\5m\67\2\u0129"+
		"\u012a\5\u0083B\2\u012a\u012b\5\u0091I\2\u012b\u012c\5u;\2\u012c\66\3"+
		"\2\2\2\u012d\u012e\5m\67\2\u012e\u012f\5\u0083B\2\u012f\u0130\5\u0083"+
		"B\2\u01308\3\2\2\2\u0131\u0132\5}?\2\u0132\u0133\5\u0085C\2\u0133\u0134"+
		"\5\u008bF\2\u0134\u0135\5\u0089E\2\u0135\u0136\5\u008fH\2\u0136\u0137"+
		"\5\u0093J\2\u0137:\3\2\2\2\u0138\u0139\5\u0087D\2\u0139\u013a\5\u0089"+
		"E\2\u013a\u013b\5\u0093J\2\u013b\u013c\5}?\2\u013c\u013d\5w<\2\u013d\u013e"+
		"\5\u009dO\2\u013e<\3\2\2\2\u013f\u0145\5k\66\2\u0140\u0144\5k\66\2\u0141"+
		"\u0144\5g\64\2\u0142\u0144\t\2\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2"+
		"\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146>\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7n\2\2\u0149"+
		"\u014a\7k\2\2\u014a\u014b\7u\2\2\u014b\u014c\7v\2\2\u014c\u014d\7\"\2"+
		"\2\u014d\u014e\7c\2\2\u014e\u014f\7n\2\2\u014f\u0150\7n\2\2\u0150@\3\2"+
		"\2\2\u0151\u0156\7$\2\2\u0152\u0155\5k\66\2\u0153\u0155\13\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0157\3\2"+
		"\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u0164\7$\2\2\u015a\u015f\7)\2\2\u015b\u015e\5k\66\2\u015c\u015e\13\2"+
		"\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\u0161\3\2\2\2\u015f"+
		"\u0160\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0162\u0164\7)\2\2\u0163\u0151\3\2\2\2\u0163\u015a\3\2\2\2\u0164"+
		"B\3\2\2\2\u0165\u0169\5i\65\2\u0166\u0168\5g\64\2\u0167\u0166\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016e"+
		"\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016e\5g\64\2\u016d\u0165\3\2\2\2\u016d"+
		"\u016c\3\2\2\2\u016eD\3\2\2\2\u016f\u0170\5g\64\2\u0170\u0171\5g\64\2"+
		"\u0171F\3\2\2\2\u0172\u0173\5g\64\2\u0173\u0174\5g\64\2\u0174H\3\2\2\2"+
		"\u0175\u0176\5g\64\2\u0176\u0177\5g\64\2\u0177J\3\2\2\2\u0178\u0179\5"+
		"g\64\2\u0179\u017a\5g\64\2\u017aL\3\2\2\2\u017b\u017c\5g\64\2\u017c\u017d"+
		"\5g\64\2\u017d\u017e\5g\64\2\u017e\u017f\5g\64\2\u017fN\3\2\2\2\u0180"+
		"\u0181\7v\2\2\u0181\u0182\7t\2\2\u0182\u0183\7w\2\2\u0183\u018a\7g\2\2"+
		"\u0184\u0185\7h\2\2\u0185\u0186\7c\2\2\u0186\u0187\7n\2\2\u0187\u0188"+
		"\7u\2\2\u0188\u018a\7g\2\2\u0189\u0180\3\2\2\2\u0189\u0184\3\2\2\2\u018a"+
		"P\3\2\2\2\u018b\u018c\5=\37\2\u018c\u018d\7\60\2\2\u018d\u0192\5=\37\2"+
		"\u018e\u018f\7\60\2\2\u018f\u0191\5=\37\2\u0190\u018e\3\2\2\2\u0191\u0194"+
		"\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193R\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0196\5E#\2\u0196\u0197\7\61\2\2\u0197\u0198\5G$"+
		"\2\u0198T\3\2\2\2\u0199\u019a\5I%\2\u019a\u019b\7\61\2\2\u019b\u019c\5"+
		"K&\2\u019c\u019d\7\61\2\2\u019d\u019e\5M\'\2\u019eV\3\2\2\2\u019f\u01a0"+
		"\t\3\2\2\u01a0X\3\2\2\2\u01a1\u01a2\t\4\2\2\u01a2Z\3\2\2\2\u01a3\u01a4"+
		"\7?\2\2\u01a4\u01ad\7?\2\2\u01a5\u01ad\t\5\2\2\u01a6\u01a7\7>\2\2\u01a7"+
		"\u01ad\7?\2\2\u01a8\u01a9\7#\2\2\u01a9\u01ad\7?\2\2\u01aa\u01ab\7@\2\2"+
		"\u01ab\u01ad\7?\2\2\u01ac\u01a3\3\2\2\2\u01ac\u01a5\3\2\2\2\u01ac\u01a6"+
		"\3\2\2\2\u01ac\u01a8\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\\\3\2\2\2\u01ae"+
		"\u01af\t\6\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\b/\2\2\u01b1^\3\2\2\2\u01b2"+
		"\u01b3\7\61\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b8\3\2\2\2\u01b5\u01b7\13"+
		"\2\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b9\u01bb\3\2\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\5c"+
		"\62\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\b\60\2\2\u01be`\3\2\2\2\u01bf\u01c0"+
		"\7\61\2\2\u01c0\u01c1\7,\2\2\u01c1\u01c5\3\2\2\2\u01c2\u01c4\13\2\2\2"+
		"\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7,\2\2\u01c9"+
		"\u01ca\7\61\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\b\61\2\2\u01ccb\3\2\2"+
		"\2\u01cd\u01d3\7\17\2\2\u01ce\u01d0\7\17\2\2\u01cf\u01ce\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\7\f\2\2\u01d2\u01cd\3\2"+
		"\2\2\u01d2\u01cf\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\b\62\2\2\u01d5"+
		"d\3\2\2\2\u01d6\u01d7\t\7\2\2\u01d7f\3\2\2\2\u01d8\u01db\7\62\2\2\u01d9"+
		"\u01db\5i\65\2\u01da\u01d8\3\2\2\2\u01da\u01d9\3\2\2\2\u01dbh\3\2\2\2"+
		"\u01dc\u01dd\4\63;\2\u01ddj\3\2\2\2\u01de\u01df\t\b\2\2\u01dfl\3\2\2\2"+
		"\u01e0\u01e1\t\t\2\2\u01e1n\3\2\2\2\u01e2\u01e3\t\n\2\2\u01e3p\3\2\2\2"+
		"\u01e4\u01e5\t\13\2\2\u01e5r\3\2\2\2\u01e6\u01e7\t\f\2\2\u01e7t\3\2\2"+
		"\2\u01e8\u01e9\t\r\2\2\u01e9v\3\2\2\2\u01ea\u01eb\t\16\2\2\u01ebx\3\2"+
		"\2\2\u01ec\u01ed\t\17\2\2\u01edz\3\2\2\2\u01ee\u01ef\t\20\2\2\u01ef|\3"+
		"\2\2\2\u01f0\u01f1\t\21\2\2\u01f1~\3\2\2\2\u01f2\u01f3\t\22\2\2\u01f3"+
		"\u0080\3\2\2\2\u01f4\u01f5\t\23\2\2\u01f5\u0082\3\2\2\2\u01f6\u01f7\t"+
		"\24\2\2\u01f7\u0084\3\2\2\2\u01f8\u01f9\t\25\2\2\u01f9\u0086\3\2\2\2\u01fa"+
		"\u01fb\t\26\2\2\u01fb\u0088\3\2\2\2\u01fc\u01fd\t\27\2\2\u01fd\u008a\3"+
		"\2\2\2\u01fe\u01ff\t\30\2\2\u01ff\u008c\3\2\2\2\u0200\u0201\t\31\2\2\u0201"+
		"\u008e\3\2\2\2\u0202\u0203\t\32\2\2\u0203\u0090\3\2\2\2\u0204\u0205\t"+
		"\33\2\2\u0205\u0092\3\2\2\2\u0206\u0207\t\34\2\2\u0207\u0094\3\2\2\2\u0208"+
		"\u0209\t\35\2\2\u0209\u0096\3\2\2\2\u020a\u020b\t\36\2\2\u020b\u0098\3"+
		"\2\2\2\u020c\u020d\t\37\2\2\u020d\u009a\3\2\2\2\u020e\u020f\t \2\2\u020f"+
		"\u009c\3\2\2\2\u0210\u0211\t!\2\2\u0211\u009e\3\2\2\2\u0212\u0213\t\""+
		"\2\2\u0213\u00a0\3\2\2\2\24\2\u0143\u0145\u0154\u0156\u015d\u015f\u0163"+
		"\u0169\u016d\u0189\u0192\u01ac\u01b8\u01c5\u01cf\u01d2\u01da\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}