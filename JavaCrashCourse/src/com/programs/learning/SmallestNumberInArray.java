package com.programs.learning;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,67};
		int smallestNumber = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallestNumber)
			smallestNumber = arr[i];
		}
		System.out.println("The smallest Number in the given array is: "+ smallestNumber);
	}
}
