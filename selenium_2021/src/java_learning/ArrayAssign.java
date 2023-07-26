package java_learning;

import java.util.Scanner;

public class ArrayAssign {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);
   System.out.println("enter value=");
	int num=sc.nextInt();
	
	int a[]= {1,2,3,4,5};
	
	for ( int i=0;i<a.length;i++) {
		
		if( a[i]==num) {
			
			num= num + 1;


		     }
	}
	if( num>0) {
		System.out.println("value is  present ");
	              }
	else {
		System.out.println("value is not present");
	}
	
}
}
