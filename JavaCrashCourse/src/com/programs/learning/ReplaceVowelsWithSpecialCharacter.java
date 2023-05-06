package com.programs.learning;

public class ReplaceVowelsWithSpecialCharacter {
public static void main(String[] args) {
	
	String input = "Hemakumar Chinnaiah";
	
	char[] c = input.toCharArray();
	
	for(int i=0;i<input.length();i++) {
		if(input.charAt(i)=='A' ||input.charAt(i)=='E'||input.charAt(i)=='I'||input.charAt(i)=='O'||input.charAt(i)=='U'||input.charAt(i)=='a'
				||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u') {
			c[i] = '*';
		}
		
	}
	for(int i=0;i<input.length();i++) {
		System.out.print(c[i]);
	}
	
	//using regular expression
	String replaceText = input.replaceAll("[AEIOUaeiou]", "\\$");
	System.out.println(replaceText);
}
}
