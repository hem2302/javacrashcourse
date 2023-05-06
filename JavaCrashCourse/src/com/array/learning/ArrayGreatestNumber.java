package com.array.learning;

public class ArrayGreatestNumber {

	public static void main(String[] args) {

		int[] no = { 40, 20, 50 };
		int i = 0;
		Integer big = null;
		//take the innteger min value in the temp variable
		int temp = big.MIN_VALUE;
		//int max = no[i];
		
		while (i <no.length) {
			
			// compare each index value with the temp and find whether the value is greater than the temp value
			if (no[i] > temp) {
				temp = no[i];
				
			}
			i++;
		}
		
		//printing the greatest value in the array
		System.out.println("The max value in the array is :" + temp);
	}
}
