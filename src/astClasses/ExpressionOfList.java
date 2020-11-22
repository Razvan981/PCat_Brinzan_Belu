package astClasses;

public class ExpressionOfList {
	
	ExpressionOfList exprOfList;
	Expression expression;
	
	public ExpressionOfList(Expression expression ) {
		this.expression = expression;
	}
	
	public ExpressionOfList(ExpressionOfList exprOfList, Expression expression ) {
		this.exprOfList = exprOfList;
		this.expression = expression;
	}
	

	public void print() {
		System.out.println("ExpressionOf List");
		
		if(expression != null) {
			expression.print();
		}
		
		if(exprOfList != null) {
			exprOfList.print();
		}
	}
}
