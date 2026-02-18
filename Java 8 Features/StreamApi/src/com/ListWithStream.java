package com;

import java.util.Iterator;
import java.util.List;

public class ListWithStream {

	public static void main(String[] args) {
	List<Integer> ll1 = List.of(1,2,3,4,5,6,7,8,9,10,10,4);
//	Iterator<Integer> li = ll1.iterator();
//	while(li.hasNext()) {
//		int n = li.next();
//		//System.out.print(" "+n);
//		if(n%2==0) {
//			//System.out.print(" "+n);
//			System.out.print(" "+(n+10));
//		}
//	}
	
	// convert collection to stream 
	//ll1.stream().forEach(v->System.out.print(" "+v));				// display data 
	//ll1.stream().filter(v->v%2==0).forEach(v->System.out.print(" "+v));	// even with filter 
	//ll1.stream().filter(v->v%2!=0).forEach(v->System.out.print(" "+v));	// odd with filter 
	//ll1.stream().map(m->m+100).forEach(v->System.out.print(" "+v));		// add 100 for each elements 
	
	//ll1.stream().distinct().forEach(v->System.out.print(" "+v));
	//ll1.stream().limit(5).forEach(v->System.out.print(" "+v));
	boolean res = ll1.stream().anyMatch(p->p>9);
	System.out.println(res);
	}

}
