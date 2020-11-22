package astClasses;

import java.util.ArrayList;
import java.util.List;

public class CommaLvalueList {
List<CommaLvalue> commaLvalueList;
	
	public CommaLvalueList() {
		commaLvalueList = new ArrayList<>();
	}
	
	public void AddCommaLvalue(CommaLvalue commaLvalue) {
		commaLvalueList.add(commaLvalue);
	}
	
	public void print() {
		System.out.println("CommaLvalue List");
		
		for(int it = 0; it < commaLvalueList.size(); ++it) {
			commaLvalueList.get(it).print();
		}
	}
}
