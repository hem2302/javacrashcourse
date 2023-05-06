package com.array.learning;

import java.util.Scanner;

public class ArrayLearning {

	public static void main(String[] args) {

		// getting array length from the user
		System.out.println("Enter the Values Length");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();

		System.out.println("the length is " + len);

		// no declare an array based on the given length
		int[] ar = new int[len];

		int total = 0;

		// now getting the array values based on the given length
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Enter the value:  " + i);
			ar[i] = sc.nextInt();
			// At the same time adding the values one by one and finding total values in the
			// array
			total = total + ar[i];
		}

		// now printing array values after adding the values in the array
		System.out.println("The values in the array: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("The addition of the array: " + total);

		String[] stringar = new String[5];
		stringar[0] = "A";

		for (int i = 0; i < stringar.length; i++) {
			System.out.println(stringar[i]);
		}

	}
}
