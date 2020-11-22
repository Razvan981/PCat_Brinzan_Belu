package astClasses;
import java.util.ArrayList;
import java.util.List;

public class ElsifStatementList {
	List<ElsifStatement> elsifStatementList;
	
	public ElsifStatementList() 
	{
		elsifStatementList = new ArrayList<>();
	}
	
	public void AddElsifStatement(ElsifStatement elifStatement)
	{
		elsifStatementList.add(elifStatement);
	}
	public void print() {
		System.out.println("ElifStatement List");
		
		for(int it = 0; it < elsifStatementList.size(); ++it) {
			elsifStatementList.get(it).print();
		}
	}
}
