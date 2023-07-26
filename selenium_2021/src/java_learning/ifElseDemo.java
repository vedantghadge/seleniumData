package java_learning;

import java.util.Scanner;

public class ifElseDemo {

	
  public static void main(String[] args) {
		
	   Scanner sc=new Scanner(System.in);
		System.out.println("pls enter number");	  
		int number=sc.nextInt(); 
	  
		if (number % 2==0) {
		  System.out.println("number is even");
	  }
	  
	  else {
		  System.out.println("number  is odd");
	  }
	  
	  
	  sc.close();
	  
	  
	  
	  
	  
	  
	  
	  
	
	
  }
}
  

