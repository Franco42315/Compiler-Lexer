package compiler;
// $ANTLR 3.5.2 compiler.g 2024-03-03 16:14:45
 //  -------------- importaciones 
        import java.util.HashMap;       

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class compilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "BOOLEAN", "CCHAR", "CFLOAT", 
		"CHAR", "CINT", "CLASS", "COMA", "CSTRING", "DOUBLE", "END", "FLOAT", 
		"ID", "INT", "LLAVEA", "LLAVEC", "OPASIGN", "OPDIV", "OPMAS", "OPMENOS", 
		"OPMULT", "PARA", "PARC", "PRIVATE", "PROTECTED", "PUBLIC", "PUNTOYCOMA", 
		"STATIC", "STRING", "VOID", "WS"
	};
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
        private javax.swing.JTextArea salida;
        
        public void setSalida(javax.swing.JTextArea _salida)
            { salida=_salida; }
	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public compilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public compilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return compilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "compiler.g"; }

	//  -------------- datos miembro
		     HashMap tablaDeSimbolos = new HashMap();

	       public void  procesaDeclLocal(String id,String tipo){
                 salida.append(id+" : "+tipo+"\n");
	         Integer verifica = (Integer) tablaDeSimbolos.get(id);
	         if (verifica==null){
	            if(tipo.compareTo("int")==0){ Integer objTipo = Integer.valueOf(1);  
	                                         tablaDeSimbolos.put(id,objTipo); }
	            else if(tipo.compareTo("float")==0){ Integer objTipo = Integer.valueOf(2);  
	                                        tablaDeSimbolos.put(id,objTipo); }
	          }                
	          else salida.append("La variable: "+id+" ya se ha declarado.\n" );                            
	       }  

	       public void error(String msg){salida.append("ERROR: "+msg);}

	public int checa(int t1, int t2, String e1, String e2){
	      if(t1==t2) return t1;
	      else{  error(" de tipos en ("+e1+ " op " + e2 +")" );
	                 return 0;
	             }
	}


	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
                salida.append( ">>MyCompiler>>  " + hdr + " " + msg + "\n");
	    }






	// $ANTLR start "inicial"
	// compiler.g:43:1: inicial : mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC ;
	public final void inicial() throws RecognitionException {
		try {
			// compiler.g:43:9: ( mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC )
			// compiler.g:43:11: mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC
			{
			pushFollow(FOLLOW_mod_acceso_in_inicial23);
			mod_acceso();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_inicial25); 
			match(input,ID,FOLLOW_ID_in_inicial27); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_inicial29); 
			// compiler.g:44:16: ( metodo | atributo )*
			loop1:
			while (true) {
				int alt1=3;
				switch ( input.LA(1) ) {
				case PRIVATE:
				case PROTECTED:
				case PUBLIC:
					{
					int LA1_2 = input.LA(2);
					if ( (LA1_2==STATIC) ) {
						alt1=1;
					}
					else if ( (LA1_2==BOOLEAN||LA1_2==CHAR||LA1_2==DOUBLE||LA1_2==FLOAT||LA1_2==INT||(LA1_2 >= STRING && LA1_2 <= VOID)) ) {
						int LA1_4 = input.LA(3);
						if ( (LA1_4==ID) ) {
							int LA1_5 = input.LA(4);
							if ( (LA1_5==PARA) ) {
								alt1=1;
							}
							else if ( (LA1_5==COMA||LA1_5==PUNTOYCOMA) ) {
								alt1=2;
							}

						}

					}

					}
					break;
				case STATIC:
					{
					alt1=1;
					}
					break;
				case BOOLEAN:
				case CHAR:
				case DOUBLE:
				case FLOAT:
				case INT:
				case STRING:
				case VOID:
					{
					int LA1_4 = input.LA(2);
					if ( (LA1_4==ID) ) {
						int LA1_5 = input.LA(3);
						if ( (LA1_5==PARA) ) {
							alt1=1;
						}
						else if ( (LA1_5==COMA||LA1_5==PUNTOYCOMA) ) {
							alt1=2;
						}

					}

					}
					break;
				}
				switch (alt1) {
				case 1 :
					// compiler.g:44:17: metodo
					{
					pushFollow(FOLLOW_metodo_in_inicial47);
					metodo();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:44:26: atributo
					{
					pushFollow(FOLLOW_atributo_in_inicial51);
					atributo();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_inicial67); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inicial"



	// $ANTLR start "atributo"
	// compiler.g:47:1: atributo : ( mod_acceso )? tipo ID ( COMA ID )* PUNTOYCOMA ;
	public final void atributo() throws RecognitionException {
		try {
			// compiler.g:47:10: ( ( mod_acceso )? tipo ID ( COMA ID )* PUNTOYCOMA )
			// compiler.g:47:13: ( mod_acceso )? tipo ID ( COMA ID )* PUNTOYCOMA
			{
			// compiler.g:47:13: ( mod_acceso )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// compiler.g:47:13: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_atributo77);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_atributo80);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_atributo82); 
			// compiler.g:47:33: ( COMA ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// compiler.g:47:34: COMA ID
					{
					match(input,COMA,FOLLOW_COMA_in_atributo85); 
					match(input,ID,FOLLOW_ID_in_atributo87); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_atributo91); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "atributo"



	// $ANTLR start "metodo"
	// compiler.g:48:1: metodo : ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC ;
	public final void metodo() throws RecognitionException {
		try {
			// compiler.g:48:8: ( ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC )
			// compiler.g:48:11: ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC
			{
			// compiler.g:48:11: ( mod_acceso )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// compiler.g:48:11: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_metodo102);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			// compiler.g:48:23: ( directiva )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STATIC) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compiler.g:48:23: directiva
					{
					pushFollow(FOLLOW_directiva_in_metodo105);
					directiva();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_metodo108);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_metodo110); 
			match(input,PARA,FOLLOW_PARA_in_metodo112); 
			// compiler.g:48:47: ( decl_args )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BOOLEAN||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||(LA6_0 >= STRING && LA6_0 <= VOID)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// compiler.g:48:47: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_metodo114);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,PARC,FOLLOW_PARC_in_metodo117); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_metodo132); 
			// compiler.g:50:16: ( sentencia )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==BOOLEAN||LA7_0==CHAR||LA7_0==DOUBLE||(LA7_0 >= FLOAT && LA7_0 <= INT)||(LA7_0 >= STRING && LA7_0 <= VOID)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compiler.g:50:16: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_metodo150);
					sentencia();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_metodo167); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "metodo"



	// $ANTLR start "decl_args"
	// compiler.g:52:1: decl_args : tipo ID ( COMA tipo ID )* ;
	public final void decl_args() throws RecognitionException {
		try {
			// compiler.g:52:11: ( tipo ID ( COMA tipo ID )* )
			// compiler.g:52:13: tipo ID ( COMA tipo ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args175);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_decl_args177); 
			// compiler.g:52:21: ( COMA tipo ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compiler.g:52:22: COMA tipo ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_args180); 
					pushFollow(FOLLOW_tipo_in_decl_args182);
					tipo();
					state._fsp--;

					match(input,ID,FOLLOW_ID_in_decl_args184); 
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_args"



	// $ANTLR start "decl_local"
	// compiler.g:55:1: decl_local : tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA ;
	public final void decl_local() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope tipo1 =null;

		try {
			// compiler.g:55:11: ( tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA )
			// compiler.g:55:13: tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA
			{
			pushFollow(FOLLOW_tipo_in_decl_local195);
			tipo1=tipo();
			state._fsp--;

			t1=(Token)match(input,ID,FOLLOW_ID_in_decl_local199); 
			procesaDeclLocal((t1!=null?t1.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null)); 
			// compiler.g:56:14: ( COMA t2= ID )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// compiler.g:56:15: COMA t2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_local218); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_decl_local222); 
					procesaDeclLocal((t2!=null?t2.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null)); 
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_local241); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decl_local"



	// $ANTLR start "sentencia"
	// compiler.g:59:1: sentencia : ( asignacion | decl_local );
	public final void sentencia() throws RecognitionException {
		try {
			// compiler.g:59:11: ( asignacion | decl_local )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				alt10=1;
			}
			else if ( (LA10_0==BOOLEAN||LA10_0==CHAR||LA10_0==DOUBLE||LA10_0==FLOAT||LA10_0==INT||(LA10_0 >= STRING && LA10_0 <= VOID)) ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// compiler.g:59:13: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_sentencia250);
					asignacion();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:59:26: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentencia254);
					decl_local();
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "sentencia"



	// $ANTLR start "asignacion"
	// compiler.g:61:1: asignacion : ID OPASIGN expr PUNTOYCOMA ;
	public final void asignacion() throws RecognitionException {
		try {
			// compiler.g:61:11: ( ID OPASIGN expr PUNTOYCOMA )
			// compiler.g:61:14: ID OPASIGN expr PUNTOYCOMA
			{
			match(input,ID,FOLLOW_ID_in_asignacion262); 
			match(input,OPASIGN,FOLLOW_OPASIGN_in_asignacion264); 
			pushFollow(FOLLOW_expr_in_asignacion266);
			expr();
			state._fsp--;

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_asignacion268); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "asignacion"



	// $ANTLR start "expr"
	// compiler.g:62:1: expr returns [int typeDetected] : m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* ;
	public final int expr() throws RecognitionException {
		int typeDetected = 0;


		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// compiler.g:62:37: (m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* )
			// compiler.g:63:13: m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr300);
			m1=multExpr();
			state._fsp--;

			 typeDetected = (m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0);
			// compiler.g:64:14: ( ( OPMAS | OPMENOS ) m2= multExpr )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= OPMAS && LA11_0 <= OPMENOS)) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// compiler.g:64:15: ( OPMAS | OPMENOS ) m2= multExpr
					{
					if ( (input.LA(1) >= OPMAS && input.LA(1) <= OPMENOS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr329);
					m2=multExpr();
					state._fsp--;


					 typeDetected =checa((m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0),(m2!=null?((compilerParser.multExpr_return)m2).typeDetected:0),(m1!=null?input.toString(m1.start,m1.stop):null), (m2!=null?input.toString(m2.start,m2.stop):null)); 
					             
					}
					break;

				default :
					break loop11;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return typeDetected;
	}
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "multExpr"
	// compiler.g:71:1: multExpr returns [int typeDetected] : a1= atom ( OPMULT a2= atom )* ;
	public final compilerParser.multExpr_return multExpr() throws RecognitionException {
		compilerParser.multExpr_return retval = new compilerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		try {
			// compiler.g:71:37: (a1= atom ( OPMULT a2= atom )* )
			// compiler.g:71:40: a1= atom ( OPMULT a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr379);
			a1=atom();
			state._fsp--;

			 retval.typeDetected = (a1!=null?((compilerParser.atom_return)a1).typeDetected:0);
			// compiler.g:73:21: ( OPMULT a2= atom )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==OPMULT) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// compiler.g:73:23: OPMULT a2= atom
					{
					match(input,OPMULT,FOLLOW_OPMULT_in_multExpr427); 
					pushFollow(FOLLOW_atom_in_multExpr431);
					a2=atom();
					state._fsp--;

					 
					  retval.typeDetected =checa((a1!=null?((compilerParser.atom_return)a1).typeDetected:0),(a2!=null?((compilerParser.atom_return)a2).typeDetected:0),(a1!=null?input.toString(a1.start,a1.stop):null), (a2!=null?input.toString(a2.start,a2.stop):null)); 
					                        
					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class atom_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "atom"
	// compiler.g:79:1: atom returns [int typeDetected] : ( CINT | CFLOAT | ID | PARA expr PARC );
	public final compilerParser.atom_return atom() throws RecognitionException {
		compilerParser.atom_return retval = new compilerParser.atom_return();
		retval.start = input.LT(1);

		Token ID2=null;
		int expr3 =0;

		try {
			// compiler.g:79:33: ( CINT | CFLOAT | ID | PARA expr PARC )
			int alt13=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt13=1;
				}
				break;
			case CFLOAT:
				{
				alt13=2;
				}
				break;
			case ID:
				{
				alt13=3;
				}
				break;
			case PARA:
				{
				alt13=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// compiler.g:79:35: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom473); 
					retval.typeDetected =1;
					}
					break;
				case 2 :
					// compiler.g:80:35: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom514); 
					retval.typeDetected =2;
					}
					break;
				case 3 :
					// compiler.g:81:35: ID
					{
					ID2=(Token)match(input,ID,FOLLOW_ID_in_atom552); 
					 
					                    Integer obj = (Integer) tablaDeSimbolos.get((ID2!=null?ID2.getText():null));
					                         if (obj==null) {   
					                                           error("id: "+(ID2!=null?ID2.getText():null) +" no declarada");
					                                           retval.typeDetected =0;
					                                        }
					                         else  retval.typeDetected = obj.intValue();              
					                                        
					}
					break;
				case 4 :
					// compiler.g:89:35: PARA expr PARC
					{
					match(input,PARA,FOLLOW_PARA_in_atom595); 
					pushFollow(FOLLOW_expr_in_atom597);
					expr3=expr();
					state._fsp--;

					retval.typeDetected =expr3;
					match(input,PARC,FOLLOW_PARC_in_atom602); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atom"



	// $ANTLR start "id"
	// compiler.g:93:1: id : ID ;
	public final void id() throws RecognitionException {
		Token ID4=null;

		try {
			// compiler.g:93:9: ( ID )
			// compiler.g:93:11: ID
			{
			ID4=(Token)match(input,ID,FOLLOW_ID_in_id617); 
			  Integer obj = (Integer) tablaDeSimbolos.get((ID4!=null?ID4.getText():null));
			                  if (obj==null){
			                                  Integer objNuevo = Integer.valueOf(1);  
			                                  tablaDeSimbolos.put((ID4!=null?ID4.getText():null), objNuevo);     
			                                }
			                  else{   obj=obj.intValue()+1;
			                          tablaDeSimbolos.put((ID4!=null?ID4.getText():null),obj);                          
			                  }              
			              
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "id"



	// $ANTLR start "end"
	// compiler.g:103:1: end : END ;
	public final void end() throws RecognitionException {
		try {
			// compiler.g:103:8: ( END )
			// compiler.g:103:10: END
			{
			match(input,END,FOLLOW_END_in_end631); 
			  int a= ((Integer) tablaDeSimbolos.get("a")).intValue();
			                 int b= ((Integer) tablaDeSimbolos.get("b")).intValue();    
			                 //System.out.println("La a estuvo:" + a);
			                 //System.out.println("La b estuvo:" + b); 
			              
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "end"



	// $ANTLR start "mod_acceso"
	// compiler.g:108:1: mod_acceso : ( PUBLIC | PRIVATE | PROTECTED );
	public final void mod_acceso() throws RecognitionException {
		try {
			// compiler.g:108:11: ( PUBLIC | PRIVATE | PROTECTED )
			// compiler.g:
			{
			if ( (input.LA(1) >= PRIVATE && input.LA(1) <= PUBLIC) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "mod_acceso"


	public static class tipo_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tipo"
	// compiler.g:110:1: tipo : ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID );
	public final compilerParser.tipo_return tipo() throws RecognitionException {
		compilerParser.tipo_return retval = new compilerParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:110:7: ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID )
			// compiler.g:
			{
			if ( input.LA(1)==BOOLEAN||input.LA(1)==CHAR||input.LA(1)==DOUBLE||input.LA(1)==FLOAT||input.LA(1)==INT||(input.LA(1) >= STRING && input.LA(1) <= VOID) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tipo"



	// $ANTLR start "directiva"
	// compiler.g:111:1: directiva : STATIC ;
	public final void directiva() throws RecognitionException {
		try {
			// compiler.g:111:10: ( STATIC )
			// compiler.g:111:14: STATIC
			{
			match(input,STATIC,FOLLOW_STATIC_in_directiva696); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "directiva"



	// $ANTLR start "ops_aritmetico"
	// compiler.g:114:1: ops_aritmetico : ( OPMAS | OPMENOS | OPDIV | OPMULT );
	public final void ops_aritmetico() throws RecognitionException {
		try {
			// compiler.g:114:15: ( OPMAS | OPMENOS | OPDIV | OPMULT )
			// compiler.g:
			{
			if ( (input.LA(1) >= OPDIV && input.LA(1) <= OPMULT) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ops_aritmetico"



	// $ANTLR start "constantes"
	// compiler.g:115:1: constantes : ( CINT | CFLOAT | CCHAR | CSTRING );
	public final void constantes() throws RecognitionException {
		try {
			// compiler.g:115:11: ( CINT | CFLOAT | CCHAR | CSTRING )
			// compiler.g:
			{
			if ( (input.LA(1) >= CCHAR && input.LA(1) <= CFLOAT)||input.LA(1)==CINT||input.LA(1)==CSTRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "constantes"

	// Delegated rules



	public static final BitSet FOLLOW_mod_acceso_in_inicial23 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_CLASS_in_inicial25 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_inicial27 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LLAVEA_in_inicial29 = new BitSet(new long[]{0x00000001DC055090L});
	public static final BitSet FOLLOW_metodo_in_inicial47 = new BitSet(new long[]{0x00000001DC055090L});
	public static final BitSet FOLLOW_atributo_in_inicial51 = new BitSet(new long[]{0x00000001DC055090L});
	public static final BitSet FOLLOW_LLAVEC_in_inicial67 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_atributo77 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_atributo80 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_atributo82 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_COMA_in_atributo85 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_atributo87 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_atributo91 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_metodo102 = new BitSet(new long[]{0x00000001C0015090L});
	public static final BitSet FOLLOW_directiva_in_metodo105 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_metodo108 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_metodo110 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_PARA_in_metodo112 = new BitSet(new long[]{0x0000000182015090L});
	public static final BitSet FOLLOW_decl_args_in_metodo114 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_PARC_in_metodo117 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LLAVEA_in_metodo132 = new BitSet(new long[]{0x000000018005D090L});
	public static final BitSet FOLLOW_sentencia_in_metodo150 = new BitSet(new long[]{0x000000018005D090L});
	public static final BitSet FOLLOW_LLAVEC_in_metodo167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args175 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_args177 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMA_in_decl_args180 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_decl_args182 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_args184 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_tipo_in_decl_local195 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_local199 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_COMA_in_decl_local218 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_local222 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_local241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_sentencia250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentencia254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion262 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPASIGN_in_asignacion264 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_asignacion266 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_asignacion268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr300 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_set_in_expr318 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_multExpr_in_expr329 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_atom_in_multExpr379 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_OPMULT_in_multExpr427 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_atom_in_multExpr431 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_CINT_in_atom473 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom552 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARA_in_atom595 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_atom597 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_PARC_in_atom602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_in_end631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_directiva696 = new BitSet(new long[]{0x0000000000000002L});
}
