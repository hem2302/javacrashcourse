package com.string.learning;

public class StringBufferLearning {

	public static void main(String[] args) {

		String name = "Hema";

		System.out.println("***STRING IS IMMUTTABLE***");
		System.out.println("String Literal name concat: " + name.concat("kumar"));
		System.out.println("String Literal name now: " + name);

		System.out.println("*******************************************");
		StringBuffer name1 = new StringBuffer("hema");
		
		System.out.println("***STRINGBUFFER IS MUTTABLE***");
		System.out.println("String Buffer concat: " + name1.append("kumar"));
		System.out.println("StringBuffer name after concatinate: " + name1);

	}
}
