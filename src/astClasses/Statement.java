package astClasses;

public class Statement {
	LValue lvalue;
	Expression expression;
	Expression expression1;
	Expression expression2;
	String id;
	ActualParams actualParams;
	CommaLvalueList commaLvalueList;
	StatementList statementList;
	ElseStatementList elseStatementList;
	DoStatement doStatement;
	ExpressionList expressionList;
	WriteParams writeParams;
	
	public Statement(LValue lvalue, Expression expression) {
		this.lvalue = lvalue;
		this.expression = expression;
	}
	
	public Statement(WriteParams writeParams) {
		this.writeParams = writeParams;
	}
	
	public Statement(String id, ActualParams actualParams) {
		this.id = id;
		this.actualParams = actualParams;
	}
	
	public Statement(LValue lvalue, CommaLvalueList commaLvalueList) {
		this.lvalue = lvalue;
		this.commaLvalueList = commaLvalueList;
	}
	
	public Statement(LValue lvalue) {
		this.lvalue = lvalue;
	}
	
	public Statement(Expression expression, String id, ActualParams actualParams, StatementList statementList) {
		this.expression = expression;
		this.id = id;
		this.actualParams = actualParams;
		this.statementList = statementList;
	}
	
	public Statement(Expression expression, StatementList statementList, ElseStatementList elseStatementList) {
		this.expression = expression;
		this.statementList = statementList;
		this.elseStatementList = elseStatementList;
	}
	
	public Statement(Expression expression, StatementList statementList) {
		this.expression = expression;
		this.statementList = statementList;
	}
	
	public Statement(Expression expression, ElseStatementList elseStatementList) {
		this.expression = expression;
		this.elseStatementList = elseStatementList;
	}
	
	public Statement(Expression expression) {
		this.expression = expression;
	}
	
	public Statement(StatementList statementList) {
		this.statementList = statementList;
	}
	
	public Statement(String id, Expression expression1, Expression expression2, DoStatement doStatement) {
		this.id = id;
		this.expression1 = expression1;
		this.expression2 = expression2;
		this.doStatement = doStatement;
	}
	
	public Statement(String id, Expression expression, Expression expression1, Expression expression2, DoStatement doStatement) {
		this.id = id;
		this.expression = expression;
		this.expression1 = expression1;
		this.expression2 = expression2;
		this.doStatement = doStatement;
	}
	
	public Statement(ExpressionList expressionList) {
		this.expressionList = expressionList;
	}
	
	
	public void print() {
		System.out.println("Statement");
		
		if(this.lvalue != null) {
			this.lvalue.print();
		}
		
		if(this.expression != null) {
			this.expression.print();
		}
		
		if(this.expression1 != null) {
			this.expression1.print();
		}
		
		if(this.expression2 != null) {
			this.expression2.print();
		}
		
		if(this.actualParams != null) {
			this.actualParams.print();
		}
		
		if(this.commaLvalueList != null) {
			this.commaLvalueList.print();
		}
		
		if(this.statementList != null) {
			this.statementList.print();
		}
		
		if(this.elseStatementList != null) {
			this.elseStatementList.print();
		}
		
		if(this.doStatement != null) {
			this.doStatement.print();
		}
		
		if(this.expressionList != null) {
			this.expressionList.print();
		}
		
		if(this.writeParams != null) {
			this.writeParams.print();
		}
	}
}
