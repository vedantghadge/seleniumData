package java_learning;


public class ArraysLearning {

	public static void main(String[] args) {
		
		double value []= {10, 10, 10, 10, 10} ;
		
		int i,sum, avg ;
		sum=0;
		for (i=0; i<value.length;i++) {
			sum+= value[i];
		}
		
		avg= sum /value.length;
		
		System.out.println("THE AVG OF GIVEN VALUE:"+avg);
		
	      }}
		
		
		
		
		
		
		
	
		
	// avg valu 
		
/*Scanner sc=new Scanner(System.in);
		System.out.println("Total number of element");
	    int n=sc.nextInt();
	    double [] arr=new double [n];
	    System.out.println("Enter  "+n+" elements in  array:");
	     double sum=0;
	     for(int i=0;i<n;i++) {
	    	 arr[i]=sc.nextDouble();
	         sum+=arr[i];
	     
	     }
	System.out.println("Average is :" +sum % n);
	}}*/
		
	
	
	
	
	
/*int array[]= {1,2,3,4,5};

for (int a:array)
{
	System.out.println(a);
}*/


/*int arrary[][] = { {1, 2, 3},{ 4, 5,6 }};
System.out.println(array2d.length);

for (int j = 0; j < 2; j++) {
	for (int k = 0; k < 3; k++) {
		System.out.println(array2d[j][k]);
	}*/