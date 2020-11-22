package astClasses;

public class DIVIDE_Operator implements BinaryOperator  {
	
	String string;
	
	public DIVIDE_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("DIVIDE");
	}

}
