package astClasses;

public class DIV_Operator implements BinaryOperator  {
	
	String string;
	
	public DIV_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("DIV");
	}

}
