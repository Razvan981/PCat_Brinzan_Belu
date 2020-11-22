package astClasses;

public class ActualParams {
	
	Expression expression;
	CommaExpressionList commaExpressionList;
	
	public ActualParams(Expression expression, CommaExpressionList commaExpressionList) {
		this.expression = expression;
		this.commaExpressionList = commaExpressionList;
	}
	
	public ActualParams(Expression expression) {
		this.expression = expression;
	}

	public void print() {
		System.out.println("Actual Params");
		
		if(expression != null) {
			expression.print();
		}
		
		if(commaExpressionList != null) {
			commaExpressionList.print();
		}
	}
}
