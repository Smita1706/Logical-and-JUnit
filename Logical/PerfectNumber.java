package com.bridgelabz.Logical;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String [] args){
		int n ;
		int i;
		int Result = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find its perfect number or not : ");
		n = s.nextInt();

		for(i = 1; i < n; i++) {
			if(n % i == 0) {
				Result += i;
			}
		}
		if(Result == n)
			System.out.println("The number " + n + " is a perfect number");
		else
			System.out.println("The number " + n + " is a not perfect number");
	}
}
