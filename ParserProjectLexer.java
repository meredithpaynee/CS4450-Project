// Generated from ParserProject.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ParserProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, INT=14, DOUBLE=15, STRING=16, VARNAME=17, 
		NEWLINE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "INT", "DOUBLE", "STRING", "VARNAME", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'['", "', '", "']'", "'='", 
			"'+='", "'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "INT", "DOUBLE", "STRING", "VARNAME", "NEWLINE", "WS"
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


	public ParserProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserProject.g4"; }

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
		"\u0004\u0000\u0013o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0004"+
		"\rH\b\r\u000b\r\f\rI\u0001\u000e\u0004\u000eM\b\u000e\u000b\u000e\f\u000e"+
		"N\u0001\u000e\u0001\u000e\u0004\u000eS\b\u000e\u000b\u000e\f\u000eT\u0001"+
		"\u000f\u0001\u000f\u0004\u000fY\b\u000f\u000b\u000f\f\u000fZ\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010`\b\u0010\u000b\u0010\f\u0010a\u0001"+
		"\u0011\u0004\u0011e\b\u0011\u000b\u0011\f\u0011f\u0001\u0012\u0004\u0012"+
		"j\b\u0012\u000b\u0012\f\u0012k\u0001\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0006\u0001"+
		"\u000009\u0002\u0000\"\"\'\'\u0003\u000009AZaz\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0001\u0000  u\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000"+
		"\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-"+
		"\u0001\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000"+
		"\u0000\u0000\r3\u0001\u0000\u0000\u0000\u000f6\u0001\u0000\u0000\u0000"+
		"\u00118\u0001\u0000\u0000\u0000\u0013:\u0001\u0000\u0000\u0000\u0015="+
		"\u0001\u0000\u0000\u0000\u0017@\u0001\u0000\u0000\u0000\u0019C\u0001\u0000"+
		"\u0000\u0000\u001bG\u0001\u0000\u0000\u0000\u001dL\u0001\u0000\u0000\u0000"+
		"\u001fV\u0001\u0000\u0000\u0000!_\u0001\u0000\u0000\u0000#d\u0001\u0000"+
		"\u0000\u0000%i\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\u0002\u0001"+
		"\u0000\u0000\u0000)*\u0005-\u0000\u0000*\u0004\u0001\u0000\u0000\u0000"+
		"+,\u0005*\u0000\u0000,\u0006\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000"+
		".\b\u0001\u0000\u0000\u0000/0\u0005%\u0000\u00000\n\u0001\u0000\u0000"+
		"\u000012\u0005[\u0000\u00002\f\u0001\u0000\u0000\u000034\u0005,\u0000"+
		"\u000045\u0005 \u0000\u00005\u000e\u0001\u0000\u0000\u000067\u0005]\u0000"+
		"\u00007\u0010\u0001\u0000\u0000\u000089\u0005=\u0000\u00009\u0012\u0001"+
		"\u0000\u0000\u0000:;\u0005+\u0000\u0000;<\u0005=\u0000\u0000<\u0014\u0001"+
		"\u0000\u0000\u0000=>\u0005-\u0000\u0000>?\u0005=\u0000\u0000?\u0016\u0001"+
		"\u0000\u0000\u0000@A\u0005*\u0000\u0000AB\u0005=\u0000\u0000B\u0018\u0001"+
		"\u0000\u0000\u0000CD\u0005/\u0000\u0000DE\u0005=\u0000\u0000E\u001a\u0001"+
		"\u0000\u0000\u0000FH\u0007\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000J\u001c\u0001\u0000\u0000\u0000KM\u0007\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0005.\u0000\u0000"+
		"QS\u0007\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u001e\u0001"+
		"\u0000\u0000\u0000VX\u0007\u0001\u0000\u0000WY\u0007\u0002\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0007\u0001"+
		"\u0000\u0000] \u0001\u0000\u0000\u0000^`\u0007\u0003\u0000\u0000_^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000b\"\u0001\u0000\u0000\u0000ce\u0007\u0004\u0000"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000g$\u0001\u0000\u0000\u0000hj\u0007"+
		"\u0005\u0000\u0000ih\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"ki\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000"+
		"\u0000mn\u0006\u0012\u0000\u0000n&\u0001\u0000\u0000\u0000\b\u0000INT"+
		"Zafk\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}