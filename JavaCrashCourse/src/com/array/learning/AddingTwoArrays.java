package com.array.learning;

public class AddingTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = { 5, 6, 7, 8 };
		int[] arr2 = { 4, 5, 6 };

		int len = arr1.length + arr2.length;

		int[] arr3 = new int[len];

		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int j=0;
		for(int i=arr1.length;i<arr3.length;i++) {
			arr3[i]=arr2[j];
			j++;
		}
		for (int i = 0; i<arr3.length;i++) {
			System.out.println(arr3[i]);
		}
	}
}
