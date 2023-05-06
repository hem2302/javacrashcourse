package com.collections.learning;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearning {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(20);
		al.add(30);
		al.add("hema");
		al.add("kumar");
		al.add("chennai");
		al.add(100);

		System.out.println("The arraylist " + al);

		Iterator i = al.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
			if(i.next().equals("hema"))
				i.remove();
		}

		System.out.println("***for each***");
		for(Object a: al) {
			
			System.out.println(a);
		}
	}
}
