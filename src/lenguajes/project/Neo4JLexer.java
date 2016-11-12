// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Neo4JLexer extends Lexer {
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
		TOKEN_DIRECTED_RELATION=71, TOKEN_POT=72, TOKEN_XOR=73, TOKEN_DOSP=74, 
		TOKEN_CADENA=75, TOKEN_REAL=76, TOKEN_ENTERO=77, WS=78, LINE_COMMENT=79;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "MATCH", "CREATE", "RETURN", "AVG", "SUM", 
		"DISTINCT", "MAX", "MIN", "WITH", "OPTIONAL", "OR", "NOT", "EXISTS", "HAS", 
		"STARTS", "ENDS", "TRUE", "FALSE", "CONTAINS", "WHERE", "IN", "COUNT", 
		"RELS", "RELATIONSHIP", "NODE", "NODES", "PROPS", "INDEX", "ON", "SET", 
		"DETACH", "DELETE", "REMOVE", "ORDER", "BY", "DESC", "ASC", "LENGHT", 
		"LIMIT", "SKIP_TOKEN", "RAND", "DROP", "ID", "LABEL", "TOKEN_IGUAL", "TOKEN_REGEX", 
		"TOKEN_AGREGAR", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_LLAVE_IZR", "TOKEN_LLAVE_DER", "TOKEN_COMA", "TOKEN_PYC", 
		"TOKEN_FIN_LINEA", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", 
		"TOKEN_RELATION", "TOKEN_DIRECTED_RELATION", "TOKEN_POT", "TOKEN_XOR", 
		"TOKEN_DOSP", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", "WS", "LINE_COMMENT", 
		"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
		"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'|'", "'~'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'='", "'~='", "'+='", "'!='", "'>'", "'>='", "'<'", "'<='", 
		"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'\n'", "'*'", 
		"'/'", "'+'", "'-'", "'--'", "'-->'", "'^'", null, "':'"
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
		"TOKEN_RELATION", "TOKEN_DIRECTED_RELATION", "TOKEN_POT", "TOKEN_XOR", 
		"TOKEN_DOSP", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", "WS", "LINE_COMMENT"
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


	public Neo4JLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Neo4J.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2Q\u027c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3"+
		"%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3"+
		"(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3"+
		",\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\6\60\u01ce\n\60\r"+
		"\60\16\60\u01cf\3\60\7\60\u01d3\n\60\f\60\16\60\u01d6\13\60\3\61\6\61"+
		"\u01d9\n\61\r\61\16\61\u01da\3\61\7\61\u01de\n\61\f\61\16\61\u01e1\13"+
		"\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\67\3\67\3\67\38\38\39\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3"+
		"@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3G\3H\3H\3H\3H\3I\3I\3J\3"+
		"J\3J\3J\3K\3K\3L\3L\7L\u0223\nL\fL\16L\u0226\13L\3L\3L\3M\6M\u022b\nM"+
		"\rM\16M\u022c\3M\3M\6M\u0231\nM\rM\16M\u0232\3N\6N\u0236\nN\rN\16N\u0237"+
		"\3O\3O\3O\3O\3P\3P\3P\3P\7P\u0242\nP\fP\16P\u0245\13P\3P\3P\3Q\3Q\3R\3"+
		"R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]"+
		"\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3i"+
		"\3i\3j\3j\2\2k\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34"+
		"\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g"+
		"\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F"+
		"\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af"+
		"\2\u00b1\2\u00b3\2\u00b5\2\u00b7\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1"+
		"\2\u00c3\2\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3"+
		"\2\3\2%\3\2c|\6\2\62;C\\aac|\3\2C\\\4\2$$))\5\2\f\f\17\17$$\3\2\62;\3"+
		"\2\60\60\5\2\13\13\17\17\"\"\4\2\f\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2"+
		"FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4"+
		"\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWw"+
		"w\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u026a\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\3\u00d5\3\2\2"+
		"\2\5\u00d7\3\2\2\2\7\u00d9\3\2\2\2\t\u00db\3\2\2\2\13\u00dd\3\2\2\2\r"+
		"\u00e3\3\2\2\2\17\u00ea\3\2\2\2\21\u00f1\3\2\2\2\23\u00f5\3\2\2\2\25\u00f9"+
		"\3\2\2\2\27\u0102\3\2\2\2\31\u0106\3\2\2\2\33\u010a\3\2\2\2\35\u010f\3"+
		"\2\2\2\37\u0118\3\2\2\2!\u011b\3\2\2\2#\u011f\3\2\2\2%\u0126\3\2\2\2\'"+
		"\u012a\3\2\2\2)\u0131\3\2\2\2+\u0136\3\2\2\2-\u013b\3\2\2\2/\u0141\3\2"+
		"\2\2\61\u014a\3\2\2\2\63\u0150\3\2\2\2\65\u0153\3\2\2\2\67\u0159\3\2\2"+
		"\29\u015e\3\2\2\2;\u016b\3\2\2\2=\u0170\3\2\2\2?\u0176\3\2\2\2A\u017c"+
		"\3\2\2\2C\u0182\3\2\2\2E\u0185\3\2\2\2G\u0189\3\2\2\2I\u0190\3\2\2\2K"+
		"\u0197\3\2\2\2M\u019e\3\2\2\2O\u01a4\3\2\2\2Q\u01a7\3\2\2\2S\u01ac\3\2"+
		"\2\2U\u01b0\3\2\2\2W\u01b7\3\2\2\2Y\u01bd\3\2\2\2[\u01c2\3\2\2\2]\u01c7"+
		"\3\2\2\2_\u01cd\3\2\2\2a\u01d8\3\2\2\2c\u01e2\3\2\2\2e\u01e4\3\2\2\2g"+
		"\u01e7\3\2\2\2i\u01ea\3\2\2\2k\u01ed\3\2\2\2m\u01ef\3\2\2\2o\u01f2\3\2"+
		"\2\2q\u01f4\3\2\2\2s\u01f7\3\2\2\2u\u01f9\3\2\2\2w\u01fb\3\2\2\2y\u01fd"+
		"\3\2\2\2{\u01ff\3\2\2\2}\u0201\3\2\2\2\177\u0203\3\2\2\2\u0081\u0205\3"+
		"\2\2\2\u0083\u0207\3\2\2\2\u0085\u0209\3\2\2\2\u0087\u020b\3\2\2\2\u0089"+
		"\u020d\3\2\2\2\u008b\u020f\3\2\2\2\u008d\u0211\3\2\2\2\u008f\u0214\3\2"+
		"\2\2\u0091\u0218\3\2\2\2\u0093\u021a\3\2\2\2\u0095\u021e\3\2\2\2\u0097"+
		"\u0220\3\2\2\2\u0099\u022a\3\2\2\2\u009b\u0235\3\2\2\2\u009d\u0239\3\2"+
		"\2\2\u009f\u023d\3\2\2\2\u00a1\u0248\3\2\2\2\u00a3\u024a\3\2\2\2\u00a5"+
		"\u024c\3\2\2\2\u00a7\u024e\3\2\2\2\u00a9\u0250\3\2\2\2\u00ab\u0252\3\2"+
		"\2\2\u00ad\u0254\3\2\2\2\u00af\u0256\3\2\2\2\u00b1\u0258\3\2\2\2\u00b3"+
		"\u025a\3\2\2\2\u00b5\u025c\3\2\2\2\u00b7\u025e\3\2\2\2\u00b9\u0260\3\2"+
		"\2\2\u00bb\u0262\3\2\2\2\u00bd\u0264\3\2\2\2\u00bf\u0266\3\2\2\2\u00c1"+
		"\u0268\3\2\2\2\u00c3\u026a\3\2\2\2\u00c5\u026c\3\2\2\2\u00c7\u026e\3\2"+
		"\2\2\u00c9\u0270\3\2\2\2\u00cb\u0272\3\2\2\2\u00cd\u0274\3\2\2\2\u00cf"+
		"\u0276\3\2\2\2\u00d1\u0278\3\2\2\2\u00d3\u027a\3\2\2\2\u00d5\u00d6\7\'"+
		"\2\2\u00d6\4\3\2\2\2\u00d7\u00d8\7(\2\2\u00d8\6\3\2\2\2\u00d9\u00da\7"+
		"~\2\2\u00da\b\3\2\2\2\u00db\u00dc\7\u0080\2\2\u00dc\n\3\2\2\2\u00dd\u00de"+
		"\5\u00b9]\2\u00de\u00df\5\u00a1Q\2\u00df\u00e0\5\u00c7d\2\u00e0\u00e1"+
		"\5\u00a5S\2\u00e1\u00e2\5\u00afX\2\u00e2\f\3\2\2\2\u00e3\u00e4\5\u00a5"+
		"S\2\u00e4\u00e5\5\u00c3b\2\u00e5\u00e6\5\u00a9U\2\u00e6\u00e7\5\u00a1"+
		"Q\2\u00e7\u00e8\5\u00c7d\2\u00e8\u00e9\5\u00a9U\2\u00e9\16\3\2\2\2\u00ea"+
		"\u00eb\5\u00c3b\2\u00eb\u00ec\5\u00a9U\2\u00ec\u00ed\5\u00c7d\2\u00ed"+
		"\u00ee\5\u00c9e\2\u00ee\u00ef\5\u00c3b\2\u00ef\u00f0\5\u00bb^\2\u00f0"+
		"\20\3\2\2\2\u00f1\u00f2\5\u00a1Q\2\u00f2\u00f3\5\u00cbf\2\u00f3\u00f4"+
		"\5\u00adW\2\u00f4\22\3\2\2\2\u00f5\u00f6\5\u00c5c\2\u00f6\u00f7\5\u00c9"+
		"e\2\u00f7\u00f8\5\u00b9]\2\u00f8\24\3\2\2\2\u00f9\u00fa\5\u00a7T\2\u00fa"+
		"\u00fb\5\u00b1Y\2\u00fb\u00fc\5\u00c5c\2\u00fc\u00fd\5\u00c7d\2\u00fd"+
		"\u00fe\5\u00b1Y\2\u00fe\u00ff\5\u00bb^\2\u00ff\u0100\5\u00a5S\2\u0100"+
		"\u0101\5\u00c7d\2\u0101\26\3\2\2\2\u0102\u0103\5\u00b9]\2\u0103\u0104"+
		"\5\u00a1Q\2\u0104\u0105\5\u00cfh\2\u0105\30\3\2\2\2\u0106\u0107\5\u00b9"+
		"]\2\u0107\u0108\5\u00b1Y\2\u0108\u0109\5\u00bb^\2\u0109\32\3\2\2\2\u010a"+
		"\u010b\5\u00cdg\2\u010b\u010c\5\u00b1Y\2\u010c\u010d\5\u00c7d\2\u010d"+
		"\u010e\5\u00afX\2\u010e\34\3\2\2\2\u010f\u0110\5\u00bd_\2\u0110\u0111"+
		"\5\u00bf`\2\u0111\u0112\5\u00c7d\2\u0112\u0113\5\u00b1Y\2\u0113\u0114"+
		"\5\u00bd_\2\u0114\u0115\5\u00bb^\2\u0115\u0116\5\u00a1Q\2\u0116\u0117"+
		"\5\u00b7\\\2\u0117\36\3\2\2\2\u0118\u0119\5\u00bd_\2\u0119\u011a\5\u00c3"+
		"b\2\u011a \3\2\2\2\u011b\u011c\5\u00bb^\2\u011c\u011d\5\u00bd_\2\u011d"+
		"\u011e\5\u00c7d\2\u011e\"\3\2\2\2\u011f\u0120\5\u00a9U\2\u0120\u0121\5"+
		"\u00cfh\2\u0121\u0122\5\u00b1Y\2\u0122\u0123\5\u00c5c\2\u0123\u0124\5"+
		"\u00c7d\2\u0124\u0125\5\u00c5c\2\u0125$\3\2\2\2\u0126\u0127\5\u00afX\2"+
		"\u0127\u0128\5\u00a1Q\2\u0128\u0129\5\u00c5c\2\u0129&\3\2\2\2\u012a\u012b"+
		"\5\u00c5c\2\u012b\u012c\5\u00c7d\2\u012c\u012d\5\u00a1Q\2\u012d\u012e"+
		"\5\u00c3b\2\u012e\u012f\5\u00c7d\2\u012f\u0130\5\u00c5c\2\u0130(\3\2\2"+
		"\2\u0131\u0132\5\u00a9U\2\u0132\u0133\5\u00bb^\2\u0133\u0134\5\u00a7T"+
		"\2\u0134\u0135\5\u00c5c\2\u0135*\3\2\2\2\u0136\u0137\5\u00c7d\2\u0137"+
		"\u0138\5\u00c3b\2\u0138\u0139\5\u00c9e\2\u0139\u013a\5\u00a9U\2\u013a"+
		",\3\2\2\2\u013b\u013c\5\u00abV\2\u013c\u013d\5\u00a1Q\2\u013d\u013e\5"+
		"\u00b7\\\2\u013e\u013f\5\u00c5c\2\u013f\u0140\5\u00a9U\2\u0140.\3\2\2"+
		"\2\u0141\u0142\5\u00a5S\2\u0142\u0143\5\u00bd_\2\u0143\u0144\5\u00bb^"+
		"\2\u0144\u0145\5\u00c7d\2\u0145\u0146\5\u00a1Q\2\u0146\u0147\5\u00b1Y"+
		"\2\u0147\u0148\5\u00bb^\2\u0148\u0149\5\u00c5c\2\u0149\60\3\2\2\2\u014a"+
		"\u014b\5\u00cdg\2\u014b\u014c\5\u00afX\2\u014c\u014d\5\u00a9U\2\u014d"+
		"\u014e\5\u00c3b\2\u014e\u014f\5\u00a9U\2\u014f\62\3\2\2\2\u0150\u0151"+
		"\5\u00b1Y\2\u0151\u0152\5\u00bb^\2\u0152\64\3\2\2\2\u0153\u0154\5\u00a5"+
		"S\2\u0154\u0155\5\u00bd_\2\u0155\u0156\5\u00c9e\2\u0156\u0157\5\u00bb"+
		"^\2\u0157\u0158\5\u00c7d\2\u0158\66\3\2\2\2\u0159\u015a\5\u00c3b\2\u015a"+
		"\u015b\5\u00a9U\2\u015b\u015c\5\u00b7\\\2\u015c\u015d\5\u00c5c\2\u015d"+
		"8\3\2\2\2\u015e\u015f\5\u00c3b\2\u015f\u0160\5\u00a9U\2\u0160\u0161\5"+
		"\u00b7\\\2\u0161\u0162\5\u00a1Q\2\u0162\u0163\5\u00c7d\2\u0163\u0164\5"+
		"\u00b1Y\2\u0164\u0165\5\u00bd_\2\u0165\u0166\5\u00bb^\2\u0166\u0167\5"+
		"\u00c5c\2\u0167\u0168\5\u00afX\2\u0168\u0169\5\u00b1Y\2\u0169\u016a\5"+
		"\u00bf`\2\u016a:\3\2\2\2\u016b\u016c\5\u00bb^\2\u016c\u016d\5\u00bd_\2"+
		"\u016d\u016e\5\u00a7T\2\u016e\u016f\5\u00a9U\2\u016f<\3\2\2\2\u0170\u0171"+
		"\5\u00bb^\2\u0171\u0172\5\u00bd_\2\u0172\u0173\5\u00a7T\2\u0173\u0174"+
		"\5\u00a9U\2\u0174\u0175\5\u00c5c\2\u0175>\3\2\2\2\u0176\u0177\5\u00bf"+
		"`\2\u0177\u0178\5\u00c3b\2\u0178\u0179\5\u00bd_\2\u0179\u017a\5\u00bf"+
		"`\2\u017a\u017b\5\u00c5c\2\u017b@\3\2\2\2\u017c\u017d\5\u00b1Y\2\u017d"+
		"\u017e\5\u00bb^\2\u017e\u017f\5\u00a7T\2\u017f\u0180\5\u00a9U\2\u0180"+
		"\u0181\5\u00cfh\2\u0181B\3\2\2\2\u0182\u0183\5\u00bd_\2\u0183\u0184\5"+
		"\u00bb^\2\u0184D\3\2\2\2\u0185\u0186\5\u00c5c\2\u0186\u0187\5\u00a9U\2"+
		"\u0187\u0188\5\u00c7d\2\u0188F\3\2\2\2\u0189\u018a\5\u00a7T\2\u018a\u018b"+
		"\5\u00a9U\2\u018b\u018c\5\u00c7d\2\u018c\u018d\5\u00a1Q\2\u018d\u018e"+
		"\5\u00a5S\2\u018e\u018f\5\u00afX\2\u018fH\3\2\2\2\u0190\u0191\5\u00a7"+
		"T\2\u0191\u0192\5\u00a9U\2\u0192\u0193\5\u00b7\\\2\u0193\u0194\5\u00a9"+
		"U\2\u0194\u0195\5\u00c7d\2\u0195\u0196\5\u00a9U\2\u0196J\3\2\2\2\u0197"+
		"\u0198\5\u00c3b\2\u0198\u0199\5\u00a9U\2\u0199\u019a\5\u00b9]\2\u019a"+
		"\u019b\5\u00bd_\2\u019b\u019c\5\u00cbf\2\u019c\u019d\5\u00a9U\2\u019d"+
		"L\3\2\2\2\u019e\u019f\5\u00bd_\2\u019f\u01a0\5\u00c3b\2\u01a0\u01a1\5"+
		"\u00a7T\2\u01a1\u01a2\5\u00a9U\2\u01a2\u01a3\5\u00c3b\2\u01a3N\3\2\2\2"+
		"\u01a4\u01a5\5\u00a3R\2\u01a5\u01a6\5\u00d1i\2\u01a6P\3\2\2\2\u01a7\u01a8"+
		"\5\u00a7T\2\u01a8\u01a9\5\u00a9U\2\u01a9\u01aa\5\u00c5c\2\u01aa\u01ab"+
		"\5\u00a5S\2\u01abR\3\2\2\2\u01ac\u01ad\5\u00a1Q\2\u01ad\u01ae\5\u00c5"+
		"c\2\u01ae\u01af\5\u00a5S\2\u01afT\3\2\2\2\u01b0\u01b1\5\u00b7\\\2\u01b1"+
		"\u01b2\5\u00a9U\2\u01b2\u01b3\5\u00bb^\2\u01b3\u01b4\5\u00adW\2\u01b4"+
		"\u01b5\5\u00c7d\2\u01b5\u01b6\5\u00afX\2\u01b6V\3\2\2\2\u01b7\u01b8\5"+
		"\u00b7\\\2\u01b8\u01b9\5\u00b1Y\2\u01b9\u01ba\5\u00b9]\2\u01ba\u01bb\5"+
		"\u00b1Y\2\u01bb\u01bc\5\u00c7d\2\u01bcX\3\2\2\2\u01bd\u01be\5\u00c5c\2"+
		"\u01be\u01bf\5\u00b5[\2\u01bf\u01c0\5\u00b1Y\2\u01c0\u01c1\5\u00bf`\2"+
		"\u01c1Z\3\2\2\2\u01c2\u01c3\5\u00c3b\2\u01c3\u01c4\5\u00a1Q\2\u01c4\u01c5"+
		"\5\u00bb^\2\u01c5\u01c6\5\u00a7T\2\u01c6\\\3\2\2\2\u01c7\u01c8\5\u00a7"+
		"T\2\u01c8\u01c9\5\u00c3b\2\u01c9\u01ca\5\u00bd_\2\u01ca\u01cb\5\u00bf"+
		"`\2\u01cb^\3\2\2\2\u01cc\u01ce\t\2\2\2\u01cd\u01cc\3\2\2\2\u01ce\u01cf"+
		"\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d4\3\2\2\2\u01d1"+
		"\u01d3\t\3\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d2\3\2"+
		"\2\2\u01d4\u01d5\3\2\2\2\u01d5`\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d7\u01d9"+
		"\t\4\2\2\u01d8\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01db\3\2\2\2\u01db\u01df\3\2\2\2\u01dc\u01de\t\3\2\2\u01dd\u01dc\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"b\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e3\7?\2\2\u01e3d\3\2\2\2\u01e4"+
		"\u01e5\7\u0080\2\2\u01e5\u01e6\7?\2\2\u01e6f\3\2\2\2\u01e7\u01e8\7-\2"+
		"\2\u01e8\u01e9\7?\2\2\u01e9h\3\2\2\2\u01ea\u01eb\7#\2\2\u01eb\u01ec\7"+
		"?\2\2\u01ecj\3\2\2\2\u01ed\u01ee\7@\2\2\u01eel\3\2\2\2\u01ef\u01f0\7@"+
		"\2\2\u01f0\u01f1\7?\2\2\u01f1n\3\2\2\2\u01f2\u01f3\7>\2\2\u01f3p\3\2\2"+
		"\2\u01f4\u01f5\7>\2\2\u01f5\u01f6\7?\2\2\u01f6r\3\2\2\2\u01f7\u01f8\7"+
		"*\2\2\u01f8t\3\2\2\2\u01f9\u01fa\7+\2\2\u01fav\3\2\2\2\u01fb\u01fc\7]"+
		"\2\2\u01fcx\3\2\2\2\u01fd\u01fe\7_\2\2\u01fez\3\2\2\2\u01ff\u0200\7}\2"+
		"\2\u0200|\3\2\2\2\u0201\u0202\7\177\2\2\u0202~\3\2\2\2\u0203\u0204\7."+
		"\2\2\u0204\u0080\3\2\2\2\u0205\u0206\7=\2\2\u0206\u0082\3\2\2\2\u0207"+
		"\u0208\7\f\2\2\u0208\u0084\3\2\2\2\u0209\u020a\7,\2\2\u020a\u0086\3\2"+
		"\2\2\u020b\u020c\7\61\2\2\u020c\u0088\3\2\2\2\u020d\u020e\7-\2\2\u020e"+
		"\u008a\3\2\2\2\u020f\u0210\7/\2\2\u0210\u008c\3\2\2\2\u0211\u0212\7/\2"+
		"\2\u0212\u0213\7/\2\2\u0213\u008e\3\2\2\2\u0214\u0215\7/\2\2\u0215\u0216"+
		"\7/\2\2\u0216\u0217\7@\2\2\u0217\u0090\3\2\2\2\u0218\u0219\7`\2\2\u0219"+
		"\u0092\3\2\2\2\u021a\u021b\5\u00cfh\2\u021b\u021c\5\u00bd_\2\u021c\u021d"+
		"\5\u00c3b\2\u021d\u0094\3\2\2\2\u021e\u021f\7<\2\2\u021f\u0096\3\2\2\2"+
		"\u0220\u0224\t\5\2\2\u0221\u0223\n\6\2\2\u0222\u0221\3\2\2\2\u0223\u0226"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0228\t\5\2\2\u0228\u0098\3\2\2\2\u0229\u022b\t\7"+
		"\2\2\u022a\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\t\b\2\2\u022f\u0231\t\7"+
		"\2\2\u0230\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u009a\3\2\2\2\u0234\u0236\t\7\2\2\u0235\u0234\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u009c\3\2\2\2\u0239\u023a\t\t\2\2\u023a\u023b\3\2\2\2\u023b\u023c\bO"+
		"\2\2\u023c\u009e\3\2\2\2\u023d\u023e\7\61\2\2\u023e\u023f\7\61\2\2\u023f"+
		"\u0243\3\2\2\2\u0240\u0242\n\n\2\2\u0241\u0240\3\2\2\2\u0242\u0245\3\2"+
		"\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u0247\bP\2\2\u0247\u00a0\3\2\2\2\u0248\u0249\t\13"+
		"\2\2\u0249\u00a2\3\2\2\2\u024a\u024b\t\f\2\2\u024b\u00a4\3\2\2\2\u024c"+
		"\u024d\t\r\2\2\u024d\u00a6\3\2\2\2\u024e\u024f\t\16\2\2\u024f\u00a8\3"+
		"\2\2\2\u0250\u0251\t\17\2\2\u0251\u00aa\3\2\2\2\u0252\u0253\t\20\2\2\u0253"+
		"\u00ac\3\2\2\2\u0254\u0255\t\21\2\2\u0255\u00ae\3\2\2\2\u0256\u0257\t"+
		"\22\2\2\u0257\u00b0\3\2\2\2\u0258\u0259\t\23\2\2\u0259\u00b2\3\2\2\2\u025a"+
		"\u025b\t\24\2\2\u025b\u00b4\3\2\2\2\u025c\u025d\t\25\2\2\u025d\u00b6\3"+
		"\2\2\2\u025e\u025f\t\26\2\2\u025f\u00b8\3\2\2\2\u0260\u0261\t\27\2\2\u0261"+
		"\u00ba\3\2\2\2\u0262\u0263\t\30\2\2\u0263\u00bc\3\2\2\2\u0264\u0265\t"+
		"\31\2\2\u0265\u00be\3\2\2\2\u0266\u0267\t\32\2\2\u0267\u00c0\3\2\2\2\u0268"+
		"\u0269\t\33\2\2\u0269\u00c2\3\2\2\2\u026a\u026b\t\34\2\2\u026b\u00c4\3"+
		"\2\2\2\u026c\u026d\t\35\2\2\u026d\u00c6\3\2\2\2\u026e\u026f\t\36\2\2\u026f"+
		"\u00c8\3\2\2\2\u0270\u0271\t\37\2\2\u0271\u00ca\3\2\2\2\u0272\u0273\t"+
		" \2\2\u0273\u00cc\3\2\2\2\u0274\u0275\t!\2\2\u0275\u00ce\3\2\2\2\u0276"+
		"\u0277\t\"\2\2\u0277\u00d0\3\2\2\2\u0278\u0279\t#\2\2\u0279\u00d2\3\2"+
		"\2\2\u027a\u027b\t$\2\2\u027b\u00d4\3\2\2\2\f\2\u01cf\u01d4\u01da\u01df"+
		"\u0224\u022c\u0232\u0237\u0243\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}