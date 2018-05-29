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
		TRUE=25, FALSE=26, ALL=27, IMPORT=28, NOTIFY=29, IDENTIFIER=30, SEARCH_FUNCTION=31, 
		STRING=32, INTEGER_NUMBER=33, HOUR=34, MINUTE=35, DAY=36, MONTH=37, YEAR=38, 
		BOOLEAN=39, OBJECT_PROPERTIES=40, TIME=41, DATE=42, ADDITION_OPERATOR=43, 
		MULTIPLICATION_OPERATOR=44, RELATIVE_OPERATOR=45, WHITESPACE=46, LINE_COMMENT=47, 
		COMMENT=48, NEW_LINE=49;
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
		RULE_ifInstructions = 34, RULE_elseInstructions = 35, RULE_instruction = 36, 
		RULE_conditionExpression = 37, RULE_term = 38, RULE_factor = 39, RULE_relativeFactor = 40, 
		RULE_relativeArithmeticArithmetic = 41, RULE_relativeVariableVariable = 42, 
		RULE_relativeIntegerInteger = 43, RULE_relativeArithmeticInteger = 44, 
		RULE_relativeArithmeticVariable = 45, RULE_relativeVariableArithmetic = 46, 
		RULE_relativeVariableInteger = 47, RULE_relativeIntegerVariable = 48, 
		RULE_relativeIntegerArithmetic = 49, RULE_notVariable = 50;
	public static final String[] ruleNames = {
		"script", "statement", "importStatement", "notificationStatement", "firedWhen", 
		"timeBased", "singleTime", "pluralTime", "actionType", "timePrecisely", 
		"onEvent", "every", "in", "second", "seconds", "minute", "minutes", "hour", 
		"hours", "variableOrAssignment", "variable", "variableAssignment", "expression", 
		"assignVariable", "booleanExpression", "searchFunction", "objectProperties", 
		"arithmeticOperation", "additionExpression", "multiplyExpression", "atomExpression", 
		"functionCall", "params", "ifStatement", "ifInstructions", "elseInstructions", 
		"instruction", "conditionExpression", "term", "factor", "relativeFactor", 
		"relativeArithmeticArithmetic", "relativeVariableVariable", "relativeIntegerInteger", 
		"relativeArithmeticInteger", "relativeArithmeticVariable", "relativeVariableArithmetic", 
		"relativeVariableInteger", "relativeIntegerVariable", "relativeIntegerArithmetic", 
		"notVariable"
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitScript(this);
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
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(102);
				statement();
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << IMPORT) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				notificationStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				variableOrAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				functionCall();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(112);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(IMPORT);
			setState(116);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitNotificationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotificationStatementContext notificationStatement() throws RecognitionException {
		NotificationStatementContext _localctx = new NotificationStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_notificationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(NOTIFY);
			setState(119);
			match(IDENTIFIER);
			setState(120);
			firedWhen();
			setState(121);
			match(STRING);
			setState(122);
			match(T__0);
			setState(123);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitFiredWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiredWhenContext firedWhen() throws RecognitionException {
		FiredWhenContext _localctx = new FiredWhenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_firedWhen);
		try {
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				timeBased();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				timePrecisely();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitTimeBased(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeBasedContext timeBased() throws RecognitionException {
		TimeBasedContext _localctx = new TimeBasedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_timeBased);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				{
				setState(130);
				every();
				}
				break;
			case T__5:
				{
				setState(131);
				in();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__8:
			case T__10:
				{
				setState(134);
				singleTime();
				}
				break;
			case INTEGER_NUMBER:
				{
				setState(135);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitSingleTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTimeContext singleTime() throws RecognitionException {
		SingleTimeContext _localctx = new SingleTimeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTime);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				second();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				minute();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitPluralTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluralTimeContext pluralTime() throws RecognitionException {
		PluralTimeContext _localctx = new PluralTimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pluralTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(INTEGER_NUMBER);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(144);
				seconds();
				}
				break;
			case T__9:
				{
				setState(145);
				minutes();
				}
				break;
			case T__11:
				{
				setState(146);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitActionType(this);
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
			setState(149);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitTimePrecisely(this);
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
			setState(151);
			match(T__2);
			setState(152);
			match(TIME);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATE) {
				{
				setState(153);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitOnEvent(this);
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
			setState(156);
			match(T__3);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				match(IDENTIFIER);
				}
				}
				setState(160); 
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitEvery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EveryContext every() throws RecognitionException {
		EveryContext _localctx = new EveryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_every);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InContext in() throws RecognitionException {
		InContext _localctx = new InContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitSeconds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondsContext seconds() throws RecognitionException {
		SecondsContext _localctx = new SecondsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_seconds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitMinutes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinutesContext minutes() throws RecognitionException {
		MinutesContext _localctx = new MinutesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_minutes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitHours(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HoursContext hours() throws RecognitionException {
		HoursContext _localctx = new HoursContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_hours);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitVariableOrAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrAssignmentContext variableOrAssignment() throws RecognitionException {
		VariableOrAssignmentContext _localctx = new VariableOrAssignmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_variableOrAssignment);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variableAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(IDENTIFIER);
			setState(185);
			match(T__12);
			setState(186);
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
		public AssignVariableContext assignVariable() {
			return getRuleContext(AssignVariableContext.class,0);
		}
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expression);
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(INTEGER_NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				assignVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				booleanExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(192);
				searchFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(193);
				objectProperties();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(194);
				arithmeticOperation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(195);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitAssignVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignVariableContext assignVariable() throws RecognitionException {
		AssignVariableContext _localctx = new AssignVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitBooleanExpression(this);
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
			setState(200);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitSearchFunction(this);
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
			setState(202);
			match(SEARCH_FUNCTION);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(203);
				match(T__13);
				setState(204);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitObjectProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPropertiesContext objectProperties() throws RecognitionException {
		ObjectPropertiesContext _localctx = new ObjectPropertiesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_objectProperties);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitArithmeticOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperationContext arithmeticOperation() throws RecognitionException {
		ArithmeticOperationContext _localctx = new ArithmeticOperationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_arithmeticOperation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitAdditionExpression(this);
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
			setState(211);
			multiplyExpression();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDITION_OPERATOR) {
				{
				{
				setState(212);
				match(ADDITION_OPERATOR);
				setState(213);
				multiplyExpression();
				}
				}
				setState(218);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitMultiplyExpression(this);
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
			setState(219);
			atomExpression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICATION_OPERATOR) {
				{
				{
				setState(220);
				match(MULTIPLICATION_OPERATOR);
				setState(221);
				atomExpression();
				}
				}
				setState(226);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitAtomExpression(this);
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
			setState(227);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(IDENTIFIER);
			setState(230);
			match(T__14);
			setState(231);
			match(T__15);
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(232);
				params();
				}
				break;
			}
			setState(235);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(AsistParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AsistParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INTEGER_NUMBER() { return getTokens(AsistParser.INTEGER_NUMBER); }
		public TerminalNode INTEGER_NUMBER(int i) {
			return getToken(AsistParser.INTEGER_NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(AsistParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(AsistParser.STRING, i);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_params);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(ALL);
				}
				break;
			case T__16:
			case IDENTIFIER:
			case STRING:
			case INTEGER_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER_NUMBER))) != 0)) {
					{
					{
					setState(238);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << STRING) | (1L << INTEGER_NUMBER))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitIfStatement(this);
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
			setState(246);
			match(T__17);
			setState(247);
			conditionExpression();
			setState(248);
			match(T__18);
			setState(249);
			ifInstructions();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(250);
				match(T__19);
				setState(251);
				elseInstructions();
				}
			}

			setState(254);
			match(T__20);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitIfInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInstructionsContext ifInstructions() throws RecognitionException {
		IfInstructionsContext _localctx = new IfInstructionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ifInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				instruction();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitElseInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseInstructionsContext elseInstructions() throws RecognitionException {
		ElseInstructionsContext _localctx = new ElseInstructionsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_elseInstructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(261);
				instruction();
				}
				}
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << NOTIFY) | (1L << IDENTIFIER) | (1L << SEARCH_FUNCTION))) != 0) );
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_instruction);
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				searchFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				variableOrAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(268);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(269);
				notificationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
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

	public static class ConditionExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExpressionContext conditionExpression() throws RecognitionException {
		ConditionExpressionContext _localctx = new ConditionExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conditionExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			term();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21) {
				{
				{
				setState(274);
				match(T__21);
				setState(275);
				term();
				}
				}
				setState(280);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			factor();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__22) {
				{
				{
				setState(282);
				match(T__22);
				setState(283);
				factor();
				}
				}
				setState(288);
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
		public RelativeFactorContext relativeFactor() {
			return getRuleContext(RelativeFactorContext.class,0);
		}
		public NotVariableContext notVariable() {
			return getRuleContext(NotVariableContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
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
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_factor);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				relativeFactor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				notVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(292);
				match(T__15);
				setState(293);
				arithmeticOperation();
				setState(294);
				match(T__16);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(296);
				match(INTEGER_NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(297);
				objectProperties();
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

	public static class RelativeFactorContext extends ParserRuleContext {
		public RelativeArithmeticArithmeticContext relativeArithmeticArithmetic() {
			return getRuleContext(RelativeArithmeticArithmeticContext.class,0);
		}
		public RelativeVariableVariableContext relativeVariableVariable() {
			return getRuleContext(RelativeVariableVariableContext.class,0);
		}
		public RelativeIntegerIntegerContext relativeIntegerInteger() {
			return getRuleContext(RelativeIntegerIntegerContext.class,0);
		}
		public RelativeArithmeticIntegerContext relativeArithmeticInteger() {
			return getRuleContext(RelativeArithmeticIntegerContext.class,0);
		}
		public RelativeArithmeticVariableContext relativeArithmeticVariable() {
			return getRuleContext(RelativeArithmeticVariableContext.class,0);
		}
		public RelativeVariableArithmeticContext relativeVariableArithmetic() {
			return getRuleContext(RelativeVariableArithmeticContext.class,0);
		}
		public RelativeVariableIntegerContext relativeVariableInteger() {
			return getRuleContext(RelativeVariableIntegerContext.class,0);
		}
		public RelativeIntegerVariableContext relativeIntegerVariable() {
			return getRuleContext(RelativeIntegerVariableContext.class,0);
		}
		public RelativeIntegerArithmeticContext relativeIntegerArithmetic() {
			return getRuleContext(RelativeIntegerArithmeticContext.class,0);
		}
		public RelativeFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeFactorContext relativeFactor() throws RecognitionException {
		RelativeFactorContext _localctx = new RelativeFactorContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_relativeFactor);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				relativeArithmeticArithmetic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				relativeVariableVariable();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				relativeIntegerInteger();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				relativeArithmeticInteger();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				relativeArithmeticVariable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				relativeVariableArithmetic();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(306);
				relativeVariableInteger();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(307);
				relativeIntegerVariable();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(308);
				relativeIntegerArithmetic();
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

	public static class RelativeArithmeticArithmeticContext extends ParserRuleContext {
		public List<ArithmeticOperationContext> arithmeticOperation() {
			return getRuleContexts(ArithmeticOperationContext.class);
		}
		public ArithmeticOperationContext arithmeticOperation(int i) {
			return getRuleContext(ArithmeticOperationContext.class,i);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public RelativeArithmeticArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeArithmeticArithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeArithmeticArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeArithmeticArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeArithmeticArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeArithmeticArithmeticContext relativeArithmeticArithmetic() throws RecognitionException {
		RelativeArithmeticArithmeticContext _localctx = new RelativeArithmeticArithmeticContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_relativeArithmeticArithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__15);
			setState(312);
			arithmeticOperation();
			setState(313);
			match(T__16);
			setState(314);
			match(RELATIVE_OPERATOR);
			setState(315);
			match(T__15);
			setState(316);
			arithmeticOperation();
			setState(317);
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

	public static class RelativeVariableVariableContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public RelativeVariableVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeVariableVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeVariableVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeVariableVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeVariableVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeVariableVariableContext relativeVariableVariable() throws RecognitionException {
		RelativeVariableVariableContext _localctx = new RelativeVariableVariableContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_relativeVariableVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			variable();
			setState(320);
			match(RELATIVE_OPERATOR);
			setState(321);
			variable();
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

	public static class RelativeIntegerIntegerContext extends ParserRuleContext {
		public List<TerminalNode> INTEGER_NUMBER() { return getTokens(AsistParser.INTEGER_NUMBER); }
		public TerminalNode INTEGER_NUMBER(int i) {
			return getToken(AsistParser.INTEGER_NUMBER, i);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public RelativeIntegerIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeIntegerInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeIntegerInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeIntegerInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeIntegerInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeIntegerIntegerContext relativeIntegerInteger() throws RecognitionException {
		RelativeIntegerIntegerContext _localctx = new RelativeIntegerIntegerContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_relativeIntegerInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(INTEGER_NUMBER);
			setState(324);
			match(RELATIVE_OPERATOR);
			setState(325);
			match(INTEGER_NUMBER);
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

	public static class RelativeArithmeticIntegerContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public RelativeArithmeticIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeArithmeticInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeArithmeticInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeArithmeticInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeArithmeticInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeArithmeticIntegerContext relativeArithmeticInteger() throws RecognitionException {
		RelativeArithmeticIntegerContext _localctx = new RelativeArithmeticIntegerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_relativeArithmeticInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(T__15);
			setState(328);
			arithmeticOperation();
			setState(329);
			match(T__16);
			setState(330);
			match(RELATIVE_OPERATOR);
			setState(331);
			match(INTEGER_NUMBER);
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

	public static class RelativeArithmeticVariableContext extends ParserRuleContext {
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RelativeArithmeticVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeArithmeticVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeArithmeticVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeArithmeticVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeArithmeticVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeArithmeticVariableContext relativeArithmeticVariable() throws RecognitionException {
		RelativeArithmeticVariableContext _localctx = new RelativeArithmeticVariableContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_relativeArithmeticVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(T__15);
			setState(334);
			arithmeticOperation();
			setState(335);
			match(T__16);
			setState(336);
			match(RELATIVE_OPERATOR);
			setState(337);
			variable();
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

	public static class RelativeVariableArithmeticContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public RelativeVariableArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeVariableArithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeVariableArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeVariableArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeVariableArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeVariableArithmeticContext relativeVariableArithmetic() throws RecognitionException {
		RelativeVariableArithmeticContext _localctx = new RelativeVariableArithmeticContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_relativeVariableArithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			variable();
			setState(340);
			match(RELATIVE_OPERATOR);
			setState(341);
			match(T__15);
			setState(342);
			arithmeticOperation();
			setState(343);
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

	public static class RelativeVariableIntegerContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public RelativeVariableIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeVariableInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeVariableInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeVariableInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeVariableInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeVariableIntegerContext relativeVariableInteger() throws RecognitionException {
		RelativeVariableIntegerContext _localctx = new RelativeVariableIntegerContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_relativeVariableInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			variable();
			setState(346);
			match(RELATIVE_OPERATOR);
			setState(347);
			match(INTEGER_NUMBER);
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

	public static class RelativeIntegerVariableContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public RelativeIntegerVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeIntegerVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeIntegerVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeIntegerVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeIntegerVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeIntegerVariableContext relativeIntegerVariable() throws RecognitionException {
		RelativeIntegerVariableContext _localctx = new RelativeIntegerVariableContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_relativeIntegerVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(INTEGER_NUMBER);
			setState(350);
			match(RELATIVE_OPERATOR);
			setState(351);
			variable();
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

	public static class RelativeIntegerArithmeticContext extends ParserRuleContext {
		public TerminalNode INTEGER_NUMBER() { return getToken(AsistParser.INTEGER_NUMBER, 0); }
		public TerminalNode RELATIVE_OPERATOR() { return getToken(AsistParser.RELATIVE_OPERATOR, 0); }
		public ArithmeticOperationContext arithmeticOperation() {
			return getRuleContext(ArithmeticOperationContext.class,0);
		}
		public RelativeIntegerArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relativeIntegerArithmetic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterRelativeIntegerArithmetic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitRelativeIntegerArithmetic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitRelativeIntegerArithmetic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelativeIntegerArithmeticContext relativeIntegerArithmetic() throws RecognitionException {
		RelativeIntegerArithmeticContext _localctx = new RelativeIntegerArithmeticContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_relativeIntegerArithmetic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(INTEGER_NUMBER);
			setState(354);
			match(RELATIVE_OPERATOR);
			setState(355);
			match(T__15);
			setState(356);
			arithmeticOperation();
			setState(357);
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

	public static class NotVariableContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NotVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).enterNotVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsistListener ) ((AsistListener)listener).exitNotVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsistVisitor) return ((AsistVisitor<? extends T>)visitor).visitNotVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotVariableContext notVariable() throws RecognitionException {
		NotVariableContext _localctx = new NotVariableContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_notVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(T__23);
			setState(360);
			variable();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u016d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\6\2j\n\2\r\2\16\2k\3\3\3\3\3\3\3\3\3\3\3\3\5\3t\n\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6\u0083\n\6\3\7\3\7\5\7\u0087"+
		"\n\7\3\7\3\7\5\7\u008b\n\7\3\b\3\b\3\b\5\b\u0090\n\b\3\t\3\t\3\t\3\t\5"+
		"\t\u0096\n\t\3\n\3\n\3\13\3\13\3\13\5\13\u009d\n\13\3\f\3\f\6\f\u00a1"+
		"\n\f\r\f\16\f\u00a2\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00b7\n\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00c7\n\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\33\5\33\u00d0\n\33\3\34\3\34\3\35\3\35"+
		"\3\36\3\36\3\36\7\36\u00d9\n\36\f\36\16\36\u00dc\13\36\3\37\3\37\3\37"+
		"\7\37\u00e1\n\37\f\37\16\37\u00e4\13\37\3 \3 \3!\3!\3!\3!\5!\u00ec\n!"+
		"\3!\3!\3\"\3\"\7\"\u00f2\n\"\f\"\16\"\u00f5\13\"\5\"\u00f7\n\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u00ff\n#\3#\3#\3$\6$\u0104\n$\r$\16$\u0105\3%\6%\u0109\n"+
		"%\r%\16%\u010a\3&\3&\3&\3&\3&\5&\u0112\n&\3\'\3\'\3\'\7\'\u0117\n\'\f"+
		"\'\16\'\u011a\13\'\3(\3(\3(\7(\u011f\n(\f(\16(\u0122\13(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u012d\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0138\n*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\2\2\65\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`bdf\2\6\4\2\4\4  \3\2\33\34\4\2  ##\4\2  \"#\2\u016d\2i\3\2"+
		"\2\2\4s\3\2\2\2\6u\3\2\2\2\bx\3\2\2\2\n\u0082\3\2\2\2\f\u0086\3\2\2\2"+
		"\16\u008f\3\2\2\2\20\u0091\3\2\2\2\22\u0097\3\2\2\2\24\u0099\3\2\2\2\26"+
		"\u009e\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2\2\34\u00a8\3\2\2\2\36\u00aa"+
		"\3\2\2\2 \u00ac\3\2\2\2\"\u00ae\3\2\2\2$\u00b0\3\2\2\2&\u00b2\3\2\2\2"+
		"(\u00b6\3\2\2\2*\u00b8\3\2\2\2,\u00ba\3\2\2\2.\u00c6\3\2\2\2\60\u00c8"+
		"\3\2\2\2\62\u00ca\3\2\2\2\64\u00cc\3\2\2\2\66\u00d1\3\2\2\28\u00d3\3\2"+
		"\2\2:\u00d5\3\2\2\2<\u00dd\3\2\2\2>\u00e5\3\2\2\2@\u00e7\3\2\2\2B\u00f6"+
		"\3\2\2\2D\u00f8\3\2\2\2F\u0103\3\2\2\2H\u0108\3\2\2\2J\u0111\3\2\2\2L"+
		"\u0113\3\2\2\2N\u011b\3\2\2\2P\u012c\3\2\2\2R\u0137\3\2\2\2T\u0139\3\2"+
		"\2\2V\u0141\3\2\2\2X\u0145\3\2\2\2Z\u0149\3\2\2\2\\\u014f\3\2\2\2^\u0155"+
		"\3\2\2\2`\u015b\3\2\2\2b\u015f\3\2\2\2d\u0163\3\2\2\2f\u0169\3\2\2\2h"+
		"j\5\4\3\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\3\3\2\2\2mt\5\6\4\2"+
		"nt\5\b\5\2ot\5(\25\2pt\5@!\2qt\5D#\2rt\5\64\33\2sm\3\2\2\2sn\3\2\2\2s"+
		"o\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\5\3\2\2\2uv\7\36\2\2vw\7 \2\2"+
		"w\7\3\2\2\2xy\7\37\2\2yz\7 \2\2z{\5\n\6\2{|\7\"\2\2|}\7\3\2\2}~\5\22\n"+
		"\2~\t\3\2\2\2\177\u0083\5\f\7\2\u0080\u0083\5\24\13\2\u0081\u0083\5\26"+
		"\f\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0081\3\2\2\2\u0083\13"+
		"\3\2\2\2\u0084\u0087\5\30\r\2\u0085\u0087\5\32\16\2\u0086\u0084\3\2\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u008b\5\16\b\2\u0089"+
		"\u008b\5\20\t\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\r\3\2\2"+
		"\2\u008c\u0090\5\34\17\2\u008d\u0090\5 \21\2\u008e\u0090\5$\23\2\u008f"+
		"\u008c\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\17\3\2\2"+
		"\2\u0091\u0095\7#\2\2\u0092\u0096\5\36\20\2\u0093\u0096\5\"\22\2\u0094"+
		"\u0096\5&\24\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\21\3\2\2\2\u0097\u0098\t\2\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\7\5\2\2\u009a\u009c\7+\2\2\u009b\u009d\7,\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\25\3\2\2\2\u009e\u00a0\7\6\2\2\u009f\u00a1\7 \2\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\27\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\31\3\2\2\2\u00a6\u00a7"+
		"\7\b\2\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\t\2\2\u00a9\35\3\2\2\2\u00aa\u00ab"+
		"\7\n\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\7\13\2\2\u00ad!\3\2\2\2\u00ae\u00af"+
		"\7\f\2\2\u00af#\3\2\2\2\u00b0\u00b1\7\r\2\2\u00b1%\3\2\2\2\u00b2\u00b3"+
		"\7\16\2\2\u00b3\'\3\2\2\2\u00b4\u00b7\5*\26\2\u00b5\u00b7\5,\27\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7)\3\2\2\2\u00b8\u00b9\7 \2\2\u00b9"+
		"+\3\2\2\2\u00ba\u00bb\7 \2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bd\5.\30\2"+
		"\u00bd-\3\2\2\2\u00be\u00c7\7\"\2\2\u00bf\u00c7\7#\2\2\u00c0\u00c7\5\60"+
		"\31\2\u00c1\u00c7\5\62\32\2\u00c2\u00c7\5\64\33\2\u00c3\u00c7\5\66\34"+
		"\2\u00c4\u00c7\58\35\2\u00c5\u00c7\5@!\2\u00c6\u00be\3\2\2\2\u00c6\u00bf"+
		"\3\2\2\2\u00c6\u00c0\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c6"+
		"\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7/\3\2\2\2"+
		"\u00c8\u00c9\7 \2\2\u00c9\61\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\63\3\2"+
		"\2\2\u00cc\u00cf\7!\2\2\u00cd\u00ce\7\20\2\2\u00ce\u00d0\7\"\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\65\3\2\2\2\u00d1\u00d2\7*\2\2"+
		"\u00d2\67\3\2\2\2\u00d3\u00d4\5:\36\2\u00d49\3\2\2\2\u00d5\u00da\5<\37"+
		"\2\u00d6\u00d7\7-\2\2\u00d7\u00d9\5<\37\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc"+
		"\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db;\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e2\5> \2\u00de\u00df\7.\2\2\u00df\u00e1\5> \2"+
		"\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3=\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\4\2\2\u00e6"+
		"?\3\2\2\2\u00e7\u00e8\7 \2\2\u00e8\u00e9\7\21\2\2\u00e9\u00eb\7\22\2\2"+
		"\u00ea\u00ec\5B\"\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\7\23\2\2\u00eeA\3\2\2\2\u00ef\u00f7\7\35\2\2\u00f0"+
		"\u00f2\t\5\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7C\3\2\2\2\u00f8\u00f9\7\24\2\2"+
		"\u00f9\u00fa\5L\'\2\u00fa\u00fb\7\25\2\2\u00fb\u00fe\5F$\2\u00fc\u00fd"+
		"\7\26\2\2\u00fd\u00ff\5H%\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\7\27\2\2\u0101E\3\2\2\2\u0102\u0104\5J&\2\u0103"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106G\3\2\2\2\u0107\u0109\5J&\2\u0108\u0107\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010bI\3\2\2\2\u010c"+
		"\u0112\5\64\33\2\u010d\u0112\5(\25\2\u010e\u0112\5D#\2\u010f\u0112\5\b"+
		"\5\2\u0110\u0112\5@!\2\u0111\u010c\3\2\2\2\u0111\u010d\3\2\2\2\u0111\u010e"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0110\3\2\2\2\u0112K\3\2\2\2\u0113"+
		"\u0118\5N(\2\u0114\u0115\7\30\2\2\u0115\u0117\5N(\2\u0116\u0114\3\2\2"+
		"\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119M"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u0120\5P)\2\u011c\u011d\7\31\2\2\u011d"+
		"\u011f\5P)\2\u011e\u011c\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2"+
		"\2\u0120\u0121\3\2\2\2\u0121O\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u012d"+
		"\5R*\2\u0124\u012d\5f\64\2\u0125\u012d\5*\26\2\u0126\u0127\7\22\2\2\u0127"+
		"\u0128\58\35\2\u0128\u0129\7\23\2\2\u0129\u012d\3\2\2\2\u012a\u012d\7"+
		"#\2\2\u012b\u012d\5\66\34\2\u012c\u0123\3\2\2\2\u012c\u0124\3\2\2\2\u012c"+
		"\u0125\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2"+
		"\2\2\u012dQ\3\2\2\2\u012e\u0138\5T+\2\u012f\u0138\5V,\2\u0130\u0138\5"+
		"X-\2\u0131\u0138\5Z.\2\u0132\u0138\5\\/\2\u0133\u0138\5^\60\2\u0134\u0138"+
		"\5`\61\2\u0135\u0138\5b\62\2\u0136\u0138\5d\63\2\u0137\u012e\3\2\2\2\u0137"+
		"\u012f\3\2\2\2\u0137\u0130\3\2\2\2\u0137\u0131\3\2\2\2\u0137\u0132\3\2"+
		"\2\2\u0137\u0133\3\2\2\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137"+
		"\u0136\3\2\2\2\u0138S\3\2\2\2\u0139\u013a\7\22\2\2\u013a\u013b\58\35\2"+
		"\u013b\u013c\7\23\2\2\u013c\u013d\7/\2\2\u013d\u013e\7\22\2\2\u013e\u013f"+
		"\58\35\2\u013f\u0140\7\23\2\2\u0140U\3\2\2\2\u0141\u0142\5*\26\2\u0142"+
		"\u0143\7/\2\2\u0143\u0144\5*\26\2\u0144W\3\2\2\2\u0145\u0146\7#\2\2\u0146"+
		"\u0147\7/\2\2\u0147\u0148\7#\2\2\u0148Y\3\2\2\2\u0149\u014a\7\22\2\2\u014a"+
		"\u014b\58\35\2\u014b\u014c\7\23\2\2\u014c\u014d\7/\2\2\u014d\u014e\7#"+
		"\2\2\u014e[\3\2\2\2\u014f\u0150\7\22\2\2\u0150\u0151\58\35\2\u0151\u0152"+
		"\7\23\2\2\u0152\u0153\7/\2\2\u0153\u0154\5*\26\2\u0154]\3\2\2\2\u0155"+
		"\u0156\5*\26\2\u0156\u0157\7/\2\2\u0157\u0158\7\22\2\2\u0158\u0159\58"+
		"\35\2\u0159\u015a\7\23\2\2\u015a_\3\2\2\2\u015b\u015c\5*\26\2\u015c\u015d"+
		"\7/\2\2\u015d\u015e\7#\2\2\u015ea\3\2\2\2\u015f\u0160\7#\2\2\u0160\u0161"+
		"\7/\2\2\u0161\u0162\5*\26\2\u0162c\3\2\2\2\u0163\u0164\7#\2\2\u0164\u0165"+
		"\7/\2\2\u0165\u0166\7\22\2\2\u0166\u0167\58\35\2\u0167\u0168\7\23\2\2"+
		"\u0168e\3\2\2\2\u0169\u016a\7\32\2\2\u016a\u016b\5*\26\2\u016bg\3\2\2"+
		"\2\33ks\u0082\u0086\u008a\u008f\u0095\u009c\u00a2\u00b6\u00c6\u00cf\u00da"+
		"\u00e2\u00eb\u00f3\u00f6\u00fe\u0105\u010a\u0111\u0118\u0120\u012c\u0137";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}