package astClasses;

public class IDType extends Typename{
	String id;
	
	public IDType(String id){
		this.id = id;
	}
	
	@Override
	public void print(){
		System.out.println("Identifier");
	}
}
