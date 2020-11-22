package astClasses;

import java.util.ArrayList;
import java.util.List;

public class WriteExprList extends WriteParams{
	List<WriteExpression> writeExprList;
	
	public WriteExprList() {
		writeExprList = new ArrayList<>();
	}
	
	public void AddWriteExp(WriteExpression writeExpr) {
		writeExprList.add(writeExpr);
	}
	
	@Override
	public void print() {
		System.out.println("WriteExprList List");
		
		for(int it = 0; it < writeExprList.size(); ++it) {
			writeExprList.get(it).print();
		}
	}
}
