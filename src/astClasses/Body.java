package astClasses;

public class Body {
	DeclarationList decList;
	StatementList stmList;
	
	public Body(DeclarationList decList, StatementList stmList) {
		this.decList = decList;
		this.stmList = stmList;
	}
	
	public Body(StatementList stmList) {
		this.stmList = stmList;
	}
	
	public void print() {
		System.out.println("Body");
		
		if(decList != null) {
			decList.print();
		}
		
		if(stmList != null) {
			stmList.print();
		}
	}
}
