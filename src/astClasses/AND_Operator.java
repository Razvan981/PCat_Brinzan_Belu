package astClasses;

public class AND_Operator implements BinaryOperator  {
	
	String string;
	
	public AND_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("AND");
	}

}
