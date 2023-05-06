package com.array.learning;

public class ArraySmallestNumber {

	public static void main(String[] args) {

		int[] no = { 50, 40, 12, 10 };
		int i = 0;
		
		//assigning the array first value in the temp variable
		int temp = no[i];

		while (i < no.length-1) {
			i++;
			//compare from 2nd value of the array with temp and add it to temp value based on the condition
			if (no[i] < temp) {
				temp = no[i];
			}
		}
		
		//print the smallest value
		System.out.println("The smallest number in the array is :" + temp);
	}
}