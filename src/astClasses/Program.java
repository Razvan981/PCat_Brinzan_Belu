package astClasses;

public class Program {
	Body body;
	
	public Program(Body body) {
		this.body = body;
	}
	
	public void print() {
		System.out.println("Program");
		
		body.print();
	}
}
