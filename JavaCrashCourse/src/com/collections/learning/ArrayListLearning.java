package com.collections.learning;

import java.util.ArrayList;

public class ArrayListLearning {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		ArrayList al2 = new ArrayList();
		System.out.println(al.size());
		al.add(90);
		al.add(80);
		al.add(100);
		al.add("hemakumar");
		System.out.println(al);
		al.add(1, "kumar");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("hemakumar"));
		System.out.println(al.get(0));
		System.out.println(al2.addAll(al));
		System.out.println(al2);
	}
}
