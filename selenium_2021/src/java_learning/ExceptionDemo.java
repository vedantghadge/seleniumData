package java_learning;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		String  month []={"jan","feb","March","Apr","May","Jun","Jul","Aug","Sep","Oct", "Nov","Dec"};
		
		
		for(int i=0;i<=month.length;i++) {
		
		try {
			System.out.println(month[i]);
		}
		
		catch ( ArrayIndexOutOfBoundsException a){
			System.out.println("month does not exist");
		}
		}
		
		
		
		
		
		
		
		
		
	}

}
