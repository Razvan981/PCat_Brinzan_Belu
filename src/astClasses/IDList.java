package astClasses;

public class IDList {
	
	String id;
	IDList idList;
	
	public IDList() {
		
	}
	
	public IDList(String id) {
		this.id = id;
	}

	public IDList(IDList idList, String id) {
		this.id = id;
		this.idList = idList;
	}
	
	public void setList(IDList idList) {
		this.idList = idList;
	}
	
	public void print() {
		System.out.println("ID List");
		
		if(idList != null) {
			idList.print();
		}
	}
}
