package com.lao.javalearning;

public class forLoopLearning {

	public static void main(String[] args) {
//for Loop - Initilization, Condition; Increment/Decrement
		int count;
		int totalCount = 0;
		for (int times = 0; times < 25; times++) {
			System.out.println("I can Learn Java");
			totalCount = times + 1;
		}
		System.out.println("Total count " + totalCount);

	}
}
