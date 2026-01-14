package com;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class AutoboxingAndUnBoxingExamples {

	public static void main(String[] args) {
		// old version 
//		int a=10;
//		Integer b = new Integer(a);	// converting primitive to object 
//		System.out.println(a);
//		System.out.println(b);
//		int c = b.intValue();  // converting object to primitive 
		int a=10;
		Integer b = a;   //	auto-boxing : converting primitive to object.
		int c = b;			// auto-unboxing : converting object to primitive 
		LinkedList hs = new LinkedList();
		hs.add(10);		// aubo-boxing 
		Integer obj = (Integer)hs.get(0); // type casting 
		
		LinkedList<Integer> hs1 = new LinkedList<Integer>();
		hs1.add(100);
		int n = hs1.get(0);		// auto-unboxing
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		Object num[]=al.toArray();	// converting arraylist to object array 
		Integer num1[]=(Integer[])num;
  	}

}
