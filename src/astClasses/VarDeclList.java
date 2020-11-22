package astClasses;

import java.util.ArrayList;
import java.util.List;

public class VarDeclList extends DeclarationList{
	List<VarDeclaration> varDecList;
	
	public VarDeclList() {
		varDecList = new ArrayList<>();
	}
	
	public void AddVarDeclaration(VarDeclaration varDecl) {
		varDecList.add(varDecl);
	}
	
	public void print() {
		System.out.println("VarDeclaration List");
		
		for(int it = 0; it < varDecList.size(); ++it) {
			varDecList.get(it).print();
		}
	}
}
