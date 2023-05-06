package com.abstractclass.learning;

public class Worker {
	
	
	public Worker() {
		this(20);
		System.out.println("I am the public constructor from the parent class");
	}

	private Worker(int speed) {
		System.out.println("I am the private constructor from the Abstract class");
	}
//	public abstract void work();

	public void work() {
		System.out.println("I am the parent class work");
	}

	public void getLeaves() {
		System.out.println("I dont have leaves");

	}

	public void employee() {
		System.out.println("I am an Employee");

	}

	
	public static void main(String[] args) {

	}
}
