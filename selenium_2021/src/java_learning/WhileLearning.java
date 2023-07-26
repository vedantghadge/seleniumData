package java_learning;

import java.util.Scanner;

public class WhileLearning {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("plz enter your number");
		int i = sc.nextInt();
       
		System.out.println("list of odd number");
		  while(i<=100) {
			  
			  if(i %2 !=0) {
				  System.out.println(i+" ");
				  i++;
			  }sc.close();
			  
		  }
		while (i < 20) 
			System.out.println("given number is  " +i);
			i++;
      
		  

		System.out.println("i am outside the loop");
		 sc.close();
	     }
  
}
