package java_learning;

public class AssignArray1 {

	public static void main(String[] args) {
		// addition of two array element 
	
		int sum1=0;
		
	   int a[][]={{1,2,3},{4,5,6}}  ;
	   
     for( int i=0 ;i<2;i++) {
        for( int j=0 ;j<3;j++)
	{
		sum1=sum1+a[i][j];
	}}
      System.out.println(+sum1);
	} }