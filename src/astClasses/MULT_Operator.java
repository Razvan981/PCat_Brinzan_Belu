package astClasses;

public class MULT_Operator implements BinaryOperator  {
	
	String string;
	
	public MULT_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("MULT");
	}

}
