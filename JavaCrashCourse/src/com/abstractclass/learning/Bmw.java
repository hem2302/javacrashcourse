package com.abstractclass.learning;

public class Bmw extends Car implements InterfaceLearningUpcomingProjects,Interface2{

	@Override
	public void engineSecret() {
		System.out.println("Bmw engine seccret");
	}

	
	  @Override public void companyVault() {
	  System.out.println("Bmw company vault"); }
	 

	@Override
	public void vehicleSecret() {
		System.out.println("Bmw vehicle secret");
	}

	public static void main() {
		Car car = new Bmw();

		car.engineSecret();
		car.companyVault();
		car.vehicleSecret();
	}


	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	

}
