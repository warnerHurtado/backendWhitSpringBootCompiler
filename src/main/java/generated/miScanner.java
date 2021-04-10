// Generated from C:/Users/warne/Downloads/demo\miScanner.g4 by ANTLR 4.9.1
package generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, PIZQ=2, PDER=3, KEYDER=4, KEYIZQ=5, ASSIGN=6, COMA=7, UNDERS=8, 
		PCIZQ=9, PCDER=10, PUNTO=11, COMI=12, SUMA=13, RESTA=14, ADMIRACION=15, 
		ROPERATOR=16, STYPE=17, TRUE=18, FALSE=19, BTYPE=20, AND=21, OR=22, DIVISION=23, 
		MULTIPLI=24, AOP=25, MOP=26, UNARY=27, IF=28, ELSE=29, WHILE=30, RETURN=31, 
		PRINT=32, CLASS=33, NEW=34, LENGTH=35, INTLITERAL=36, REALLITERAL=37, 
		BOOLITERAL=38, STRINGLITERAL=39, ID=40, WS=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PyCOMA", "PIZQ", "PDER", "KEYDER", "KEYIZQ", "ASSIGN", "COMA", "UNDERS", 
			"PCIZQ", "PCDER", "PUNTO", "COMI", "SUMA", "RESTA", "ADMIRACION", "MAYOR", 
			"IGUALES", "DIFERENTE", "MENORIGU", "MAYORIGU", "MENOR", "ROPERATOR", 
			"STYPE", "TRUE", "FALSE", "BTYPE", "AND", "OR", "DIVISION", "MULTIPLI", 
			"AOP", "MOP", "UNARY", "IF", "ELSE", "WHILE", "RETURN", "PRINT", "CLASS", 
			"NEW", "LENGTH", "INTLITERAL", "REALLITERAL", "BOOLITERAL", "STRINGLITERAL", 
			"ID", "PRINTABLE", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'}'", "'{'", "'='", "','", "'_'", "'['", 
			"']'", "'.'", "'\"'", "'+'", "'-'", "'!'", null, null, "'true'", "'false'", 
			null, "'&&'", "'||'", "'/'", "'*'", null, null, null, "'if'", "'else'", 
			"'while'", "'return'", "'print'", "'class'", "'new'", "'length'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "PIZQ", "PDER", "KEYDER", "KEYIZQ", "ASSIGN", "COMA", 
			"UNDERS", "PCIZQ", "PCDER", "PUNTO", "COMI", "SUMA", "RESTA", "ADMIRACION", 
			"ROPERATOR", "STYPE", "TRUE", "FALSE", "BTYPE", "AND", "OR", "DIVISION", 
			"MULTIPLI", "AOP", "MOP", "UNARY", "IF", "ELSE", "WHILE", "RETURN", "PRINT", 
			"CLASS", "NEW", "LENGTH", "INTLITERAL", "REALLITERAL", "BOOLITERAL", 
			"STRINGLITERAL", "ID", "WS"
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


	public miScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "miScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u009c\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00b2\n\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\5\33\u00c1\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3 \5 \u00d0\n \3!\3!\3!\5!\u00d5\n!\3\"\3\"\3\"\5\"\u00da\n\"\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\7+\u010a\n+\f+\16+\u010d\13+\3,\3,\7,\u0111\n,\f,\16,\u0114\13,\3"+
		",\3,\7,\u0118\n,\f,\16,\u011b\13,\3,\3,\3,\7,\u0120\n,\f,\16,\u0123\13"+
		",\5,\u0125\n,\3-\3-\3.\3.\7.\u012b\n.\f.\16.\u012e\13.\3.\3.\3/\3/\5/"+
		"\u0134\n/\3/\3/\3/\7/\u0139\n/\f/\16/\u013c\13/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5"+
		"\60\u015e\n\60\3\61\3\61\3\62\3\62\3\63\6\63\u0165\n\63\r\63\16\63\u0166"+
		"\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\2#\2%\2\'\2)\2+\2-\22/\23\61\24\63\25\65\26\67"+
		"\279\30;\31=\32?\33A\34C\35E\36G\37I K!M\"O#Q$S%U&W\'Y([)]*_\2a\2c\2e"+
		"+\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0197\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2\5i\3\2\2\2"+
		"\7k\3\2\2\2\tm\3\2\2\2\13o\3\2\2\2\rq\3\2\2\2\17s\3\2\2\2\21u\3\2\2\2"+
		"\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0081"+
		"\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u008a\3\2\2\2"+
		"\'\u008d\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u009b\3\2\2\2/\u00b1\3"+
		"\2\2\2\61\u00b3\3\2\2\2\63\u00b8\3\2\2\2\65\u00c0\3\2\2\2\67\u00c2\3\2"+
		"\2\29\u00c5\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cf\3\2\2\2A\u00d4"+
		"\3\2\2\2C\u00d9\3\2\2\2E\u00db\3\2\2\2G\u00de\3\2\2\2I\u00e3\3\2\2\2K"+
		"\u00e9\3\2\2\2M\u00f0\3\2\2\2O\u00f6\3\2\2\2Q\u00fc\3\2\2\2S\u0100\3\2"+
		"\2\2U\u0107\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0128\3\2\2\2]\u0133"+
		"\3\2\2\2_\u015d\3\2\2\2a\u015f\3\2\2\2c\u0161\3\2\2\2e\u0164\3\2\2\2g"+
		"h\7=\2\2h\4\3\2\2\2ij\7*\2\2j\6\3\2\2\2kl\7+\2\2l\b\3\2\2\2mn\7\177\2"+
		"\2n\n\3\2\2\2op\7}\2\2p\f\3\2\2\2qr\7?\2\2r\16\3\2\2\2st\7.\2\2t\20\3"+
		"\2\2\2uv\7a\2\2v\22\3\2\2\2wx\7]\2\2x\24\3\2\2\2yz\7_\2\2z\26\3\2\2\2"+
		"{|\7\60\2\2|\30\3\2\2\2}~\7$\2\2~\32\3\2\2\2\177\u0080\7-\2\2\u0080\34"+
		"\3\2\2\2\u0081\u0082\7/\2\2\u0082\36\3\2\2\2\u0083\u0084\7#\2\2\u0084"+
		" \3\2\2\2\u0085\u0086\7@\2\2\u0086\"\3\2\2\2\u0087\u0088\7?\2\2\u0088"+
		"\u0089\7?\2\2\u0089$\3\2\2\2\u008a\u008b\7#\2\2\u008b\u008c\7?\2\2\u008c"+
		"&\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7?\2\2\u008f(\3\2\2\2\u0090\u0091"+
		"\7@\2\2\u0091\u0092\7?\2\2\u0092*\3\2\2\2\u0093\u0094\7>\2\2\u0094,\3"+
		"\2\2\2\u0095\u009c\5+\26\2\u0096\u009c\5!\21\2\u0097\u009c\5#\22\2\u0098"+
		"\u009c\5%\23\2\u0099\u009c\5\'\24\2\u009a\u009c\5)\25\2\u009b\u0095\3"+
		"\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c.\3\2\2\2\u009d\u009e\7d\2\2\u009e"+
		"\u009f\7q\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2\u00a3\7c\2\2\u00a3\u00b2\7p\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6"+
		"\7j\2\2\u00a6\u00a7\7c\2\2\u00a7\u00b2\7t\2\2\u00a8\u00a9\7k\2\2\u00a9"+
		"\u00aa\7p\2\2\u00aa\u00b2\7v\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7v\2\2"+
		"\u00ad\u00ae\7t\2\2\u00ae\u00af\7k\2\2\u00af\u00b0\7p\2\2\u00b0\u00b2"+
		"\7i\2\2\u00b1\u009d\3\2\2\2\u00b1\u00a4\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1"+
		"\u00ab\3\2\2\2\u00b2\60\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2"+
		"\u00b5\u00b6\7w\2\2\u00b6\u00b7\7g\2\2\u00b7\62\3\2\2\2\u00b8\u00b9\7"+
		"h\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd"+
		"\7g\2\2\u00bd\64\3\2\2\2\u00be\u00c1\5\61\31\2\u00bf\u00c1\5\63\32\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\66\3\2\2\2\u00c2\u00c3\7(\2\2"+
		"\u00c3\u00c4\7(\2\2\u00c48\3\2\2\2\u00c5\u00c6\7~\2\2\u00c6\u00c7\7~\2"+
		"\2\u00c7:\3\2\2\2\u00c8\u00c9\7\61\2\2\u00c9<\3\2\2\2\u00ca\u00cb\7,\2"+
		"\2\u00cb>\3\2\2\2\u00cc\u00d0\5\33\16\2\u00cd\u00d0\5\35\17\2\u00ce\u00d0"+
		"\59\35\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"@\3\2\2\2\u00d1\u00d5\5=\37\2\u00d2\u00d5\5;\36\2\u00d3\u00d5\5\67\34"+
		"\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5B"+
		"\3\2\2\2\u00d6\u00da\5\33\16\2\u00d7\u00da\5\35\17\2\u00d8\u00da\5\37"+
		"\20\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da"+
		"D\3\2\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7h\2\2\u00ddF\3\2\2\2\u00de\u00df"+
		"\7g\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"H\3\2\2\2\u00e3\u00e4\7y\2\2\u00e4\u00e5\7j\2\2\u00e5\u00e6\7k\2\2\u00e6"+
		"\u00e7\7n\2\2\u00e7\u00e8\7g\2\2\u00e8J\3\2\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7w\2\2\u00ed\u00ee\7t\2\2"+
		"\u00ee\u00ef\7p\2\2\u00efL\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1\u00f2\7t\2"+
		"\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7v\2\2\u00f5N\3\2"+
		"\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7u\2\2\u00fa\u00fb\7u\2\2\u00fbP\3\2\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe"+
		"\7g\2\2\u00fe\u00ff\7y\2\2\u00ffR\3\2\2\2\u0100\u0101\7n\2\2\u0101\u0102"+
		"\7g\2\2\u0102\u0103\7p\2\2\u0103\u0104\7i\2\2\u0104\u0105\7v\2\2\u0105"+
		"\u0106\7j\2\2\u0106T\3\2\2\2\u0107\u010b\5a\61\2\u0108\u010a\5a\61\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010cV\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u0112\5a\61\2\u010f\u0111"+
		"\5a\61\2\u0110\u010f\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0119\5\27"+
		"\f\2\u0116\u0118\5a\61\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0125\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\5\27\f\2\u011d\u0121\5a\61\2\u011e\u0120\5a\61\2\u011f"+
		"\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u010e\3\2\2\2\u0124"+
		"\u011c\3\2\2\2\u0125X\3\2\2\2\u0126\u0127\5\65\33\2\u0127Z\3\2\2\2\u0128"+
		"\u012c\5\31\r\2\u0129\u012b\5_\60\2\u012a\u0129\3\2\2\2\u012b\u012e\3"+
		"\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012f\u0130\5\31\r\2\u0130\\\3\2\2\2\u0131\u0134\5\21\t"+
		"\2\u0132\u0134\5c\62\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u013a"+
		"\3\2\2\2\u0135\u0139\5\21\t\2\u0136\u0139\5c\62\2\u0137\u0139\5a\61\2"+
		"\u0138\u0135\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b^\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u015e\5a\61\2\u013e\u015e\5c\62\2\u013f\u015e\7\""+
		"\2\2\u0140\u0141\7$\2\2\u0141\u0142\7\"\2\2\u0142\u015e\7$\2\2\u0143\u015e"+
		"\5\37\20\2\u0144\u015e\4%)\2\u0145\u015e\5\5\3\2\u0146\u015e\5\7\4\2\u0147"+
		"\u015e\5=\37\2\u0148\u015e\5\33\16\2\u0149\u015e\5\17\b\2\u014a\u015e"+
		"\5\35\17\2\u014b\u015e\5\27\f\2\u014c\u015e\5;\36\2\u014d\u015e\7<\2\2"+
		"\u014e\u015e\5\3\2\2\u014f\u015e\5+\26\2\u0150\u015e\5\r\7\2\u0151\u015e"+
		"\5!\21\2\u0152\u015e\4AB\2\u0153\u015e\5\5\3\2\u0154\u015e\7^\2\2\u0155"+
		"\u015e\5\25\13\2\u0156\u015e\7`\2\2\u0157\u015e\5\21\t\2\u0158\u015e\7"+
		"b\2\2\u0159\u015e\5\13\6\2\u015a\u015e\7~\2\2\u015b\u015e\5\t\5\2\u015c"+
		"\u015e\7\u0080\2\2\u015d\u013d\3\2\2\2\u015d\u013e\3\2\2\2\u015d\u013f"+
		"\3\2\2\2\u015d\u0140\3\2\2\2\u015d\u0143\3\2\2\2\u015d\u0144\3\2\2\2\u015d"+
		"\u0145\3\2\2\2\u015d\u0146\3\2\2\2\u015d\u0147\3\2\2\2\u015d\u0148\3\2"+
		"\2\2\u015d\u0149\3\2\2\2\u015d\u014a\3\2\2\2\u015d\u014b\3\2\2\2\u015d"+
		"\u014c\3\2\2\2\u015d\u014d\3\2\2\2\u015d\u014e\3\2\2\2\u015d\u014f\3\2"+
		"\2\2\u015d\u0150\3\2\2\2\u015d\u0151\3\2\2\2\u015d\u0152\3\2\2\2\u015d"+
		"\u0153\3\2\2\2\u015d\u0154\3\2\2\2\u015d\u0155\3\2\2\2\u015d\u0156\3\2"+
		"\2\2\u015d\u0157\3\2\2\2\u015d\u0158\3\2\2\2\u015d\u0159\3\2\2\2\u015d"+
		"\u015a\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e`\3\2\2\2"+
		"\u015f\u0160\t\2\2\2\u0160b\3\2\2\2\u0161\u0162\t\3\2\2\u0162d\3\2\2\2"+
		"\u0163\u0165\t\4\2\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164"+
		"\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\63\2\2"+
		"\u0169f\3\2\2\2\24\2\u009b\u00b1\u00c0\u00cf\u00d4\u00d9\u010b\u0112\u0119"+
		"\u0121\u0124\u012c\u0133\u0138\u013a\u015d\u0166\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}