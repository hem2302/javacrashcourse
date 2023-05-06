package com.programs.learning;

import java.util.Scanner;

public class NumberLength {

	public static void main(String[] args) {

		//***Find Length of the Given Number***
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find the length: ");
		int number = sc.nextInt();
		int count = 0;
		while(number>0) {
			number = number/10;
			count++;
		}
		System.out.println("Length of the given number is: " + count);
	}
}
