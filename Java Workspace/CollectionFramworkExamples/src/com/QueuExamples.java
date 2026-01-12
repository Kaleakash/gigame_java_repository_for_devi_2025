package com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuExamples {

	public static void main(String[] args) {
	// Priority Queue 
		Queue queue1 = new PriorityQueue();
		queue1.add(6);queue1.add(1);queue1.add(5);queue1.add(3);queue1.add(4);
		System.out.println(queue1);
		System.out.println("remove element "+queue1.poll());
		System.out.println(queue1);
		// Priority Queue 
		Queue queue2 = new LinkedList();
		queue2.add(6);queue2.add(1);queue2.add(5);queue2.add(3);queue2.add(4);
		System.out.println(queue2);
		System.out.println("remove element "+queue2.poll());
		System.out.println(queue2);

	}

}
