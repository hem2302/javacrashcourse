package com.programs.learning;

public class SecondMaximumInArray {
	public static void main(String[] args) {

		int[] arr = {1,200,3,4,5};
		int firstMax = 0;
		int secondMax=0;
		firstMax=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i+1]>firstMax) {
				
				secondMax = firstMax;
				firstMax = arr[i+1];
			}
			else if(arr[i+1]>secondMax){
				secondMax = arr[i+1];
			}
			
			
		}
		System.out.println(firstMax);
		System.out.println(secondMax);
		
	}

	private static void elseIf(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
