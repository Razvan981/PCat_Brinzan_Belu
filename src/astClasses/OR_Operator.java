package astClasses;

public class OR_Operator implements BinaryOperator  {
	
	String string;
	
	public OR_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("OR");
	}

}
