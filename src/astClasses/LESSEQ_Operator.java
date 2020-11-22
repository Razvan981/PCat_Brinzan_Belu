package astClasses;

public class LESSEQ_Operator implements BinaryOperator  {
	
	String string;
	
	public LESSEQ_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("LESSEQ");
	}

}
