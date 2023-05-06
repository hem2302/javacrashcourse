package com.programs.learning;

import java.util.Scanner;

public class Factorial {

	public int factorialRecursive(int num) {
		if (num == 0) {
			return 1;
		}

		return num * factorialRecursive(num - 1);

	}

	public static void main(String[] args) {

		// factorial 5! = 5*4*3*2*1

		int i = 1;
		int factorial = 1;

		System.out.println("Enter the factorial range: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		sc.close();

		for (i = 1; i <= len; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}

		Factorial factorial2 = new Factorial();
		System.out.println(factorial2.factorialRecursive(5));
	}
}
