package com.programs.learning;

public class FindOccuranceOfCharInString {
	public static void main(String[] args) {
		
	String input = "Hemakumar Chinnaiah";
	char c = 'a';
	int frequency = 0;

	input = input.toLowerCase();

	for (int i = 0; i < input.length(); i++) {
		if (c == input.charAt(i)) {
			frequency++;
		}
	}
	System.out.println("The a occurs " +frequency+ " times");
}

}
