package astClasses;

public class MOD_Operator implements BinaryOperator  {
	
	String string;
	
	public MOD_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("MOD");
	}

}
