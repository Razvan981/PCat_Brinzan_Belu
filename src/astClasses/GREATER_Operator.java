package astClasses;

public class GREATER_Operator implements BinaryOperator  {
	
	String string;
	
	public GREATER_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("GREATER");
	}

}
