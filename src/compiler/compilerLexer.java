package compiler;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class compilerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
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

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:2:7: ( '[' )
			// compiler.g:2:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:3:7: ( ']' )
			// compiler.g:3:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:4:7: ( 'new' )
			// compiler.g:4:9: 'new'
			{
			match("new"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "COMA"
	public final void mCOMA() throws RecognitionException {
		try {
			int _type = COMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// compiler.g:256:6: ( ',' )
			// compiler.g:256:8: ','
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
			// compiler.g:257:6: ( '(' )
			// compiler.g:257:8: '('
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
			// compiler.g:258:6: ( ')' )
			// compiler.g:258:8: ')'
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
			// compiler.g:259:8: ( 'e' 'n' 'd' )
			// compiler.g:259:10: 'e' 'n' 'd'
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
			// compiler.g:260:8: ( '+' )
			// compiler.g:260:10: '+'
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
			// compiler.g:261:8: ( '-' )
			// compiler.g:261:10: '-'
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
			// compiler.g:262:8: ( '/' )
			// compiler.g:262:10: '/'
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
			// compiler.g:263:8: ( '*' )
			// compiler.g:263:10: '*'
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
			// compiler.g:264:8: ( '{' )
			// compiler.g:264:10: '{'
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
			// compiler.g:265:8: ( '}' )
			// compiler.g:265:10: '}'
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
			// compiler.g:266:11: ( '=' )
			// compiler.g:266:13: '='
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
			// compiler.g:267:11: ( ';' )
			// compiler.g:267:13: ';'
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
			// compiler.g:268:10: ( 'public' )
			// compiler.g:268:12: 'public'
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
			// compiler.g:269:8: ( 'String' )
			// compiler.g:269:9: 'String'
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
			// compiler.g:270:4: ( 'int' )
			// compiler.g:270:6: 'int'
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
			// compiler.g:271:6: ( 'float' )
			// compiler.g:271:7: 'float'
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
			// compiler.g:272:8: ( 'double' )
			// compiler.g:272:9: 'double'
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
			// compiler.g:273:9: ( 'boolean' )
			// compiler.g:273:11: 'boolean'
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
			// compiler.g:274:5: ( 'char' )
			// compiler.g:274:8: 'char'
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
			// compiler.g:275:5: ( 'void' )
			// compiler.g:275:7: 'void'
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
			// compiler.g:276:10: ( 'private' )
			// compiler.g:276:12: 'private'
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
			// compiler.g:277:10: ( 'protected' )
			// compiler.g:277:12: 'protected'
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
			// compiler.g:278:9: ( 'class' )
			// compiler.g:278:11: 'class'
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
			// compiler.g:279:8: ( 'static' )
			// compiler.g:279:10: 'static'
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
			// compiler.g:280:9: ( '\\'' ( ' ' .. 'z' ) '\\'' )
			// compiler.g:280:11: '\\'' ( ' ' .. 'z' ) '\\''
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
			// compiler.g:281:8: ( '\\\"' ( ' ' .. 'z' )* '\\\"' )
			// compiler.g:281:10: '\\\"' ( ' ' .. 'z' )* '\\\"'
			{
			match('\"'); 
			// compiler.g:281:16: ( ' ' .. 'z' )*
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
			// compiler.g:282:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// compiler.g:282:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// compiler.g:282:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
			// compiler.g:283:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// compiler.g:283:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// compiler.g:283:11: ( '0' .. '9' )+
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
			// compiler.g:283:25: ( '0' .. '9' )+
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
			// compiler.g:284:9: ( ( '0' .. '9' )+ )
			// compiler.g:284:11: ( '0' .. '9' )+
			{
			// compiler.g:284:11: ( '0' .. '9' )+
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
			// compiler.g:285:8: ( ( ' ' | '\\n' | '\\t' | '\\r' )+ )
			// compiler.g:285:10: ( ' ' | '\\n' | '\\t' | '\\r' )+
			{
			// compiler.g:285:10: ( ' ' | '\\n' | '\\t' | '\\r' )+
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
		// compiler.g:1:8: ( T__34 | T__35 | T__36 | COMA | PARA | PARC | END | OPMAS | OPMENOS | OPDIV | OPMULT | LLAVEA | LLAVEC | OPASIGN | PUNTOYCOMA | PUBLIC | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | PRIVATE | PROTECTED | CLASS | STATIC | CCHAR | CSTRING | ID | CFLOAT | CINT | WS )
		int alt7=33;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// compiler.g:1:10: T__34
				{
				mT__34(); 

				}
				break;
			case 2 :
				// compiler.g:1:16: T__35
				{
				mT__35(); 

				}
				break;
			case 3 :
				// compiler.g:1:22: T__36
				{
				mT__36(); 

				}
				break;
			case 4 :
				// compiler.g:1:28: COMA
				{
				mCOMA(); 

				}
				break;
			case 5 :
				// compiler.g:1:33: PARA
				{
				mPARA(); 

				}
				break;
			case 6 :
				// compiler.g:1:38: PARC
				{
				mPARC(); 

				}
				break;
			case 7 :
				// compiler.g:1:43: END
				{
				mEND(); 

				}
				break;
			case 8 :
				// compiler.g:1:47: OPMAS
				{
				mOPMAS(); 

				}
				break;
			case 9 :
				// compiler.g:1:53: OPMENOS
				{
				mOPMENOS(); 

				}
				break;
			case 10 :
				// compiler.g:1:61: OPDIV
				{
				mOPDIV(); 

				}
				break;
			case 11 :
				// compiler.g:1:67: OPMULT
				{
				mOPMULT(); 

				}
				break;
			case 12 :
				// compiler.g:1:74: LLAVEA
				{
				mLLAVEA(); 

				}
				break;
			case 13 :
				// compiler.g:1:81: LLAVEC
				{
				mLLAVEC(); 

				}
				break;
			case 14 :
				// compiler.g:1:88: OPASIGN
				{
				mOPASIGN(); 

				}
				break;
			case 15 :
				// compiler.g:1:96: PUNTOYCOMA
				{
				mPUNTOYCOMA(); 

				}
				break;
			case 16 :
				// compiler.g:1:107: PUBLIC
				{
				mPUBLIC(); 

				}
				break;
			case 17 :
				// compiler.g:1:114: STRING
				{
				mSTRING(); 

				}
				break;
			case 18 :
				// compiler.g:1:121: INT
				{
				mINT(); 

				}
				break;
			case 19 :
				// compiler.g:1:125: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 20 :
				// compiler.g:1:131: DOUBLE
				{
				mDOUBLE(); 

				}
				break;
			case 21 :
				// compiler.g:1:138: BOOLEAN
				{
				mBOOLEAN(); 

				}
				break;
			case 22 :
				// compiler.g:1:146: CHAR
				{
				mCHAR(); 

				}
				break;
			case 23 :
				// compiler.g:1:151: VOID
				{
				mVOID(); 

				}
				break;
			case 24 :
				// compiler.g:1:156: PRIVATE
				{
				mPRIVATE(); 

				}
				break;
			case 25 :
				// compiler.g:1:164: PROTECTED
				{
				mPROTECTED(); 

				}
				break;
			case 26 :
				// compiler.g:1:174: CLASS
				{
				mCLASS(); 

				}
				break;
			case 27 :
				// compiler.g:1:180: STATIC
				{
				mSTATIC(); 

				}
				break;
			case 28 :
				// compiler.g:1:187: CCHAR
				{
				mCCHAR(); 

				}
				break;
			case 29 :
				// compiler.g:1:193: CSTRING
				{
				mCSTRING(); 

				}
				break;
			case 30 :
				// compiler.g:1:201: ID
				{
				mID(); 

				}
				break;
			case 31 :
				// compiler.g:1:204: CFLOAT
				{
				mCFLOAT(); 

				}
				break;
			case 32 :
				// compiler.g:1:211: CINT
				{
				mCINT(); 

				}
				break;
			case 33 :
				// compiler.g:1:216: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\3\uffff\1\33\3\uffff\1\33\10\uffff\11\33\3\uffff\1\54\1\uffff\15\33\2"+
		"\uffff\1\73\1\74\4\33\1\101\7\33\2\uffff\4\33\1\uffff\3\33\1\120\1\33"+
		"\1\122\5\33\1\130\2\33\1\uffff\1\133\1\uffff\1\33\1\135\2\33\1\140\1\uffff"+
		"\1\141\1\33\1\uffff\1\143\1\uffff\1\144\1\33\2\uffff\1\146\2\uffff\1\33"+
		"\1\uffff\1\150\1\uffff";
	static final String DFA7_eofS =
		"\151\uffff";
	static final String DFA7_minS =
		"\1\11\2\uffff\1\145\3\uffff\1\156\10\uffff\1\162\1\164\1\156\1\154\2\157"+
		"\1\150\1\157\1\164\3\uffff\1\56\1\uffff\1\167\1\144\1\142\1\151\1\162"+
		"\1\164\1\157\1\165\1\157\2\141\1\151\1\141\2\uffff\2\60\1\154\1\166\1"+
		"\164\1\151\1\60\1\141\1\142\1\154\1\162\1\163\1\144\1\164\2\uffff\1\151"+
		"\1\141\1\145\1\156\1\uffff\1\164\1\154\1\145\1\60\1\163\1\60\1\151\1\143"+
		"\1\164\1\143\1\147\1\60\1\145\1\141\1\uffff\1\60\1\uffff\1\143\1\60\1"+
		"\145\1\164\1\60\1\uffff\1\60\1\156\1\uffff\1\60\1\uffff\1\60\1\145\2\uffff"+
		"\1\60\2\uffff\1\144\1\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\2\uffff\1\145\3\uffff\1\156\10\uffff\1\165\1\164\1\156\1\154\2"+
		"\157\1\154\1\157\1\164\3\uffff\1\71\1\uffff\1\167\1\144\1\142\1\157\1"+
		"\162\1\164\1\157\1\165\1\157\2\141\1\151\1\141\2\uffff\2\172\1\154\1\166"+
		"\1\164\1\151\1\172\1\141\1\142\1\154\1\162\1\163\1\144\1\164\2\uffff\1"+
		"\151\1\141\1\145\1\156\1\uffff\1\164\1\154\1\145\1\172\1\163\1\172\1\151"+
		"\1\143\1\164\1\143\1\147\1\172\1\145\1\141\1\uffff\1\172\1\uffff\1\143"+
		"\1\172\1\145\1\164\1\172\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\172"+
		"\1\145\2\uffff\1\172\2\uffff\1\144\1\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14"+
		"\1\15\1\16\1\17\11\uffff\1\34\1\35\1\36\1\uffff\1\41\15\uffff\1\37\1\40"+
		"\16\uffff\1\3\1\7\4\uffff\1\22\16\uffff\1\26\1\uffff\1\27\5\uffff\1\23"+
		"\2\uffff\1\32\1\uffff\1\20\2\uffff\1\21\1\24\1\uffff\1\33\1\30\1\uffff"+
		"\1\25\1\uffff\1\31";
	static final String DFA7_specialS =
		"\151\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\35\2\uffff\1\35\22\uffff\1\35\1\uffff\1\32\4\uffff\1\31\1\5\1\6\1"+
			"\13\1\10\1\4\1\11\1\uffff\1\12\12\34\1\uffff\1\17\1\uffff\1\16\3\uffff"+
			"\22\33\1\21\7\33\1\1\1\uffff\1\2\1\uffff\1\33\1\uffff\1\33\1\25\1\26"+
			"\1\24\1\7\1\23\2\33\1\22\4\33\1\3\1\33\1\20\2\33\1\30\2\33\1\27\4\33"+
			"\1\14\1\uffff\1\15",
			"",
			"",
			"\1\36",
			"",
			"",
			"",
			"\1\37",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\2\uffff\1\40",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47\3\uffff\1\50",
			"\1\51",
			"\1\52",
			"",
			"",
			"",
			"\1\53\1\uffff\12\34",
			"",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60\5\uffff\1\61",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\102",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\121",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\131",
			"\1\132",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\1\134",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\136",
			"\1\137",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\142",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"\1\145",
			"",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
			"",
			"",
			"\1\147",
			"",
			"\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
			return "1:1: Tokens : ( T__34 | T__35 | T__36 | COMA | PARA | PARC | END | OPMAS | OPMENOS | OPDIV | OPMULT | LLAVEA | LLAVEC | OPASIGN | PUNTOYCOMA | PUBLIC | STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID | PRIVATE | PROTECTED | CLASS | STATIC | CCHAR | CSTRING | ID | CFLOAT | CINT | WS );";
		}
	}

}
