package astClasses;
import java.lang.Integer;

public class IntegerType extends Typename{
	//int integer;
	Integer integer_1;
	
//	public IntegerType(int integer){
//		this.integer = integer;
//	}
	
	public IntegerType(Integer integer_1) {
		this.integer_1 = integer_1;
	}

	@Override
	public void print(){
		System.out.println("Integer");
	}
}
