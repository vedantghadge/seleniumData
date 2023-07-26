    package java_learning;

import java.util.Scanner;

public class OddEven2 {

	public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("plz enter number");
        int i=sc.nextInt();	
	
	while(i<=50) {
		if(i % 2 != 0) 
			i++;
			System.out.println("given number is odd ");
   	
	}
	sc.close();
	}


}