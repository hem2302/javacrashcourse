package com.lao.javalearning;

// Constructor should be same as the Class Name
// Constructor is to instantiate the newly created object
// Constructor cannot be Abstract, Static and final
// Constructor looks like a class but it is not a class.
// Constructor will be automatically when the class is run
// Types of the constructors - Default, No arguments and parameterised constructor.

// Why constructor cannot be static - Once static is declared it is common across the class members. 
//But constructor is called once the object is newly created. SO there is no use of declaring the constructor as static.

// Can we call a subclass constructor from the super class constructor
//And: NO, There is no way in java to call a subclass constructor from the super class constructor.

//What happens if you keep the return type in the constructor?
//Ans: Constructor must not have a return type. It is has the return type then it is considered as the method.


public class ConstructorsLearning {
	int no;
	String name;

	ConstructorsLearning(int number, String ename) {
		no = number;
		name = ename;
	}

	 ConstructorsLearning() {
		System.out.println(no);
	}

	public void MethodA() {
		System.out.println(no);
		System.out.println(name);

	}

	public static void main(String[] args) {

		ConstructorsLearning learning = new ConstructorsLearning(1, "hemaaa");
		ConstructorsLearning learning1 = new ConstructorsLearning();
		learning.MethodA();

	}
}
