package astClasses;

public class RealType extends Typename{
	float real;
	
	public RealType(float real){
		this.real = real;
	}
	
	@Override
	public void print(){
		System.out.println("Real");
	}
}
