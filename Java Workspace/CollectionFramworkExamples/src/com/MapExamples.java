package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
	public static void main(String[] args) {
		// HashMap 
//		Map mm1  = new HashMap();
//		mm1.put(2, "Ravi");
//			mm1.put(1, "Ramesh");
//		mm1.put(4, "Raju");
//		mm1.put(3, "Ram");
//		mm1.put("a", "b");
//			mm1.put(1, "Vikash"); 
//		mm1.put("6", "Ravi");
//		System.out.println(mm1);
//		System.out.println(mm1.containsKey(1));
//		System.out.println(mm1.containsValue("Akash"));
//		System.out.println(mm1.get(1));
		
		// LinkedHashMap 
		
//		Map mm1  = new LinkedHashMap();
//		mm1.put(2, "Ravi");
//			mm1.put(1, "Ramesh");
//		mm1.put(4, "Raju");
//		mm1.put(3, "Ram");
//		mm1.put("a", "b");
//			mm1.put(1, "Vikash"); 
//		mm1.put("6", "Ravi");
//		System.out.println(mm1);
//		System.out.println(mm1.containsKey(1));
//		System.out.println(mm1.containsValue("Akash"));
//		System.out.println(mm1.get(1));
		
		// TreeMap 
		Map mm1  = new TreeMap();
		mm1.put(2, "Ravi");
			mm1.put(1, "Ramesh");
		mm1.put(4, "Raju");
		mm1.put(3, "Ram");
		//mm1.put("a", "b");
			mm1.put(1, "Vikash"); 
		mm1.put(6, "Ravi");
		System.out.println(mm1);
		System.out.println(mm1.containsKey(1));
		System.out.println(mm1.containsValue("Akash"));
		System.out.println(mm1.get(1));
	}
}
