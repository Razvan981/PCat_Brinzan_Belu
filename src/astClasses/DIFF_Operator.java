package astClasses;

public class DIFF_Operator implements BinaryOperator  {
	
	String string;
	
	public DIFF_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("DIFF");
	}

}
