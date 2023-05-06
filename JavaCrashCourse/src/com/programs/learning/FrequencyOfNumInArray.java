package com.programs.learning;

public class FrequencyOfNumInArray {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 20, 40, 50, 10, 10, 20, 20, 40, 50, 10, 20, 20, 40, 50,80};

		
		int[] frequency = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int num = arr[i];
			for (int j = i+1; j < arr.length; j++) {
				if (num == arr[j]) {
					count++;
					frequency[j] = -1;
				}
			}
			if(frequency[i]!=-1) {
				frequency[i]=count;	

			}
		}
		int max = Integer.MIN_VALUE;
		int position=0;
		for(int i=0;i<frequency.length;i++) {
			if(frequency[i]>0) {
				System.out.println(arr[i]+ " Occurs " + frequency[i]+ " times");
			}
			if(frequency[i]>max) {
				max = frequency[i];
				position = i;
			}
		}
		
		System.out.println(max);
		System.out.println(arr[position]+ " Occurs more times ie: "+ max + " times");

	}
}
