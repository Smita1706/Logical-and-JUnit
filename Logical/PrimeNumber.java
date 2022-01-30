package com.bridgelabz.Logical;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String [] args){
		int n;
		int i;
		int Prime = 1;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check it si prime or not :");
		n = s.nextInt();

		for(i = 2; i < n; i++) {
			if(n % i == 0)
				Prime = 0;
		}
		
		if(Prime == 0)
			System.out.println("The number " + n + " is not a prime number");
		else
			System.out.println("The number " + n + " is a prime number");
	}
}
