package com.programs.learning;

public class MergingTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
		int[] arr2 = { 1, 2, 3 };

		int bigArray = arr1.length > arr2.length ? arr1.length : arr2.length;
		int smallArray = arr1.length < arr2.length ? arr1.length : arr2.length;

		int[] arr3 = new int[bigArray];

		for (int i = 0; i < smallArray; i++) {
			arr3[i] = arr1[i] + arr2[i];
		}

		if (arr1.length > arr2.length) {
			for (int i = smallArray; i < arr3.length; i++) {
				arr3[i] = arr1[i];
			}
			if (arr1.length < arr2.length) {
				for (int i = smallArray; i < arr3.length; i++) {
					arr3[i] = arr2[i];
				}

			}

			for (int i = 0; i < arr3.length; i++) {
				System.out.println(arr3[i]);
			}
		}
	}
}
