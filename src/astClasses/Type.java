package astClasses;

public class Type {
	Typename typename;
	Component component;
	ComponentList componentList;
	
	public Type(Typename typename) {
		this.typename = typename;
	}
	
	public Type(Component component, ComponentList componentList) {
		this.component = component;
		this.componentList = componentList;
	}
	
	public Type(Component component) {
		this.component = component;
	}
	
	public void print(){
		System.out.println("Type");
		
		if(typename != null) {
			typename.print();
		}
		
		if(component != null) {
			component.print();
		}
		
		if(componentList != null) {
			componentList.print();
		}
	}
}
