package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ElseStatementList {
	List<ElseStatement> elseStatementList;
	
	public ElseStatementList() 
	{
		elseStatementList = new ArrayList<>();
	}
	
	public void AddElseStatement(ElseStatement elseStatement)
	{
		elseStatementList.add(elseStatement);
	}
	public void print() {
		System.out.println("ElseStatement List");
		
		for(int it = 0; it < elseStatementList.size(); ++it) {
			elseStatementList.get(it).print();
		}
	}
}
