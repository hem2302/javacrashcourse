package com.collections.learning;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsLearningInterview {

	public static void main(String[] args) {

		int length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Length you required: ");
		length = sc.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<arr.length;i++) {
			System.out.println("Enter the Array" +i+ "now ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("*****After convertig Array to ArrayList");
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for(Integer o: arr) {
			System.out.println(o);
		}
		
	}
}
