package com.programs.learning;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		//***Swap two numbers using temp variable***
		System.out.println("***Swap two numbers using temp variable***");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter the second number: ");
		int secondNum = sc.nextInt();

		System.out.println("First number is: " + firstNum);
		System.out.println("Second number is: " + secondNum);
		
		int tempNum = 0;
		tempNum =firstNum; 
		firstNum = secondNum;
		secondNum = tempNum;
		System.out.println("Now the First number is: " + firstNum);
		System.out.println("Now the second number is: " + secondNum);
		
		//***Swap two numbers without using temp variable***
		System.out.println("***Swap two numbers without using temp variable***");
		firstNum = firstNum+secondNum; 
		secondNum = firstNum-secondNum; 
		firstNum = firstNum-secondNum;
		System.out.println("Now the First number is: " + firstNum);
		System.out.println("Now the second number is: " + secondNum);
	}
}
