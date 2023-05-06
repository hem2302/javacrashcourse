package com.string.learning;

public class StringLearning {


	public static void main(String[] args) {

	String name = "HEMAKUMARCHINNAIAH1986";
	
	char[] ch = name.toCharArray();
	for(int i=0;i<ch.length;i++) {
		System.out.println(ch[i]);
			}
	
	System.out.println("Last index of " + name.lastIndexOf('N'));

	}
	
}
