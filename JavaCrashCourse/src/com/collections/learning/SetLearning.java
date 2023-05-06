package com.collections.learning;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetLearning {
	public static void main(String[] args) {

		// LinkedHashSet doesn't allow the duplicate values.
		//LinkedHashSet maintains the insertion order.
		
		LinkedHashSet ll = new LinkedHashSet();
		 
		ll.add(10);
		ll.add(20);
		ll.add(20);
		ll.add(50);
		ll.add(50);
		System.out.println(ll);
		
		//HashSet doesn't allow the duplicate values.
		//HashSet doesn't maintain the insertion order.
		HashSet lll = new HashSet();
		 
		lll.add(10);
		lll.add(20);
		lll.add(20);
		lll.add(50);
		lll.add(50);
		System.out.println(lll);
	}
}
