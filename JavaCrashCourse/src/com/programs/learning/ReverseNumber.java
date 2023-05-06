package com.programs.learning;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		//*** Reverse the Given Number"***
		
		System.out.println("Reverse the given Number***");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to be reversed: ");
		int number = sc.nextInt();
		sc.close();
		
		int reverse;
		
		while(number>0) {
			reverse = number%10;
			System.out.print(reverse);
			number = number/10;
		}
	}
	
}
