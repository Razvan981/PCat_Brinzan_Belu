package astClasses;

public class VarDeclaration {
	IDList idList;
	Typename typename;
	Expression expression;
	VarDeclaration varDeclaration;
	
	public VarDeclaration(IDList idList, Typename typename, Expression expression) {
		this.idList = idList;
		this.typename = typename;
		this.expression = expression;
	}
	
	public VarDeclaration(IDList idList, Expression expression) {
		this.idList = idList;
		this.expression = expression;
	}
	
	public VarDeclaration(VarDeclaration varDeclaration, IDList idList, Typename typename, Expression expression) {
		this.varDeclaration = varDeclaration;
		this.idList = idList;
		this.expression = expression;
		this.typename = typename;
	}
	
	public VarDeclaration(VarDeclaration varDeclaration, IDList idList, Expression expression) {
		this.varDeclaration = varDeclaration;
		this.idList = idList;
		this.expression = expression;
	}
	
	public void print() {
		System.out.println("Var Declaration");
		
		if(idList != null) {
			idList.print();
		}
		
		if(typename != null) {
			typename.print();
		}
		
		if(expression != null) {
			expression.print();
		}
		
		if(varDeclaration != null) {
			varDeclaration.print();
		}
	}
}
