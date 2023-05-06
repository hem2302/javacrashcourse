package com.abstractclass.learning;

public  class Subworker extends Worker {

	public Subworker() {
		super();
		
	}
	@Override
	public  void getLeaves() {
		System.out.println("I am child get leaves = I dont have leaves");

	}

	@Override
	public void employee() {
		System.out.println("I am a child employee");

	}

	public void thisClassMethod() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		Worker subworker = new Subworker(); //Dynamic Binding/Dynamic polymorphism
		subworker.employee();
		subworker.getLeaves();
		
		
	}

}
