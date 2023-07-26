package java_learning;

public class ExceptionAssign {

	public static void main(String[] args) {
		try {
			int []a= {5};
			System.out.println(a[3]);
		}
		
		catch(NullPointerException r) {
			System.out.println("youre arrey is null");
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("youre index is out of bounds");
		}
		
	}	
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
