// Generated from ParserProject.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, INT=29, DOUBLE=30, STRING=31, 
		VARNAME=32, NEWLINE=33, WS=34;
	public static final int
		RULE_program = 0, RULE_expr = 1, RULE_innerarray = 2, RULE_assignment = 3, 
		RULE_blocks = 4, RULE_conditional = 5, RULE_extra = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "expr", "innerarray", "assignment", "blocks", "conditional", 
			"extra"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "', '", "']'", "'=='", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'if'", "'elif'", "'else'", "':'", 
			"'>'", "'<'", "'<='", "'>='", "'!='", "'not'", "'('", "')'", "'and'", 
			"'or'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "DOUBLE", "STRING", "VARNAME", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "ParserProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ParserProjectParser.EOF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				expr(0);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16643227712L) != 0) );
			setState(19);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BlocksContext blocks() {
			return getRuleContext(BlocksContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParserProjectParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserProjectParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(ParserProjectParser.STRING, 0); }
		public TerminalNode VARNAME() { return getToken(ParserProjectParser.VARNAME, 0); }
		public InnerarrayContext innerarray() {
			return getRuleContext(InnerarrayContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ParserProjectParser.NEWLINE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(22);
				assignment();
				}
				break;
			case 2:
				{
				setState(23);
				blocks();
				}
				break;
			case 3:
				{
				setState(24);
				match(INT);
				}
				break;
			case 4:
				{
				setState(25);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				setState(26);
				match(STRING);
				}
				break;
			case 6:
				{
				setState(27);
				match(VARNAME);
				}
				break;
			case 7:
				{
				setState(28);
				match(T__5);
				setState(29);
				innerarray();
				}
				break;
			case 8:
				{
				setState(30);
				match(NEWLINE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(38);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(33);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(34);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(35);
					expr(9);
					}
					} 
				}
				setState(40);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InnerarrayContext extends ParserRuleContext {
		public InnerarrayContext innerarray() {
			return getRuleContext(InnerarrayContext.class,0);
		}
		public TerminalNode INT() { return getToken(ParserProjectParser.INT, 0); }
		public TerminalNode STRING() { return getToken(ParserProjectParser.STRING, 0); }
		public TerminalNode DOUBLE() { return getToken(ParserProjectParser.DOUBLE, 0); }
		public InnerarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterInnerarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitInnerarray(this);
		}
	}

	public final InnerarrayContext innerarray() throws RecognitionException {
		InnerarrayContext _localctx = new InnerarrayContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_innerarray);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(42);
					match(T__6);
					}
				}

				setState(45);
				innerarray();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserProjectParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VARNAME);
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(51);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocksContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ParserProjectParser.NEWLINE, 0); }
		public BlocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterBlocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitBlocks(this);
		}
	}

	public final BlocksContext blocks() throws RecognitionException {
		BlocksContext _localctx = new BlocksContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_blocks);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__14);
				setState(54);
				conditional();
				setState(55);
				match(NEWLINE);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__15);
				setState(58);
				conditional();
				setState(59);
				match(NEWLINE);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(T__16);
				setState(62);
				match(T__17);
				setState(63);
				match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExtraContext extra() {
			return getRuleContext(ExtraContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(ParserProjectParser.VARNAME, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__14:
			case T__15:
			case T__16:
			case INT:
			case DOUBLE:
			case STRING:
			case VARNAME:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				expr(0);
				setState(67);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16253440L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(68);
				expr(0);
				setState(69);
				extra();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__23);
				setState(72);
				match(VARNAME);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				match(T__24);
				setState(74);
				conditional();
				setState(75);
				match(T__25);
				setState(76);
				extra();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExtraContext extends ParserRuleContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public ExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterExtra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitExtra(this);
		}
	}

	public final ExtraContext extra() throws RecognitionException {
		ExtraContext _localctx = new ExtraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extra);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__26);
				setState(81);
				conditional();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__27);
				setState(83);
				conditional();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(T__17);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"X\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001 \b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u00020\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"A\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006V\b\u0006\u0001\u0006\u0000\u0001"+
		"\u0002\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0004\u0001\u0000\u0001"+
		"\u0005\u0001\u0000\u001d\u001f\u0001\u0000\t\u000e\u0002\u0000\t\t\u0013"+
		"\u0017a\u0000\u000f\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000"+
		"\u0000\u0004/\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b"+
		"@\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000"+
		"\u0000\u000e\u0010\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000"+
		"\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000"+
		"\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000"+
		"\u0000\u0015\u0016\u0006\u0001\uffff\uffff\u0000\u0016 \u0003\u0006\u0003"+
		"\u0000\u0017 \u0003\b\u0004\u0000\u0018 \u0005\u001d\u0000\u0000\u0019"+
		" \u0005\u001e\u0000\u0000\u001a \u0005\u001f\u0000\u0000\u001b \u0005"+
		" \u0000\u0000\u001c\u001d\u0005\u0006\u0000\u0000\u001d \u0003\u0004\u0002"+
		"\u0000\u001e \u0005!\u0000\u0000\u001f\u0015\u0001\u0000\u0000\u0000\u001f"+
		"\u0017\u0001\u0000\u0000\u0000\u001f\u0018\u0001\u0000\u0000\u0000\u001f"+
		"\u0019\u0001\u0000\u0000\u0000\u001f\u001a\u0001\u0000\u0000\u0000\u001f"+
		"\u001b\u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 &\u0001\u0000\u0000\u0000!\"\n\b\u0000"+
		"\u0000\"#\u0007\u0000\u0000\u0000#%\u0003\u0002\u0001\t$!\u0001\u0000"+
		"\u0000\u0000%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001"+
		"\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000"+
		"\u0000)+\u0007\u0001\u0000\u0000*,\u0005\u0007\u0000\u0000+*\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-0\u0003"+
		"\u0004\u0002\u0000.0\u0005\b\u0000\u0000/)\u0001\u0000\u0000\u0000/.\u0001"+
		"\u0000\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005 \u0000\u0000"+
		"23\u0007\u0002\u0000\u000034\u0003\u0002\u0001\u00004\u0007\u0001\u0000"+
		"\u0000\u000056\u0005\u000f\u0000\u000067\u0003\n\u0005\u000078\u0005!"+
		"\u0000\u00008A\u0001\u0000\u0000\u00009:\u0005\u0010\u0000\u0000:;\u0003"+
		"\n\u0005\u0000;<\u0005!\u0000\u0000<A\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0011\u0000\u0000>?\u0005\u0012\u0000\u0000?A\u0005!\u0000\u0000@5\u0001"+
		"\u0000\u0000\u0000@9\u0001\u0000\u0000\u0000@=\u0001\u0000\u0000\u0000"+
		"A\t\u0001\u0000\u0000\u0000BC\u0003\u0002\u0001\u0000CD\u0007\u0003\u0000"+
		"\u0000DE\u0003\u0002\u0001\u0000EF\u0003\f\u0006\u0000FO\u0001\u0000\u0000"+
		"\u0000GH\u0005\u0018\u0000\u0000HO\u0005 \u0000\u0000IJ\u0005\u0019\u0000"+
		"\u0000JK\u0003\n\u0005\u0000KL\u0005\u001a\u0000\u0000LM\u0003\f\u0006"+
		"\u0000MO\u0001\u0000\u0000\u0000NB\u0001\u0000\u0000\u0000NG\u0001\u0000"+
		"\u0000\u0000NI\u0001\u0000\u0000\u0000O\u000b\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u001b\u0000\u0000QV\u0003\n\u0005\u0000RS\u0005\u001c\u0000\u0000"+
		"SV\u0003\n\u0005\u0000TV\u0005\u0012\u0000\u0000UP\u0001\u0000\u0000\u0000"+
		"UR\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000"+
		"\u0000\b\u0011\u001f&+/@NU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}