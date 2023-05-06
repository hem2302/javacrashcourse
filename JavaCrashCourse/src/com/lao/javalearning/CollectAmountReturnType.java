package com.lao.javalearning;

public class CollectAmountReturnType {

	int toBeCollected = 5000;

	public int collectAmountAndGetToMe() {
		System.out.println("Collected the amount " + toBeCollected);
		return toBeCollected;
	}

	private int CollectedAddedAmpount(int aa, int bb, int cc) {

		int addition = aa + bb + cc;
		return addition;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectAmountReturnType amount = new CollectAmountReturnType();
		int yesCollected = amount.collectAmountAndGetToMe();
		System.out.println("Amount collected and returned to you " + yesCollected);

		int finalAddition = amount.CollectedAddedAmpount(200, 300, 400);
		System.out.println("The addition of the values :" + finalAddition);
	}

}
