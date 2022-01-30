package com.bridgelabz.Logical;

import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		int i;
		int j;
		int n;
		int Random;
		boolean e = true;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no :");
		n = s.nextInt();
		int [] Array = new int[n];

		for(i = 0; i < n; i++)
		{
			Random = (int)(Math.random() * 100);
			if(e == true)
				Array[i] = Random;
			else
				Array[i] = Random;
			for(j = 0; j < i; j++) {
				if(Array[i] == Array[j]) {
					Array[i] = ' ';
					i--;
				}
			}
		}
		System.out.println("Your coupons are :");
		for(i = 0; i < n; i++) {
			System.out.println(Array[i]);
		}

	}
}
