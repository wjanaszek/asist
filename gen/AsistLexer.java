// Generated from /Users/wjanaszek/Workspace/IdeaProjects/asist/src/main/antlr4/Asist.g4 by ANTLR 4.7
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
		T__0=1, IMPORT=2, NOTIFY=3, FUNCTION=4, IDENTIFIER=5, WHITESPACE=6, LINE_COMMENT=7, 
		COMMENT=8, NEW_LINE=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "IMPORT", "NOTIFY", "FUNCTION", "IDENTIFIER", "WHITESPACE", "LINE_COMMENT", 
		"COMMENT", "NEW_LINE", "DIGIT", "NON_ZERO_DIGIT", "LETTER", "A", "B", 
		"C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", 
		"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "IMPORT", "NOTIFY", "FUNCTION", "IDENTIFIER", "WHITESPACE", 
		"LINE_COMMENT", "COMMENT", "NEW_LINE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\5\n\u0093\n"+
		"\n\3\n\5\n\u0096\n\n\3\n\3\n\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3&\3&\3\'\3\'\4{\u0088\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2\3\2\36\4\2\13\13\"\"\4\2"+
		"C\\c|\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj"+
		"\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2S"+
		"Sss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u00bf\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3O\3\2\2\2"+
		"\5Q\3\2\2\2\7X\3\2\2\2\t_\3\2\2\2\13h\3\2\2\2\rq\3\2\2\2\17u\3\2\2\2\21"+
		"\u0082\3\2\2\2\23\u0095\3\2\2\2\25\u009b\3\2\2\2\27\u009d\3\2\2\2\31\u009f"+
		"\3\2\2\2\33\u00a1\3\2\2\2\35\u00a3\3\2\2\2\37\u00a5\3\2\2\2!\u00a7\3\2"+
		"\2\2#\u00a9\3\2\2\2%\u00ab\3\2\2\2\'\u00ad\3\2\2\2)\u00af\3\2\2\2+\u00b1"+
		"\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2"+
		"\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c3"+
		"\3\2\2\2?\u00c5\3\2\2\2A\u00c7\3\2\2\2C\u00c9\3\2\2\2E\u00cb\3\2\2\2G"+
		"\u00cd\3\2\2\2I\u00cf\3\2\2\2K\u00d1\3\2\2\2M\u00d3\3\2\2\2OP\7?\2\2P"+
		"\4\3\2\2\2QR\5+\26\2RS\5\63\32\2ST\59\35\2TU\5\67\34\2UV\5=\37\2VW\5A"+
		"!\2W\6\3\2\2\2XY\5\65\33\2YZ\5\67\34\2Z[\5A!\2[\\\5+\26\2\\]\5%\23\2]"+
		"^\5K&\2^\b\3\2\2\2_`\5%\23\2`a\5C\"\2ab\5\65\33\2bc\5\37\20\2cd\5A!\2"+
		"de\5+\26\2ef\5\67\34\2fg\5\65\33\2g\n\3\2\2\2hn\5\31\r\2im\5\31\r\2jm"+
		"\5\25\13\2km\7a\2\2li\3\2\2\2lj\3\2\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2"+
		"no\3\2\2\2o\f\3\2\2\2pn\3\2\2\2qr\t\2\2\2rs\3\2\2\2st\b\7\2\2t\16\3\2"+
		"\2\2uv\7\61\2\2vw\7\61\2\2w{\3\2\2\2xz\13\2\2\2yx\3\2\2\2z}\3\2\2\2{|"+
		"\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\5\23\n\2\177\u0080\3\2\2\2"+
		"\u0080\u0081\b\b\2\2\u0081\20\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084"+
		"\7,\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\b\t\2\2\u008f\22\3\2\2\2\u0090\u0096\7\17\2"+
		"\2\u0091\u0093\7\17\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\7\f\2\2\u0095\u0090\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\n\2\2\u0098\24\3\2\2\2\u0099\u009c"+
		"\7\62\2\2\u009a\u009c\5\27\f\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\26\3\2\2\2\u009d\u009e\4\63;\2\u009e\30\3\2\2\2\u009f\u00a0\t\3"+
		"\2\2\u00a0\32\3\2\2\2\u00a1\u00a2\t\4\2\2\u00a2\34\3\2\2\2\u00a3\u00a4"+
		"\t\5\2\2\u00a4\36\3\2\2\2\u00a5\u00a6\t\6\2\2\u00a6 \3\2\2\2\u00a7\u00a8"+
		"\t\7\2\2\u00a8\"\3\2\2\2\u00a9\u00aa\t\b\2\2\u00aa$\3\2\2\2\u00ab\u00ac"+
		"\t\t\2\2\u00ac&\3\2\2\2\u00ad\u00ae\t\n\2\2\u00ae(\3\2\2\2\u00af\u00b0"+
		"\t\13\2\2\u00b0*\3\2\2\2\u00b1\u00b2\t\f\2\2\u00b2,\3\2\2\2\u00b3\u00b4"+
		"\t\r\2\2\u00b4.\3\2\2\2\u00b5\u00b6\t\16\2\2\u00b6\60\3\2\2\2\u00b7\u00b8"+
		"\t\17\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\t\20\2\2\u00ba\64\3\2\2\2\u00bb"+
		"\u00bc\t\21\2\2\u00bc\66\3\2\2\2\u00bd\u00be\t\22\2\2\u00be8\3\2\2\2\u00bf"+
		"\u00c0\t\23\2\2\u00c0:\3\2\2\2\u00c1\u00c2\t\24\2\2\u00c2<\3\2\2\2\u00c3"+
		"\u00c4\t\25\2\2\u00c4>\3\2\2\2\u00c5\u00c6\t\26\2\2\u00c6@\3\2\2\2\u00c7"+
		"\u00c8\t\27\2\2\u00c8B\3\2\2\2\u00c9\u00ca\t\30\2\2\u00caD\3\2\2\2\u00cb"+
		"\u00cc\t\31\2\2\u00ccF\3\2\2\2\u00cd\u00ce\t\32\2\2\u00ceH\3\2\2\2\u00cf"+
		"\u00d0\t\33\2\2\u00d0J\3\2\2\2\u00d1\u00d2\t\34\2\2\u00d2L\3\2\2\2\u00d3"+
		"\u00d4\t\35\2\2\u00d4N\3\2\2\2\n\2ln{\u0088\u0092\u0095\u009b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}