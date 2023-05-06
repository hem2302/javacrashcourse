package com.lao.javalearning;

public class MultipleIfElseLearning {

	String myFavouriteDish = "Briyani";
	
	public void favouriteDishGuess() {
		if(myFavouriteDish.equals("Sambar Rice")) {
			System.out.println("You thought about Sambar Rice");
		}
		else if(myFavouriteDish.equals("Curd Rice")) {
			System.out.println("You thought about Curd Rice");
		}
		else if(myFavouriteDish.equals("Coriander Rice")) {
			System.out.println("You thought about Coriander Rice");
			}
		else {
			System.out.println("Sorry I can't Guess");
		}
			
	}
	
	public static void main(String[] args) {
		MultipleIfElseLearning multiple = new MultipleIfElseLearning();
		multiple.favouriteDishGuess();
	}

}
