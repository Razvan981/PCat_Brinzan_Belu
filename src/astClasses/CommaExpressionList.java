package astClasses;
import java.util.ArrayList;
import java.util.List;

public class CommaExpressionList {
	List<CommaExpression> commaExpressionList;
	
	public CommaExpressionList() {
		commaExpressionList = new ArrayList<>();
	}
	public void AddCommaExpression(CommaExpression commaExpression)
	{
		commaExpressionList.add(commaExpression);
	}
	public void print() {
		System.out.println("CommaExpression List");
		
		for(int it = 0; it < commaExpressionList.size(); ++it) {
			commaExpressionList.get(it).print();
		}
	}
}
