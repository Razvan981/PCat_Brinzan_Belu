package astClasses;

import java.util.ArrayList;
import java.util.List;

public class FpSectionList extends FormalParams{
	List<FPSection> fpSectionList;
	
	public FpSectionList() {
		fpSectionList = new ArrayList<>();
	}
	
	public void AddFpSection(FPSection fpSection) {
		fpSectionList.add(fpSection);
	}
	
	public void print() {
		System.out.println("FpSection List");
		
		for(int it = 0; it < fpSectionList.size(); ++it) {
			fpSectionList.get(it).print();
		}
	}
}
