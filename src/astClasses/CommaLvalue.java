package astClasses;

public class CommaLvalue {
	LValue lvalue;
	
	public CommaLvalue(LValue lvalue) {
		this.lvalue = lvalue;
	}
	
	public void print() {
		System.out.println("CommaLvalue");
		
		lvalue.print();
	}
}
