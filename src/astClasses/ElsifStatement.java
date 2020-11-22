package astClasses;

public class ElsifStatement {
	StatementList statementList;
	Expression expression;
	
	public ElsifStatement(Expression expression, StatementList statementList)
	{
		this.expression = expression;
		this.statementList = statementList;
	}
	public ElsifStatement(Expression expression)
	{
		this.expression = expression;
	}
	public void print() {
		System.out.println("ElsifStatement");
		
		if(statementList != null) {
			statementList.print();
		}
		
		if(expression != null) {
			expression.print();
		}
	}
}
