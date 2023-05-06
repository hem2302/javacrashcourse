package com.programs.learning;

public class StringReverse {

	public static void main(String[] args) {

		System.out.println("***Reverse the String using length, charAt and concatenate");

		String name = "Hemakumar";

		String reverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);

		System.out.println("Using String Buffer");
		StringBuffer name1 = new StringBuffer("Hemakumar");
		System.out.println(name1.reverse());
		
		System.out.println("Using charArray");
		String name3 = "Hemakumar";
		String reverse1 = "";
		char[] name4 = name3.toCharArray();
	for(int i = name3.length()-1;i>=0;i--) {
		reverse1 = reverse1+name4[i];
		
			}System.out.println(reverse1);
	}
}
