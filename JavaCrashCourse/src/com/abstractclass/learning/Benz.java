package com.abstractclass.learning;

public class Benz extends Car {

	@Override
	public void engineSecret() {
		System.out.println("Benz engine secret");
	}

	@Override
	public void companyVault() {
		System.out.println("Benz company vault");
	}

	@Override
	public void vehicleSecret() {
		System.out.println("Benz vehicle seccret");
	}

	static public void main(String[] args) {
		Car car = new Benz();
		car.engineSecret();
		car.companyVault();
		car.vehicleSecret();
	}

}
