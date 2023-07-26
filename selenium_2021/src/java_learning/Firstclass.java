package java_learning;

public class Firstclass {
 
 int num=30;
  static int age;
  
 static void testmethod() {
	 int mark=10;
	 System.out.println(mark);
 }
	public static void main(String[] args) {

		System.out.println(age);
		Firstclass abc=new Firstclass();
		Firstclass.testmethod();
		System.out.println(abc.num);
		
	/*int a=125;
	
	System.out.println(a++);
	System.out.println(a--);
	System.out.println(a);
	
	int b=100;
	
	System.out.println(++b);
	System.out.println(--b);
	System.out.println(b);

	System.out.println(a>b);
	System.out.println(a!=b);
	
	long abc=123456789012345L;
	
	char cha=('V');
	
	float flag=12.55F;
		 
	System.out.println(a);
	System.out.println(abc);
	System.out.println(cha);
	System.out.println(flag);
	*/
	}
	
}
