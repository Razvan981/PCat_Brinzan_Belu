package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ProcedureDeclList extends DeclarationList{
List<ProcedureDeclaration> procedureDecList;
	
	public ProcedureDeclList() {
		procedureDecList = new ArrayList<>();
	}
	
	public void AddProcedureDeclaration(ProcedureDeclaration procedureDecl) {
		procedureDecList.add(procedureDecl);
	}
	
	public void print() {
		System.out.println("ProcedureDeclaration List");
		
		for(int it = 0; it < procedureDecList.size(); ++it) {
			procedureDecList.get(it).print();
		}
	}
}
