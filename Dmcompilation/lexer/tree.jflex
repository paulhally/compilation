import java_cup.runtime.Symbol;

%%
%class MyLexer
%line
%column
%cupsym TreeSymbol
%cup

Float = [[:digit:]]+(\.[[:digit:]]+)?([Ee][+-]?[[:digit:]]+)?
Entier=[0-9]+
Comment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
ID = [A-Za-z]+[0-9]*
CAR=[A-Za-z]
%%


/* -------------------------------------------------
        Mot-CLES
   ------------------------------------------------- */
   
 "main" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.MAIN, yyline, yycolumn);}
 
 "int" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.INT, yyline, yycolumn);}
 
 "bool" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.BOOL, yyline, yycolumn);}
 
 "float" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.FLOAT, yyline, yycolumn);}
 
 "unsigned" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 			return new Symbol(TreeSymbol.UNSIGNED, yyline, yycolumn);}
 
 "char" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.CHAR, yyline, yycolumn);}
 
 "string" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 			return new Symbol(TreeSymbol.STRING, yyline, yycolumn);}
 
 "if" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.IF, yyline, yycolumn);}
 		
 "else" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
		return new Symbol(TreeSymbol.IF, yyline, yycolumn);}
 
 "for" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.FOR, yyline, yycolumn);}
 
 "while" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.WHILE, yyline, yycolumn);}
 
   
   
/* -------------------------------------------------
        Operateurs
   ------------------------------------------------- */
   
"{" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
	return new Symbol(TreeSymbol.LACC, yyline, yycolumn);}

"}" {System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
	return new Symbol(TreeSymbol.RACC, yyline, yycolumn);}

"+"    { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PLUS, yyline, yycolumn); }
"-"    {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.MINUS, yyline, yycolumn); }
"*"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.TIMES, yyline, yycolumn); }
			
"/"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.DIVIDE, yyline, yycolumn); }
			
"("      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.LPAR, yyline, yycolumn); }
")"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.RPAR, yyline, yycolumn); }
"&&"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.AND, yyline, yycolumn); }
"||"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.OR, yyline, yycolumn); }

">="      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PGE, yyline, yycolumn); }

"<="      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PPE, yyline, yycolumn); }
			
"<"      { 
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PPS, yyline, yycolumn); }
">"      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.PGS, yyline, yycolumn); }
			

"<->"      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.EQUI, yyline, yycolumn); }			
			
"="      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.EQ, yyline, yycolumn); }
			
"->"      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.IMP, yyline, yycolumn); }
"!"      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.NON, yyline, yycolumn); }

";"      {
			System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
			return new Symbol(TreeSymbol.SEMIC, yyline, yycolumn); }

/* -------------------------------------------------
        Nombres
   ------------------------------------------------- */
{Entier} 	{ System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
				return new Symbol(TreeSymbol.NUMBER, yyline, yycolumn, new Float(yytext())); }
				
{Float}     { System.err.println(" Symbole : " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
				return new Symbol(TreeSymbol.FLOTTANT, yyline, yycolumn, new Float(yytext())); }
				
				
"true" {System.err.println(" Symbole bool true: " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.BOOLEEN, yyline, yycolumn, new Boolean(true));}
 		
"false" {System.err.println(" Symbole bool false: " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.BOOLEEN, yyline, yycolumn, new Boolean(false));}
 		
{ID} {System.err.println(" Symbole id: " + yytext() + " Ligne : " + yyline + " Colonne : " + yycolumn);
 		return new Symbol(TreeSymbol.ID, yyline, yycolumn, yytext());}


/* -------------------------------------------------
        Commentaires - Caracteres non pris en compte
   ------------------------------------------------- */
{Comment} {}

/* -------------------------------------------------
   ------------------------------------------------- */
.|\n {}