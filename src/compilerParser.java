// $ANTLR 3.5.2 compiler.g 2024-03-14 06:07:35
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
		"STATIC", "STRING", "VOID", "WS", "'['", "']'", "'new'"
	};
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
	         //Si el tipo inicia con 1 significa que es un array
	         //ej 1 es float, 11 es arreglo de float
	         
		     HashMap tablaDeSimbolos = new HashMap();
	        HashMap tablaDeClase = new HashMap();

	       public void  procesaDeclLocal(String id,String tipo){
	         System.out.println(id+" : "+tipo);
	         Integer verifica = (Integer) tablaDeSimbolos.get(id);
	         if (verifica==null){
	            if(tipo.compareTo("int")==0){ Integer objTipo = Integer.valueOf(1);  
	                                         tablaDeSimbolos.put(id,objTipo); }
	            else if(tipo.compareTo("float")==0){ Integer objTipo = Integer.valueOf(2);  
	                                        tablaDeSimbolos.put(id,objTipo); }
	            else if(tipo.compareTo("arrint")==0){Integer objTipo = Integer.valueOf(11);  
	                                         tablaDeSimbolos.put(id,objTipo);
	            }
	            else if(tipo.compareTo("arrfloat")==0){Integer objTipo = Integer.valueOf(12);  
	                                         tablaDeSimbolos.put(id,objTipo);
	            }
	          }
	          else System.err.println("La variable: "+id+" ya se ha declarado." );                               
	       }

	       public void  procesaDeclClase(String id,String tipo){
	         //System.out.println(id+" : "+tipo);
	         Integer verifica = (Integer) tablaDeClase.get(id);
	         if (verifica==null){
	            if(tipo.compareTo("int")==0){ Integer objTipo = Integer.valueOf(1);  
	                                         tablaDeClase.put(id,objTipo); }
	            else if(tipo.compareTo("float")==0){ Integer objTipo = Integer.valueOf(2);  
	                                        tablaDeClase.put(id,objTipo); }
	            else if(tipo.compareTo("arrint")==0){Integer objTipo = Integer.valueOf(11);  
	                                         tablaDeClase.put(id,objTipo);
	            }
	            else if(tipo.compareTo("arrfloat")==0){Integer objTipo = Integer.valueOf(12);  
	                                         tablaDeClase.put(id,objTipo);
	            }
	          }
	          else System.err.println("La variable: "+id+" ya se ha declarado." );                               
	       }    

	       public void error(String msg){System.out.println("ERROR: "+msg);}

	public int checa(int t1, int t2, String e1, String e2){
	      if(t1==t2) return t1;
	      else{  error(" de tipos en ("+e1+ " op " + e2 +")" );
	                 return 0;
	             }
	}

	public int obtenerTipoNum(String tipo){
	   switch (tipo) {
	    case "int":
	        return 1;
	        
	    case "float":
	        return 2;
	      


	    default:
	        return -1;

	   }
	}


	    public void displayRecognitionError(String[] tokenNames,
	                                        RecognitionException e) {
	        String hdr = getErrorHeader(e);
	        String msg = getErrorMessage(e, tokenNames);
	        System.out.println(">>MyCompiler>>  " + hdr + " " + msg);
	    }







	// $ANTLR start "inicial"
	// compiler.g:88:1: inicial : mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC ;
	public final void inicial() throws RecognitionException {
		try {
			// compiler.g:88:9: ( mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC )
			// compiler.g:88:11: mod_acceso CLASS ID LLAVEA ( metodo | atributo )* LLAVEC
			{
			pushFollow(FOLLOW_mod_acceso_in_inicial23);
			mod_acceso();
			state._fsp--;

			match(input,CLASS,FOLLOW_CLASS_in_inicial25); 
			match(input,ID,FOLLOW_ID_in_inicial27); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_inicial29); 
			// compiler.g:89:16: ( metodo | atributo )*
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
					// compiler.g:89:17: metodo
					{
					pushFollow(FOLLOW_metodo_in_inicial47);
					metodo();
					state._fsp--;

					tablaDeSimbolos.clear();
					}
					break;
				case 2 :
					// compiler.g:89:52: atributo
					{
					pushFollow(FOLLOW_atributo_in_inicial52);
					atributo();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_inicial68); 
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
	// compiler.g:94:1: atributo : ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA ;
	public final void atributo() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo1 =null;

		try {
			// compiler.g:94:10: ( ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA )
			// compiler.g:94:13: ( mod_acceso )? tipo id1= ID ( COMA id2= ID )* PUNTOYCOMA
			{
			// compiler.g:94:13: ( mod_acceso )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= PRIVATE && LA2_0 <= PUBLIC)) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// compiler.g:94:13: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_atributo80);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_atributo83);
			tipo1=tipo();
			state._fsp--;

			id1=(Token)match(input,ID,FOLLOW_ID_in_atributo87); 
			procesaDeclClase((id1!=null?id1.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null)); 
			// compiler.g:94:79: ( COMA id2= ID )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// compiler.g:94:80: COMA id2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_atributo91); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_atributo95); 
					procesaDeclClase((id2!=null?id2.getText():null),(tipo1!=null?input.toString(tipo1.start,tipo1.stop):null)); 
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_atributo100); 
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
	// compiler.g:95:1: metodo : ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC ;
	public final void metodo() throws RecognitionException {
		try {
			// compiler.g:95:8: ( ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC )
			// compiler.g:95:11: ( mod_acceso )? ( directiva )? tipo ID PARA ( decl_args )? PARC LLAVEA ( sentencia )* LLAVEC
			{
			// compiler.g:95:11: ( mod_acceso )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= PRIVATE && LA4_0 <= PUBLIC)) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// compiler.g:95:11: mod_acceso
					{
					pushFollow(FOLLOW_mod_acceso_in_metodo111);
					mod_acceso();
					state._fsp--;

					}
					break;

			}

			// compiler.g:95:23: ( directiva )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==STATIC) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// compiler.g:95:23: directiva
					{
					pushFollow(FOLLOW_directiva_in_metodo114);
					directiva();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tipo_in_metodo117);
			tipo();
			state._fsp--;

			match(input,ID,FOLLOW_ID_in_metodo119); 
			match(input,PARA,FOLLOW_PARA_in_metodo121); 
			// compiler.g:95:47: ( decl_args )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==BOOLEAN||LA6_0==CHAR||LA6_0==DOUBLE||LA6_0==FLOAT||LA6_0==INT||(LA6_0 >= STRING && LA6_0 <= VOID)) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// compiler.g:95:47: decl_args
					{
					pushFollow(FOLLOW_decl_args_in_metodo123);
					decl_args();
					state._fsp--;

					}
					break;

			}

			match(input,PARC,FOLLOW_PARC_in_metodo126); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_metodo141); 
			// compiler.g:97:16: ( sentencia )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==BOOLEAN||LA7_0==CHAR||LA7_0==DOUBLE||(LA7_0 >= FLOAT && LA7_0 <= INT)||(LA7_0 >= STRING && LA7_0 <= VOID)) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// compiler.g:97:16: sentencia
					{
					pushFollow(FOLLOW_sentencia_in_metodo159);
					sentencia();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			match(input,LLAVEC,FOLLOW_LLAVEC_in_metodo176); 
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
	// compiler.g:99:1: decl_args : type1= tipo arg1= ID ( COMA type2= tipo arg2= ID )* ;
	public final void decl_args() throws RecognitionException {
		Token arg1=null;
		Token arg2=null;
		ParserRuleReturnScope type1 =null;
		ParserRuleReturnScope type2 =null;

		try {
			// compiler.g:99:11: (type1= tipo arg1= ID ( COMA type2= tipo arg2= ID )* )
			// compiler.g:99:13: type1= tipo arg1= ID ( COMA type2= tipo arg2= ID )*
			{
			pushFollow(FOLLOW_tipo_in_decl_args186);
			type1=tipo();
			state._fsp--;

			arg1=(Token)match(input,ID,FOLLOW_ID_in_decl_args190); 
			procesaDeclLocal((arg1!=null?arg1.getText():null),(type1!=null?input.toString(type1.start,type1.stop):null)); 
			// compiler.g:99:76: ( COMA type2= tipo arg2= ID )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==COMA) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// compiler.g:99:77: COMA type2= tipo arg2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_args194); 
					pushFollow(FOLLOW_tipo_in_decl_args198);
					type2=tipo();
					state._fsp--;

					arg2=(Token)match(input,ID,FOLLOW_ID_in_decl_args202); 
					procesaDeclLocal((arg2!=null?arg2.getText():null),(type2!=null?input.toString(type2.start,type2.stop):null)); 
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
	// compiler.g:102:1: decl_local : tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA ;
	public final void decl_local() throws RecognitionException {
		Token t1=null;
		Token t2=null;
		ParserRuleReturnScope tipo2 =null;

		try {
			// compiler.g:102:11: ( tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA )
			// compiler.g:102:13: tipo t1= ID ( COMA t2= ID )* PUNTOYCOMA
			{
			pushFollow(FOLLOW_tipo_in_decl_local214);
			tipo2=tipo();
			state._fsp--;

			t1=(Token)match(input,ID,FOLLOW_ID_in_decl_local218); 
			procesaDeclLocal((t1!=null?t1.getText():null),(tipo2!=null?input.toString(tipo2.start,tipo2.stop):null)); 
			// compiler.g:103:14: ( COMA t2= ID )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==COMA) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// compiler.g:103:15: COMA t2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_local237); 
					t2=(Token)match(input,ID,FOLLOW_ID_in_decl_local241); 
					procesaDeclLocal((t2!=null?t2.getText():null),(tipo2!=null?input.toString(tipo2.start,tipo2.stop):null)); 
					}
					break;

				default :
					break loop9;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_local260); 
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
	// compiler.g:106:1: sentencia : ( asignacion | decl_local | decl_arreglo | asignacion_arreglo );
	public final void sentencia() throws RecognitionException {
		try {
			// compiler.g:106:11: ( asignacion | decl_local | decl_arreglo | asignacion_arreglo )
			int alt10=4;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ID) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==34) ) {
					alt10=1;
				}
				else if ( (LA10_1==OPASIGN) ) {
					int LA10_4 = input.LA(3);
					if ( (LA10_4==36) ) {
						alt10=4;
					}
					else if ( (LA10_4==CFLOAT||LA10_4==CINT||LA10_4==ID||LA10_4==PARA) ) {
						alt10=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA10_0==BOOLEAN||LA10_0==CHAR||LA10_0==DOUBLE||LA10_0==FLOAT||LA10_0==INT||(LA10_0 >= STRING && LA10_0 <= VOID)) ) {
				int LA10_2 = input.LA(2);
				if ( (LA10_2==ID) ) {
					alt10=2;
				}
				else if ( (LA10_2==34) ) {
					alt10=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// compiler.g:106:13: asignacion
					{
					pushFollow(FOLLOW_asignacion_in_sentencia269);
					asignacion();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:106:26: decl_local
					{
					pushFollow(FOLLOW_decl_local_in_sentencia273);
					decl_local();
					state._fsp--;

					}
					break;
				case 3 :
					// compiler.g:106:38: decl_arreglo
					{
					pushFollow(FOLLOW_decl_arreglo_in_sentencia276);
					decl_arreglo();
					state._fsp--;

					}
					break;
				case 4 :
					// compiler.g:106:53: asignacion_arreglo
					{
					pushFollow(FOLLOW_asignacion_arreglo_in_sentencia280);
					asignacion_arreglo();
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
	// compiler.g:108:1: asignacion returns [int tipoID] : id1= ID ( '[' ( CINT | ID ) ']' )? OPASIGN t1= expr PUNTOYCOMA ;
	public final int asignacion() throws RecognitionException {
		int tipoID = 0;


		Token id1=null;
		ParserRuleReturnScope t1 =null;

		try {
			// compiler.g:108:32: (id1= ID ( '[' ( CINT | ID ) ']' )? OPASIGN t1= expr PUNTOYCOMA )
			// compiler.g:108:35: id1= ID ( '[' ( CINT | ID ) ']' )? OPASIGN t1= expr PUNTOYCOMA
			{
			id1=(Token)match(input,ID,FOLLOW_ID_in_asignacion294); 

			                                          Integer objInicial = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));
			                                          if (objInicial==null) {   
			                                                            error("id: "+(id1!=null?id1.getText():null) +" no declarada");
			                                                            tipoID =0;
			                                                         }
			                                          else {
			                                             tipoID = objInicial.intValue();
			                                          }
			// compiler.g:116:46: ( '[' ( CINT | ID ) ']' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==34) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// compiler.g:116:47: '[' ( CINT | ID ) ']'
					{
					match(input,34,FOLLOW_34_in_asignacion298); 
					if ( input.LA(1)==CINT||input.LA(1)==ID ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,35,FOLLOW_35_in_asignacion306); 


					                                 Integer objTest = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));
					                                 if((objTest!=null)&&(objTest.intValue()<10)){
					                                    System.err.println("La variable "+(id1!=null?id1.getText():null)+" no es un arreglo." );
					                                 }
					                                 else if(objTest!=null){
					                                    tipoID =objTest.intValue()-10;

					                                 }
					                                
					}
					break;

			}

			match(input,OPASIGN,FOLLOW_OPASIGN_in_asignacion311); 
			pushFollow(FOLLOW_expr_in_asignacion315);
			t1=expr();
			state._fsp--;

			 //aqui
			                                   Integer obj = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));//obtener el tipo con que se declaro ID
			                                   //if(obj.intValue()>=10){
			                                    //obj=obj.intValue()-10;
			                                   //}
			                                   if((t1!=null?((compilerParser.expr_return)t1).typeDetected:0) != tipoID ){
			                                      System.err.println("La variable "+(id1!=null?id1.getText():null)+" de tipo " +tipoID+ " se le asigno un valor incompatible de tipo "+ (t1!=null?((compilerParser.expr_return)t1).typeDetected:0));
			                                   }                                   



			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_asignacion318); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipoID;
	}
	// $ANTLR end "asignacion"


	public static class expr_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "expr"
	// compiler.g:139:1: expr returns [int typeDetected] : m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* ;
	public final compilerParser.expr_return expr() throws RecognitionException {
		compilerParser.expr_return retval = new compilerParser.expr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope m2 =null;

		try {
			// compiler.g:139:37: (m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )* )
			// compiler.g:140:13: m1= multExpr ( ( OPMAS | OPMENOS ) m2= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_expr352);
			m1=multExpr();
			state._fsp--;

			 retval.typeDetected = (m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0);
			// compiler.g:141:14: ( ( OPMAS | OPMENOS ) m2= multExpr )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= OPMAS && LA12_0 <= OPMENOS)) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// compiler.g:141:15: ( OPMAS | OPMENOS ) m2= multExpr
					{
					if ( (input.LA(1) >= OPMAS && input.LA(1) <= OPMENOS) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multExpr_in_expr381);
					m2=multExpr();
					state._fsp--;


					 retval.typeDetected =checa((m1!=null?((compilerParser.multExpr_return)m1).typeDetected:0),(m2!=null?((compilerParser.multExpr_return)m2).typeDetected:0),(m1!=null?input.toString(m1.start,m1.stop):null), (m2!=null?input.toString(m2.start,m2.stop):null)); 
					             
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
	// $ANTLR end "expr"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int typeDetected;
	};


	// $ANTLR start "multExpr"
	// compiler.g:148:1: multExpr returns [int typeDetected] : a1= atom ( OPMULT a2= atom )* ;
	public final compilerParser.multExpr_return multExpr() throws RecognitionException {
		compilerParser.multExpr_return retval = new compilerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;

		try {
			// compiler.g:148:37: (a1= atom ( OPMULT a2= atom )* )
			// compiler.g:148:40: a1= atom ( OPMULT a2= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpr431);
			a1=atom();
			state._fsp--;

			 retval.typeDetected = (a1!=null?((compilerParser.atom_return)a1).typeDetected:0);
			// compiler.g:150:21: ( OPMULT a2= atom )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==OPMULT) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// compiler.g:150:23: OPMULT a2= atom
					{
					match(input,OPMULT,FOLLOW_OPMULT_in_multExpr479); 
					pushFollow(FOLLOW_atom_in_multExpr483);
					a2=atom();
					state._fsp--;

					 
					  retval.typeDetected =checa((a1!=null?((compilerParser.atom_return)a1).typeDetected:0),(a2!=null?((compilerParser.atom_return)a2).typeDetected:0),(a1!=null?input.toString(a1.start,a1.stop):null), (a2!=null?input.toString(a2.start,a2.stop):null)); 
					                        
					}
					break;

				default :
					break loop13;
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
	// compiler.g:156:1: atom returns [int typeDetected] : ( CINT | CFLOAT |id1= ID ( '[' ( CINT | ID ) ']' )? | PARA expr PARC );
	public final compilerParser.atom_return atom() throws RecognitionException {
		compilerParser.atom_return retval = new compilerParser.atom_return();
		retval.start = input.LT(1);

		Token id1=null;
		ParserRuleReturnScope expr3 =null;

		try {
			// compiler.g:156:33: ( CINT | CFLOAT |id1= ID ( '[' ( CINT | ID ) ']' )? | PARA expr PARC )
			int alt15=4;
			switch ( input.LA(1) ) {
			case CINT:
				{
				alt15=1;
				}
				break;
			case CFLOAT:
				{
				alt15=2;
				}
				break;
			case ID:
				{
				alt15=3;
				}
				break;
			case PARA:
				{
				alt15=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}
			switch (alt15) {
				case 1 :
					// compiler.g:156:35: CINT
					{
					match(input,CINT,FOLLOW_CINT_in_atom525); 
					retval.typeDetected =1;
					}
					break;
				case 2 :
					// compiler.g:157:35: CFLOAT
					{
					match(input,CFLOAT,FOLLOW_CFLOAT_in_atom566); 
					retval.typeDetected =2;
					}
					break;
				case 3 :
					// compiler.g:158:35: id1= ID ( '[' ( CINT | ID ) ']' )?
					{
					id1=(Token)match(input,ID,FOLLOW_ID_in_atom606); 
					 //aqui
					                                          Integer obj = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));
					                                          if (obj==null) {   
					                                                            error("id: "+(id1!=null?id1.getText():null) +" no declarada");
					                                                            retval.typeDetected =0;
					                                                         }
					                                          else{  
					                                                //if(obj.intValue()>=10){
					                                                //       obj=obj.intValue()-10;
					                                                   //  }                           
					                                                retval.typeDetected = obj.intValue();                         
					                                          }              
					                                        
					// compiler.g:170:45: ( '[' ( CINT | ID ) ']' )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==34) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// compiler.g:170:46: '[' ( CINT | ID ) ']'
							{
							match(input,34,FOLLOW_34_in_atom612); 
							if ( input.LA(1)==CINT||input.LA(1)==ID ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,35,FOLLOW_35_in_atom620); 


							                                 Integer objTest = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));
							                                 if(objTest.intValue()<10){
							                                    System.err.println("La variable "+(id1!=null?id1.getText():null)+" no es un arreglo." );
							                                 }
							                                 else{
							                                    retval.typeDetected =obj=objTest.intValue()-10;
							                                 }
							                                
							}
							break;

					}

					}
					break;
				case 4 :
					// compiler.g:180:35: PARA expr PARC
					{
					match(input,PARA,FOLLOW_PARA_in_atom662); 
					pushFollow(FOLLOW_expr_in_atom664);
					expr3=expr();
					state._fsp--;

					retval.typeDetected =(expr3!=null?((compilerParser.expr_return)expr3).typeDetected:0);
					match(input,PARC,FOLLOW_PARC_in_atom669); 
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



	// $ANTLR start "decl_arreglo"
	// compiler.g:182:1: decl_arreglo : ( decl_arreglo_sin_ini | decl_arreglo_con_tamano | decl_arreglo_con_ini );
	public final void decl_arreglo() throws RecognitionException {
		try {
			// compiler.g:182:13: ( decl_arreglo_sin_ini | decl_arreglo_con_tamano | decl_arreglo_con_ini )
			int alt16=3;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==BOOLEAN||LA16_0==CHAR||LA16_0==DOUBLE||LA16_0==FLOAT||LA16_0==INT||(LA16_0 >= STRING && LA16_0 <= VOID)) ) {
				int LA16_1 = input.LA(2);
				if ( (LA16_1==34) ) {
					int LA16_2 = input.LA(3);
					if ( (LA16_2==35) ) {
						int LA16_3 = input.LA(4);
						if ( (LA16_3==ID) ) {
							int LA16_4 = input.LA(5);
							if ( (LA16_4==OPASIGN) ) {
								int LA16_5 = input.LA(6);
								if ( (LA16_5==36) ) {
									alt16=2;
								}
								else if ( (LA16_5==LLAVEA) ) {
									alt16=3;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 16, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA16_4==COMA||LA16_4==PUNTOYCOMA) ) {
								alt16=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 16, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 16, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 16, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 16, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// compiler.g:182:15: decl_arreglo_sin_ini
					{
					pushFollow(FOLLOW_decl_arreglo_sin_ini_in_decl_arreglo676);
					decl_arreglo_sin_ini();
					state._fsp--;

					}
					break;
				case 2 :
					// compiler.g:182:38: decl_arreglo_con_tamano
					{
					pushFollow(FOLLOW_decl_arreglo_con_tamano_in_decl_arreglo680);
					decl_arreglo_con_tamano();
					state._fsp--;

					}
					break;
				case 3 :
					// compiler.g:182:64: decl_arreglo_con_ini
					{
					pushFollow(FOLLOW_decl_arreglo_con_ini_in_decl_arreglo684);
					decl_arreglo_con_ini();
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
	// $ANTLR end "decl_arreglo"



	// $ANTLR start "decl_arreglo_sin_ini"
	// compiler.g:184:1: decl_arreglo_sin_ini : tipo '[' ']' id1= ID ( COMA id2= ID )* PUNTOYCOMA ;
	public final void decl_arreglo_sin_ini() throws RecognitionException {
		Token id1=null;
		Token id2=null;
		ParserRuleReturnScope tipo4 =null;

		try {
			// compiler.g:184:22: ( tipo '[' ']' id1= ID ( COMA id2= ID )* PUNTOYCOMA )
			// compiler.g:184:24: tipo '[' ']' id1= ID ( COMA id2= ID )* PUNTOYCOMA
			{
			pushFollow(FOLLOW_tipo_in_decl_arreglo_sin_ini692);
			tipo4=tipo();
			state._fsp--;

			match(input,34,FOLLOW_34_in_decl_arreglo_sin_ini694); 
			match(input,35,FOLLOW_35_in_decl_arreglo_sin_ini695); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_arreglo_sin_ini699); 
			procesaDeclLocal((id1!=null?id1.getText():null),"arr"+(tipo4!=null?input.toString(tipo4.start,tipo4.stop):null)); 
			// compiler.g:184:91: ( COMA id2= ID )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// compiler.g:184:92: COMA id2= ID
					{
					match(input,COMA,FOLLOW_COMA_in_decl_arreglo_sin_ini703); 
					id2=(Token)match(input,ID,FOLLOW_ID_in_decl_arreglo_sin_ini707); 
					procesaDeclLocal((id2!=null?id2.getText():null),"arr"+(tipo4!=null?input.toString(tipo4.start,tipo4.stop):null)); 
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_arreglo_sin_ini713); 
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
	// $ANTLR end "decl_arreglo_sin_ini"



	// $ANTLR start "decl_arreglo_con_tamano"
	// compiler.g:186:1: decl_arreglo_con_tamano : t1= tipo '[' ']' id1= ID OPASIGN 'new' t2= tipo '[' ( CINT | ID ) ']' PUNTOYCOMA ;
	public final void decl_arreglo_con_tamano() throws RecognitionException {
		Token id1=null;
		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope t2 =null;

		try {
			// compiler.g:186:24: (t1= tipo '[' ']' id1= ID OPASIGN 'new' t2= tipo '[' ( CINT | ID ) ']' PUNTOYCOMA )
			// compiler.g:186:26: t1= tipo '[' ']' id1= ID OPASIGN 'new' t2= tipo '[' ( CINT | ID ) ']' PUNTOYCOMA
			{
			pushFollow(FOLLOW_tipo_in_decl_arreglo_con_tamano724);
			t1=tipo();
			state._fsp--;

			match(input,34,FOLLOW_34_in_decl_arreglo_con_tamano726); 
			match(input,35,FOLLOW_35_in_decl_arreglo_con_tamano727); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_arreglo_con_tamano731); 
			match(input,OPASIGN,FOLLOW_OPASIGN_in_decl_arreglo_con_tamano733); 
			match(input,36,FOLLOW_36_in_decl_arreglo_con_tamano735); 
			pushFollow(FOLLOW_tipo_in_decl_arreglo_con_tamano739);
			t2=tipo();
			state._fsp--;


			   if((t1!=null?input.toString(t1.start,t1.stop):null)!=(t2!=null?input.toString(t2.start,t2.stop):null)){
			      procesaDeclLocal((id1!=null?id1.getText():null),"arr"+(t1!=null?input.toString(t1.start,t1.stop):null));} 
			   else{
			      System.err.println("Tipos no coinciden en arreglo "+(t1!=null?input.toString(t1.start,t1.stop):null));
			   }      
			      
			match(input,34,FOLLOW_34_in_decl_arreglo_con_tamano743); 
			if ( input.LA(1)==CINT||input.LA(1)==ID ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			match(input,35,FOLLOW_35_in_decl_arreglo_con_tamano751); 
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_arreglo_con_tamano753); 
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
	// $ANTLR end "decl_arreglo_con_tamano"



	// $ANTLR start "decl_arreglo_con_ini"
	// compiler.g:195:1: decl_arreglo_con_ini : tipo '[' ']' id1= ID OPASIGN LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA ;
	public final void decl_arreglo_con_ini() throws RecognitionException {
		Token id1=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope tipo5 =null;

		try {
			// compiler.g:195:22: ( tipo '[' ']' id1= ID OPASIGN LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA )
			// compiler.g:195:24: tipo '[' ']' id1= ID OPASIGN LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA
			{
			pushFollow(FOLLOW_tipo_in_decl_arreglo_con_ini766);
			tipo5=tipo();
			state._fsp--;

			match(input,34,FOLLOW_34_in_decl_arreglo_con_ini768); 
			match(input,35,FOLLOW_35_in_decl_arreglo_con_ini769); 
			id1=(Token)match(input,ID,FOLLOW_ID_in_decl_arreglo_con_ini773); 
			procesaDeclLocal((id1!=null?id1.getText():null),"arr"+(tipo5!=null?input.toString(tipo5.start,tipo5.stop):null)); 
			match(input,OPASIGN,FOLLOW_OPASIGN_in_decl_arreglo_con_ini776); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_decl_arreglo_con_ini778); 
			// compiler.g:195:106: (e1= expr )
			// compiler.g:195:107: e1= expr
			{
			pushFollow(FOLLOW_expr_in_decl_arreglo_con_ini783);
			e1=expr();
			state._fsp--;

			}


			   if(obtenerTipoNum((tipo5!=null?input.toString(tipo5.start,tipo5.stop):null))!=(e1!=null?((compilerParser.expr_return)e1).typeDetected:0)){
			      System.err.println("Error de tipos en arreglo "+(id1!=null?id1.getText():null)+ "y valor "+(e1!=null?input.toString(e1.start,e1.stop):null));
			   }

			// compiler.g:199:3: ( COMA e2= expr )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COMA) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// compiler.g:199:4: COMA e2= expr
					{
					match(input,COMA,FOLLOW_COMA_in_decl_arreglo_con_ini788); 
					pushFollow(FOLLOW_expr_in_decl_arreglo_con_ini792);
					e2=expr();
					state._fsp--;

					}
					break;

				default :
					break loop18;
				}
			}


			      if(obtenerTipoNum((tipo5!=null?input.toString(tipo5.start,tipo5.stop):null))!=(e2!=null?((compilerParser.expr_return)e2).typeDetected:0)){

			      System.err.println("Error de tipos en arreglo "+(id1!=null?id1.getText():null)+ " y valor "+(e2!=null?input.toString(e2.start,e2.stop):null));
			   }

			match(input,LLAVEC,FOLLOW_LLAVEC_in_decl_arreglo_con_ini798); 
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_decl_arreglo_con_ini800); 
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
	// $ANTLR end "decl_arreglo_con_ini"



	// $ANTLR start "asignacion_arreglo"
	// compiler.g:207:1: asignacion_arreglo returns [int tipoID] : id1= ID OPASIGN 'new' tipo '[' ']' LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA ;
	public final int asignacion_arreglo() throws RecognitionException {
		int tipoID = 0;


		Token id1=null;
		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope e2 =null;
		ParserRuleReturnScope tipo6 =null;

		try {
			// compiler.g:207:41: (id1= ID OPASIGN 'new' tipo '[' ']' LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA )
			// compiler.g:207:43: id1= ID OPASIGN 'new' tipo '[' ']' LLAVEA (e1= expr ) ( COMA e2= expr )* LLAVEC PUNTOYCOMA
			{
			id1=(Token)match(input,ID,FOLLOW_ID_in_asignacion_arreglo817); 

			                                          Integer objInicial = (Integer) tablaDeSimbolos.get((id1!=null?id1.getText():null));
			                                          if (objInicial==null) {   
			                                                            error("id: "+(id1!=null?id1.getText():null) +" no declarada");
			                                                            tipoID =0;
			                                                         }
			                                          else if(objInicial.intValue()<10){
			                                             error("variable: "+(id1!=null?id1.getText():null) +" no es un arreglo");
			                                             tipoID =0;
			                                          }
			                                          else {
			                                             tipoID = objInicial.intValue()-10;
			                                          }
			match(input,OPASIGN,FOLLOW_OPASIGN_in_asignacion_arreglo820); 
			match(input,36,FOLLOW_36_in_asignacion_arreglo822); 
			pushFollow(FOLLOW_tipo_in_asignacion_arreglo824);
			tipo6=tipo();
			state._fsp--;

			match(input,34,FOLLOW_34_in_asignacion_arreglo826); 
			match(input,35,FOLLOW_35_in_asignacion_arreglo827); 
			match(input,LLAVEA,FOLLOW_LLAVEA_in_asignacion_arreglo828); 
			// compiler.g:219:78: (e1= expr )
			// compiler.g:219:79: e1= expr
			{
			pushFollow(FOLLOW_expr_in_asignacion_arreglo833);
			e1=expr();
			state._fsp--;

			}


			   if(obtenerTipoNum((tipo6!=null?input.toString(tipo6.start,tipo6.stop):null))!=tipoID){
			      System.err.println("Error de tipos en arreglo "+(id1!=null?id1.getText():null)+ " y asignacion new "+(tipo6!=null?input.toString(tipo6.start,tipo6.stop):null));
			   }
			   else if(obtenerTipoNum((tipo6!=null?input.toString(tipo6.start,tipo6.stop):null))!=(e1!=null?((compilerParser.expr_return)e1).typeDetected:0)){
			      System.err.println("Error de tipos en arreglo "+(id1!=null?id1.getText():null)+ "y valor "+(e1!=null?input.toString(e1.start,e1.stop):null));
			   }

			// compiler.g:226:3: ( COMA e2= expr )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// compiler.g:226:4: COMA e2= expr
					{
					match(input,COMA,FOLLOW_COMA_in_asignacion_arreglo838); 
					pushFollow(FOLLOW_expr_in_asignacion_arreglo842);
					e2=expr();
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}


			      if(obtenerTipoNum((tipo6!=null?input.toString(tipo6.start,tipo6.stop):null))!=(e2!=null?((compilerParser.expr_return)e2).typeDetected:0)){
			      System.err.println("Error de tipos en arreglo "+(id1!=null?id1.getText():null)+ " y valor "+(e2!=null?input.toString(e2.start,e2.stop):null));
			   }

			match(input,LLAVEC,FOLLOW_LLAVEC_in_asignacion_arreglo848); 
			match(input,PUNTOYCOMA,FOLLOW_PUNTOYCOMA_in_asignacion_arreglo850); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return tipoID;
	}
	// $ANTLR end "asignacion_arreglo"



	// $ANTLR start "id"
	// compiler.g:233:1: id : ID ;
	public final void id() throws RecognitionException {
		Token ID7=null;

		try {
			// compiler.g:233:9: ( ID )
			// compiler.g:233:11: ID
			{
			ID7=(Token)match(input,ID,FOLLOW_ID_in_id866); 
			  Integer obj = (Integer) tablaDeSimbolos.get((ID7!=null?ID7.getText():null));
			                  if (obj==null){
			                                  Integer objNuevo = Integer.valueOf(1);  
			                                  tablaDeSimbolos.put((ID7!=null?ID7.getText():null), objNuevo);     
			                                }
			                  else{   obj=obj.intValue()+1;
			                          tablaDeSimbolos.put((ID7!=null?ID7.getText():null),obj);                          
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
	// compiler.g:243:1: end : END ;
	public final void end() throws RecognitionException {
		try {
			// compiler.g:243:8: ( END )
			// compiler.g:243:10: END
			{
			match(input,END,FOLLOW_END_in_end880); 
			  int a= ((Integer) tablaDeSimbolos.get("a")).intValue();
			                 int b= ((Integer) tablaDeSimbolos.get("b")).intValue();    
			                 System.out.println("La a estuvo:" + a);
			                 System.out.println("La b estuvo:" + b); 
			              
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
	// compiler.g:248:1: mod_acceso : ( PUBLIC | PRIVATE | PROTECTED );
	public final void mod_acceso() throws RecognitionException {
		try {
			// compiler.g:248:11: ( PUBLIC | PRIVATE | PROTECTED )
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
	// compiler.g:250:1: tipo : ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID );
	public final compilerParser.tipo_return tipo() throws RecognitionException {
		compilerParser.tipo_return retval = new compilerParser.tipo_return();
		retval.start = input.LT(1);

		try {
			// compiler.g:250:7: ( STRING | INT | FLOAT | DOUBLE | BOOLEAN | CHAR | VOID )
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
	// compiler.g:251:1: directiva : STATIC ;
	public final void directiva() throws RecognitionException {
		try {
			// compiler.g:251:10: ( STATIC )
			// compiler.g:251:14: STATIC
			{
			match(input,STATIC,FOLLOW_STATIC_in_directiva945); 
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
	// compiler.g:254:1: ops_aritmetico : ( OPMAS | OPMENOS | OPDIV | OPMULT );
	public final void ops_aritmetico() throws RecognitionException {
		try {
			// compiler.g:254:15: ( OPMAS | OPMENOS | OPDIV | OPMULT )
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
	// compiler.g:255:1: constantes : ( CINT | CFLOAT | CCHAR | CSTRING );
	public final void constantes() throws RecognitionException {
		try {
			// compiler.g:255:11: ( CINT | CFLOAT | CCHAR | CSTRING )
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
	public static final BitSet FOLLOW_atributo_in_inicial52 = new BitSet(new long[]{0x00000001DC055090L});
	public static final BitSet FOLLOW_LLAVEC_in_inicial68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_atributo80 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_atributo83 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_atributo87 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_COMA_in_atributo91 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_atributo95 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_atributo100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mod_acceso_in_metodo111 = new BitSet(new long[]{0x00000001C0015090L});
	public static final BitSet FOLLOW_directiva_in_metodo114 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_metodo117 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_metodo119 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_PARA_in_metodo121 = new BitSet(new long[]{0x0000000182015090L});
	public static final BitSet FOLLOW_decl_args_in_metodo123 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_PARC_in_metodo126 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LLAVEA_in_metodo141 = new BitSet(new long[]{0x000000018005D090L});
	public static final BitSet FOLLOW_sentencia_in_metodo159 = new BitSet(new long[]{0x000000018005D090L});
	public static final BitSet FOLLOW_LLAVEC_in_metodo176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_args186 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_args190 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMA_in_decl_args194 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_decl_args198 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_args202 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_tipo_in_decl_local214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_local218 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_COMA_in_decl_local237 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_local241 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_local260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_in_sentencia269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_local_in_sentencia273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_arreglo_in_sentencia276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_asignacion_arreglo_in_sentencia280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion294 = new BitSet(new long[]{0x0000000400080000L});
	public static final BitSet FOLLOW_34_in_asignacion298 = new BitSet(new long[]{0x0000000000008100L});
	public static final BitSet FOLLOW_set_in_asignacion300 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_asignacion306 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPASIGN_in_asignacion311 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_asignacion315 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_asignacion318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_expr352 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_set_in_expr370 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_multExpr_in_expr381 = new BitSet(new long[]{0x0000000000600002L});
	public static final BitSet FOLLOW_atom_in_multExpr431 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_OPMULT_in_multExpr479 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_atom_in_multExpr483 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_CINT_in_atom525 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CFLOAT_in_atom566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom606 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_atom612 = new BitSet(new long[]{0x0000000000008100L});
	public static final BitSet FOLLOW_set_in_atom614 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_atom620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARA_in_atom662 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_atom664 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_PARC_in_atom669 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_arreglo_sin_ini_in_decl_arreglo676 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_arreglo_con_tamano_in_decl_arreglo680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_arreglo_con_ini_in_decl_arreglo684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_arreglo_sin_ini692 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_decl_arreglo_sin_ini694 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_decl_arreglo_sin_ini695 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_arreglo_sin_ini699 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_COMA_in_decl_arreglo_sin_ini703 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_arreglo_sin_ini707 = new BitSet(new long[]{0x0000000020000400L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_arreglo_sin_ini713 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_arreglo_con_tamano724 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_decl_arreglo_con_tamano726 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_decl_arreglo_con_tamano727 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_arreglo_con_tamano731 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPASIGN_in_decl_arreglo_con_tamano733 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_decl_arreglo_con_tamano735 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_decl_arreglo_con_tamano739 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_decl_arreglo_con_tamano743 = new BitSet(new long[]{0x0000000000008100L});
	public static final BitSet FOLLOW_set_in_decl_arreglo_con_tamano745 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_decl_arreglo_con_tamano751 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_arreglo_con_tamano753 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tipo_in_decl_arreglo_con_ini766 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_decl_arreglo_con_ini768 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_decl_arreglo_con_ini769 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_ID_in_decl_arreglo_con_ini773 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPASIGN_in_decl_arreglo_con_ini776 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LLAVEA_in_decl_arreglo_con_ini778 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_decl_arreglo_con_ini783 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_COMA_in_decl_arreglo_con_ini788 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_decl_arreglo_con_ini792 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_LLAVEC_in_decl_arreglo_con_ini798 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_decl_arreglo_con_ini800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_asignacion_arreglo817 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_OPASIGN_in_asignacion_arreglo820 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_asignacion_arreglo822 = new BitSet(new long[]{0x0000000180015090L});
	public static final BitSet FOLLOW_tipo_in_asignacion_arreglo824 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_asignacion_arreglo826 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_asignacion_arreglo827 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_LLAVEA_in_asignacion_arreglo828 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_asignacion_arreglo833 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_COMA_in_asignacion_arreglo838 = new BitSet(new long[]{0x0000000001008140L});
	public static final BitSet FOLLOW_expr_in_asignacion_arreglo842 = new BitSet(new long[]{0x0000000000040400L});
	public static final BitSet FOLLOW_LLAVEC_in_asignacion_arreglo848 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_PUNTOYCOMA_in_asignacion_arreglo850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_id866 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_END_in_end880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STATIC_in_directiva945 = new BitSet(new long[]{0x0000000000000002L});
}
