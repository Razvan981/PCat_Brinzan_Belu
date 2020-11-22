package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%unicode
%class Lexer
%public
%cup
%implements sym

%line
%column
 
%{

public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
	this(is);
	symbolFactory = sf;
}

public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
	this(reader);
	symbolFactory = sf;
}

private StringBuffer sb;
private ComplexSymbolFactory symbolFactory;
private int csline, cscolumn;

public Symbol symbol(String name, int code) {
    return symbolFactory.newSymbol(name, code,
    				new Location(yyline + 1, yycolumn + 1, yychar),
    				new Location(yyline + 1, yycolumn + yylength(), yychar + yylength())
    				);
}

public Symbol symbol(String name, int code, String lexem) {
    return symbolFactory.newSymbol(name, code,
    				new Location(yyline + 1, yycolumn + 1, yychar),
    				new Location(yyline + 1, yycolumn + yylength(), yychar + yylength())
    				);
}

private void error(String message) {
   System.out.println("Error at line "+ (yyline+1) + ", column " + (yycolumn+ 1)+ " : "+message);
}
%} 

LineEnd = [\r\n]|\r\n
Character = [^\r\n\t]
WhiteSpace = {LineEnd} | [ \t\f] 

Comment = "(*" {Character}* "*)" {LineEnd}

String = "\"" {Character}* "\""
 
Identifier = [:jletter:][:jletterdigit:]*
 
NumericConstant = [1-9][0-9]+ | [0-9]
 
%%
<YYINITIAL> {
   /* Arithmetic Operations */
   "-" { return symbolFactory.newSymbol("SUB", SUB);}
   "+" { return symbolFactory.newSymbol("ADD", ADD); }
   "*" { return symbolFactory.newSymbol("MULT", MULT); }
   "/" { return symbolFactory.newSymbol("DIVIDE", DIVIDE); }
 
   "<" { return symbolFactory.newSymbol("LESS", LESS); }
   ">" { return symbolFactory.newSymbol("GREATER", GREATER); }
   ":=" { return symbolFactory.newSymbol("ASSIGN", ASSIGN); }
   "<=" { return symbolFactory.newSymbol("LESSEQ", LESSEQ); }
   ">=" { return symbolFactory.newSymbol("GREATEREQ", GREATEREQ); }
   "=" { return symbolFactory.newSymbol("EQUAL", EQUAL); }
   "<>" { return symbolFactory.newSymbol("DIFF", DIFF); }
   
   /* Delimiters */
   ":" { return symbolFactory.newSymbol("COLON", COLON); }
   ";" { return symbolFactory.newSymbol("SEMICOLON", SEMICOLON); }
   "," { return symbolFactory.newSymbol("COMMA", COMMA); }
   "." { return symbolFactory.newSymbol("DOT", DOT); }
   "(" { return symbolFactory.newSymbol("LPAREN", LPAREN); }
   ")" { return symbolFactory.newSymbol("RPAREN", RPAREN); }
   "[" { return symbolFactory.newSymbol("LSQBKT", LSQBKT); }
   "]" { return symbolFactory.newSymbol("RSQBKT", RSQBKT); }
   "{" { return symbolFactory.newSymbol("LBRKT", LBRKT); }
   "}" { return symbolFactory.newSymbol("RBRKT", RBRKT); }
   "[<" { return symbolFactory.newSymbol("LSQBKTLESS", LSQBKTLESS); }
   ">]" { return symbolFactory.newSymbol("GREATERRSQBKT", GREATERRSQBKT); }
   
   /* Keywords */
   "AND"    { return symbolFactory.newSymbol("AND", AND); }
   "ARRAY"  { return symbolFactory.newSymbol("ARRAY", ARRAY); }
   "BEGIN"  { return symbolFactory.newSymbol("BEGIN", BEGIN); }
   "BY"     { return symbolFactory.newSymbol("BY", BY); }
   "DIV"    { return symbolFactory.newSymbol("DIV", DIV); }
   "DO"     { return symbolFactory.newSymbol("DO", DO); }
   "ELSE"   { return symbolFactory.newSymbol("ELSE", ELSE); }
   "ELSIF"  { return symbolFactory.newSymbol("ELSIF", ELSIF); }
   "END"    { return symbolFactory.newSymbol("END", END); }
   "EXIT"   { return symbolFactory.newSymbol("EXIT", EXIT); }
   "FOR"    { return symbolFactory.newSymbol("FOR", FOR); }
   "IF"     { return symbolFactory.newSymbol("IF", IF); }
   "IS"     { return symbolFactory.newSymbol("IS", IS); }
   "LOOP"   { return symbolFactory.newSymbol("LOOP", LOOP); }
   "MOD"    { return symbolFactory.newSymbol("MOD", MOD); }
   "NOT"    { return symbolFactory.newSymbol("NOT", NOT); }
   "OF"     { return symbolFactory.newSymbol("OF", OF); }
   "OR"     { return symbolFactory.newSymbol("OR", OR); }
   "PROCEDURE"  { return symbolFactory.newSymbol("PROCEDURE", PROCEDURE); }
   "PROGRAM"  { return symbolFactory.newSymbol("PROGRAM", PROGRAM); }
   "READ"     { return symbolFactory.newSymbol("READ", READ); }
   "RECORD"   { return symbolFactory.newSymbol("RECORD", RECORD); }
   "RETURN"   { return symbolFactory.newSymbol("RETURN", RETURN); }
   "THEN"     { return symbolFactory.newSymbol("THEN", THEN); }
   "TO"       { return symbolFactory.newSymbol("TO", TO); }
   "TYPE"     { return symbolFactory.newSymbol("TYPE", TYPE); }
   "VAR"      { return symbolFactory.newSymbol("VAR", VAR); }
   "WHILE"    { return symbolFactory.newSymbol("WHILE", WHILE); }
   "WRITE"    { return symbolFactory.newSymbol("WRITE", WRITE); }
   
   "INTEGER"  { return symbolFactory.newSymbol("INTEGER", INTEGER); }
   "REAL"     { return symbolFactory.newSymbol("REAL", REAL); }
   "STRING"   { return symbolFactory.newSymbol("STRING", STRING); }
 
   <<EOF>>		{ return symbolFactory.newSymbol("EOF", EOF); }

   {Comment} {}
   {String}  { return symbolFactory.newSymbol("STRING",STRING); }
   {Identifier} { return symbolFactory.newSymbol("ID", ID, yytext()); } 
   {NumericConstant} { return symbolFactory.newSymbol("NUMERIC_CONSTANT", NUMERIC_CONSTANT, new Integer(Integer.parseInt(yytext()))); }
   {WhiteSpace} { /* Ignore */ }
   
 	
 }
 
.|\n { System.out.println("ERROR");error(yytext()); }

