package astClasses;
import java.util.ArrayList;
import java.util.List;

public class StatementList {
	List<Statement> statementList;
	
	public StatementList() {
		statementList = new ArrayList<>();
	}
	public void AddStatement(Statement statement)
	{
		statementList.add(statement);
	}
	public void print() {
		System.out.println("Statement List");
		
		for(int it = 0; it < statementList.size(); ++it) {
			statementList.get(it).print();
		}
	}
}
