package astClasses;

public class ADD_Operator implements Operator {
	
	String string;
	
	public ADD_Operator(String string) {
		this.string = string;
	}

	@Override
	public void print() {
		System.out.println("ADD");
	}

}
