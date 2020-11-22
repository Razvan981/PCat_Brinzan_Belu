package astClasses;

public class LESS_Operator implements BinaryOperator  {
	
	String string;
	
	public LESS_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("LESS");
	}

}
