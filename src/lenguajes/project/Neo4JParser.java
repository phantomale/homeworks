// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Neo4JParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MATCH=5, CREATE=6, RETURN=7, AVG=8, SUM=9, 
		DISTINCT=10, MAX=11, MIN=12, WITH=13, OPTIONAL=14, OR=15, NOT=16, EXISTS=17, 
		HAS=18, STARTS=19, ENDS=20, TRUE=21, FALSE=22, CONTAINS=23, WHERE=24, 
		IN=25, COUNT=26, RELS=27, RELATIONSHIP=28, NODE=29, NODES=30, PROPS=31, 
		INDEX=32, ON=33, SET=34, DETACH=35, DELETE=36, REMOVE=37, ORDER=38, BY=39, 
		DESC=40, ASC=41, LENGHT=42, LIMIT=43, SKIP_TOKEN=44, RAND=45, DROP=46, 
		ID=47, LABEL=48, TOKEN_IGUAL=49, TOKEN_REGEX=50, TOKEN_AGREGAR=51, TOKEN_DIF=52, 
		TOKEN_MAYOR=53, TOKEN_MAYOR_IGUAL=54, TOKEN_MENOR=55, TOKEN_MENOR_IGUAL=56, 
		TOKEN_PAR_IZR=57, TOKEN_PAR_DER=58, TOKEN_COR_IZR=59, TOKEN_COR_DER=60, 
		TOKEN_LLAVE_IZR=61, TOKEN_LLAVE_DER=62, TOKEN_COMA=63, TOKEN_PYC=64, TOKEN_FIN_LINEA=65, 
		TOKEN_MUL=66, TOKEN_DIV=67, TOKEN_MAS=68, TOKEN_MENOS=69, TOKEN_RELATION=70, 
		TOKEN_DIRECTED_RELATION=71, TOKEN_POT=72, TOKEN_PUNTO=73, TOKEN_XOR=74, 
		TOKEN_DOSP=75, TOKEN_CADENA=76, TOKEN_REAL=77, TOKEN_ENTERO=78, WS=79, 
		LINE_COMMENT=80;
	public static final int
		RULE_init = 0, RULE_select_sentence = 1, RULE_opt_where = 2, RULE_create = 3, 
		RULE_opt_create = 4, RULE_relation_def = 5, RULE_relation_type = 6, RULE_node_def = 7, 
		RULE_definition = 8, RULE_props_list = 9, RULE_prop = 10, RULE_exp = 11, 
		RULE_b_term = 12, RULE_eq_factor = 13, RULE_dif_opt = 14, RULE_b_factor = 15, 
		RULE_rel_opt = 16, RULE_exp_num = 17, RULE_sum_opt = 18, RULE_mod_term = 19, 
		RULE_mul_opt = 20, RULE_s_term = 21, RULE_not_factor = 22, RULE_factor = 23, 
		RULE_function_sentence = 24, RULE_relationship_rels = 25, RULE_node_nodes = 26, 
		RULE_token_mod = 27, RULE_token_y = 28, RULE_token_o = 29, RULE_token_neg = 30;
	public static final String[] ruleNames = {
		"init", "select_sentence", "opt_where", "create", "opt_create", "relation_def", 
		"relation_type", "node_def", "definition", "props_list", "prop", "exp", 
		"b_term", "eq_factor", "dif_opt", "b_factor", "rel_opt", "exp_num", "sum_opt", 
		"mod_term", "mul_opt", "s_term", "not_factor", "factor", "function_sentence", 
		"relationship_rels", "node_nodes", "token_mod", "token_y", "token_o", 
		"token_neg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'|'", "'~'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "'~='", "'+='", "'!='", "'>'", "'>='", "'<'", "'<='", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'\n'", "'*'", 
		"'/'", "'+'", "'-'", "'--'", "'-->'", "'^'", "'.'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MATCH", "CREATE", "RETURN", "AVG", "SUM", 
		"DISTINCT", "MAX", "MIN", "WITH", "OPTIONAL", "OR", "NOT", "EXISTS", "HAS", 
		"STARTS", "ENDS", "TRUE", "FALSE", "CONTAINS", "WHERE", "IN", "COUNT", 
		"RELS", "RELATIONSHIP", "NODE", "NODES", "PROPS", "INDEX", "ON", "SET", 
		"DETACH", "DELETE", "REMOVE", "ORDER", "BY", "DESC", "ASC", "LENGHT", 
		"LIMIT", "SKIP_TOKEN", "RAND", "DROP", "ID", "LABEL", "TOKEN_IGUAL", "TOKEN_REGEX", 
		"TOKEN_AGREGAR", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_LLAVE_IZR", "TOKEN_LLAVE_DER", "TOKEN_COMA", "TOKEN_PYC", 
		"TOKEN_FIN_LINEA", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", 
		"TOKEN_RELATION", "TOKEN_DIRECTED_RELATION", "TOKEN_POT", "TOKEN_PUNTO", 
		"TOKEN_XOR", "TOKEN_DOSP", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", 
		"WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Neo4J.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Neo4JParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<Select_sentenceContext> select_sentence() {
			return getRuleContexts(Select_sentenceContext.class);
		}
		public Select_sentenceContext select_sentence(int i) {
			return getRuleContext(Select_sentenceContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CREATE) {
					{
					{
					setState(62);
					create();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MATCH) {
					{
					{
					setState(68);
					select_sentence();
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Select_sentenceContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(Neo4JParser.MATCH, 0); }
		public Node_defContext node_def() {
			return getRuleContext(Node_defContext.class,0);
		}
		public Opt_whereContext opt_where() {
			return getRuleContext(Opt_whereContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(Neo4JParser.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TOKEN_FIN_LINEA() { return getToken(Neo4JParser.TOKEN_FIN_LINEA, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Select_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSelect_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSelect_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSelect_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_sentenceContext select_sentence() throws RecognitionException {
		Select_sentenceContext _localctx = new Select_sentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(MATCH);
			setState(77);
			node_def();
			setState(78);
			opt_where();
			setState(79);
			match(RETURN);
			setState(80);
			exp(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(81);
				match(TOKEN_COMA);
				setState(82);
				exp(0);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			switch (_input.LA(1)) {
			case TOKEN_FIN_LINEA:
				{
				setState(88);
				match(TOKEN_FIN_LINEA);
				}
				break;
			case EOF:
			case MATCH:
				{
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

	public static class Opt_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Neo4JParser.WHERE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Opt_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterOpt_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitOpt_where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitOpt_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_whereContext opt_where() throws RecognitionException {
		Opt_whereContext _localctx = new Opt_whereContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opt_where);
		int _la;
		try {
			setState(102);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(WHERE);
				setState(93);
				exp(0);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(94);
					match(TOKEN_COMA);
					setState(95);
					exp(0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Neo4JParser.CREATE, 0); }
		public Opt_createContext opt_create() {
			return getRuleContext(Opt_createContext.class,0);
		}
		public TerminalNode TOKEN_FIN_LINEA() { return getToken(Neo4JParser.TOKEN_FIN_LINEA, 0); }
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CREATE);
			setState(105);
			opt_create();
			setState(108);
			switch (_input.LA(1)) {
			case TOKEN_FIN_LINEA:
				{
				setState(106);
				match(TOKEN_FIN_LINEA);
				}
				break;
			case EOF:
			case CREATE:
				{
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

	public static class Opt_createContext extends ParserRuleContext {
		public Opt_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_create; }
	 
		public Opt_createContext() { }
		public void copyFrom(Opt_createContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Create_multipleContext extends Opt_createContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_multipleContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_multiple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Create_relationContext extends Opt_createContext {
		public List<Relation_defContext> relation_def() {
			return getRuleContexts(Relation_defContext.class);
		}
		public Relation_defContext relation_def(int i) {
			return getRuleContext(Relation_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_relationContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_createContext opt_create() throws RecognitionException {
		Opt_createContext _localctx = new Opt_createContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_opt_create);
		int _la;
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Create_multipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				node_def();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(111);
					match(TOKEN_COMA);
					setState(112);
					node_def();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Create_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				relation_def();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(119);
					match(TOKEN_COMA);
					setState(120);
					relation_def();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Relation_defContext extends ParserRuleContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public Relation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelation_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelation_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_defContext relation_def() throws RecognitionException {
		Relation_defContext _localctx = new Relation_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relation_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			node_def();
			setState(129);
			relation_type();
			setState(130);
			node_def();
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

	public static class Relation_typeContext extends ParserRuleContext {
		public Relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_type; }
	 
		public Relation_typeContext() { }
		public void copyFrom(Relation_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Simple_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_RELATION() { return getToken(Neo4JParser.TOKEN_RELATION, 0); }
		public Simple_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSimple_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSimple_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSimple_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Directed_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_DIRECTED_RELATION() { return getToken(Neo4JParser.TOKEN_DIRECTED_RELATION, 0); }
		public Directed_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDirected_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDirected_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDirected_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Complex_relationContext extends Relation_typeContext {
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(Neo4JParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(Neo4JParser.TOKEN_MENOS, i);
		}
		public TerminalNode TOKEN_COR_IZR() { return getToken(Neo4JParser.TOKEN_COR_IZR, 0); }
		public TerminalNode TOKEN_COR_DER() { return getToken(Neo4JParser.TOKEN_COR_DER, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public List<TerminalNode> TOKEN_MAYOR() { return getTokens(Neo4JParser.TOKEN_MAYOR); }
		public TerminalNode TOKEN_MAYOR(int i) {
			return getToken(Neo4JParser.TOKEN_MAYOR, i);
		}
		public Complex_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterComplex_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitComplex_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitComplex_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_typeContext relation_type() throws RecognitionException {
		Relation_typeContext _localctx = new Relation_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation_type);
		int _la;
		try {
			setState(147);
			switch (_input.LA(1)) {
			case TOKEN_RELATION:
				_localctx = new Simple_relationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(TOKEN_RELATION);
				}
				break;
			case TOKEN_DIRECTED_RELATION:
				_localctx = new Directed_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(TOKEN_DIRECTED_RELATION);
				}
				break;
			case TOKEN_MENOS:
				_localctx = new Complex_relationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(TOKEN_MENOS);
				setState(135);
				match(TOKEN_COR_IZR);
				setState(138);
				_la = _input.LA(1);
				if (_la==TOKEN_DOSP) {
					{
					setState(136);
					match(TOKEN_DOSP);
					setState(137);
					match(LABEL);
					}
				}

				setState(140);
				match(TOKEN_COR_DER);
				setState(141);
				match(TOKEN_MENOS);
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					match(TOKEN_MAYOR);
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOKEN_MAYOR );
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

	public static class Node_defContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public Node_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_defContext node_def() throws RecognitionException {
		Node_defContext _localctx = new Node_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_node_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TOKEN_PAR_IZR);
			setState(150);
			definition();
			setState(151);
			match(TOKEN_PAR_DER);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public Props_listContext props_list() {
			return getRuleContext(Props_listContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ID);
			setState(154);
			match(TOKEN_DOSP);
			setState(155);
			match(LABEL);
			setState(157);
			_la = _input.LA(1);
			if (_la==TOKEN_LLAVE_IZR) {
				{
				setState(156);
				props_list();
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

	public static class Props_listContext extends ParserRuleContext {
		public TerminalNode TOKEN_LLAVE_IZR() { return getToken(Neo4JParser.TOKEN_LLAVE_IZR, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(Neo4JParser.TOKEN_LLAVE_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Props_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProps_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProps_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProps_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Props_listContext props_list() throws RecognitionException {
		Props_listContext _localctx = new Props_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_props_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(TOKEN_LLAVE_IZR);
			setState(160);
			prop();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(161);
				match(TOKEN_COMA);
				setState(162);
				prop();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(TOKEN_LLAVE_DER);
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

	public static class PropContext extends ParserRuleContext {
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
	 
		public PropContext() { }
		public void copyFrom(PropContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PropertyContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Query_condContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Query_condContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterQuery_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitQuery_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitQuery_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prop);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				setState(171);
				match(TOKEN_DOSP);
				setState(172);
				exp(0);
				}
				break;
			case 2:
				_localctx = new Query_condContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(ID);
				setState(174);
				rel_opt();
				setState(175);
				exp(0);
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
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Or_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Token_oContext token_o() {
			return getRuleContext(Token_oContext.class,0);
		}
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Or_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitOr_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitOr_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_singleContext extends ExpContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Exp_singleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xor_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_XOR() { return getToken(Neo4JParser.TOKEN_XOR, 0); }
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Xor_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterXor_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitXor_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitXor_operation(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(180);
			b_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(191);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(189);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Or_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						token_o();
						setState(184);
						b_term(0);
						}
						break;
					case 2:
						{
						_localctx = new Xor_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						match(TOKEN_XOR);
						setState(188);
						b_term(0);
						}
						break;
					}
					} 
				}
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class B_termContext extends ParserRuleContext {
		public B_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_term; }
	 
		public B_termContext() { }
		public void copyFrom(B_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_operationContext extends B_termContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Token_yContext token_y() {
			return getRuleContext(Token_yContext.class,0);
		}
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public And_operationContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitAnd_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitAnd_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_term_singleContext extends B_termContext {
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public B_term_singleContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_term_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_termContext b_term() throws RecognitionException {
		return b_term(0);
	}

	private B_termContext b_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		B_termContext _localctx = new B_termContext(_ctx, _parentState);
		B_termContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_b_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new B_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(195);
			eq_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operationContext(new B_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_b_term);
					setState(197);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(198);
					token_y();
					setState(199);
					eq_factor();
					}
					} 
				}
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Eq_factorContext extends ParserRuleContext {
		public Eq_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_factor; }
	 
		public Eq_factorContext() { }
		public void copyFrom(Eq_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Equals_operationContext extends Eq_factorContext {
		public List<B_factorContext> b_factor() {
			return getRuleContexts(B_factorContext.class);
		}
		public B_factorContext b_factor(int i) {
			return getRuleContext(B_factorContext.class,i);
		}
		public Dif_optContext dif_opt() {
			return getRuleContext(Dif_optContext.class,0);
		}
		public Equals_operationContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEquals_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEquals_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEquals_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_factor_singleContext extends Eq_factorContext {
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
		}
		public Eq_factor_singleContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEq_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEq_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEq_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_factorContext eq_factor() throws RecognitionException {
		Eq_factorContext _localctx = new Eq_factorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eq_factor);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Equals_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				b_factor();
				setState(207);
				dif_opt();
				setState(208);
				b_factor();
				}
				break;
			case 2:
				_localctx = new Eq_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				b_factor();
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

	public static class Dif_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(Neo4JParser.TOKEN_DIF, 0); }
		public Dif_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dif_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDif_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDif_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDif_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dif_optContext dif_opt() throws RecognitionException {
		Dif_optContext _localctx = new Dif_optContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dif_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_IGUAL || _la==TOKEN_DIF) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class B_factorContext extends ParserRuleContext {
		public B_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_factor; }
	 
		public B_factorContext() { }
		public void copyFrom(B_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rel_operationContext extends B_factorContext {
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public Rel_operationContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_factor_singleContext extends B_factorContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public B_factor_singleContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_factorContext b_factor() throws RecognitionException {
		B_factorContext _localctx = new B_factorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_b_factor);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Rel_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				exp_num(0);
				setState(216);
				rel_opt();
				setState(217);
				exp_num(0);
				}
				break;
			case 2:
				_localctx = new B_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				exp_num(0);
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

	public static class Rel_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAYOR() { return getToken(Neo4JParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(Neo4JParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_REGEX() { return getToken(Neo4JParser.TOKEN_REGEX, 0); }
		public Rel_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_optContext rel_opt() throws RecognitionException {
		Rel_optContext _localctx = new Rel_optContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_REGEX) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Exp_numContext extends ParserRuleContext {
		public Exp_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_num; }
	 
		public Exp_numContext() { }
		public void copyFrom(Exp_numContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exp_num_singleContext extends Exp_numContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Exp_num_singleContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_num_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_num_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_num_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sum_operationContext extends Exp_numContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public Sum_optContext sum_opt() {
			return getRuleContext(Sum_optContext.class,0);
		}
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Sum_operationContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_numContext exp_num() throws RecognitionException {
		return exp_num(0);
	}

	private Exp_numContext exp_num(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_numContext _localctx = new Exp_numContext(_ctx, _parentState);
		Exp_numContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp_num, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_num_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(225);
			mod_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_operationContext(new Exp_numContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp_num);
					setState(227);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(228);
					sum_opt();
					setState(229);
					mod_term(0);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Sum_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAS() { return getToken(Neo4JParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(Neo4JParser.TOKEN_MENOS, 0); }
		public Sum_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_optContext sum_opt() throws RecognitionException {
		Sum_optContext _localctx = new Sum_optContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Mod_termContext extends ParserRuleContext {
		public Mod_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_term; }
	 
		public Mod_termContext() { }
		public void copyFrom(Mod_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mod_term_singleContext extends Mod_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mod_term_singleContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMod_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMod_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMod_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mul_mod_operationContext extends Mod_termContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Mul_optContext mul_opt() {
			return getRuleContext(Mul_optContext.class,0);
		}
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mul_mod_operationContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_mod_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_mod_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_mod_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_termContext mod_term() throws RecognitionException {
		return mod_term(0);
	}

	private Mod_termContext mod_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mod_termContext _localctx = new Mod_termContext(_ctx, _parentState);
		Mod_termContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_mod_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mod_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(239);
			s_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_mod_operationContext(new Mod_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mod_term);
					setState(241);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(242);
					mul_opt();
					setState(243);
					s_term(0);
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Mul_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(Neo4JParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(Neo4JParser.TOKEN_DIV, 0); }
		public Token_modContext token_mod() {
			return getRuleContext(Token_modContext.class,0);
		}
		public Mul_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_optContext mul_opt() throws RecognitionException {
		Mul_optContext _localctx = new Mul_optContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mul_opt);
		try {
			setState(253);
			switch (_input.LA(1)) {
			case TOKEN_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(TOKEN_MUL);
				}
				break;
			case TOKEN_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(TOKEN_DIV);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				token_mod();
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

	public static class S_termContext extends ParserRuleContext {
		public S_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_term; }
	 
		public S_termContext() { }
		public void copyFrom(S_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class S_term_singleContext extends S_termContext {
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public S_term_singleContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterS_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitS_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitS_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pot_operationContext extends S_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(Neo4JParser.TOKEN_POT, 0); }
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Pot_operationContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterPot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitPot_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitPot_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_termContext s_term() throws RecognitionException {
		return s_term(0);
	}

	private S_termContext s_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		S_termContext _localctx = new S_termContext(_ctx, _parentState);
		S_termContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_s_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(256);
			not_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pot_operationContext(new S_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s_term);
					setState(258);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(259);
					match(TOKEN_POT);
					setState(260);
					not_factor();
					}
					} 
				}
				setState(265);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Not_factorContext extends ParserRuleContext {
		public Not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_factor; }
	 
		public Not_factorContext() { }
		public void copyFrom(Not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_factor_singleContext extends Not_factorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Not_factor_singleContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNot_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNot_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNot_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negation_operationContext extends Not_factorContext {
		public Token_negContext token_neg() {
			return getRuleContext(Token_negContext.class,0);
		}
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Negation_operationContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNegation_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNegation_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNegation_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_factorContext not_factor() throws RecognitionException {
		Not_factorContext _localctx = new Not_factorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_not_factor);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__3:
			case NOT:
				_localctx = new Negation_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				token_neg();
				setState(267);
				not_factor();
				}
				break;
			case AVG:
			case SUM:
			case DISTINCT:
			case MAX:
			case MIN:
			case TRUE:
			case FALSE:
			case COUNT:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				_localctx = new Not_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TOKEN_CADENA() { return getToken(Neo4JParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(Neo4JParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(Neo4JParser.TOKEN_ENTERO, 0); }
		public TerminalNode TRUE() { return getToken(Neo4JParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Neo4JParser.FALSE, 0); }
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> ID() { return getTokens(Neo4JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Neo4JParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTO() { return getToken(Neo4JParser.TOKEN_PUNTO, 0); }
		public Function_sentenceContext function_sentence() {
			return getRuleContext(Function_sentenceContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(289);
			switch (_input.LA(1)) {
			case TOKEN_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(TOKEN_CADENA);
				}
				break;
			case TOKEN_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(TOKEN_REAL);
				}
				break;
			case TOKEN_ENTERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(TOKEN_ENTERO);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(FALSE);
				}
				break;
			case TOKEN_PAR_IZR:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(TOKEN_PAR_IZR);
				setState(278);
				exp(0);
				setState(279);
				match(TOKEN_PAR_DER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(281);
				match(ID);
				setState(282);
				match(TOKEN_PUNTO);
				setState(283);
				match(ID);
				}
				break;
			case AVG:
			case SUM:
			case DISTINCT:
			case MAX:
			case MIN:
			case COUNT:
				enterOuterAlt(_localctx, 8);
				{
				setState(284);
				function_sentence();
				setState(285);
				match(TOKEN_PAR_IZR);
				setState(286);
				exp(0);
				setState(287);
				match(TOKEN_PAR_DER);
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

	public static class Function_sentenceContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(Neo4JParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(Neo4JParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(Neo4JParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(Neo4JParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(Neo4JParser.MIN, 0); }
		public TerminalNode DISTINCT() { return getToken(Neo4JParser.DISTINCT, 0); }
		public Function_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFunction_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFunction_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFunction_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_sentenceContext function_sentence() throws RecognitionException {
		Function_sentenceContext _localctx = new Function_sentenceContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << SUM) | (1L << DISTINCT) | (1L << MAX) | (1L << MIN) | (1L << COUNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Relationship_relsContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(Neo4JParser.RELATIONSHIP, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode RELS() { return getToken(Neo4JParser.RELS, 0); }
		public Relationship_relsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship_rels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelationship_rels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelationship_rels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelationship_rels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relationship_relsContext relationship_rels() throws RecognitionException {
		Relationship_relsContext _localctx = new Relationship_relsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_relationship_rels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(RELATIONSHIP);
			setState(294);
			match(TOKEN_DOSP);
			setState(295);
			match(RELS);
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

	public static class Node_nodesContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(Neo4JParser.NODE, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode NODES() { return getToken(Neo4JParser.NODES, 0); }
		public Node_nodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_nodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_nodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_nodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_nodesContext node_nodes() throws RecognitionException {
		Node_nodesContext _localctx = new Node_nodesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_node_nodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(NODE);
			setState(298);
			match(TOKEN_DOSP);
			setState(299);
			match(NODES);
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

	public static class Token_modContext extends ParserRuleContext {
		public Token_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_modContext token_mod() throws RecognitionException {
		Token_modContext _localctx = new Token_modContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_token_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__0);
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

	public static class Token_yContext extends ParserRuleContext {
		public Token_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_yContext token_y() throws RecognitionException {
		Token_yContext _localctx = new Token_yContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_token_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(T__1);
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

	public static class Token_oContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Neo4JParser.OR, 0); }
		public Token_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_oContext token_o() throws RecognitionException {
		Token_oContext _localctx = new Token_oContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_token_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Token_negContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Neo4JParser.NOT, 0); }
		public Token_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_negContext token_neg() throws RecognitionException {
		Token_negContext _localctx = new Token_negContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_token_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 12:
			return b_term_sempred((B_termContext)_localctx, predIndex);
		case 17:
			return exp_num_sempred((Exp_numContext)_localctx, predIndex);
		case 19:
			return mod_term_sempred((Mod_termContext)_localctx, predIndex);
		case 21:
			return s_term_sempred((S_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_term_sempred(B_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_num_sempred(Exp_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mod_term_sempred(Mod_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean s_term_sempred(S_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\7\2B\n\2\f\2\16\2E\13\2\3\2\7\2H\n\2\f\2\16\2K\13\2\5\2M\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\7\3V\n\3\f\3\16\3Y\13\3\3\3\3\3\5\3]\n\3\3\4\3\4"+
		"\3\4\3\4\7\4c\n\4\f\4\16\4f\13\4\3\4\5\4i\n\4\3\5\3\5\3\5\3\5\5\5o\n\5"+
		"\3\6\3\6\3\6\7\6t\n\6\f\6\16\6w\13\6\3\6\3\6\3\6\7\6|\n\6\f\6\16\6\177"+
		"\13\6\5\6\u0081\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d"+
		"\n\b\3\b\3\b\3\b\6\b\u0092\n\b\r\b\16\b\u0093\5\b\u0096\n\b\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\13\3\13\7\13\u00a6\n"+
		"\13\f\13\16\13\u00a9\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00c0\n\r\f\r\16\r\u00c3"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00cc\n\16\f\16\16\16\u00cf"+
		"\13\16\3\17\3\17\3\17\3\17\3\17\5\17\u00d6\n\17\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\5\21\u00df\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00ea\n\23\f\23\16\23\u00ed\13\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u00f8\n\25\f\25\16\25\u00fb\13\25\3\26\3\26"+
		"\3\26\5\26\u0100\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u0108\n\27\f"+
		"\27\16\27\u010b\13\27\3\30\3\30\3\30\3\30\5\30\u0111\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u0124\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \2\7\30\32$(,!\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\b\4\2\63\63\66\66\4\2"+
		"\63\64\67:\3\2FG\4\2\n\16\34\34\4\2\5\5\21\21\4\2\6\6\22\22\u013c\2L\3"+
		"\2\2\2\4N\3\2\2\2\6h\3\2\2\2\bj\3\2\2\2\n\u0080\3\2\2\2\f\u0082\3\2\2"+
		"\2\16\u0095\3\2\2\2\20\u0097\3\2\2\2\22\u009b\3\2\2\2\24\u00a1\3\2\2\2"+
		"\26\u00b3\3\2\2\2\30\u00b5\3\2\2\2\32\u00c4\3\2\2\2\34\u00d5\3\2\2\2\36"+
		"\u00d7\3\2\2\2 \u00de\3\2\2\2\"\u00e0\3\2\2\2$\u00e2\3\2\2\2&\u00ee\3"+
		"\2\2\2(\u00f0\3\2\2\2*\u00ff\3\2\2\2,\u0101\3\2\2\2.\u0110\3\2\2\2\60"+
		"\u0123\3\2\2\2\62\u0125\3\2\2\2\64\u0127\3\2\2\2\66\u012b\3\2\2\28\u012f"+
		"\3\2\2\2:\u0131\3\2\2\2<\u0133\3\2\2\2>\u0135\3\2\2\2@B\5\b\5\2A@\3\2"+
		"\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DM\3\2\2\2EC\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2KI\3\2\2\2LC\3\2\2\2LI\3\2"+
		"\2\2M\3\3\2\2\2NO\7\7\2\2OP\5\20\t\2PQ\5\6\4\2QR\7\t\2\2RW\5\30\r\2ST"+
		"\7A\2\2TV\5\30\r\2US\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\\\3\2\2\2"+
		"YW\3\2\2\2Z]\7C\2\2[]\3\2\2\2\\Z\3\2\2\2\\[\3\2\2\2]\5\3\2\2\2^_\7\32"+
		"\2\2_d\5\30\r\2`a\7A\2\2ac\5\30\r\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3"+
		"\2\2\2ei\3\2\2\2fd\3\2\2\2gi\3\2\2\2h^\3\2\2\2hg\3\2\2\2i\7\3\2\2\2jk"+
		"\7\b\2\2kn\5\n\6\2lo\7C\2\2mo\3\2\2\2nl\3\2\2\2nm\3\2\2\2o\t\3\2\2\2p"+
		"u\5\20\t\2qr\7A\2\2rt\5\20\t\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\u0081\3\2\2\2wu\3\2\2\2x}\5\f\7\2yz\7A\2\2z|\5\f\7\2{y\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080p\3\2\2"+
		"\2\u0080x\3\2\2\2\u0081\13\3\2\2\2\u0082\u0083\5\20\t\2\u0083\u0084\5"+
		"\16\b\2\u0084\u0085\5\20\t\2\u0085\r\3\2\2\2\u0086\u0096\7H\2\2\u0087"+
		"\u0096\7I\2\2\u0088\u0089\7G\2\2\u0089\u008c\7=\2\2\u008a\u008b\7M\2\2"+
		"\u008b\u008d\7\62\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0091\7G\2\2\u0090\u0092\7\67\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0086\3\2\2\2\u0095\u0087\3\2\2\2\u0095"+
		"\u0088\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\7;\2\2\u0098\u0099\5\22\n"+
		"\2\u0099\u009a\7<\2\2\u009a\21\3\2\2\2\u009b\u009c\7\61\2\2\u009c\u009d"+
		"\7M\2\2\u009d\u009f\7\62\2\2\u009e\u00a0\5\24\13\2\u009f\u009e\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\23\3\2\2\2\u00a1\u00a2\7?\2\2\u00a2\u00a7\5"+
		"\26\f\2\u00a3\u00a4\7A\2\2\u00a4\u00a6\5\26\f\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2"+
		"\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ab\7@\2\2\u00ab\25\3\2\2\2\u00ac\u00ad"+
		"\7\61\2\2\u00ad\u00ae\7M\2\2\u00ae\u00b4\5\30\r\2\u00af\u00b0\7\61\2\2"+
		"\u00b0\u00b1\5\"\22\2\u00b1\u00b2\5\30\r\2\u00b2\u00b4\3\2\2\2\u00b3\u00ac"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\27\3\2\2\2\u00b5\u00b6\b\r\1\2\u00b6"+
		"\u00b7\5\32\16\2\u00b7\u00c1\3\2\2\2\u00b8\u00b9\f\5\2\2\u00b9\u00ba\5"+
		"<\37\2\u00ba\u00bb\5\32\16\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\f\4\2\2\u00bd"+
		"\u00be\7L\2\2\u00be\u00c0\5\32\16\2\u00bf\u00b8\3\2\2\2\u00bf\u00bc\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\31\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\b\16\1\2\u00c5\u00c6\5\34"+
		"\17\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\f\4\2\2\u00c8\u00c9\5:\36\2\u00c9"+
		"\u00ca\5\34\17\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cc\u00cf\3"+
		"\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\33\3\2\2\2\u00cf"+
		"\u00cd\3\2\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\5\36\20\2\u00d2\u00d3\5"+
		" \21\2\u00d3\u00d6\3\2\2\2\u00d4\u00d6\5 \21\2\u00d5\u00d0\3\2\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\t\2\2\2\u00d8\37\3\2\2\2\u00d9"+
		"\u00da\5$\23\2\u00da\u00db\5\"\22\2\u00db\u00dc\5$\23\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00df\5$\23\2\u00de\u00d9\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"!\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1#\3\2\2\2\u00e2\u00e3\b\23\1\2\u00e3"+
		"\u00e4\5(\25\2\u00e4\u00eb\3\2\2\2\u00e5\u00e6\f\4\2\2\u00e6\u00e7\5&"+
		"\24\2\u00e7\u00e8\5(\25\2\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00ea"+
		"\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec%\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ee\u00ef\t\4\2\2\u00ef\'\3\2\2\2\u00f0\u00f1\b"+
		"\25\1\2\u00f1\u00f2\5,\27\2\u00f2\u00f9\3\2\2\2\u00f3\u00f4\f\4\2\2\u00f4"+
		"\u00f5\5*\26\2\u00f5\u00f6\5,\27\2\u00f6\u00f8\3\2\2\2\u00f7\u00f3\3\2"+
		"\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		")\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u0100\7D\2\2\u00fd\u0100\7E\2\2\u00fe"+
		"\u0100\58\35\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u00fe\3\2"+
		"\2\2\u0100+\3\2\2\2\u0101\u0102\b\27\1\2\u0102\u0103\5.\30\2\u0103\u0109"+
		"\3\2\2\2\u0104\u0105\f\4\2\2\u0105\u0106\7J\2\2\u0106\u0108\5.\30\2\u0107"+
		"\u0104\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a-\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\5> \2\u010d\u010e"+
		"\5.\30\2\u010e\u0111\3\2\2\2\u010f\u0111\5\60\31\2\u0110\u010c\3\2\2\2"+
		"\u0110\u010f\3\2\2\2\u0111/\3\2\2\2\u0112\u0124\7N\2\2\u0113\u0124\7O"+
		"\2\2\u0114\u0124\7P\2\2\u0115\u0124\7\27\2\2\u0116\u0124\7\30\2\2\u0117"+
		"\u0118\7;\2\2\u0118\u0119\5\30\r\2\u0119\u011a\7<\2\2\u011a\u0124\3\2"+
		"\2\2\u011b\u011c\7\61\2\2\u011c\u011d\7K\2\2\u011d\u0124\7\61\2\2\u011e"+
		"\u011f\5\62\32\2\u011f\u0120\7;\2\2\u0120\u0121\5\30\r\2\u0121\u0122\7"+
		"<\2\2\u0122\u0124\3\2\2\2\u0123\u0112\3\2\2\2\u0123\u0113\3\2\2\2\u0123"+
		"\u0114\3\2\2\2\u0123\u0115\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u0117\3\2"+
		"\2\2\u0123\u011b\3\2\2\2\u0123\u011e\3\2\2\2\u0124\61\3\2\2\2\u0125\u0126"+
		"\t\5\2\2\u0126\63\3\2\2\2\u0127\u0128\7\36\2\2\u0128\u0129\7M\2\2\u0129"+
		"\u012a\7\35\2\2\u012a\65\3\2\2\2\u012b\u012c\7\37\2\2\u012c\u012d\7M\2"+
		"\2\u012d\u012e\7 \2\2\u012e\67\3\2\2\2\u012f\u0130\7\3\2\2\u01309\3\2"+
		"\2\2\u0131\u0132\7\4\2\2\u0132;\3\2\2\2\u0133\u0134\t\6\2\2\u0134=\3\2"+
		"\2\2\u0135\u0136\t\7\2\2\u0136?\3\2\2\2\36CILW\\dhnu}\u0080\u008c\u0093"+
		"\u0095\u009f\u00a7\u00b3\u00bf\u00c1\u00cd\u00d5\u00de\u00eb\u00f9\u00ff"+
		"\u0109\u0110\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}