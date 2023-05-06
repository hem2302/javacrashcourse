package com.lao.javalearning;

public class SwitchCaseLearning {

	// Switch Case is used in case of lot of conditions like 6, 7 or more than that.
	// It will be looked organised and look and feel in case of using switch case.
	// Switch case will execute all the conditions once the first case is satisfied.
	// So to avoid this break should be added

	String myFavouriteDish = "Sambar Rice";

	public void myFavouriteDishGuess() {
		switch (myFavouriteDish) {
		case "Sambar Rice":
			System.out.println("You thought about Sambar Rice");
//			break;
		case "Curd Rice":
			System.out.println("You thought about Curd Rice");
//			break;
		case "Coriander Rice":
			System.out.println("You thought about Coriander Rice");
//			break;
		case "Tomato Rice":
			System.out.println("You thought about Tomato Rice");
//			break;
		default:
			System.out.println("Sorry cannot guess your Favourite Dish");

		}
	}

	public static void main(String[] args) {

		SwitchCaseLearning switchLearning = new SwitchCaseLearning();
		switchLearning.myFavouriteDishGuess();
	}

}
