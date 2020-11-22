package astClasses;

public class ElseStatement {
	StatementList stmList;
	public ElseStatement(StatementList stmList) {
		this.stmList = stmList;
	}
	public void print() {
		System.out.println("Else Statement");
		
		if(stmList != null) {
			stmList.print();
		}
	}
}
