package com.array.learning;

import java.util.Scanner;

public class MultiplicationArray {

	// arr1={4,5,6,7,8}
	// arr2={2,3,4}
	public static void main(String[] args) {

		System.out.println("Enter the array-1 length: ");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int[] arr1 = new int[len];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Enter the array-1 values-" + i + " now: ");
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("Enter the array-2 length: ");
		int len1 = sc.nextInt();

		int[] arr2 = new int[len1];

		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Enter the array-2 values-" + i + " now: ");
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
//		int smallArray = arr1.length < arr1.length ? arr1.length : arr2.length;
//		int bigArray = arr1.length > arr2.length ? arr2.length : arr1.length;

		int small = len < len1 ? len : len1;
		int big = len > len1 ? len : len1;

		int arr3[] = new int[big];

		for (int i = 0; i < small; i++) {
			arr3[i] = arr1[i] * arr2[i];

		}
		
		if(len>len1) {
			for(int i=small;i<arr3.length;i++) {
				arr3[i] = arr1[i];
			}
		}
		else {
			for(int i=small;i<arr3.length;i++) {
				arr3[i] = arr2[i];
			}
		}
		for (int i = 0; i < big; i++) {
			System.out.println("Multiplication: " + arr3[i]);

		}
	}

}
