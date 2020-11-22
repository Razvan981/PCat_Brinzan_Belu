package astClasses;

public class ArrayInits {
	
	ArrayInit arrayInit;
	ArrayInitList arrayInitList;
	
	public ArrayInits(ArrayInit arrayInit, ArrayInitList arrayInitList) {
		this.arrayInit = arrayInit;
		this.arrayInitList = arrayInitList;
	}
	
	public ArrayInits(ArrayInit arrayInit) {
		this.arrayInit = arrayInit;
	}
	
	public void print() {
		System.out.println("Array Inits");
		
		if(arrayInit != null) {
			arrayInit.print();
		}
		
		if(arrayInitList != null) {
			arrayInitList.print();
		}
	}
}
