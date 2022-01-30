package com.bridgelabz.Logical;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String [] args){
		int n;
		int First = 0;
		int Second = 1; 
		int Next;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit for fiboncci series : ");
		n = s.nextInt();
		System.out.println("Your Fibonacci series upto " + n + " is : "  );
		System.out.println(First);
		System.out.println(Second);
		Next = First + Second;
		
		while(Next < n) {
			Next = First + Second;
			First = Second;
			Second = Next;
			if(Next > n)
				break;
			System.out.println(Next);
		}


	}
}
