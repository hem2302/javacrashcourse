package com.programs.learning;

import java.util.Collections;

public class ReverseSentence {

	public static void main(String[] args) {
		System.out.println("***Reverse the words in a given sentence***");
		String sentence = "I Love India";
		String reverse = "";
		String[] stringArray = sentence.split(" ");
		for (int i = stringArray.length - 1; i >= 0; i--) {
			reverse = reverse + stringArray[i];
			System.out.print(stringArray[i] + " ");
		}
	
		System.out.println("***Using reverse method***");
		StringBuffer buffer = new StringBuffer("I Love India");
		System.out.println("After reversing: " + buffer.reverse());
	}

}
