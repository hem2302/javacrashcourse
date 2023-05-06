package com.lao.javalearning;

public class BankAccount {

	Long accountNumber = 123456789l;
	String holderName = "kumar";
	Integer accountBalance = 500;

	public void getBalance() {

		System.out.println("The balance is " + accountBalance);

	}

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.getBalance();
	}

}
