package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ByExpressionList {
	List<ByExpression> byExpressionList;
	
	public ByExpressionList() 
	{
		byExpressionList = new ArrayList<>();
	}
	
	public void AddByExpression(ByExpression byExpression)
	{
		byExpressionList.add(byExpression);
	}
	public void print() {
		System.out.println("ByExpression List");
		
		for(int it = 0; it < byExpressionList.size(); ++it) {
			byExpressionList.get(it).print();
		}
	}
}
