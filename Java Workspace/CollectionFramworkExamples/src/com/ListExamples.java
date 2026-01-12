package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListExamples {

	public static void main(String[] args) {
	//1st examples 
//		ArrayList al = new ArrayList();
//		al.add(10);					// before storing they are primitive but after stored they consider as object ie auto-boxing 
//		al.add("Ravi");				// converting primitive to object : auto-boxing 
//		al.add(20);
//		al.add(30);
//		al.add(true);
//		System.out.println(al);
//		System.out.println("get the value using index "+al.get(1));
//			al.add(1, "Ram");	// added element in between 
//		System.out.println("get the value using index "+al.get(1));
//		System.out.println(al);
//		al.remove(1);		// remove using index position 
//		Integer value = 20;		// value consider as object 
//			al.remove(value);		// remove using value 
//		System.out.println(al);
//		LinkedList ll = new LinkedList();
//		ll.add(10);
//		ll.add(20);
//		ll.add(30);
//		ll.addFirst(40);// before 10 
//		ll.addLast(50);
//		System.out.println(ll);
//		ll.remove(2);
//		System.out.println(ll);
//			ll.add(3, 1000);
//		System.out.println(ll);
		
		Stack ss = new Stack();
		ss.push(100);				
		ss.push(200);
		ss.push(300);
		System.out.println(ss);
		System.out.println("pop operation "+ss.pop()); 
		System.out.println(ss);
		System.out.println("peek operation "+ss.peek()); 
		System.out.println(ss);
		System.out.println("search "+ss.search(200));
		System.out.println("search "+ss.search(100));
		System.out.println("search "+ss.search(1000));
	}

}
