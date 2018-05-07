package pl.edu.pw.elka.wjanaszek.asist.generated;// Generated from /Users/wjanaszek/Workspace/IdeaProjects/asist/src/main/antlr4/Asist.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsistParser extends Parser {
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
	public static final int
		RULE_script = 0, RULE_statement = 1, RULE_importStatement = 2, RULE_notificationStatement = 3, 
		RULE_firedWhen = 4, RULE_timeBased = 5, RULE_singleTime = 6, RULE_pluralTime = 7, 
		RULE_actionType = 8, RULE_timePrecisely = 9, RULE_onEvent = 10, RULE_every = 11, 
		RULE_in = 12, RULE_second = 13, RULE_seconds = 14, RULE_minute = 15, RULE_minutes = 16, 
		RULE_hour = 17, RULE_hours = 18, RULE_variableOrAssignment = 19, RULE_variable = 20, 
		RULE_variableAssignment = 21, RULE_expression = 22, RULE_assignVariable = 23, 
		RULE_booleanExpression = 24, RULE_searchFunction = 25, RULE_objectProperties = 26, 
		RULE_arithmeticOperation = 27, RULE_additionExpression = 28, RULE_multiplyExpression = 29, 
		RULE_atomExpression = 30, RULE_functionCall = 31, RULE_params = 32, RULE_ifStatement = 33, 
		RULE_conditionExpression = 34, RULE_ifInstructions = 35, RULE_elseInstructions = 36, 
		RULE_instruction = 37, RULE_simpleExpression = 38, RULE_term = 39, RULE_factor = 40;
	public static final String[] ruleNames = {
		"script", "statement", "importStatement", "notificationStatement", "firedWhen", 
		"timeBased", "singleTime", "pluralTime", "actionType", "timePrecisely", 
		"onEvent", "every", "in", "second", "seconds", "minute", "minutes", "hour", 
		"hours", "variableOrAssignment", "variable", "variableAssignment", "expression", 
		"assignVariable", "booleanExpression", "searchFunction", "objectProperties", 
		"arithmeticOperation", "additionExpression", "multiplyExpression", "atomExpression", 
		"functionCall", "params", "ifStatement", "conditionExpression", "ifInstructions", 
		"elseInstructions", "instruction", "simpleExpression", "term", "factor"
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

	@Override
	public String getGrammarFileName() { return "Asist.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AsistParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << IMPORT) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public NotificationStatementContext notificationStatement() {
			return getRuleContext(NotificationStatementContext.class,0);
		}
		public VariableOrAssignmentContext variableOrAssignment() {
			return getRuleContext(VariableOrAssignmentContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SearchFunctionContext searchFunction() {
			return getRuleContext(SearchFunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				notificationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				variableOrAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				searchFunction();
				}
				break;
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(AsistParser.IMPORT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(IMPORT);
			setState(96);
			match(IDENTIFIER);
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

	public static class NotificationStatementContext extends ParserRuleContext {
		public TerminalNode NOTIFY() { return getToken(AsistParser.NOTIFY, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public FiredWhenContext firedWhen() {
			return getRuleContext(FiredWhenContext.class,0);
		}
		public TerminalNode STRING() { return getToken(AsistParser.STRING, 0); }
		public ActionTypeContext actionType() {
			return getRuleContext(ActionTypeContext.class,0);
		}
		public NotificationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notificationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterNotificationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitNotificationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitNotificationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationStatementContext notificationStatement() throws RecognitionException {
		NotificationStatementContext _localctx = new NotificationStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notificationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(NOTIFY);
			setState(99);
			match(IDENTIFIER);
			setState(100);
			firedWhen();
			setState(101);
			match(STRING);
			setState(102);
			match(T__0);
			setState(103);
			actionType();
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

	public static class FiredWhenContext extends ParserRuleContext {
		public TimeBasedContext timeBased() {
			return getRuleContext(TimeBasedContext.class,0);
		}
		public TimePreciselyContext timePrecisely() {
			return getRuleContext(TimePreciselyContext.class,0);
		}
		public OnEventContext onEvent() {
			return getRuleContext(OnEventContext.class,0);
		}
		public FiredWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firedWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterFiredWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitFiredWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitFiredWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiredWhenContext firedWhen() throws RecognitionException {
		FiredWhenContext _localctx = new FiredWhenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firedWhen);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				timeBased();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				timePrecisely();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				onEvent();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TimeBasedContext extends ParserRuleContext {
		public EveryContext every() {
			return getRuleContext(EveryContext.class,0);
		}
		public InContext in() {
			return getRuleContext(InContext.class,0);
		}
		public SingleTimeContext singleTime() {
			return getRuleContext(SingleTimeContext.class,0);
		}
		public PluralTimeContext pluralTime() {
			return getRuleContext(PluralTimeContext.class,0);
		}
		public TimeBasedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeBased; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterTimeBased(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitTimeBased(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitTimeBased(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeBasedContext timeBased() throws RecognitionException {
		TimeBasedContext _localctx = new TimeBasedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_timeBased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(110);
				every();
				}
				break;
			case T__5:
				{
				setState(111);
				in();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__10:
				{
				setState(114);
				singleTime();
				}
				break;
			case INTEGER_NUMBER:
				{
				setState(115);
				pluralTime();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class SingleTimeContext extends ParserRuleContext {
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public SingleTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterSingleTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitSingleTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitSingleTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTimeContext singleTime() throws RecognitionException {
		SingleTimeContext _localctx = new SingleTimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTime);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				second();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				minute();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				hour();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PluralTimeContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public SecondsContext seconds() {
			return getRuleContext(SecondsContext.class,0);
		}
		public MinutesContext minutes() {
			return getRuleContext(MinutesContext.class,0);
		}
		public HoursContext hours() {
			return getRuleContext(HoursContext.class,0);
		}
		public PluralTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluralTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterPluralTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitPluralTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitPluralTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluralTimeContext pluralTime() throws RecognitionException {
		PluralTimeContext _localctx = new PluralTimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pluralTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(INTEGER_NUMBER);
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(124);
				seconds();
				}
				break;
			case T__9:
				{
				setState(125);
				minutes();
				}
				break;
			case T__11:
				{
				setState(126);
				hours();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ActionTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public ActionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterActionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitActionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitActionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionTypeContext actionType() throws RecognitionException {
		ActionTypeContext _localctx = new ActionTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class TimePreciselyContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(AsistParser.TIME, 0); }
		public TerminalNode DATE() { return getToken(AsistParser.DATE, 0); }
		public TimePreciselyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timePrecisely; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterTimePrecisely(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitTimePrecisely(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitTimePrecisely(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimePreciselyContext timePrecisely() throws RecognitionException {
		TimePreciselyContext _localctx = new TimePreciselyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timePrecisely);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(T__2);
			setState(132);
			match(TIME);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATE) {
				{
				setState(133);
				match(DATE);
				}
			}

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

	public static class OnEventContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsistParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsistParser.IDENTIFIER, i);
		}
		public OnEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterOnEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitOnEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitOnEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnEventContext onEvent() throws RecognitionException {
		OnEventContext _localctx = new OnEventContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_onEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__3);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				match(IDENTIFIER);
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class EveryContext extends ParserRuleContext {
		public EveryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterEvery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitEvery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitEvery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EveryContext every() throws RecognitionException {
		EveryContext _localctx = new EveryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_every);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__4);
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

	public static class InContext extends ParserRuleContext {
		public InContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__5);
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

	public static class SecondContext extends ParserRuleContext {
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__6);
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

	public static class SecondsContext extends ParserRuleContext {
		public SecondsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seconds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterSeconds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitSeconds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondsContext seconds() throws RecognitionException {
		SecondsContext _localctx = new SecondsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__7);
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

	public static class MinuteContext extends ParserRuleContext {
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__8);
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

	public static class MinutesContext extends ParserRuleContext {
		public MinutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minutes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterMinutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitMinutes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitMinutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinutesContext minutes() throws RecognitionException {
		MinutesContext _localctx = new MinutesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minutes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__9);
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

	public static class HourContext extends ParserRuleContext {
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__10);
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

	public static class HoursContext extends ParserRuleContext {
		public HoursContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hours; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterHours(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitHours(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitHours(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hours);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__11);
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

	public static class VariableOrAssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
		}
		public VariableOrAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterVariableOrAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitVariableOrAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitVariableOrAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrAssignmentContext variableOrAssignment() throws RecognitionException {
		VariableOrAssignmentContext _localctx = new VariableOrAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableOrAssignment);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				variableAssignment();
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENTIFIER);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFIER);
			setState(165);
			match(T__12);
			setState(166);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AsistParser.STRING, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public SearchFunctionContext searchFunction() {
			return getRuleContext(SearchFunctionContext.class,0);
		}
		public ObjectPropertiesContext objectProperties() {
			return getRuleContext(ObjectPropertiesContext.class,0);
		}
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public AssignVariableContext assignVariable() {
			return getRuleContext(AssignVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(INTEGER_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				booleanExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				searchFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				objectProperties();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				arithmeticOperation();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				functionCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				assignVariable();
				}
				break;
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

	public static class AssignVariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public AssignVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterAssignVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitAssignVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVariableContext assignVariable() throws RecognitionException {
		AssignVariableContext _localctx = new AssignVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(IDENTIFIER);
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

	public static class BooleanExpressionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(AsistParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(AsistParser.FALSE, 0); }
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class SearchFunctionContext extends ParserRuleContext {
		public TerminalNode SEARCH_FUNCTION() { return getToken(AsistParser.SEARCH_FUNCTION, 0); }
		public TerminalNode STRING() { return getToken(AsistParser.STRING, 0); }
		public SearchFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterSearchFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitSearchFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitSearchFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchFunctionContext searchFunction() throws RecognitionException {
		SearchFunctionContext _localctx = new SearchFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_searchFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(SEARCH_FUNCTION);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(183);
				match(T__13);
				setState(184);
				match(STRING);
				}
			}

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

	public static class ObjectPropertiesContext extends ParserRuleContext {
		public TerminalNode OBJECT_PROPERTIES() { return getToken(AsistParser.OBJECT_PROPERTIES, 0); }
		public ObjectPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterObjectProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitObjectProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitObjectProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_objectProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(OBJECT_PROPERTIES);
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

	public static class ArithmeticOperationContext extends ParserRuleContext {
		public AdditionExpressionContext additionExpression() {
			return getRuleContext(AdditionExpressionContext.class,0);
		}
		public ArithmeticOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterArithmeticOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitArithmeticOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			additionExpression();
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

	public static class AdditionExpressionContext extends ParserRuleContext {
		public List<MultiplyExpressionContext> multiplyExpression() {
			return getRuleContexts(MultiplyExpressionContext.class);
		}
		public MultiplyExpressionContext multiplyExpression(int i) {
			return getRuleContext(MultiplyExpressionContext.class,i);
		}
		public List<TerminalNode> ADDITION_OPERATOR() { return getTokens(AsistParser.ADDITION_OPERATOR); }
		public TerminalNode ADDITION_OPERATOR(int i) {
			return getToken(AsistParser.ADDITION_OPERATOR, i);
		}
		public AdditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterAdditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitAdditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitAdditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditionExpressionContext additionExpression() throws RecognitionException {
		AdditionExpressionContext _localctx = new AdditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_additionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			multiplyExpression();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITION_OPERATOR) {
				{
				{
				setState(192);
				match(ADDITION_OPERATOR);
				setState(193);
				multiplyExpression();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class MultiplyExpressionContext extends ParserRuleContext {
		public List<AtomExpressionContext> atomExpression() {
			return getRuleContexts(AtomExpressionContext.class);
		}
		public AtomExpressionContext atomExpression(int i) {
			return getRuleContext(AtomExpressionContext.class,i);
		}
		public List<TerminalNode> MULTIPLICATION_OPERATOR() { return getTokens(AsistParser.MULTIPLICATION_OPERATOR); }
		public TerminalNode MULTIPLICATION_OPERATOR(int i) {
			return getToken(AsistParser.MULTIPLICATION_OPERATOR, i);
		}
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			atomExpression();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION_OPERATOR) {
				{
				{
				setState(200);
				match(MULTIPLICATION_OPERATOR);
				setState(201);
				atomExpression();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class AtomExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public AtomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterAtomExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitAtomExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitAtomExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomExpressionContext atomExpression() throws RecognitionException {
		AtomExpressionContext _localctx = new AtomExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_atomExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==INTEGER_NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(T__14);
			setState(211);
			match(T__15);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALL) | (1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER_NUMBER))) != 0)) {
				{
				setState(212);
				params();
				}
			}

			setState(215);
			match(T__16);
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(AsistParser.ALL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AsistParser.IDENTIFIER, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public TerminalNode STRING() { return getToken(AsistParser.STRING, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_params);
		int _la;
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ALL);
				}
				break;
			case IDENTIFIER:
			case STRING:
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER_NUMBER))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(219);
						match(T__17);
						setState(220);
						params();
						}
						} 
					}
					setState(225);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionExpressionContext conditionExpression() {
			return getRuleContext(ConditionExpressionContext.class,0);
		}
		public IfInstructionsContext ifInstructions() {
			return getRuleContext(IfInstructionsContext.class,0);
		}
		public ElseInstructionsContext elseInstructions() {
			return getRuleContext(ElseInstructionsContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__18);
			setState(229);
			conditionExpression();
			setState(230);
			match(T__19);
			setState(231);
			ifInstructions();
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(232);
				match(T__20);
				setState(233);
				elseInstructions();
				}
			}

			setState(236);
			match(T__21);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> RELATIVE_OPERATOR() { return getTokens(AsistParser.RELATIVE_OPERATOR); }
		public TerminalNode RELATIVE_OPERATOR(int i) {
			return getToken(AsistParser.RELATIVE_OPERATOR, i);
		}
		public ConditionExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			simpleExpression();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RELATIVE_OPERATOR) {
				{
				{
				setState(239);
				match(RELATIVE_OPERATOR);
				setState(240);
				simpleExpression();
				}
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IfInstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public IfInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterIfInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitIfInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitIfInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstructionsContext ifInstructions() throws RecognitionException {
		IfInstructionsContext _localctx = new IfInstructionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ifInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				instruction();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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

	public static class ElseInstructionsContext extends ParserRuleContext {
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public ElseInstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseInstructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterElseInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitElseInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitElseInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseInstructionsContext elseInstructions() throws RecognitionException {
		ElseInstructionsContext _localctx = new ElseInstructionsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_elseInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(251);
				instruction();
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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

	public static class InstructionContext extends ParserRuleContext {
		public SearchFunctionContext searchFunction() {
			return getRuleContext(SearchFunctionContext.class,0);
		}
		public VariableOrAssignmentContext variableOrAssignment() {
			return getRuleContext(VariableOrAssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public NotificationStatementContext notificationStatement() {
			return getRuleContext(NotificationStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_instruction);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				searchFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				variableOrAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				notificationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(260);
				functionCall();
				}
				break;
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			term();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(264);
				match(T__22);
				setState(265);
				term();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			factor();
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(272);
				match(T__23);
				setState(273);
				factor();
				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public ObjectPropertiesContext objectProperties() {
			return getRuleContext(ObjectPropertiesContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor ) return ((AsistVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_factor);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(279);
				variable();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(T__15);
				setState(281);
				arithmeticOperation();
				setState(282);
				match(T__16);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__24);
				setState(285);
				factor();
				}
				break;
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(INTEGER_NUMBER);
				}
				break;
			case OBJECT_PROPERTIES:
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				objectProperties();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0125\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\6\2"+
		"V\n\2\r\2\16\2W\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6o\n\6\3\7\3\7\5\7s\n\7\3\7\3\7\5\7w"+
		"\n\7\3\b\3\b\3\b\5\b|\n\b\3\t\3\t\3\t\3\t\5\t\u0082\n\t\3\n\3\n\3\13\3"+
		"\13\3\13\5\13\u0089\n\13\3\f\3\f\6\f\u008d\n\f\r\f\16\f\u008e\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\5\25\u00a3\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\5\30\u00b3\n\30\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\33\5\33\u00bc\n\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\7\36\u00c5\n"+
		"\36\f\36\16\36\u00c8\13\36\3\37\3\37\3\37\7\37\u00cd\n\37\f\37\16\37\u00d0"+
		"\13\37\3 \3 \3!\3!\3!\3!\5!\u00d8\n!\3!\3!\3\"\3\"\3\"\3\"\7\"\u00e0\n"+
		"\"\f\"\16\"\u00e3\13\"\5\"\u00e5\n\"\3#\3#\3#\3#\3#\3#\5#\u00ed\n#\3#"+
		"\3#\3$\3$\3$\7$\u00f4\n$\f$\16$\u00f7\13$\3%\6%\u00fa\n%\r%\16%\u00fb"+
		"\3&\6&\u00ff\n&\r&\16&\u0100\3\'\3\'\3\'\3\'\3\'\5\'\u0108\n\'\3(\3(\3"+
		"(\7(\u010d\n(\f(\16(\u0110\13(\3)\3)\3)\7)\u0115\n)\f)\16)\u0118\13)\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0123\n*\3*\2\2+\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\6\4\2\4\4!!\3\2\34"+
		"\35\4\2!!$$\4\2!!#$\2\u0127\2U\3\2\2\2\4_\3\2\2\2\6a\3\2\2\2\bd\3\2\2"+
		"\2\nn\3\2\2\2\fr\3\2\2\2\16{\3\2\2\2\20}\3\2\2\2\22\u0083\3\2\2\2\24\u0085"+
		"\3\2\2\2\26\u008a\3\2\2\2\30\u0090\3\2\2\2\32\u0092\3\2\2\2\34\u0094\3"+
		"\2\2\2\36\u0096\3\2\2\2 \u0098\3\2\2\2\"\u009a\3\2\2\2$\u009c\3\2\2\2"+
		"&\u009e\3\2\2\2(\u00a2\3\2\2\2*\u00a4\3\2\2\2,\u00a6\3\2\2\2.\u00b2\3"+
		"\2\2\2\60\u00b4\3\2\2\2\62\u00b6\3\2\2\2\64\u00b8\3\2\2\2\66\u00bd\3\2"+
		"\2\28\u00bf\3\2\2\2:\u00c1\3\2\2\2<\u00c9\3\2\2\2>\u00d1\3\2\2\2@\u00d3"+
		"\3\2\2\2B\u00e4\3\2\2\2D\u00e6\3\2\2\2F\u00f0\3\2\2\2H\u00f9\3\2\2\2J"+
		"\u00fe\3\2\2\2L\u0107\3\2\2\2N\u0109\3\2\2\2P\u0111\3\2\2\2R\u0122\3\2"+
		"\2\2TV\5\4\3\2UT\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\3\3\2\2\2Y`\5"+
		"\6\4\2Z`\5\b\5\2[`\5(\25\2\\`\5@!\2]`\5D#\2^`\5\64\33\2_Y\3\2\2\2_Z\3"+
		"\2\2\2_[\3\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`\5\3\2\2\2ab\7\37\2\2"+
		"bc\7!\2\2c\7\3\2\2\2de\7 \2\2ef\7!\2\2fg\5\n\6\2gh\7#\2\2hi\7\3\2\2ij"+
		"\5\22\n\2j\t\3\2\2\2ko\5\f\7\2lo\5\24\13\2mo\5\26\f\2nk\3\2\2\2nl\3\2"+
		"\2\2nm\3\2\2\2o\13\3\2\2\2ps\5\30\r\2qs\5\32\16\2rp\3\2\2\2rq\3\2\2\2"+
		"sv\3\2\2\2tw\5\16\b\2uw\5\20\t\2vt\3\2\2\2vu\3\2\2\2w\r\3\2\2\2x|\5\34"+
		"\17\2y|\5 \21\2z|\5$\23\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\17\3\2\2\2}\u0081"+
		"\7$\2\2~\u0082\5\36\20\2\177\u0082\5\"\22\2\u0080\u0082\5&\24\2\u0081"+
		"~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\21\3\2\2\2\u0083"+
		"\u0084\t\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\5\2\2\u0086\u0088\7,\2\2"+
		"\u0087\u0089\7-\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\25\3"+
		"\2\2\2\u008a\u008c\7\6\2\2\u008b\u008d\7!\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\27\3\2\2"+
		"\2\u0090\u0091\7\7\2\2\u0091\31\3\2\2\2\u0092\u0093\7\b\2\2\u0093\33\3"+
		"\2\2\2\u0094\u0095\7\t\2\2\u0095\35\3\2\2\2\u0096\u0097\7\n\2\2\u0097"+
		"\37\3\2\2\2\u0098\u0099\7\13\2\2\u0099!\3\2\2\2\u009a\u009b\7\f\2\2\u009b"+
		"#\3\2\2\2\u009c\u009d\7\r\2\2\u009d%\3\2\2\2\u009e\u009f\7\16\2\2\u009f"+
		"\'\3\2\2\2\u00a0\u00a3\5*\26\2\u00a1\u00a3\5,\27\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3)\3\2\2\2\u00a4\u00a5\7!\2\2\u00a5+\3\2\2\2"+
		"\u00a6\u00a7\7!\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\5.\30\2\u00a9-\3"+
		"\2\2\2\u00aa\u00b3\7#\2\2\u00ab\u00b3\7$\2\2\u00ac\u00b3\5\62\32\2\u00ad"+
		"\u00b3\5\64\33\2\u00ae\u00b3\5\66\34\2\u00af\u00b3\58\35\2\u00b0\u00b3"+
		"\5@!\2\u00b1\u00b3\5\60\31\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2"+
		"\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3/\3\2\2\2\u00b4\u00b5"+
		"\7!\2\2\u00b5\61\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7\63\3\2\2\2\u00b8\u00bb"+
		"\7\"\2\2\u00b9\u00ba\7\20\2\2\u00ba\u00bc\7#\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\65\3\2\2\2\u00bd\u00be\7+\2\2\u00be\67\3\2\2\2\u00bf"+
		"\u00c0\5:\36\2\u00c09\3\2\2\2\u00c1\u00c6\5<\37\2\u00c2\u00c3\7.\2\2\u00c3"+
		"\u00c5\5<\37\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7;\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ce"+
		"\5> \2\u00ca\u00cb\7/\2\2\u00cb\u00cd\5> \2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf=\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d2\t\4\2\2\u00d2?\3\2\2\2\u00d3\u00d4\7"+
		"!\2\2\u00d4\u00d5\7\21\2\2\u00d5\u00d7\7\22\2\2\u00d6\u00d8\5B\"\2\u00d7"+
		"\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\23"+
		"\2\2\u00daA\3\2\2\2\u00db\u00e5\7\36\2\2\u00dc\u00e1\t\5\2\2\u00dd\u00de"+
		"\7\24\2\2\u00de\u00e0\5B\"\2\u00df\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e4\u00db\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e5C\3\2\2\2\u00e6\u00e7"+
		"\7\25\2\2\u00e7\u00e8\5F$\2\u00e8\u00e9\7\26\2\2\u00e9\u00ec\5H%\2\u00ea"+
		"\u00eb\7\27\2\2\u00eb\u00ed\5J&\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7\30\2\2\u00efE\3\2\2\2\u00f0\u00f5"+
		"\5N(\2\u00f1\u00f2\7\60\2\2\u00f2\u00f4\5N(\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6G\3\2\2\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5L\'\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcI\3\2\2\2\u00fd"+
		"\u00ff\5L\'\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0100\u0101\3\2\2\2\u0101K\3\2\2\2\u0102\u0108\5\64\33\2\u0103\u0108"+
		"\5(\25\2\u0104\u0108\5D#\2\u0105\u0108\5\b\5\2\u0106\u0108\5@!\2\u0107"+
		"\u0102\3\2\2\2\u0107\u0103\3\2\2\2\u0107\u0104\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108M\3\2\2\2\u0109\u010e\5P)\2\u010a\u010b"+
		"\7\31\2\2\u010b\u010d\5P)\2\u010c\u010a\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fO\3\2\2\2\u0110\u010e\3\2\2\2"+
		"\u0111\u0116\5R*\2\u0112\u0113\7\32\2\2\u0113\u0115\5R*\2\u0114\u0112"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"Q\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u0123\5*\26\2\u011a\u011b\7\22\2\2"+
		"\u011b\u011c\58\35\2\u011c\u011d\7\23\2\2\u011d\u0123\3\2\2\2\u011e\u011f"+
		"\7\33\2\2\u011f\u0123\5R*\2\u0120\u0123\7$\2\2\u0121\u0123\5\66\34\2\u0122"+
		"\u0119\3\2\2\2\u0122\u011a\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0120\3\2"+
		"\2\2\u0122\u0121\3\2\2\2\u0123S\3\2\2\2\33W_nrv{\u0081\u0088\u008e\u00a2"+
		"\u00b2\u00bb\u00c6\u00ce\u00d7\u00e1\u00e4\u00ec\u00f5\u00fb\u0100\u0107"+
		"\u010e\u0116\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}