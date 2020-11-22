package astClasses;

public class WriteExpression {
	String string;
	Expression expression;
	
	public WriteExpression(String string) {
		this.string = string;
	}
	
	public WriteExpression(Expression expression) {
		this.expression = expression;
	}
	
	public void print() {
		System.out.println("Write Expression");
		
		if(expression != null) {
			expression.print();
		}
	}
}
