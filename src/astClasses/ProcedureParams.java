package astClasses;

public class ProcedureParams {
	Typename typeName;
	String id1;
	String id2;
	String id3;
	
	public ProcedureParams(String id1, String id2, String id3) {
		this.id1 = id1;
		this.id2 = id2;
		this.id3 = id3;
	}
	
	public ProcedureParams(String id1, String id2, Typename typeName) {
		this.id1 = id1;
		this.id2 = id2;
		this.typeName = typeName;
	}
	public ProcedureParams(String id1) {
		this.id1 = id1;
	}
	public void print() {
		System.out.println("Program");
		
		if(typeName != null) {
			typeName.print();
		}
	}
}
