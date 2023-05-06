package com.polymorphism.learning;

public class OverrideLearningChild extends OverrideLearningParent{

	@Override
	public void marriage() {
	
		System.out.println("Its my wish. I cant marry.");
		
	}
	public static void main(String[] args) {
		
		OverrideLearningParent learningParent = new OverrideLearningChild();
		learningParent.properties();
		learningParent.marriage();
		
	}
}
