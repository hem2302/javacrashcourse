package com.polymorphism.learning;



public class PolymorphismLearning {

	public int add(int num1, int num2) {
		return num1 + num2;

	}

	public int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;

	}

	public float add(float num4, float num5) {
		return num4+num5;
		

	}

	public static void main(String[] args) {

		PolymorphismLearning learning = new PolymorphismLearning();
		System.out.println("The int add two numbers " + learning.add(1, 1));
		System.out.println("The int add three numbers " + learning.add(1, 2, 3));
		System.out.println("The float add two numbers "+ learning.add(1.5f, 2.6f));
	}
}
