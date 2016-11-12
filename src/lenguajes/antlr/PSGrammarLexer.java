// Generated from PSGrammar.g4 by ANTLR 4.5.3
package lenguajes.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SUBPROCESO=9, 
		FINSUBPROCESO=10, FUNCION=11, FINFUNCION=12, PROCESO=13, ALGORITMO=14, 
		FINPROCESO=15, FINALGORITMO=16, SI=17, ENTONCES=18, FINSI=19, SINO=20, 
		PARA=21, HASTA=22, CON=23, PASO=24, FINPARA=25, HACER=26, MIENTRAS=27, 
		FINMIENTRAS=28, REPETIR=29, QUE=30, SEGUN=31, CASO=32, DE=33, OTRO=34, 
		MODO=35, ESPERAR=36, TECLA=37, SEGUNDOS=38, MILISEGUNDOS=39, BORRAR=40, 
		LIMPIAR=41, PANTALLA=42, DIMENSION=43, LEER=44, ESCRIBIR=45, DEFINIR=46, 
		COMO=47, FINSEGUN=48, VERDADERO=49, FALSO=50, ENTERO=51, REAL=52, NUMERO=53, 
		NUMERICO=54, TEXTO=55, CADENA=56, CARACTER=57, LOGICO=58, ID=59, TOKEN_ASIG=60, 
		TOKEN_IGUAL=61, TOKEN_DIF=62, TOKEN_MAYOR=63, TOKEN_MAYOR_IGUAL=64, TOKEN_MENOR=65, 
		TOKEN_MENOR_IGUAL=66, TOKEN_PAR_IZR=67, TOKEN_PAR_DER=68, TOKEN_COR_IZR=69, 
		TOKEN_COR_DER=70, TOKEN_COMA=71, TOKEN_PYC=72, TOKEN_MUL=73, TOKEN_DIV=74, 
		TOKEN_MAS=75, TOKEN_MENOS=76, TOKEN_POT=77, TOKEN_DOSP=78, TOKEN_CADENA=79, 
		TOKEN_REAL=80, TOKEN_ENTERO=81, WS=82, LINE_COMMENT=83;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "SUBPROCESO", 
		"FINSUBPROCESO", "FUNCION", "FINFUNCION", "PROCESO", "ALGORITMO", "FINPROCESO", 
		"FINALGORITMO", "SI", "ENTONCES", "FINSI", "SINO", "PARA", "HASTA", "CON", 
		"PASO", "FINPARA", "HACER", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", 
		"SEGUN", "CASO", "DE", "OTRO", "MODO", "ESPERAR", "TECLA", "SEGUNDOS", 
		"MILISEGUNDOS", "BORRAR", "LIMPIAR", "PANTALLA", "DIMENSION", "LEER", 
		"ESCRIBIR", "DEFINIR", "COMO", "FINSEGUN", "VERDADERO", "FALSO", "ENTERO", 
		"REAL", "NUMERO", "NUMERICO", "TEXTO", "CADENA", "CARACTER", "LOGICO", 
		"ID", "TOKEN_ASIG", "TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", 
		"TOKEN_MENOR", "TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", 
		"TOKEN_COR_IZR", "TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", 
		"TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_DOSP", "TOKEN_CADENA", 
		"TOKEN_REAL", "TOKEN_ENTERO", "WS", "LINE_COMMENT", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'mod'", "'&'", "'y'", "'|'", "'o'", "'~'", "'no'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'<-'", "'='", "'<>'", "'>'", "'>='", "'<'", "'<='", "'('", 
		"')'", "'['", "']'", "','", "';'", "'*'", "'/'", "'+'", "'-'", "'^'", 
		"':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SUBPROCESO", "FINSUBPROCESO", 
		"FUNCION", "FINFUNCION", "PROCESO", "ALGORITMO", "FINPROCESO", "FINALGORITMO", 
		"SI", "ENTONCES", "FINSI", "SINO", "PARA", "HASTA", "CON", "PASO", "FINPARA", 
		"HACER", "MIENTRAS", "FINMIENTRAS", "REPETIR", "QUE", "SEGUN", "CASO", 
		"DE", "OTRO", "MODO", "ESPERAR", "TECLA", "SEGUNDOS", "MILISEGUNDOS", 
		"BORRAR", "LIMPIAR", "PANTALLA", "DIMENSION", "LEER", "ESCRIBIR", "DEFINIR", 
		"COMO", "FINSEGUN", "VERDADERO", "FALSO", "ENTERO", "REAL", "NUMERO", 
		"NUMERICO", "TEXTO", "CADENA", "CARACTER", "LOGICO", "ID", "TOKEN_ASIG", 
		"TOKEN_IGUAL", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_COMA", "TOKEN_PYC", "TOKEN_MUL", "TOKEN_DIV", 
		"TOKEN_MAS", "TOKEN_MENOS", "TOKEN_POT", "TOKEN_DOSP", "TOKEN_CADENA", 
		"TOKEN_REAL", "TOKEN_ENTERO", "WS", "LINE_COMMENT"
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


	public PSGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2U\u02fc\b\1\4\2\t"+
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
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;"+
		"\3;\3;\3;\3<\6<\u026d\n<\r<\16<\u026e\3<\7<\u0272\n<\f<\16<\u0275\13<"+
		"\3=\3=\3=\3>\3>\3?\3?\3?\3@\3@\3A\3A\3A\3B\3B\3C\3C\3C\3D\3D\3E\3E\3F"+
		"\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\7P\u02a3"+
		"\nP\fP\16P\u02a6\13P\3P\3P\3Q\6Q\u02ab\nQ\rQ\16Q\u02ac\3Q\3Q\6Q\u02b1"+
		"\nQ\rQ\16Q\u02b2\3R\6R\u02b6\nR\rR\16R\u02b7\3S\3S\3S\3S\3T\3T\3T\3T\7"+
		"T\u02c2\nT\fT\16T\u02c5\13T\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z"+
		"\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3"+
		"f\3f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\2\2o\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3\2\u00b5\2\u00b7"+
		"\2\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5\2\u00c7\2\u00c9"+
		"\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9\2\u00db"+
		"\2\3\2$\4\2C\\c|\6\2\62;C\\aac|\4\2$$))\5\2\f\f\17\17$$\3\2\62;\3\2\60"+
		"\60\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4"+
		"\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOo"+
		"o\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2"+
		"XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\u02e8\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\3\u00dd\3\2\2\2\5\u00df\3\2\2"+
		"\2\7\u00e3\3\2\2\2\t\u00e5\3\2\2\2\13\u00e7\3\2\2\2\r\u00e9\3\2\2\2\17"+
		"\u00eb\3\2\2\2\21\u00ed\3\2\2\2\23\u00f0\3\2\2\2\25\u00fb\3\2\2\2\27\u0109"+
		"\3\2\2\2\31\u0111\3\2\2\2\33\u011c\3\2\2\2\35\u0124\3\2\2\2\37\u012e\3"+
		"\2\2\2!\u0139\3\2\2\2#\u0146\3\2\2\2%\u0149\3\2\2\2\'\u0152\3\2\2\2)\u0158"+
		"\3\2\2\2+\u015d\3\2\2\2-\u0162\3\2\2\2/\u0168\3\2\2\2\61\u016c\3\2\2\2"+
		"\63\u0171\3\2\2\2\65\u0179\3\2\2\2\67\u017f\3\2\2\29\u0188\3\2\2\2;\u0194"+
		"\3\2\2\2=\u019c\3\2\2\2?\u01a0\3\2\2\2A\u01a6\3\2\2\2C\u01ab\3\2\2\2E"+
		"\u01ae\3\2\2\2G\u01b3\3\2\2\2I\u01b8\3\2\2\2K\u01c0\3\2\2\2M\u01c6\3\2"+
		"\2\2O\u01cf\3\2\2\2Q\u01dc\3\2\2\2S\u01e3\3\2\2\2U\u01eb\3\2\2\2W\u01f4"+
		"\3\2\2\2Y\u01fe\3\2\2\2[\u0203\3\2\2\2]\u020c\3\2\2\2_\u0214\3\2\2\2a"+
		"\u0219\3\2\2\2c\u0222\3\2\2\2e\u022c\3\2\2\2g\u0232\3\2\2\2i\u0239\3\2"+
		"\2\2k\u023e\3\2\2\2m\u0245\3\2\2\2o\u024e\3\2\2\2q\u0254\3\2\2\2s\u025b"+
		"\3\2\2\2u\u0264\3\2\2\2w\u026c\3\2\2\2y\u0276\3\2\2\2{\u0279\3\2\2\2}"+
		"\u027b\3\2\2\2\177\u027e\3\2\2\2\u0081\u0280\3\2\2\2\u0083\u0283\3\2\2"+
		"\2\u0085\u0285\3\2\2\2\u0087\u0288\3\2\2\2\u0089\u028a\3\2\2\2\u008b\u028c"+
		"\3\2\2\2\u008d\u028e\3\2\2\2\u008f\u0290\3\2\2\2\u0091\u0292\3\2\2\2\u0093"+
		"\u0294\3\2\2\2\u0095\u0296\3\2\2\2\u0097\u0298\3\2\2\2\u0099\u029a\3\2"+
		"\2\2\u009b\u029c\3\2\2\2\u009d\u029e\3\2\2\2\u009f\u02a0\3\2\2\2\u00a1"+
		"\u02aa\3\2\2\2\u00a3\u02b5\3\2\2\2\u00a5\u02b9\3\2\2\2\u00a7\u02bd\3\2"+
		"\2\2\u00a9\u02c8\3\2\2\2\u00ab\u02ca\3\2\2\2\u00ad\u02cc\3\2\2\2\u00af"+
		"\u02ce\3\2\2\2\u00b1\u02d0\3\2\2\2\u00b3\u02d2\3\2\2\2\u00b5\u02d4\3\2"+
		"\2\2\u00b7\u02d6\3\2\2\2\u00b9\u02d8\3\2\2\2\u00bb\u02da\3\2\2\2\u00bd"+
		"\u02dc\3\2\2\2\u00bf\u02de\3\2\2\2\u00c1\u02e0\3\2\2\2\u00c3\u02e2\3\2"+
		"\2\2\u00c5\u02e4\3\2\2\2\u00c7\u02e6\3\2\2\2\u00c9\u02e8\3\2\2\2\u00cb"+
		"\u02ea\3\2\2\2\u00cd\u02ec\3\2\2\2\u00cf\u02ee\3\2\2\2\u00d1\u02f0\3\2"+
		"\2\2\u00d3\u02f2\3\2\2\2\u00d5\u02f4\3\2\2\2\u00d7\u02f6\3\2\2\2\u00d9"+
		"\u02f8\3\2\2\2\u00db\u02fa\3\2\2\2\u00dd\u00de\7\'\2\2\u00de\4\3\2\2\2"+
		"\u00df\u00e0\7o\2\2\u00e0\u00e1\7q\2\2\u00e1\u00e2\7f\2\2\u00e2\6\3\2"+
		"\2\2\u00e3\u00e4\7(\2\2\u00e4\b\3\2\2\2\u00e5\u00e6\7{\2\2\u00e6\n\3\2"+
		"\2\2\u00e7\u00e8\7~\2\2\u00e8\f\3\2\2\2\u00e9\u00ea\7q\2\2\u00ea\16\3"+
		"\2\2\2\u00eb\u00ec\7\u0080\2\2\u00ec\20\3\2\2\2\u00ed\u00ee\7p\2\2\u00ee"+
		"\u00ef\7q\2\2\u00ef\22\3\2\2\2\u00f0\u00f1\5\u00cdg\2\u00f1\u00f2\5\u00d1"+
		"i\2\u00f2\u00f3\5\u00abV\2\u00f3\u00f4\5\u00c7d\2\u00f4\u00f5\5\u00cb"+
		"f\2\u00f5\u00f6\5\u00c5c\2\u00f6\u00f7\5\u00adW\2\u00f7\u00f8\5\u00b1"+
		"Y\2\u00f8\u00f9\5\u00cdg\2\u00f9\u00fa\5\u00c5c\2\u00fa\24\3\2\2\2\u00fb"+
		"\u00fc\5\u00b3Z\2\u00fc\u00fd\5\u00b9]\2\u00fd\u00fe\5\u00c3b\2\u00fe"+
		"\u00ff\5\u00cdg\2\u00ff\u0100\5\u00d1i\2\u0100\u0101\5\u00abV\2\u0101"+
		"\u0102\5\u00c7d\2\u0102\u0103\5\u00cbf\2\u0103\u0104\5\u00c5c\2\u0104"+
		"\u0105\5\u00adW\2\u0105\u0106\5\u00b1Y\2\u0106\u0107\5\u00cdg\2\u0107"+
		"\u0108\5\u00c5c\2\u0108\26\3\2\2\2\u0109\u010a\5\u00b3Z\2\u010a\u010b"+
		"\5\u00d1i\2\u010b\u010c\5\u00c3b\2\u010c\u010d\5\u00adW\2\u010d\u010e"+
		"\5\u00b9]\2\u010e\u010f\5\u00c5c\2\u010f\u0110\5\u00c3b\2\u0110\30\3\2"+
		"\2\2\u0111\u0112\5\u00b3Z\2\u0112\u0113\5\u00b9]\2\u0113\u0114\5\u00c3"+
		"b\2\u0114\u0115\5\u00b3Z\2\u0115\u0116\5\u00d1i\2\u0116\u0117\5\u00c3"+
		"b\2\u0117\u0118\5\u00adW\2\u0118\u0119\5\u00b9]\2\u0119\u011a\5\u00c5"+
		"c\2\u011a\u011b\5\u00c3b\2\u011b\32\3\2\2\2\u011c\u011d\5\u00c7d\2\u011d"+
		"\u011e\5\u00cbf\2\u011e\u011f\5\u00c5c\2\u011f\u0120\5\u00adW\2\u0120"+
		"\u0121\5\u00b1Y\2\u0121\u0122\5\u00cdg\2\u0122\u0123\5\u00c5c\2\u0123"+
		"\34\3\2\2\2\u0124\u0125\5\u00a9U\2\u0125\u0126\5\u00bf`\2\u0126\u0127"+
		"\5\u00b5[\2\u0127\u0128\5\u00c5c\2\u0128\u0129\5\u00cbf\2\u0129\u012a"+
		"\5\u00b9]\2\u012a\u012b\5\u00cfh\2\u012b\u012c\5\u00c1a\2\u012c\u012d"+
		"\5\u00c5c\2\u012d\36\3\2\2\2\u012e\u012f\5\u00b3Z\2\u012f\u0130\5\u00b9"+
		"]\2\u0130\u0131\5\u00c3b\2\u0131\u0132\5\u00c7d\2\u0132\u0133\5\u00cb"+
		"f\2\u0133\u0134\5\u00c5c\2\u0134\u0135\5\u00adW\2\u0135\u0136\5\u00b1"+
		"Y\2\u0136\u0137\5\u00cdg\2\u0137\u0138\5\u00c5c\2\u0138 \3\2\2\2\u0139"+
		"\u013a\5\u00b3Z\2\u013a\u013b\5\u00b9]\2\u013b\u013c\5\u00c3b\2\u013c"+
		"\u013d\5\u00a9U\2\u013d\u013e\5\u00bf`\2\u013e\u013f\5\u00b5[\2\u013f"+
		"\u0140\5\u00c5c\2\u0140\u0141\5\u00cbf\2\u0141\u0142\5\u00b9]\2\u0142"+
		"\u0143\5\u00cfh\2\u0143\u0144\5\u00c1a\2\u0144\u0145\5\u00c5c\2\u0145"+
		"\"\3\2\2\2\u0146\u0147\5\u00cdg\2\u0147\u0148\5\u00b9]\2\u0148$\3\2\2"+
		"\2\u0149\u014a\5\u00b1Y\2\u014a\u014b\5\u00c3b\2\u014b\u014c\5\u00cfh"+
		"\2\u014c\u014d\5\u00c5c\2\u014d\u014e\5\u00c3b\2\u014e\u014f\5\u00adW"+
		"\2\u014f\u0150\5\u00b1Y\2\u0150\u0151\5\u00cdg\2\u0151&\3\2\2\2\u0152"+
		"\u0153\5\u00b3Z\2\u0153\u0154\5\u00b9]\2\u0154\u0155\5\u00c3b\2\u0155"+
		"\u0156\5\u00cdg\2\u0156\u0157\5\u00b9]\2\u0157(\3\2\2\2\u0158\u0159\5"+
		"\u00cdg\2\u0159\u015a\5\u00b9]\2\u015a\u015b\5\u00c3b\2\u015b\u015c\5"+
		"\u00c5c\2\u015c*\3\2\2\2\u015d\u015e\5\u00c7d\2\u015e\u015f\5\u00a9U\2"+
		"\u015f\u0160\5\u00cbf\2\u0160\u0161\5\u00a9U\2\u0161,\3\2\2\2\u0162\u0163"+
		"\5\u00b7\\\2\u0163\u0164\5\u00a9U\2\u0164\u0165\5\u00cdg\2\u0165\u0166"+
		"\5\u00cfh\2\u0166\u0167\5\u00a9U\2\u0167.\3\2\2\2\u0168\u0169\5\u00ad"+
		"W\2\u0169\u016a\5\u00c5c\2\u016a\u016b\5\u00c3b\2\u016b\60\3\2\2\2\u016c"+
		"\u016d\5\u00c7d\2\u016d\u016e\5\u00a9U\2\u016e\u016f\5\u00cdg\2\u016f"+
		"\u0170\5\u00c5c\2\u0170\62\3\2\2\2\u0171\u0172\5\u00b3Z\2\u0172\u0173"+
		"\5\u00b9]\2\u0173\u0174\5\u00c3b\2\u0174\u0175\5\u00c7d\2\u0175\u0176"+
		"\5\u00a9U\2\u0176\u0177\5\u00cbf\2\u0177\u0178\5\u00a9U\2\u0178\64\3\2"+
		"\2\2\u0179\u017a\5\u00b7\\\2\u017a\u017b\5\u00a9U\2\u017b\u017c\5\u00ad"+
		"W\2\u017c\u017d\5\u00b1Y\2\u017d\u017e\5\u00cbf\2\u017e\66\3\2\2\2\u017f"+
		"\u0180\5\u00c1a\2\u0180\u0181\5\u00b9]\2\u0181\u0182\5\u00b1Y\2\u0182"+
		"\u0183\5\u00c3b\2\u0183\u0184\5\u00cfh\2\u0184\u0185\5\u00cbf\2\u0185"+
		"\u0186\5\u00a9U\2\u0186\u0187\5\u00cdg\2\u01878\3\2\2\2\u0188\u0189\5"+
		"\u00b3Z\2\u0189\u018a\5\u00b9]\2\u018a\u018b\5\u00c3b\2\u018b\u018c\5"+
		"\u00c1a\2\u018c\u018d\5\u00b9]\2\u018d\u018e\5\u00b1Y\2\u018e\u018f\5"+
		"\u00c3b\2\u018f\u0190\5\u00cfh\2\u0190\u0191\5\u00cbf\2\u0191\u0192\5"+
		"\u00a9U\2\u0192\u0193\5\u00cdg\2\u0193:\3\2\2\2\u0194\u0195\5\u00cbf\2"+
		"\u0195\u0196\5\u00b1Y\2\u0196\u0197\5\u00c7d\2\u0197\u0198\5\u00b1Y\2"+
		"\u0198\u0199\5\u00cfh\2\u0199\u019a\5\u00b9]\2\u019a\u019b\5\u00cbf\2"+
		"\u019b<\3\2\2\2\u019c\u019d\5\u00c9e\2\u019d\u019e\5\u00d1i\2\u019e\u019f"+
		"\5\u00b1Y\2\u019f>\3\2\2\2\u01a0\u01a1\5\u00cdg\2\u01a1\u01a2\5\u00b1"+
		"Y\2\u01a2\u01a3\5\u00b5[\2\u01a3\u01a4\5\u00d1i\2\u01a4\u01a5\5\u00c3"+
		"b\2\u01a5@\3\2\2\2\u01a6\u01a7\5\u00adW\2\u01a7\u01a8\5\u00a9U\2\u01a8"+
		"\u01a9\5\u00cdg\2\u01a9\u01aa\5\u00c5c\2\u01aaB\3\2\2\2\u01ab\u01ac\5"+
		"\u00afX\2\u01ac\u01ad\5\u00b1Y\2\u01adD\3\2\2\2\u01ae\u01af\5\u00c5c\2"+
		"\u01af\u01b0\5\u00cfh\2\u01b0\u01b1\5\u00cbf\2\u01b1\u01b2\5\u00c5c\2"+
		"\u01b2F\3\2\2\2\u01b3\u01b4\5\u00c1a\2\u01b4\u01b5\5\u00c5c\2\u01b5\u01b6"+
		"\5\u00afX\2\u01b6\u01b7\5\u00c5c\2\u01b7H\3\2\2\2\u01b8\u01b9\5\u00b1"+
		"Y\2\u01b9\u01ba\5\u00cdg\2\u01ba\u01bb\5\u00c7d\2\u01bb\u01bc\5\u00b1"+
		"Y\2\u01bc\u01bd\5\u00cbf\2\u01bd\u01be\5\u00a9U\2\u01be\u01bf\5\u00cb"+
		"f\2\u01bfJ\3\2\2\2\u01c0\u01c1\5\u00cfh\2\u01c1\u01c2\5\u00b1Y\2\u01c2"+
		"\u01c3\5\u00adW\2\u01c3\u01c4\5\u00bf`\2\u01c4\u01c5\5\u00a9U\2\u01c5"+
		"L\3\2\2\2\u01c6\u01c7\5\u00cdg\2\u01c7\u01c8\5\u00b1Y\2\u01c8\u01c9\5"+
		"\u00b5[\2\u01c9\u01ca\5\u00d1i\2\u01ca\u01cb\5\u00c3b\2\u01cb\u01cc\5"+
		"\u00afX\2\u01cc\u01cd\5\u00c5c\2\u01cd\u01ce\5\u00cdg\2\u01ceN\3\2\2\2"+
		"\u01cf\u01d0\5\u00c1a\2\u01d0\u01d1\5\u00b9]\2\u01d1\u01d2\5\u00bf`\2"+
		"\u01d2\u01d3\5\u00b9]\2\u01d3\u01d4\5\u00cdg\2\u01d4\u01d5\5\u00b1Y\2"+
		"\u01d5\u01d6\5\u00b5[\2\u01d6\u01d7\5\u00d1i\2\u01d7\u01d8\5\u00c3b\2"+
		"\u01d8\u01d9\5\u00afX\2\u01d9\u01da\5\u00c5c\2\u01da\u01db\5\u00cdg\2"+
		"\u01dbP\3\2\2\2\u01dc\u01dd\5\u00abV\2\u01dd\u01de\5\u00c5c\2\u01de\u01df"+
		"\5\u00cbf\2\u01df\u01e0\5\u00cbf\2\u01e0\u01e1\5\u00a9U\2\u01e1\u01e2"+
		"\5\u00cbf\2\u01e2R\3\2\2\2\u01e3\u01e4\5\u00bf`\2\u01e4\u01e5\5\u00b9"+
		"]\2\u01e5\u01e6\5\u00c1a\2\u01e6\u01e7\5\u00c7d\2\u01e7\u01e8\5\u00b9"+
		"]\2\u01e8\u01e9\5\u00a9U\2\u01e9\u01ea\5\u00cbf\2\u01eaT\3\2\2\2\u01eb"+
		"\u01ec\5\u00c7d\2\u01ec\u01ed\5\u00a9U\2\u01ed\u01ee\5\u00c3b\2\u01ee"+
		"\u01ef\5\u00cfh\2\u01ef\u01f0\5\u00a9U\2\u01f0\u01f1\5\u00bf`\2\u01f1"+
		"\u01f2\5\u00bf`\2\u01f2\u01f3\5\u00a9U\2\u01f3V\3\2\2\2\u01f4\u01f5\5"+
		"\u00afX\2\u01f5\u01f6\5\u00b9]\2\u01f6\u01f7\5\u00c1a\2\u01f7\u01f8\5"+
		"\u00b1Y\2\u01f8\u01f9\5\u00c3b\2\u01f9\u01fa\5\u00cdg\2\u01fa\u01fb\5"+
		"\u00b9]\2\u01fb\u01fc\5\u00c5c\2\u01fc\u01fd\5\u00c3b\2\u01fdX\3\2\2\2"+
		"\u01fe\u01ff\5\u00bf`\2\u01ff\u0200\5\u00b1Y\2\u0200\u0201\5\u00b1Y\2"+
		"\u0201\u0202\5\u00cbf\2\u0202Z\3\2\2\2\u0203\u0204\5\u00b1Y\2\u0204\u0205"+
		"\5\u00cdg\2\u0205\u0206\5\u00adW\2\u0206\u0207\5\u00cbf\2\u0207\u0208"+
		"\5\u00b9]\2\u0208\u0209\5\u00abV\2\u0209\u020a\5\u00b9]\2\u020a\u020b"+
		"\5\u00cbf\2\u020b\\\3\2\2\2\u020c\u020d\5\u00afX\2\u020d\u020e\5\u00b1"+
		"Y\2\u020e\u020f\5\u00b3Z\2\u020f\u0210\5\u00b9]\2\u0210\u0211\5\u00c3"+
		"b\2\u0211\u0212\5\u00b9]\2\u0212\u0213\5\u00cbf\2\u0213^\3\2\2\2\u0214"+
		"\u0215\5\u00adW\2\u0215\u0216\5\u00c5c\2\u0216\u0217\5\u00c1a\2\u0217"+
		"\u0218\5\u00c5c\2\u0218`\3\2\2\2\u0219\u021a\5\u00b3Z\2\u021a\u021b\5"+
		"\u00b9]\2\u021b\u021c\5\u00c3b\2\u021c\u021d\5\u00cdg\2\u021d\u021e\5"+
		"\u00b1Y\2\u021e\u021f\5\u00b5[\2\u021f\u0220\5\u00d1i\2\u0220\u0221\5"+
		"\u00c3b\2\u0221b\3\2\2\2\u0222\u0223\5\u00d3j\2\u0223\u0224\5\u00b1Y\2"+
		"\u0224\u0225\5\u00cbf\2\u0225\u0226\5\u00afX\2\u0226\u0227\5\u00a9U\2"+
		"\u0227\u0228\5\u00afX\2\u0228\u0229\5\u00b1Y\2\u0229\u022a\5\u00cbf\2"+
		"\u022a\u022b\5\u00c5c\2\u022bd\3\2\2\2\u022c\u022d\5\u00b3Z\2\u022d\u022e"+
		"\5\u00a9U\2\u022e\u022f\5\u00bf`\2\u022f\u0230\5\u00cdg\2\u0230\u0231"+
		"\5\u00c5c\2\u0231f\3\2\2\2\u0232\u0233\5\u00b1Y\2\u0233\u0234\5\u00c3"+
		"b\2\u0234\u0235\5\u00cfh\2\u0235\u0236\5\u00b1Y\2\u0236\u0237\5\u00cb"+
		"f\2\u0237\u0238\5\u00c5c\2\u0238h\3\2\2\2\u0239\u023a\5\u00cbf\2\u023a"+
		"\u023b\5\u00b1Y\2\u023b\u023c\5\u00a9U\2\u023c\u023d\5\u00bf`\2\u023d"+
		"j\3\2\2\2\u023e\u023f\5\u00c3b\2\u023f\u0240\5\u00d1i\2\u0240\u0241\5"+
		"\u00c1a\2\u0241\u0242\5\u00b1Y\2\u0242\u0243\5\u00cbf\2\u0243\u0244\5"+
		"\u00c5c\2\u0244l\3\2\2\2\u0245\u0246\5\u00c3b\2\u0246\u0247\5\u00d1i\2"+
		"\u0247\u0248\5\u00c1a\2\u0248\u0249\5\u00b1Y\2\u0249\u024a\5\u00cbf\2"+
		"\u024a\u024b\5\u00b9]\2\u024b\u024c\5\u00adW\2\u024c\u024d\5\u00c5c\2"+
		"\u024dn\3\2\2\2\u024e\u024f\5\u00cfh\2\u024f\u0250\5\u00b1Y\2\u0250\u0251"+
		"\5\u00d7l\2\u0251\u0252\5\u00cfh\2\u0252\u0253\5\u00c5c\2\u0253p\3\2\2"+
		"\2\u0254\u0255\5\u00adW\2\u0255\u0256\5\u00a9U\2\u0256\u0257\5\u00afX"+
		"\2\u0257\u0258\5\u00b1Y\2\u0258\u0259\5\u00c3b\2\u0259\u025a\5\u00a9U"+
		"\2\u025ar\3\2\2\2\u025b\u025c\5\u00adW\2\u025c\u025d\5\u00a9U\2\u025d"+
		"\u025e\5\u00cbf\2\u025e\u025f\5\u00a9U\2\u025f\u0260\5\u00adW\2\u0260"+
		"\u0261\5\u00cfh\2\u0261\u0262\5\u00b1Y\2\u0262\u0263\5\u00cbf\2\u0263"+
		"t\3\2\2\2\u0264\u0265\5\u00bf`\2\u0265\u0266\5\u00c5c\2\u0266\u0267\5"+
		"\u00b5[\2\u0267\u0268\5\u00b9]\2\u0268\u0269\5\u00adW\2\u0269\u026a\5"+
		"\u00c5c\2\u026av\3\2\2\2\u026b\u026d\t\2\2\2\u026c\u026b\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0273\3\2"+
		"\2\2\u0270\u0272\t\3\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273"+
		"\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274x\3\2\2\2\u0275\u0273\3\2\2\2"+
		"\u0276\u0277\7>\2\2\u0277\u0278\7/\2\2\u0278z\3\2\2\2\u0279\u027a\7?\2"+
		"\2\u027a|\3\2\2\2\u027b\u027c\7>\2\2\u027c\u027d\7@\2\2\u027d~\3\2\2\2"+
		"\u027e\u027f\7@\2\2\u027f\u0080\3\2\2\2\u0280\u0281\7@\2\2\u0281\u0282"+
		"\7?\2\2\u0282\u0082\3\2\2\2\u0283\u0284\7>\2\2\u0284\u0084\3\2\2\2\u0285"+
		"\u0286\7>\2\2\u0286\u0287\7?\2\2\u0287\u0086\3\2\2\2\u0288\u0289\7*\2"+
		"\2\u0289\u0088\3\2\2\2\u028a\u028b\7+\2\2\u028b\u008a\3\2\2\2\u028c\u028d"+
		"\7]\2\2\u028d\u008c\3\2\2\2\u028e\u028f\7_\2\2\u028f\u008e\3\2\2\2\u0290"+
		"\u0291\7.\2\2\u0291\u0090\3\2\2\2\u0292\u0293\7=\2\2\u0293\u0092\3\2\2"+
		"\2\u0294\u0295\7,\2\2\u0295\u0094\3\2\2\2\u0296\u0297\7\61\2\2\u0297\u0096"+
		"\3\2\2\2\u0298\u0299\7-\2\2\u0299\u0098\3\2\2\2\u029a\u029b\7/\2\2\u029b"+
		"\u009a\3\2\2\2\u029c\u029d\7`\2\2\u029d\u009c\3\2\2\2\u029e\u029f\7<\2"+
		"\2\u029f\u009e\3\2\2\2\u02a0\u02a4\t\4\2\2\u02a1\u02a3\n\5\2\2\u02a2\u02a1"+
		"\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u02a7\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\t\4\2\2\u02a8\u00a0\3\2"+
		"\2\2\u02a9\u02ab\t\6\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b0\t\7"+
		"\2\2\u02af\u02b1\t\6\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u00a2\3\2\2\2\u02b4\u02b6\t\6"+
		"\2\2\u02b5\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7"+
		"\u02b8\3\2\2\2\u02b8\u00a4\3\2\2\2\u02b9\u02ba\t\b\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bc\bS\2\2\u02bc\u00a6\3\2\2\2\u02bd\u02be\7\61\2\2\u02be"+
		"\u02bf\7\61\2\2\u02bf\u02c3\3\2\2\2\u02c0\u02c2\n\t\2\2\u02c1\u02c0\3"+
		"\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\bT\2\2\u02c7\u00a8\3\2"+
		"\2\2\u02c8\u02c9\t\n\2\2\u02c9\u00aa\3\2\2\2\u02ca\u02cb\t\13\2\2\u02cb"+
		"\u00ac\3\2\2\2\u02cc\u02cd\t\f\2\2\u02cd\u00ae\3\2\2\2\u02ce\u02cf\t\r"+
		"\2\2\u02cf\u00b0\3\2\2\2\u02d0\u02d1\t\16\2\2\u02d1\u00b2\3\2\2\2\u02d2"+
		"\u02d3\t\17\2\2\u02d3\u00b4\3\2\2\2\u02d4\u02d5\t\20\2\2\u02d5\u00b6\3"+
		"\2\2\2\u02d6\u02d7\t\21\2\2\u02d7\u00b8\3\2\2\2\u02d8\u02d9\t\22\2\2\u02d9"+
		"\u00ba\3\2\2\2\u02da\u02db\t\23\2\2\u02db\u00bc\3\2\2\2\u02dc\u02dd\t"+
		"\24\2\2\u02dd\u00be\3\2\2\2\u02de\u02df\t\25\2\2\u02df\u00c0\3\2\2\2\u02e0"+
		"\u02e1\t\26\2\2\u02e1\u00c2\3\2\2\2\u02e2\u02e3\t\27\2\2\u02e3\u00c4\3"+
		"\2\2\2\u02e4\u02e5\t\30\2\2\u02e5\u00c6\3\2\2\2\u02e6\u02e7\t\31\2\2\u02e7"+
		"\u00c8\3\2\2\2\u02e8\u02e9\t\32\2\2\u02e9\u00ca\3\2\2\2\u02ea\u02eb\t"+
		"\33\2\2\u02eb\u00cc\3\2\2\2\u02ec\u02ed\t\34\2\2\u02ed\u00ce\3\2\2\2\u02ee"+
		"\u02ef\t\35\2\2\u02ef\u00d0\3\2\2\2\u02f0\u02f1\t\36\2\2\u02f1\u00d2\3"+
		"\2\2\2\u02f2\u02f3\t\37\2\2\u02f3\u00d4\3\2\2\2\u02f4\u02f5\t \2\2\u02f5"+
		"\u00d6\3\2\2\2\u02f6\u02f7\t!\2\2\u02f7\u00d8\3\2\2\2\u02f8\u02f9\t\""+
		"\2\2\u02f9\u00da\3\2\2\2\u02fa\u02fb\t#\2\2\u02fb\u00dc\3\2\2\2\n\2\u026e"+
		"\u0273\u02a4\u02ac\u02b2\u02b7\u02c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}