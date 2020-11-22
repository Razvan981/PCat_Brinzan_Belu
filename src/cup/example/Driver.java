package cup.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import astClasses.Program;
import java_cup.runtime.Symbol;

public class Driver {
	static HashMap<Integer, String> tokenClass = new HashMap<Integer, String> (); 
	
	public static void initHash()
	{
		tokenClass.put(sym.AND, "Keyword");
		tokenClass.put(sym.ARRAY, "Keyword");
		tokenClass.put(sym.BEGIN, "Keyword");
		tokenClass.put(sym.BY, "Keyword");
		tokenClass.put(sym.DIV, "Keyword");
		tokenClass.put(sym.DO, "Keyword");
		tokenClass.put(sym.ELSE, "Keyword");
		tokenClass.put(sym.ELSIF, "Keyword");
		tokenClass.put(sym.END, "Keyword");
		tokenClass.put(sym.EXIT, "Keyword");
		tokenClass.put(sym.FOR, "Keyword");
		tokenClass.put(sym.IF, "Keyword");
		tokenClass.put(sym.IS, "Keyword");
		tokenClass.put(sym.LOOP, "Keyword");
		tokenClass.put(sym.MOD, "Keyword");
		tokenClass.put(sym.NOT, "Keyword");
		tokenClass.put(sym.OF, "Keyword");
		tokenClass.put(sym.OR, "Keyword");
		tokenClass.put(sym.PROCEDURE, "Keyword");
		tokenClass.put(sym.PROGRAM, "Keyword");
		tokenClass.put(sym.READ, "Keyword");
		tokenClass.put(sym.RECORD, "Keyword");
		tokenClass.put(sym.RETURN, "Keyword");
		tokenClass.put(sym.THEN, "Keyword");
		tokenClass.put(sym.TO, "Keyword");
		tokenClass.put(sym.TYPE, "Keyword");
		tokenClass.put(sym.VAR, "Keyword");
		tokenClass.put(sym.WHILE, "Keyword");
		tokenClass.put(sym.WRITE, "Keyword");
		
		tokenClass.put(sym.SUB, "operator");
		tokenClass.put(sym.ADD, "operator");
		tokenClass.put(sym.MULT, "operator");
		tokenClass.put(sym.DIVIDE, "operator");
		tokenClass.put(sym.ASSIGN, "operator");
		tokenClass.put(sym.LESS, "operator");
		tokenClass.put(sym.LESSEQ, "operator");
		tokenClass.put(sym.GREATER, "operator");
		tokenClass.put(sym.GREATEREQ, "operator");
		tokenClass.put(sym.EQUAL, "operator");
		tokenClass.put(sym.DIFF, "operator");
		
		tokenClass.put(sym.COLON, "delimiter");
		tokenClass.put(sym.SEMICOLON, "delimiter");
		tokenClass.put(sym.COMMA, "delimiter");
		tokenClass.put(sym.DOT, "delimiter");
		tokenClass.put(sym.LPAREN, "delimiter");
		tokenClass.put(sym.RPAREN, "delimiter");
		tokenClass.put(sym.LSQBKT, "delimiter");
		tokenClass.put(sym.RSQBKT, "delimiter");
		tokenClass.put(sym.LBRKT, "delimiter");
		tokenClass.put(sym.RBRKT, "delimiter");
		tokenClass.put(sym.LSQBKTLESS, "delimiter");
		tokenClass.put(sym.GREATERRSQBKT, "delimiter");
		tokenClass.put(sym.INTEGER, "type");
        tokenClass.put(sym.REAL, "type");
        tokenClass.put(sym.STRING, "type");

        tokenClass.put(sym.NUMERIC_CONSTANT, "Number");
		
		tokenClass.put(sym.ID, "Identifier");
	}

	public static void main (String[] args) throws Exception {
		
		Driver.initHash();
		
		FileReader inputFile;
		try {
			inputFile = new FileReader("input.txt");
			BufferedReader br = new BufferedReader(inputFile);
			
			Parser parser = new Parser();		
			Symbol root = parser.parse();
			Program program = (Program) root.value;
			program.print();
			
			System.out.println(root.value);
			
								
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void parseTree(Symbol root) {
		
	}

}