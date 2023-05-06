package com.lao.javalearning;

public class IfElseLearning {
	// int default type is 0
	// boolean default type is False
	// String default type is Null

	boolean isCupEmpty = true;

	public static void main(String[] args) {
		IfElseLearning coffee = new IfElseLearning();

		// ***IF-ELSE CONDITION***

		if (coffee.isCupEmpty) {
			System.out.println("Fill the cup");
		} else {
			System.out.println("Coffee cup is Empty");
		}
	}
}
