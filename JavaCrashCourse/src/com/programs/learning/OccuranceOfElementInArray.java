package com.programs.learning;

public class OccuranceOfElementInArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,2,3,3,3,4,5};
		int key = 3;
		int count = 0;
		boolean occ = false;
		for(int i=0;i<arr.length-1;i++) {
			
			if(key==arr[i]) {
				count++;
				occ = true;
			}
		}
		
		if(occ = true) {
			System.out.println("The given number present in an array and it occured "+ count +" times.");
		}
		else
			System.out.println("The given number is not present in an array.");
	}
}
