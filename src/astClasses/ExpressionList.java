package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ExpressionList {
	List<Expression> expressionList;
	
	public ExpressionList() 
	{
		expressionList = new ArrayList<>();
	}
	
	public void AddExpression(Expression expression)
	{
		expressionList.add(expression);
	}
	public void print() {
		System.out.println("Expression List");
		
		for(int it = 0; it < expressionList.size(); ++it) {
			expressionList.get(it).print();
		}
	}
}
