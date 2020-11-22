package astClasses;

public class IdExpressionList {
	
	IdExpressionList idExprList;
	String id;
	Expression expression;
	
	public IdExpressionList(String id, Expression expression) {
		this.id = id;
		this.expression = expression;
	}

	public IdExpressionList(IdExpressionList idExprList, String id, Expression expression) {
		this.idExprList = idExprList;
		this.id = id;
		this.expression = expression;
	}
	
	public void print() {
		
		System.out.println("Id Expression List");
		
		if(idExprList != null) {
			idExprList.print();
		}
		
		if(expression != null) {
			expression.print();
		}
	}
}
