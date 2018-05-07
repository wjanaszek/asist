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
		T__24=25, TRUE=26, FALSE=27, ALL=28, IMPORT=29, NOTIFY=30, IDENTIFIER=31, 
		SEARCH_FUNCTION=32, STRING=33, INTEGER_NUMBER=34, HOUR=35, MINUTE=36, 
		DAY=37, MONTH=38, YEAR=39, BOOLEAN=40, OBJECT_PROPERTIES=41, TIME=42, 
		DATE=43, ADDITION_OPERATOR=44, MULTIPLICATION_OPERATOR=45, RELATIVE_OPERATOR=46, 
		WHITESPACE=47, LINE_COMMENT=48, COMMENT=49, NEW_LINE=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"TRUE", "FALSE", "ALL", "IMPORT", "NOTIFY", "IDENTIFIER", "SEARCH_FUNCTION", 
		"STRING", "INTEGER_NUMBER", "HOUR", "MINUTE", "DAY", "MONTH", "YEAR", 
		"BOOLEAN", "OBJECT_PROPERTIES", "TIME", "DATE", "ADDITION_OPERATOR", "MULTIPLICATION_OPERATOR", 
		"RELATIVE_OPERATOR", "WHITESPACE", "LINE_COMMENT", "COMMENT", "NEW_LINE", 
		"SPECIAL_CHARACTER", "DIGIT", "NON_ZERO_DIGIT", "LETTER", "A", "B", "C", 
		"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", 
		"R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'with'", "'os_notification'", "'on'", "'when'", "'every'", "'in'", 
		"'second'", "'seconds'", "'minute'", "'minutes'", "'hour'", "'hours'", 
		"'='", "'| grep'", "'->'", "'('", "')'", "','", "'if ('", "') then'", 
		"'else'", "'endif'", "'or'", "'and'", "'not'", null, null, null, null, 
		null, null, "'list all'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "TRUE", "FALSE", "ALL", "IMPORT", "NOTIFY", "IDENTIFIER", 
		"SEARCH_FUNCTION", "STRING", "INTEGER_NUMBER", "HOUR", "MINUTE", "DAY", 
		"MONTH", "YEAR", "BOOLEAN", "OBJECT_PROPERTIES", "TIME", "DATE", "ADDITION_OPERATOR", 
		"MULTIPLICATION_OPERATOR", "RELATIVE_OPERATOR", "WHITESPACE", "LINE_COMMENT", 
		"COMMENT", "NEW_LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0215\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \7 \u0148\n \f \16 \u014b\13 \3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\7\"\u0159\n\"\f\"\16\"\u015c\13\"\3\"\3\"\3\"\3"+
		"\"\7\"\u0162\n\"\f\"\16\"\u0165\13\"\3\"\5\"\u0168\n\"\3#\3#\7#\u016c"+
		"\n#\f#\16#\u016f\13#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u018b\n)\3*\3*\3*\3*\3*\7*\u0192\n"+
		"*\f*\16*\u0195\13*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u01ae\n/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\7\61\u01b8\n\61\f\61\16\61\u01bb\13\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\7\62\u01c5\n\62\f\62\16\62\u01c8\13\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\63\3\63\5\63\u01d1\n\63\3\63\5\63\u01d4\n\63\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\5\65\u01dc\n\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3"+
		";\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3"+
		"F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\6"+
		"\u015a\u0163\u01b9\u01c6\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a"+
		"\62c\63e\64g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2"+
		"\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095"+
		"\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\3\2\"\4\2--//\4\2,"+
		",<<\4\2>>@@\4\2\13\13\"\"\n\2##&\'*\60<@BB]`}}\177\177\4\2C\\c|\4\2CC"+
		"cc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2"+
		"LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4"+
		"\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u020a"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3\u00a3\3\2\2\2\5\u00a8\3\2\2\2\7\u00b8\3"+
		"\2\2\2\t\u00bb\3\2\2\2\13\u00c0\3\2\2\2\r\u00c6\3\2\2\2\17\u00c9\3\2\2"+
		"\2\21\u00d0\3\2\2\2\23\u00d8\3\2\2\2\25\u00df\3\2\2\2\27\u00e7\3\2\2\2"+
		"\31\u00ec\3\2\2\2\33\u00f2\3\2\2\2\35\u00f4\3\2\2\2\37\u00fb\3\2\2\2!"+
		"\u00fe\3\2\2\2#\u0100\3\2\2\2%\u0102\3\2\2\2\'\u0104\3\2\2\2)\u0109\3"+
		"\2\2\2+\u0110\3\2\2\2-\u0115\3\2\2\2/\u011b\3\2\2\2\61\u011e\3\2\2\2\63"+
		"\u0122\3\2\2\2\65\u0126\3\2\2\2\67\u012b\3\2\2\29\u0131\3\2\2\2;\u0135"+
		"\3\2\2\2=\u013c\3\2\2\2?\u0143\3\2\2\2A\u014c\3\2\2\2C\u0167\3\2\2\2E"+
		"\u0169\3\2\2\2G\u0170\3\2\2\2I\u0173\3\2\2\2K\u0176\3\2\2\2M\u0179\3\2"+
		"\2\2O\u017c\3\2\2\2Q\u018a\3\2\2\2S\u018c\3\2\2\2U\u0196\3\2\2\2W\u019a"+
		"\3\2\2\2Y\u01a0\3\2\2\2[\u01a2\3\2\2\2]\u01ad\3\2\2\2_\u01af\3\2\2\2a"+
		"\u01b3\3\2\2\2c\u01c0\3\2\2\2e\u01d3\3\2\2\2g\u01d7\3\2\2\2i\u01db\3\2"+
		"\2\2k\u01dd\3\2\2\2m\u01df\3\2\2\2o\u01e1\3\2\2\2q\u01e3\3\2\2\2s\u01e5"+
		"\3\2\2\2u\u01e7\3\2\2\2w\u01e9\3\2\2\2y\u01eb\3\2\2\2{\u01ed\3\2\2\2}"+
		"\u01ef\3\2\2\2\177\u01f1\3\2\2\2\u0081\u01f3\3\2\2\2\u0083\u01f5\3\2\2"+
		"\2\u0085\u01f7\3\2\2\2\u0087\u01f9\3\2\2\2\u0089\u01fb\3\2\2\2\u008b\u01fd"+
		"\3\2\2\2\u008d\u01ff\3\2\2\2\u008f\u0201\3\2\2\2\u0091\u0203\3\2\2\2\u0093"+
		"\u0205\3\2\2\2\u0095\u0207\3\2\2\2\u0097\u0209\3\2\2\2\u0099\u020b\3\2"+
		"\2\2\u009b\u020d\3\2\2\2\u009d\u020f\3\2\2\2\u009f\u0211\3\2\2\2\u00a1"+
		"\u0213\3\2\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7v\2"+
		"\2\u00a6\u00a7\7j\2\2\u00a7\4\3\2\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7"+
		"u\2\2\u00aa\u00ab\7a\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae"+
		"\7v\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7h\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7e\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7k\2\2"+
		"\u00b5\u00b6\7q\2\2\u00b6\u00b7\7p\2\2\u00b7\6\3\2\2\2\u00b8\u00b9\7q"+
		"\2\2\u00b9\u00ba\7p\2\2\u00ba\b\3\2\2\2\u00bb\u00bc\7y\2\2\u00bc\u00bd"+
		"\7j\2\2\u00bd\u00be\7g\2\2\u00be\u00bf\7p\2\2\u00bf\n\3\2\2\2\u00c0\u00c1"+
		"\7g\2\2\u00c1\u00c2\7x\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c5\7{\2\2\u00c5\f\3\2\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\16\3\2\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7f\2\2\u00cf\20\3\2\2\2\u00d0"+
		"\u00d1\7u\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2"+
		"\u00d4\u00d5\7p\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7u\2\2\u00d7\22\3\2"+
		"\2\2\u00d8\u00d9\7o\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7w\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7g\2\2\u00de\24\3\2\2\2\u00df\u00e0"+
		"\7o\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7w\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7u\2\2\u00e6\26\3\2\2\2\u00e7"+
		"\u00e8\7j\2\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7w\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb\30\3\2\2\2\u00ec\u00ed\7j\2\2\u00ed\u00ee\7q\2\2\u00ee\u00ef\7"+
		"w\2\2\u00ef\u00f0\7t\2\2\u00f0\u00f1\7u\2\2\u00f1\32\3\2\2\2\u00f2\u00f3"+
		"\7?\2\2\u00f3\34\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7\"\2\2\u00f6"+
		"\u00f7\7i\2\2\u00f7\u00f8\7t\2\2\u00f8\u00f9\7g\2\2\u00f9\u00fa\7r\2\2"+
		"\u00fa\36\3\2\2\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\7@\2\2\u00fd \3\2\2\2"+
		"\u00fe\u00ff\7*\2\2\u00ff\"\3\2\2\2\u0100\u0101\7+\2\2\u0101$\3\2\2\2"+
		"\u0102\u0103\7.\2\2\u0103&\3\2\2\2\u0104\u0105\7k\2\2\u0105\u0106\7h\2"+
		"\2\u0106\u0107\7\"\2\2\u0107\u0108\7*\2\2\u0108(\3\2\2\2\u0109\u010a\7"+
		"+\2\2\u010a\u010b\7\"\2\2\u010b\u010c\7v\2\2\u010c\u010d\7j\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7p\2\2\u010f*\3\2\2\2\u0110\u0111\7g\2\2\u0111"+
		"\u0112\7n\2\2\u0112\u0113\7u\2\2\u0113\u0114\7g\2\2\u0114,\3\2\2\2\u0115"+
		"\u0116\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118\7f\2\2\u0118\u0119\7k\2\2"+
		"\u0119\u011a\7h\2\2\u011a.\3\2\2\2\u011b\u011c\7q\2\2\u011c\u011d\7t\2"+
		"\2\u011d\60\3\2\2\2\u011e\u011f\7c\2\2\u011f\u0120\7p\2\2\u0120\u0121"+
		"\7f\2\2\u0121\62\3\2\2\2\u0122\u0123\7p\2\2\u0123\u0124\7q\2\2\u0124\u0125"+
		"\7v\2\2\u0125\64\3\2\2\2\u0126\u0127\5\u0095K\2\u0127\u0128\5\u0091I\2"+
		"\u0128\u0129\5\u0097L\2\u0129\u012a\5w<\2\u012a\66\3\2\2\2\u012b\u012c"+
		"\5y=\2\u012c\u012d\5o8\2\u012d\u012e\5\u0085C\2\u012e\u012f\5\u0093J\2"+
		"\u012f\u0130\5w<\2\u01308\3\2\2\2\u0131\u0132\5o8\2\u0132\u0133\5\u0085"+
		"C\2\u0133\u0134\5\u0085C\2\u0134:\3\2\2\2\u0135\u0136\5\177@\2\u0136\u0137"+
		"\5\u0087D\2\u0137\u0138\5\u008dG\2\u0138\u0139\5\u008bF\2\u0139\u013a"+
		"\5\u0091I\2\u013a\u013b\5\u0095K\2\u013b<\3\2\2\2\u013c\u013d\5\u0089"+
		"E\2\u013d\u013e\5\u008bF\2\u013e\u013f\5\u0095K\2\u013f\u0140\5\177@\2"+
		"\u0140\u0141\5y=\2\u0141\u0142\5\u009fP\2\u0142>\3\2\2\2\u0143\u0149\5"+
		"m\67\2\u0144\u0148\5m\67\2\u0145\u0148\5i\65\2\u0146\u0148\7a\2\2\u0147"+
		"\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a@\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014d\7n\2\2\u014d\u014e\7k\2\2\u014e\u014f\7u\2\2\u014f"+
		"\u0150\7v\2\2\u0150\u0151\7\"\2\2\u0151\u0152\7c\2\2\u0152\u0153\7n\2"+
		"\2\u0153\u0154\7n\2\2\u0154B\3\2\2\2\u0155\u015a\7$\2\2\u0156\u0159\5"+
		"m\67\2\u0157\u0159\13\2\2\2\u0158\u0156\3\2\2\2\u0158\u0157\3\2\2\2\u0159"+
		"\u015c\3\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b\u015d\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\u0168\7$\2\2\u015e\u0163\7)\2\2\u015f\u0162"+
		"\5m\67\2\u0160\u0162\13\2\2\2\u0161\u015f\3\2\2\2\u0161\u0160\3\2\2\2"+
		"\u0162\u0165\3\2\2\2\u0163\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0168\7)\2\2\u0167\u0155\3\2\2\2\u0167"+
		"\u015e\3\2\2\2\u0168D\3\2\2\2\u0169\u016d\5k\66\2\u016a\u016c\5i\65\2"+
		"\u016b\u016a\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e"+
		"\3\2\2\2\u016eF\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5i\65\2\u0171"+
		"\u0172\5i\65\2\u0172H\3\2\2\2\u0173\u0174\5i\65\2\u0174\u0175\5i\65\2"+
		"\u0175J\3\2\2\2\u0176\u0177\5i\65\2\u0177\u0178\5i\65\2\u0178L\3\2\2\2"+
		"\u0179\u017a\5i\65\2\u017a\u017b\5i\65\2\u017bN\3\2\2\2\u017c\u017d\5"+
		"i\65\2\u017d\u017e\5i\65\2\u017e\u017f\5i\65\2\u017f\u0180\5i\65\2\u0180"+
		"P\3\2\2\2\u0181\u0182\7v\2\2\u0182\u0183\7t\2\2\u0183\u0184\7w\2\2\u0184"+
		"\u018b\7g\2\2\u0185\u0186\7h\2\2\u0186\u0187\7c\2\2\u0187\u0188\7n\2\2"+
		"\u0188\u0189\7u\2\2\u0189\u018b\7g\2\2\u018a\u0181\3\2\2\2\u018a\u0185"+
		"\3\2\2\2\u018bR\3\2\2\2\u018c\u018d\5? \2\u018d\u018e\7\60\2\2\u018e\u0193"+
		"\5? \2\u018f\u0190\7\60\2\2\u0190\u0192\5? \2\u0191\u018f\3\2\2\2\u0192"+
		"\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194T\3\2\2\2"+
		"\u0195\u0193\3\2\2\2\u0196\u0197\5G$\2\u0197\u0198\7\61\2\2\u0198\u0199"+
		"\5I%\2\u0199V\3\2\2\2\u019a\u019b\5K&\2\u019b\u019c\7\61\2\2\u019c\u019d"+
		"\5M\'\2\u019d\u019e\7\61\2\2\u019e\u019f\5O(\2\u019fX\3\2\2\2\u01a0\u01a1"+
		"\t\2\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\t\3\2\2\u01a3\\\3\2\2\2\u01a4\u01a5"+
		"\7?\2\2\u01a5\u01ae\7?\2\2\u01a6\u01ae\t\4\2\2\u01a7\u01a8\7>\2\2\u01a8"+
		"\u01ae\7?\2\2\u01a9\u01aa\7#\2\2\u01aa\u01ae\7?\2\2\u01ab\u01ac\7@\2\2"+
		"\u01ac\u01ae\7?\2\2\u01ad\u01a4\3\2\2\2\u01ad\u01a6\3\2\2\2\u01ad\u01a7"+
		"\3\2\2\2\u01ad\u01a9\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae^\3\2\2\2\u01af"+
		"\u01b0\t\5\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\b\60\2\2\u01b2`\3\2\2\2"+
		"\u01b3\u01b4\7\61\2\2\u01b4\u01b5\7\61\2\2\u01b5\u01b9\3\2\2\2\u01b6\u01b8"+
		"\13\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01ba\3\2\2\2"+
		"\u01b9\u01b7\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd"+
		"\5e\63\2\u01bd\u01be\3\2\2\2\u01be\u01bf\b\61\2\2\u01bfb\3\2\2\2\u01c0"+
		"\u01c1\7\61\2\2\u01c1\u01c2\7,\2\2\u01c2\u01c6\3\2\2\2\u01c3\u01c5\13"+
		"\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01ca\7,"+
		"\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\b\62\2\2\u01cd"+
		"d\3\2\2\2\u01ce\u01d4\7\17\2\2\u01cf\u01d1\7\17\2\2\u01d0\u01cf\3\2\2"+
		"\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\7\f\2\2\u01d3\u01ce"+
		"\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b\63\2\2"+
		"\u01d6f\3\2\2\2\u01d7\u01d8\t\6\2\2\u01d8h\3\2\2\2\u01d9\u01dc\7\62\2"+
		"\2\u01da\u01dc\5k\66\2\u01db\u01d9\3\2\2\2\u01db\u01da\3\2\2\2\u01dcj"+
		"\3\2\2\2\u01dd\u01de\4\63;\2\u01del\3\2\2\2\u01df\u01e0\t\7\2\2\u01e0"+
		"n\3\2\2\2\u01e1\u01e2\t\b\2\2\u01e2p\3\2\2\2\u01e3\u01e4\t\t\2\2\u01e4"+
		"r\3\2\2\2\u01e5\u01e6\t\n\2\2\u01e6t\3\2\2\2\u01e7\u01e8\t\13\2\2\u01e8"+
		"v\3\2\2\2\u01e9\u01ea\t\f\2\2\u01eax\3\2\2\2\u01eb\u01ec\t\r\2\2\u01ec"+
		"z\3\2\2\2\u01ed\u01ee\t\16\2\2\u01ee|\3\2\2\2\u01ef\u01f0\t\17\2\2\u01f0"+
		"~\3\2\2\2\u01f1\u01f2\t\20\2\2\u01f2\u0080\3\2\2\2\u01f3\u01f4\t\21\2"+
		"\2\u01f4\u0082\3\2\2\2\u01f5\u01f6\t\22\2\2\u01f6\u0084\3\2\2\2\u01f7"+
		"\u01f8\t\23\2\2\u01f8\u0086\3\2\2\2\u01f9\u01fa\t\24\2\2\u01fa\u0088\3"+
		"\2\2\2\u01fb\u01fc\t\25\2\2\u01fc\u008a\3\2\2\2\u01fd\u01fe\t\26\2\2\u01fe"+
		"\u008c\3\2\2\2\u01ff\u0200\t\27\2\2\u0200\u008e\3\2\2\2\u0201\u0202\t"+
		"\30\2\2\u0202\u0090\3\2\2\2\u0203\u0204\t\31\2\2\u0204\u0092\3\2\2\2\u0205"+
		"\u0206\t\32\2\2\u0206\u0094\3\2\2\2\u0207\u0208\t\33\2\2\u0208\u0096\3"+
		"\2\2\2\u0209\u020a\t\34\2\2\u020a\u0098\3\2\2\2\u020b\u020c\t\35\2\2\u020c"+
		"\u009a\3\2\2\2\u020d\u020e\t\36\2\2\u020e\u009c\3\2\2\2\u020f\u0210\t"+
		"\37\2\2\u0210\u009e\3\2\2\2\u0211\u0212\t \2\2\u0212\u00a0\3\2\2\2\u0213"+
		"\u0214\t!\2\2\u0214\u00a2\3\2\2\2\23\2\u0147\u0149\u0158\u015a\u0161\u0163"+
		"\u0167\u016d\u018a\u0193\u01ad\u01b9\u01c6\u01d0\u01d3\u01db\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}