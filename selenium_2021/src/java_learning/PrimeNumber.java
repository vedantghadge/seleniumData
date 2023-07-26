package java_learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

	//	Scanner sc = new Scanner(System.in);

	//	System.out.println("Pls enter number");

	//	int num = sc.nextInt();
		
		int num=30;

		boolean flag = false;

		for (int i = 2; i <= num / 2; ++i) {

// condition for nonprime number
			if (num % i == 0) {

				flag = true;

				break;
			}
		}

		if (!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
	}
}