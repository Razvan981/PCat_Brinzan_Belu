package astClasses;

public class StringType extends Typename{
	String string;
	
	public StringType(String string){
		this.string = string;
	}
	
	@Override
	public void print(){
		System.out.println("String");
	}
}
