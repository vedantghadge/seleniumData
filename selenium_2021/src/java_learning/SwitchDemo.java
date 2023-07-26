package java_learning;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
   				
				 Scanner sc=new Scanner(System.in);
					System.out.println("pls enter number");	  
					int number=sc.nextInt(); 	
	  	
	switch (number) {
    
    case 9:
    	 System.out.println("number is equal to 10");
        break;
    
    case 10:
    	System.out.println("number is less than 10");
        break;
   
    case 11:
    	System.out.println("number is greater than 10");
        break;
   
    case 0:
	    System.out.println("number is zero");
	    break;
	
      default:
		
    	  System.out.println("number is negative");
	
	}	sc.close();
	}
    }

