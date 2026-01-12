package com;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection without generics 
		List ll = new LinkedList();
		ll.add(10);		// auto-boxing automatically convert to Objects. 
			ll.add(10.10);
		ll.add("Ravi");
		ll.add(true);
		System.out.println(ll);
		Object obj = ll.get(0);
		Integer i = (Integer)obj;	// type casting to specific type 
		int n = i.intValue();      // using integer class object we convert to primitive 
		System.out.println(n);
		
		// Collection framework with generics 
		List<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		
		int n1 = ll1.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n1);
		
		
		List<Object> ll2 = new LinkedList<Object>();
		ll2.add(10);		// 10 is primitive first it convert to Integer, then Object. : auto boxing. 
		ll2.add(10.10);
		ll2.add("Ravi");
		
		Object obj2 = ll2.get(1);		// we get in Object. 
		if(obj2 instanceof Integer) {
			Integer i2 =(Integer)obj2;		// down level type casting for Integer. 
			int n2 = i2.intValue();			// converting Integer object to primitive. 
			System.out.println(n2);
		}
		if(obj2 instanceof Double) {
			Double i2 =(Double)obj2;
			double n2 = i2.intValue();
			System.out.println(n2);
		}
		
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(1, "Raju");
		System.out.println(mm);
		
		Map mm1 = new TreeMap();
		TreeMap mm2  = (TreeMap)mm1;
	}

}
