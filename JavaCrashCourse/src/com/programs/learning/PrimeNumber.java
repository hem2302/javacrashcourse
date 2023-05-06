package com.programs.learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Find the given number prime or not***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which need to find prime or not: ");
		int num = sc.nextInt();
		System.out.println(sc.nextLine());

		boolean prime = true;
		for (int i = 3; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("The given number " + num + " is not a prime number");
				prime = false;
				break;
			}
					}
		if (prime == true) {
			System.out.println("The given number " + num + " is a prime number");
		}

	}
}
