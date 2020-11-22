package astClasses;

public class RecordInits {
	
	Expression expression;
	IdExpressionList idExpressionList;
	String id;
	
	public RecordInits(String id, Expression expression, IdExpressionList idExpressionList) {
		this.expression = expression;
		this.idExpressionList = idExpressionList;
		this.id = id;
	}
	
	public RecordInits(String id, Expression expression) {
		this.expression = expression;
		this.id = id;
	}
	
	public void print() {
		System.out.println("Record Inits");
		
		if(expression != null) {
			expression.print();
		}
		
		if(idExpressionList != null) {
			idExpressionList.print();
		}
	}
}
