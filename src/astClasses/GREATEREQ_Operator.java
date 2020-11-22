package astClasses;

public class GREATEREQ_Operator implements BinaryOperator  {
	
	String string;
	
	public GREATEREQ_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("GREATEREQ");
	}

}
