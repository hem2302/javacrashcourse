package com.programs.learning;

public class GreatestNumberInArray {
	public static void main(String[] args) {

		int[]arr = {1,2,3,4,5};
		int temp = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		System.out.println(temp);
	}
}
