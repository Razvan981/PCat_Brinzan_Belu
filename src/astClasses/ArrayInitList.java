package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ArrayInitList {
	List<ArrayInit> arrInitList;
	public ArrayInitList() {
		arrInitList = new ArrayList<>();
	}
	public void AddArrayInit(ArrayInit arrayInit) {
		arrInitList.add(arrayInit);
	}
	public void print() {
		System.out.println("ArrayInit List");
		
		for(int it = 0; it < arrInitList.size(); ++it) {
			arrInitList.get(it).print();
		}
	}
}
