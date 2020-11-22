package astClasses;

import java.util.ArrayList;
import java.util.List;

public class ComponentList {
	List<Component> compList;
	
	public ComponentList() {
		compList = new ArrayList<>();
	}
	
	public void AddComponent(Component component) {
		compList.add(component);
	}
	
	public void print() {
		System.out.println("Component List");
		
		for(int it = 0; it < compList.size(); ++it) {
			compList.get(it).print();
		}
	}
}
