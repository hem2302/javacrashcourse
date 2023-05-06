package com.lao.javalearning;

public class WhileLoopLearning {

	// while is entry control loop
	// do while is exit control loop

	public static void main(String[] args) {

		int times = 0;
		int totalCount = 0;

		// While Loop
		while (times < 25) {
			System.out.println("I can learn Java");
			times++;
			totalCount = times + 1;
		}
		System.out.println("Total count " + totalCount);

		times = 0;

		// Do-While Loop
		do {
			System.out.println("I can learn Java");
			times++;
		} while (times < 25);

	}

}
