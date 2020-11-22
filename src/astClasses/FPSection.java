package astClasses;

public class FPSection {
	String id1;
	String id2;
	Typename typename;

	public FPSection(String id1, String id2, Typename typename) {
		this.id1 = id1;
		this.id2 = id2;
		this.typename = typename;
	}
	
	public void print() {
		System.out.println("FP Section");
		
		if(typename != null) {
			typename.print();
		}
	}
}
