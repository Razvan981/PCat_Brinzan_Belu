package astClasses;

public class NOT_Operator implements UnaryOperator  {
	
	String string;
	
	public NOT_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("NOT");
	}

}
