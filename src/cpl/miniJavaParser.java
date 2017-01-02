// Generated from miniJava.g4 by ANTLR 4.6
package cpl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, Id=36, INT=37, WS=38, MULTILINE_COMMENT=39, 
		LINE_COMMENT=40;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_type = 5, RULE_stmt = 6, RULE_exp = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"type", "stmt", "exp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.length'", "'.'", "'true'", 
		"'false'", "'this'", "'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"Id", "INT", "WS", "MULTILINE_COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "miniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				classDeclaration();
				}
				}
				setState(22);
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

	public static class MainClassContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(miniJavaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(miniJavaParser.Id, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			match(T__0);
			setState(24);
			match(Id);
			setState(25);
			match(T__1);
			setState(26);
			match(T__2);
			setState(27);
			match(T__3);
			setState(28);
			match(T__4);
			setState(29);
			match(T__5);
			setState(30);
			match(T__6);
			setState(31);
			match(T__7);
			setState(32);
			match(T__8);
			setState(33);
			match(T__9);
			setState(34);
			match(Id);
			setState(35);
			match(T__10);
			setState(36);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(37);
					varDeclaration();
					}
					} 
				}
				setState(42);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Id))) != 0)) {
				{
				{
				setState(43);
				stmt();
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(T__11);
			setState(50);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(miniJavaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(miniJavaParser.Id, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__0);
			setState(53);
			match(Id);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(54);
				match(T__12);
				setState(55);
				match(Id);
				}
			}

			setState(58);
			match(T__1);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Id))) != 0)) {
				{
				{
				setState(59);
				varDeclaration();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(65);
				methodDeclaration();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Id() { return getToken(miniJavaParser.Id, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			type();
			setState(74);
			match(Id);
			setState(75);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(miniJavaParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(miniJavaParser.Id, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__2);
			setState(78);
			type();
			setState(79);
			match(Id);
			setState(80);
			match(T__6);
			setState(81);
			type();
			setState(82);
			match(Id);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(83);
					match(T__14);
					setState(84);
					type();
					setState(85);
					match(Id);
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(92);
			match(T__10);
			setState(93);
			match(T__1);
			setState(97);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					varDeclaration();
					}
					} 
				}
				setState(99);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Id))) != 0)) {
				{
				{
				setState(100);
				stmt();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			match(T__15);
			setState(107);
			exp(0);
			setState(108);
			match(T__13);
			setState(109);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(miniJavaParser.Id, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__16);
				setState(112);
				match(T__8);
				setState(113);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(Id);
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

	public static class StmtContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode Id() { return getToken(miniJavaParser.Id, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(T__1);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Id))) != 0)) {
					{
					{
					setState(120);
					stmt();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(126);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__18);
				setState(128);
				match(T__6);
				setState(129);
				exp(0);
				setState(130);
				match(T__10);
				setState(131);
				stmt();
				setState(132);
				match(T__19);
				setState(133);
				stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(T__20);
				setState(136);
				match(T__6);
				setState(137);
				exp(0);
				setState(138);
				match(T__10);
				setState(139);
				stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(T__21);
				setState(142);
				match(T__6);
				setState(143);
				exp(0);
				setState(144);
				match(T__10);
				setState(145);
				match(T__13);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				match(Id);
				setState(148);
				match(T__22);
				setState(149);
				exp(0);
				setState(150);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(152);
				match(Id);
				setState(153);
				match(T__8);
				setState(154);
				exp(0);
				setState(155);
				match(T__9);
				setState(156);
				match(T__22);
				setState(157);
				exp(0);
				setState(158);
				match(T__13);
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

	public static class ExpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(miniJavaParser.INT, 0); }
		public TerminalNode Id() { return getToken(miniJavaParser.Id, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniJavaListener ) ((miniJavaListener)listener).exitExp(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(163);
				match(INT);
				}
				break;
			case 2:
				{
				setState(164);
				match(T__30);
				}
				break;
			case 3:
				{
				setState(165);
				match(T__31);
				}
				break;
			case 4:
				{
				setState(166);
				match(Id);
				}
				break;
			case 5:
				{
				setState(167);
				match(T__32);
				}
				break;
			case 6:
				{
				setState(168);
				match(T__33);
				setState(169);
				match(T__16);
				setState(170);
				match(T__8);
				setState(171);
				exp(0);
				setState(172);
				match(T__9);
				}
				break;
			case 7:
				{
				setState(174);
				match(T__33);
				setState(175);
				match(Id);
				setState(176);
				match(T__6);
				setState(177);
				match(T__10);
				}
				break;
			case 8:
				{
				setState(178);
				match(T__34);
				setState(179);
				exp(2);
				}
				break;
			case 9:
				{
				setState(180);
				match(T__6);
				setState(181);
				exp(0);
				setState(182);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(186);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(187);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(188);
						exp(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(189);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(190);
						match(T__8);
						setState(191);
						exp(0);
						setState(192);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(194);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(195);
						match(T__28);
						}
						break;
					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(196);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(197);
						match(T__29);
						setState(198);
						match(Id);
						setState(199);
						match(T__6);
						setState(208);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << Id) | (1L << INT))) != 0)) {
							{
							setState(200);
							exp(0);
							setState(205);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(201);
								match(T__14);
								setState(202);
								exp(0);
								}
								}
								setState(207);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(210);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3*\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13\4\3\4"+
		"\7\4E\n\4\f\4\16\4H\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\6\7\6b\n\6\f\6\16"+
		"\6e\13\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7x\n\7\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a3\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00bb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ce\n\t\f\t\16\t\u00d1\13\t\5\t\u00d3\n"+
		"\t\3\t\7\t\u00d6\n\t\f\t\16\t\u00d9\13\t\3\t\3[\3\20\n\2\4\6\b\n\f\16"+
		"\20\2\3\3\2\32\36\u00f2\2\22\3\2\2\2\4\31\3\2\2\2\6\66\3\2\2\2\bK\3\2"+
		"\2\2\nO\3\2\2\2\fw\3\2\2\2\16\u00a2\3\2\2\2\20\u00ba\3\2\2\2\22\26\5\4"+
		"\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2"+
		"\2\2\27\3\3\2\2\2\30\26\3\2\2\2\31\32\7\3\2\2\32\33\7&\2\2\33\34\7\4\2"+
		"\2\34\35\7\5\2\2\35\36\7\6\2\2\36\37\7\7\2\2\37 \7\b\2\2 !\7\t\2\2!\""+
		"\7\n\2\2\"#\7\13\2\2#$\7\f\2\2$%\7&\2\2%&\7\r\2\2&*\7\4\2\2\')\5\b\5\2"+
		"(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,*\3\2\2\2-/\5\16"+
		"\b\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62"+
		"\60\3\2\2\2\63\64\7\16\2\2\64\65\7\16\2\2\65\5\3\2\2\2\66\67\7\3\2\2\67"+
		":\7&\2\289\7\17\2\29;\7&\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<@\7\4\2\2="+
		"?\5\b\5\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AF\3\2\2\2B@\3\2\2\2"+
		"CE\5\n\6\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2"+
		"IJ\7\16\2\2J\7\3\2\2\2KL\5\f\7\2LM\7&\2\2MN\7\20\2\2N\t\3\2\2\2OP\7\5"+
		"\2\2PQ\5\f\7\2QR\7&\2\2RS\7\t\2\2ST\5\f\7\2T[\7&\2\2UV\7\21\2\2VW\5\f"+
		"\7\2WX\7&\2\2XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[\\\3\2\2\2[Y\3\2\2\2\\^\3"+
		"\2\2\2][\3\2\2\2^_\7\r\2\2_c\7\4\2\2`b\5\b\5\2a`\3\2\2\2be\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2di\3\2\2\2ec\3\2\2\2fh\5\16\b\2gf\3\2\2\2hk\3\2\2\2ig"+
		"\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\22\2\2mn\5\20\t\2no\7\20\2"+
		"\2op\7\16\2\2p\13\3\2\2\2qr\7\23\2\2rs\7\13\2\2sx\7\f\2\2tx\7\24\2\2u"+
		"x\7\23\2\2vx\7&\2\2wq\3\2\2\2wt\3\2\2\2wu\3\2\2\2wv\3\2\2\2x\r\3\2\2\2"+
		"y}\7\4\2\2z|\5\16\b\2{z\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u00a3\7\16\2\2\u0081\u0082\7\25\2\2\u0082"+
		"\u0083\7\t\2\2\u0083\u0084\5\20\t\2\u0084\u0085\7\r\2\2\u0085\u0086\5"+
		"\16\b\2\u0086\u0087\7\26\2\2\u0087\u0088\5\16\b\2\u0088\u00a3\3\2\2\2"+
		"\u0089\u008a\7\27\2\2\u008a\u008b\7\t\2\2\u008b\u008c\5\20\t\2\u008c\u008d"+
		"\7\r\2\2\u008d\u008e\5\16\b\2\u008e\u00a3\3\2\2\2\u008f\u0090\7\30\2\2"+
		"\u0090\u0091\7\t\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\r\2\2\u0093\u0094"+
		"\7\20\2\2\u0094\u00a3\3\2\2\2\u0095\u0096\7&\2\2\u0096\u0097\7\31\2\2"+
		"\u0097\u0098\5\20\t\2\u0098\u0099\7\20\2\2\u0099\u00a3\3\2\2\2\u009a\u009b"+
		"\7&\2\2\u009b\u009c\7\13\2\2\u009c\u009d\5\20\t\2\u009d\u009e\7\f\2\2"+
		"\u009e\u009f\7\31\2\2\u009f\u00a0\5\20\t\2\u00a0\u00a1\7\20\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2y\3\2\2\2\u00a2\u0081\3\2\2\2\u00a2\u0089\3\2\2\2"+
		"\u00a2\u008f\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u009a\3\2\2\2\u00a3\17"+
		"\3\2\2\2\u00a4\u00a5\b\t\1\2\u00a5\u00bb\7\'\2\2\u00a6\u00bb\7!\2\2\u00a7"+
		"\u00bb\7\"\2\2\u00a8\u00bb\7&\2\2\u00a9\u00bb\7#\2\2\u00aa\u00ab\7$\2"+
		"\2\u00ab\u00ac\7\23\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\20\t\2\u00ae"+
		"\u00af\7\f\2\2\u00af\u00bb\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b2\7&\2"+
		"\2\u00b2\u00b3\7\t\2\2\u00b3\u00bb\7\r\2\2\u00b4\u00b5\7%\2\2\u00b5\u00bb"+
		"\5\20\t\4\u00b6\u00b7\7\t\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7\r\2\2"+
		"\u00b9\u00bb\3\2\2\2\u00ba\u00a4\3\2\2\2\u00ba\u00a6\3\2\2\2\u00ba\u00a7"+
		"\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00a9\3\2\2\2\u00ba\u00aa\3\2\2\2\u00ba"+
		"\u00b0\3\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00d7\3\2"+
		"\2\2\u00bc\u00bd\f\17\2\2\u00bd\u00be\t\2\2\2\u00be\u00d6\5\20\t\20\u00bf"+
		"\u00c0\f\16\2\2\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3"+
		"\7\f\2\2\u00c3\u00d6\3\2\2\2\u00c4\u00c5\f\r\2\2\u00c5\u00d6\7\37\2\2"+
		"\u00c6\u00c7\f\f\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9\7&\2\2\u00c9\u00d2"+
		"\7\t\2\2\u00ca\u00cf\5\20\t\2\u00cb\u00cc\7\21\2\2\u00cc\u00ce\5\20\t"+
		"\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\r\2\2\u00d5\u00bc\3\2"+
		"\2\2\u00d5\u00bf\3\2\2\2\u00d5\u00c4\3\2\2\2\u00d5\u00c6\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\21\3\2\2"+
		"\2\u00d9\u00d7\3\2\2\2\23\26*\60:@F[ciw}\u00a2\u00ba\u00cf\u00d2\u00d5"+
		"\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}