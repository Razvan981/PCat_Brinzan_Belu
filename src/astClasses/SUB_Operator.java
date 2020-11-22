package astClasses;

public class SUB_Operator implements Operator  {
	
	String string;
	
	public SUB_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("SUB");
	}

}
