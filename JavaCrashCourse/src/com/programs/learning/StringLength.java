package com.programs.learning;

public class StringLength {
	public static void main(String[] args) {
		//***Find String length without using length function***

		String name = "Hemakumar";
		char[] name1 = name.toCharArray();
		
		int length = 0;
		for(char c:name1) {
			
			length ++;
		}
		System.out.println("The length of the string is: "+length);
		
	}
}
