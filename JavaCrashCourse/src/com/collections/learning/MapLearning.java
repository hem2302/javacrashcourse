package com.collections.learning;

import java.util.HashMap;

public class MapLearning {

	   static public void main(String[] args) {
		
		   HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		   hashmap.put(1,"Hemakumar");
		   hashmap.put(null, "kumar");
		   hashmap.put(null, null);
		   System.out.println(hashmap);
		   
		   HashMap<Integer, String> hashmap2 = new HashMap<Integer, String>();
		   hashmap2.putAll(hashmap);
		   System.out.println(hashmap2);
		   
		   hashmap.remove(1);
		   System.out.println(hashmap);
	}
}
