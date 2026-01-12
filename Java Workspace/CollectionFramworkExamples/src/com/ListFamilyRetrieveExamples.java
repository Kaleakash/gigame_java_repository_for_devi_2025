package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListFamilyRetrieveExamples {

	public static void main(String[] args) {
	List<String> names  = new ArrayList<String>();
	names.add("Ravi"); names.add("Raju"); names.add("Lokesh");
	System.out.println(names);
	System.out.println("rertireve using for each loop");
	for(String name:names) {
		System.out.println(name);
	}
	System.out.println("using iterator: super interface :only forward direction");
	Iterator<String> li1 = names.iterator();
	while(li1.hasNext()) {
		String name = li1.next();
		System.out.println(name);
	}
	System.out.println("listiterator : sub interface :forward as well as backward direction");
	System.out.println("forward direction");
	ListIterator<String> ll2 = names.listIterator();
	while(ll2.hasNext()) {
		String name = ll2.next();
		System.out.println(name);
	}
	System.out.println("backward direction");
	while(ll2.hasPrevious()) {
		String name = ll2.previous();
		System.out.println(name);
	}
	}

}
