package astClasses;
	
import java.util.ArrayList;
import java.util.List;

public class TypeDeclList extends DeclarationList{
	List<TypeDeclaration> typeDecList;

	public TypeDeclList() {
		typeDecList = new ArrayList<>();
	}
	public void AddTypeDeclaration(TypeDeclaration typeDecl) {
		typeDecList.add(typeDecl);
	}
	
	public void print() {
		System.out.println("Type Declaration List");
		
		for(int it = 0; it < typeDecList.size(); ++it) {
			typeDecList.get(it).print();
		}
	}
}
