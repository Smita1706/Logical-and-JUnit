package com.bridgelabz.Logical;

import java.util.Scanner;
public class ReverseNumber {
	public static void main(String [] args){
		int n;
		int i;
		int Result;
		int Reverse = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to reverse it : ");
		n = s.nextInt();
		while(n != 0) {
			Result = n % 10;
			Reverse = ((Reverse * 10) + Result);
			n = n / 10;
		}
		System.out.println("The reversed number is :" + Reverse);
	}
}
