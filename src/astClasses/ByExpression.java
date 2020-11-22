package astClasses;

public class ByExpression {
	Expression expression;
	
	public ByExpression(Expression expression)
	{
		this.expression = expression;
	}
	public void print() {
		System.out.println("ByExpression");
		expression.print();
	}
}
