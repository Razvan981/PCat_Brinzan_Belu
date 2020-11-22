package astClasses;

import java.util.ArrayList;
import java.util.List;

public class DeclarationList extends Declaration{
	List<Declaration> decList;
	
	public DeclarationList() {
		decList = new ArrayList<>();
	}
	
	public void addDeclaration(Declaration declaration) {
		decList.add(declaration);
	}
	
	public void print() {
		System.out.println("Declaration List");
		
		for(int it = 0; it < decList.size(); ++it) {
			decList.get(it).print();
		}
	}
}
