package com.programs.learning;

import java.util.Scanner;

public class FindPositionOfAlphabet {
	public static void main(String[] args) {

		// ASCII value for Upper case starts from 65
		//ASCII value for Lower case starts from 97
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character");
		char character = sc.next().charAt(0);
		
		//System.out.println(character);
		Character.toLowerCase(character);
		character = Character.toUpperCase(character);

		int asciiValue = (int)character;
		//int positionLowerCase = asciiValue-96;
		int positionUpperCase = asciiValue-64;
		
		//System.out.println("The postion of the given character in lower case is: " + positionLowerCase);
		System.out.println("The position of the given character in upper case is: "+ positionUpperCase);
	}
}
