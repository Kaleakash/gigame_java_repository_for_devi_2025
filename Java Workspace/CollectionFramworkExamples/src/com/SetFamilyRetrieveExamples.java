package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetFamilyRetrieveExamples {

	public static void main(String[] args) {
		
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(10);ss.add(20);ss.add(30);
		System.out.println(ss);
		System.out.println("retrieve element from set using for each loop");
		for(int n : ss) {
			System.out.println(n);		// it is use to display one by one 
		}
		System.out.println("retreive using Iterator");
		Iterator<Integer> li = ss.iterator();	// iterator is a method part of set and return type of iterator is Iterator interface reference. 
		while(li.hasNext()) {		// hasnext check element present it become true. 
			int n = li.next();		// retrieve that element 
			System.out.println(n);

			//li.remove();		display as well as we can remove also. 
		}
	}

}
