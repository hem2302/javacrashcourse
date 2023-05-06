package com.programs.learning;

public class ExtractNumbersfromStringAndAdd {

	public static void main(String[] args) {
		int total = 0;
		String input = "Hemakumar123456";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				total = total + Character.getNumericValue(c);
			}
		}
		System.out.println(total);
	}
}
