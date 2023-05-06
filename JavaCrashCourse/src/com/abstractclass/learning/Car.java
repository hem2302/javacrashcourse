package com.abstractclass.learning;

public abstract class Car {

	public abstract void engineSecret();

	/*
	 * { System.out.println("Main Car engine secret"); }
	 */
	public abstract void companyVault();
	/*
	 * { System.out.println("Main Car company vault"); }
	 */

	public void vehicleSecret() {
		System.out.println("Main car vehicle secret");
	}

}
