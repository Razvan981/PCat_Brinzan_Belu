package astClasses;

public class CommaExpression {
	Expression expression;
	
	public CommaExpression(Expression expression)
	{
		this.expression = expression;
	}
	public void print()
	{
		System.out.println("CommaExpression");
		
		expression.print();
	}
}
