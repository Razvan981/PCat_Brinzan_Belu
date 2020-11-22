package astClasses;

public class LValue {
	String id;
	LValue lvalue;
	Expression expression;
	
	public LValue(String id) {
		this.id = id;
	}
	
	public LValue(LValue lvalue, Expression expression) {
		this.lvalue = lvalue;
		this.expression = expression;
	}
	
	public LValue(LValue lvalue) {
		this.lvalue = lvalue;
	}
	
	public void print() {
		System.out.println("LValue");
		
		if(lvalue != null) {
			lvalue.print();
		}
		
		if(expression != null) {
			expression.print();
		}
	}
}
