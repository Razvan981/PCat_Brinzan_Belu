package astClasses;

public class Expression {
	Expression expression;
	Expression expression2;
	Operator unaryOp;
	Operator binaryOp;
	String id;
	ActualParams actualParams;
	RecordInits recordInits;
	ArrayInits arrayInits;
	LValue lvalue;
	
	public Expression () {
		
	}
	
	public Expression (LValue lvalue) {
		this.lvalue = lvalue;
	}
	
	public Expression (Expression expression) {
		this.expression = expression;
	}
	
	public Expression (Operator unaryOp, Expression expression) {
		this.unaryOp = unaryOp;
		this.expression = expression;
	}
	
	public Expression (Expression expression, Operator binaryOp, Expression expression2) {
		this.expression = expression;
		this.binaryOp = binaryOp;
		this.expression2 = expression2;
	}
	
	public Expression (String id, ActualParams actualParams) {
		this.id = id;
		this.actualParams = actualParams;
	}
	
	public Expression (String id, RecordInits recordInits) {
		this.id = id;
		this.recordInits = recordInits;
	}
	
	public Expression (String id, ArrayInits arrayInits) {
		this.id = id;
		this.arrayInits = arrayInits;
	}
	
	public void print() {
		System.out.println("Expression");
		
		if(this.expression != null) {
			this.expression.print();
		}
		
		if(this.expression2 != null) {
			this.expression2.print();
		}
		
		if(this.unaryOp != null) {
			this.unaryOp.print();
		}
		
		if(this.binaryOp != null) {
			this.binaryOp.print();
		}
		
		if(this.actualParams != null) {
			this.actualParams.print();
		}
		
		if(this.recordInits != null) {
			this.recordInits.print();
		}
		
		if(this.arrayInits != null) {
			this.arrayInits.print();
		}
		
		if(this.lvalue != null) {
			this.lvalue.print();
		}
	}
}
