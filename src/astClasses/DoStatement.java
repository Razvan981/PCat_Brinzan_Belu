package astClasses;

public class DoStatement {
	StatementList stmList;
	public DoStatement(StatementList stmList) {
		this.stmList = stmList;
	}
	public void print() {
		System.out.println("DoStatement");
		
		if(stmList != null) {
			stmList.print();
		}
	}
}
