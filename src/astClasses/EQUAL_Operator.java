package astClasses;

public class EQUAL_Operator implements BinaryOperator  {
	
	String string;
	
	public EQUAL_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("EQUAL");
	}

}
