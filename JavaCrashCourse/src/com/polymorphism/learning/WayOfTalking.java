package com.polymorphism.learning;

public class WayOfTalking {

	public void talk(Parents talkingType) {
		System.out.println("I'll talk polite and respectful");

	}

	public void talk(Boss talkingType) {
		System.out.println("I'll talk only in official manner");

	}

	public void talk(Lover talkingType) {
		System.out.println("I'll talk romantic and with love");

	}

	public static void main(String[] args) {

		WayOfTalking talking = new WayOfTalking();
		Parents parents = new Parents();
		talking.talk(parents);
		
		Boss boss = new Boss();
		talking.talk(boss);
		
		Lover lover = new Lover();
		talking.talk(lover);
	}
}
