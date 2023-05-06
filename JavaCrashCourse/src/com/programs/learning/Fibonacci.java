package com.programs.learning;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		//fibonacci series 0,1,1,2,3,5,8 ......

		System.out.println("Enter the length of the fibonacci series: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		int first = 0;
		int second = 1;
		int third;

		System.out.println(first);
		for (int i = 0; i < len; i++) {

			third = first + second;
			first = second;
			second = third;
			System.out.println(third);

		}

	}
}
