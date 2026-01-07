package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
	//1st Examples 
//		HashSet hs = new HashSet();
//		System.out.println("size "+hs.size());
//		System.out.println("isEmpty "+hs.isEmpty());
//		hs.add(10);
//		hs.add(10.10);
//		hs.add("Ravi");
//		hs.add(true);
//		System.out.println("size "+hs.size());
//		System.out.println("isEmpty "+hs.isEmpty());
//		System.out.println(hs);    // it display data in string format 
//		hs.remove(10);
//		System.out.println(hs);
//		System.out.println("search "+hs.contains(10));
//		System.out.println("search "+hs.contains("Ravi"));
		
		// 2nd Examples 
		//HashSet hs = new HashSet();		// unorder 
		//LinkedHashSet hs = new LinkedHashSet(); // order 
		TreeSet hs = new TreeSet();
		hs.add(3);
		hs.add(1);
		hs.add(5);
		//hs.add("A");
			hs.add(3);
		hs.add(8);
		hs.add(9);
		hs.add(4);
		System.out.println(hs);
		System.out.println(hs.tailSet(4));
		System.out.println(hs.headSet(4));
		System.out.println(hs.subSet(3, 8));
	}

}
