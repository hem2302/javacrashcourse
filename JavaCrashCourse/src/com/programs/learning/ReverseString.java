package com.programs.learning;

public class ReverseString {
	public static void main(String[] args) {

		// Using charAt(), length() methods and concatenate operator.

		String name = "madam";

		int length = name.length();
		String reverse = "";
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println("*** Using charAt(), length() methods and concatenate operator***");
		System.out.println("The reversed string is: " + reverse);

		if (name.equals(reverse)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}

		// Using String buffer reverse method inbuilt#

		System.out.println("*** USING STRING BUFFER***");
		StringBuffer name1 = new StringBuffer("Hemakumar");
		System.out.println("The reversed string is: " + name1.reverse());
		
		//Using charArray
		System.out.println("***USING toCharArray***");
		String name2 = "Hemakumar";
		char[] name3 = name2.toCharArray();
		
		String reverse1 = "";
		for(int i = name2.length()-1;i>=0;i--) {
			reverse1 = reverse1+name3[i];
		}
		System.out.println("The reversed string is: "+reverse1);
		
	}
}
