package com.lao.javalearning;

public class StaticLearning {

	static {
		System.out.println("I am 1st static block");
	}
	static {
		System.out.println("I am 2nd static block");
	}

	public static void method1() {
		System.out.println("I am static method");
	}

	public static void main(String[] args) {
		StaticLearning staticlearn = new StaticLearning();
		method1();
	}

}
