package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		long num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextLong();
		
		int i=1;
		while(i <= num / 2) {
			
			if(num % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		
		if(sum == num)
		{
			System.out.println(num + " is a Perfect Number.");
		}
		
		else {
			
			System.out.println(num + " is not a perfect Number.");
		}
	}

}
