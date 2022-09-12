package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int num, reversed = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a original number: ");
		num = sc.nextInt();
		while(num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num / 10;
		}
		System.out.println("Reversed number: " + reversed);
	}

}
