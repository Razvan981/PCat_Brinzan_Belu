package astClasses;

public class Component {
	String id;
	Typename typename;
	
	public Component(String id, Typename typename) {
		this.id = id;
		this.typename = typename;
	}
	
	public void print() {
		System.out.println("Component");
		
		if(typename != null) {
			typename.print();
		}
	}
}
