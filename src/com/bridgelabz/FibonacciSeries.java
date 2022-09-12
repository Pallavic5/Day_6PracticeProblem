package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int firstTerm = 0, secondTerm = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		System.out.println("Fibonacci Series till " + n + " terms: ");
		
		for(int i = 1; i <= n; ++i) {
			
			System.out.println(firstTerm);
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}
