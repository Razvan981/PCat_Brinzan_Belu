package astClasses;

public class TypeDeclaration extends TypeDeclList{
	String id;
	Type type;
	
	public TypeDeclaration(String id, Type type) {
		this.id = id;
		this.type = type;
	}
	
	public void print() {
		System.out.println("Type Declaration");
		
		if(type != null) {
			type.print();
		}
	}
}
