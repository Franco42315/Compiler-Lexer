package compiler;
// $ANTLR 3.5.2 compiler.g 2024-03-03 16:14:45
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int BOOLEAN=4;
	public static final int CCHAR=5;
	public static final int CFLOAT=6;
	public static final int CHAR=7;
	public static final int CINT=8;
	public static final int CLASS=9;
	public static final int COMA=10;
	public static final int CSTRING=11;
	public static final int DOUBLE=12;
	public static final int END=13;
	public static final int FLOAT=14;
	public static final int ID=15;
	public static final int INT=16;
	public static final int LLAVEA=17;
	public static final int LLAVEC=18;
	public static final int OPASIGN=19;
	public static final int OPDIV=20;
	public static final int OPMAS=21;
	public static final int OPMENOS=22;
	public static final int OPMULT=23;
	public static final int PARA=24;
	public static final int PARC=25;
	public static final int PRIVATE=26;
	public static final int PROTECTED=27;
	public static final int PUBLIC=28;
	public static final int PUNTOYCOMA=29;
	public static final int STATIC=30;
	public static final int STRING=31;
	public static final int VOID=32;
	public static final int WS=33;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public compilerLexer() {} 
	public compilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "compiler.g"; }

	// $ANTLR start "COMA"
	public final void mCOMA() throws RecognitionException {
		try {
			int _type = COMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:116:6: ( ',' )
			// compiler.g:116:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMA"

	// $ANTLR start "PARA"
	public final void mPARA() throws RecognitionException {
		try {
			int _type = PARA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:117:6: ( '(' )
			// compiler.g:117:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARA"

	// $ANTLR start "PARC"
	public final void mPARC() throws RecognitionException {
		try {
			int _type = PARC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:118:6: ( ')' )
			// compiler.g:118:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARC"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:119:8: ( 'e' 'n' 'd' )
			// compiler.g:119:10: 'e' 'n' 'd'
			{
			match('e'); 
			match('n'); 
			match('d'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "OPMAS"
	public final void mOPMAS() throws RecognitionException {
		try {
			int _type = OPMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:120:8: ( '+' )
			// compiler.g:120:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPMAS"

	// $ANTLR start "OPMENOS"
	public final void mOPMENOS() throws RecognitionException {
		try {
			int _type = OPMENOS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:121:8: ( '-' )
			// compiler.g:121:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPMENOS"

	// $ANTLR start "OPDIV"
	public final void mOPDIV() throws RecognitionException {
		try {
			int _type = OPDIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:122:8: ( '/' )
			// compiler.g:122:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPDIV"

	// $ANTLR start "OPMULT"
	public final void mOPMULT() throws RecognitionException {
		try {
			int _type = OPMULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:123:8: ( '*' )
			// compiler.g:123:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPMULT"

	// $ANTLR start "LLAVEA"
	public final void mLLAVEA() throws RecognitionException {
		try {
			int _type = LLAVEA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:124:8: ( '{' )
			// compiler.g:124:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLAVEA"

	// $ANTLR start "LLAVEC"
	public final void mLLAVEC() throws RecognitionException {
		try {
			int _type = LLAVEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:125:8: ( '}' )
			// compiler.g:125:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLAVEC"

	// $ANTLR start "OPASIGN"
	public final void mOPASIGN() throws RecognitionException {
		try {
			int _type = OPASIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:126:11: ( '=' )
			// compiler.g:126:13: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPASIGN"

	// $ANTLR start "PUNTOYCOMA"
	public final void mPUNTOYCOMA() throws RecognitionException {
		try {
			int _type = PUNTOYCOMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:127:11: ( ';' )
			// compiler.g:127:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUNTOYCOMA"

	// $ANTLR start "PUBLIC"
	public final void mPUBLIC() throws RecognitionException {
		try {
			int _type = PUBLIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:128:10: ( 'public' )
			// compiler.g:128:12: 'public'
			{
			match("public"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PUBLIC"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:129:8: ( 'String' )
			// compiler.g:129:9: 'String'
			{
			match("String"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:130:4: ( 'int' )
			// compiler.g:130:6: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:131:6: ( 'float' )
			// compiler.g:131:7: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "DOUBLE"
	public final void mDOUBLE() throws RecognitionException {
		try {
			int _type = DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:132:8: ( 'double' )
			// compiler.g:132:9: 'double'
			{
			match("double"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE"

	// $ANTLR start "BOOLEAN"
	public final void mBOOLEAN() throws RecognitionException {
		try {
			int _type = BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:133:9: ( 'boolean' )
			// compiler.g:133:11: 'boolean'
			{
			match("boolean"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLEAN"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:134:5: ( 'char' )
			// compiler.g:134:8: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:135:5: ( 'void' )
			// compiler.g:135:7: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID"

	// $ANTLR start "PRIVATE"
	public final void mPRIVATE() throws RecognitionException {
		try {
			int _type = PRIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:136:10: ( 'private' )
			// compiler.g:136:12: 'private'
			{
			match("private"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRIVATE"

	// $ANTLR start "PROTECTED"
	public final void mPROTECTED() throws RecognitionException {
		try {
			int _type = PROTECTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:137:10: ( 'protected' )
			// compiler.g:137:12: 'protected'
			{
			match("protected"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PROTECTED"

	// $ANTLR start "CLASS"
	public final void mCLASS() throws RecognitionException {
		try {
			int _type = CLASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:138:9: ( 'class' )
			// compiler.g:138:11: 'class'
			{
			match("class"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLASS"

	// $ANTLR start "STATIC"
	public final void mSTATIC() throws RecognitionException {
		try {
			int _type = STATIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:139:8: ( 'static' )
			// compiler.g:139:10: 'static'
			{
			match("static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STATIC"

	// $ANTLR start "CCHAR"
	public final void mCCHAR() throws RecognitionException {
		try {
			int _type = CCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:140:9: ( '\\'' ( ' ' .. 'z' ) '\\'' )
			// compiler.g:140:11: '\\'' ( ' ' .. 'z' ) '\\''
			{
			match('\''); 
			if ( (input.LA(1) >= ' ' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CCHAR"

	// $ANTLR start "CSTRING"
	public final void mCSTRING() throws RecognitionException {
		try {
			int _type = CSTRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:141:8: ( '\\\"' ( ' ' .. 'z' )* '\\\"' )
			// compiler.g:141:10: '\\\"' ( ' ' .. 'z' )* '\\\"'
			{
			match('\"'); 
			// compiler.g:141:16: ( ' ' .. 'z' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='\"') ) {
					int LA1_1 = input.LA(2);
					if ( ((LA1_1 >= ' ' && LA1_1 <= 'z')) ) {
						alt1=1;
					}

				}
				else if ( ((LA1_0 >= ' ' && LA1_0 <= '!')||(LA1_0 >= '#' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= ' ' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSTRING"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:142:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compiler.g:142:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compiler.g:142:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "CFLOAT"
	public final void mCFLOAT() throws RecognitionException {
		try {
			int _type = CFLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:143:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// compiler.g:143:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// compiler.g:143:11: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// compiler.g:143:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CFLOAT"

	// $ANTLR start "CINT"
	public final void mCINT() throws RecognitionException {
		try {
			int _type = CINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:144:9: ( ( '0' .. '9' )+ )
			// compiler.g:144:11: ( '0' .. '9' )+
			{
			// compiler.g:144:11: ( '0' .. '9' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CINT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:145:8: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// compiler.g:145:10: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// compiler.g:145:10: ( ' ' | '\\n' | '\\t' | '\\r' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||LA6_0=='\r'||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// compiler.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// compiler.g:1:8: ( COMA | PARA | PARC | END | OPMAS | OPMENOS | OPDIV | OPMULT | LLAVEA | LLAVEC | OPASIGN | PUNTOYCOMA | PUBLIC | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | PRIVATE | PROTECTED | CLASS | STATIC | CCHAR | CSTRING | ID | CFLOAT | CINT | WS )
		int alt7=30;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// compiler.g:1:10: COMA
				{
				mCOMA(); 

				}
				break;
			case 2 :
				// compiler.g:1:15: PARA
				{
				mPARA(); 

				}
				break;
			case 3 :
				// compiler.g:1:20: PARC
				{
				mPARC(); 

				}
				break;
			case 4 :
				// compiler.g:1:25: END
				{
				mEND(); 

				}
				break;
			case 5 :
				// compiler.g:1:29: OPMAS
				{
				mOPMAS(); 

				}
				break;
			case 6 :
				// compiler.g:1:35: OPMENOS
				{
				mOPMENOS(); 

				}
				break;
			case 7 :
				// compiler.g:1:43: OPDIV
				{
				mOPDIV(); 

				}
				break;
			case 8 :
				// compiler.g:1:49: OPMULT
				{
				mOPMULT(); 

				}
				break;
			case 9 :
				// compiler.g:1:56: LLAVEA
				{
				mLLAVEA(); 

				}
				break;
			case 10 :
				// compiler.g:1:63: LLAVEC
				{
				mLLAVEC(); 

				}
				break;
			case 11 :
				// compiler.g:1:70: OPASIGN
				{
				mOPASIGN(); 

				}
				break;
			case 12 :
				// compiler.g:1:78: PUNTOYCOMA
				{
				mPUNTOYCOMA(); 

				}
				break;
			case 13 :
				// compiler.g:1:89: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 14 :
				// compiler.g:1:96: STRING
				{
				mSTRING(); 

				}
				break;
			case 15 :
				// compiler.g:1:103: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// compiler.g:1:107: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 17 :
				// compiler.g:1:113: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 18 :
				// compiler.g:1:120: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 19 :
				// compiler.g:1:128: CHAR
				{
				mCHAR(); 

				}
				break;
			case 20 :
				// compiler.g:1:133: VOID
				{
				mVOID(); 

				}
				break;
			case 21 :
				// compiler.g:1:138: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 22 :
				// compiler.g:1:146: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 23 :
				// compiler.g:1:156: CLASS
				{
				mCLASS(); 

				}
				break;
			case 24 :
				// compiler.g:1:162: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 25 :
				// compiler.g:1:169: CCHAR
				{
				mCCHAR(); 

				}
				break;
			case 26 :
				// compiler.g:1:175: CSTRING
				{
				mCSTRING(); 

				}
				break;
			case 27 :
				// compiler.g:1:183: ID
				{
				mID(); 

				}
				break;
			case 28 :
				// compiler.g:1:186: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 29 :
				// compiler.g:1:193: CINT
				{
				mCINT(); 

				}
				break;
			case 30 :
				// compiler.g:1:198: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\4\uffff\1\30\10\uffff\11\30\3\uffff\1\50\1\uffff\14\30\2\uffff\1\66\4"+
		"\30\1\73\7\30\1\uffff\4\30\1\uffff\3\30\1\112\1\30\1\114\5\30\1\122\2"+
		"\30\1\uffff\1\125\1\uffff\1\30\1\127\2\30\1\132\1\uffff\1\133\1\30\1\uffff"+
		"\1\135\1\uffff\1\136\1\30\2\uffff\1\140\2\uffff\1\30\1\uffff\1\142\1\uffff";
	static final String DFA7_eofS =
		"\143\uffff";
	static final String DFA7_minS =
		"\1\11\3\uffff\1\156\10\uffff\1\162\1\164\1\156\1\154\2\157\1\150\1\157"+
		"\1\164\3\uffff\1\56\1\uffff\1\144\1\142\1\151\1\162\1\164\1\157\1\165"+
		"\1\157\2\141\1\151\1\141\2\uffff\1\60\1\154\1\166\1\164\1\151\1\60\1\141"+
		"\1\142\1\154\1\162\1\163\1\144\1\164\1\uffff\1\151\1\141\1\145\1\156\1"+
		"\uffff\1\164\1\154\1\145\1\60\1\163\1\60\1\151\1\143\1\164\1\143\1\147"+
		"\1\60\1\145\1\141\1\uffff\1\60\1\uffff\1\143\1\60\1\145\1\164\1\60\1\uffff"+
		"\1\60\1\156\1\uffff\1\60\1\uffff\1\60\1\145\2\uffff\1\60\2\uffff\1\144"+
		"\1\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\3\uffff\1\156\10\uffff\1\165\1\164\1\156\1\154\2\157\1\154\1\157"+
		"\1\164\3\uffff\1\71\1\uffff\1\144\1\142\1\157\1\162\1\164\1\157\1\165"+
		"\1\157\2\141\1\151\1\141\2\uffff\1\172\1\154\1\166\1\164\1\151\1\172\1"+
		"\141\1\142\1\154\1\162\1\163\1\144\1\164\1\uffff\1\151\1\141\1\145\1\156"+
		"\1\uffff\1\164\1\154\1\145\1\172\1\163\1\172\1\151\1\143\1\164\1\143\1"+
		"\147\1\172\1\145\1\141\1\uffff\1\172\1\uffff\1\143\1\172\1\145\1\164\1"+
		"\172\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\172\1\145\2\uffff\1\172"+
		"\2\uffff\1\144\1\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\11\uffff"+
		"\1\31\1\32\1\33\1\uffff\1\36\14\uffff\1\34\1\35\15\uffff\1\4\4\uffff\1"+
		"\17\16\uffff\1\23\1\uffff\1\24\5\uffff\1\20\2\uffff\1\27\1\uffff\1\15"+
		"\2\uffff\1\16\1\21\1\uffff\1\30\1\25\1\uffff\1\22\1\uffff\1\26";
	static final String DFA7_specialS =
		"\143\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\32\2\uffff\1\32\22\uffff\1\32\1\uffff\1\27\4\uffff\1\26\1\2\1\3\1"+
			"\10\1\5\1\1\1\6\1\uffff\1\7\12\31\1\uffff\1\14\1\uffff\1\13\3\uffff\22"+
			"\30\1\16\7\30\4\uffff\1\30\1\uffff\1\30\1\22\1\23\1\21\1\4\1\20\2\30"+
			"\1\17\6\30\1\15\2\30\1\25\2\30\1\24\4\30\1\11\1\uffff\1\12",
			"",
			"",
			"",
			"\1\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\35\2\uffff\1\34",
			"\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43\3\uffff\1\44",
			"\1\45",
			"\1\46",
			"",
			"",
			"",
			"\1\47\1\uffff\12\31",
			"",
			"\1\51",
			"\1\52",
			"\1\53\5\uffff\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\102",
			"",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"",
			"\1\107",
			"\1\110",
			"\1\111",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\113",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\123",
			"\1\124",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"",
			"\1\126",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\130",
			"\1\131",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\134",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"\1\137",
			"",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			"",
			"",
			"\1\141",
			"",
			"\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( COMA | PARA | PARC | END | OPMAS | OPMENOS | OPDIV | OPMULT | LLAVEA | LLAVEC | OPASIGN | PUNTOYCOMA | PUBLIC | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | PRIVATE | PROTECTED | CLASS | STATIC | CCHAR | CSTRING | ID | CFLOAT | CINT | WS );";
		}
	}

}
