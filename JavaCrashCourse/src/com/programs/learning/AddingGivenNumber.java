package com.programs.learning;

import java.util.Scanner;

public class AddingGivenNumber {
	// ***Addition of the digits in the given Number***

	public static void main(String[] args) {
		System.out.println("***Addition of the digits in the given number***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to add the digits in it: ");
		sc.close();
		int number = sc.nextInt();
		int total = 0;
		while (number > 0) {
			total = total + number % 10;
			number = number / 10;
		
	}
		System.out.println("Addition of the digits in the given number: "+ total);

}
}
