package com.bridgelabz.Logical;

import java.util.Scanner;

public class StopWatch {
	public static void main(String[] args) {
		double start ;
		double stop;
		double ElapsedTime;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter 1 to start the clock");

		start = s.nextDouble();
		start = System.currentTimeMillis();

		System.out.println("Enter 0 to stop the clock");
		stop = s.nextDouble();
		stop = System.currentTimeMillis();

		ElapsedTime = (stop - start) / 1000;
		System.out.println("Elapsed time is " + ElapsedTime + " seconds");

	}	
}
