package Assignment32;
import java.lang.reflect.*;

public class TestReflection {
	public static void main(String[] args) {
		
		
		try {
			Class classobj = Class.forName("Assignment32.Employee");
			Method[] array = classobj.getDeclaredMethods();
			
			for(Method a: array) {
				System.out.println(a);
			}
			
			System.out.println();
			
			Field[] array1 = classobj.getDeclaredFields();
			
			for(Field b: array1) {
				System.out.println(b);
			}
			
			System.out.println();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
	}
}
