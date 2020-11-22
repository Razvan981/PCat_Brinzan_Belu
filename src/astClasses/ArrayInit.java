package astClasses;

public class ArrayInit {
	
	ExpressionOfList exprList;
	Expression expr;
	
	public ArrayInit(ExpressionOfList exprList, Expression expr) {
		this.expr = expr;
		this.exprList = exprList;
	}
	
	public void print() {
		System.out.println("Array Init");
		
		if(exprList != null) {
			exprList.print();
		}
		
		if(expr != null) {
			expr.print();
		}
	}
}
