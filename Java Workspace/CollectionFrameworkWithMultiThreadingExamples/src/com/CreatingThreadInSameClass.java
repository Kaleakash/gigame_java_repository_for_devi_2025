package com;

public class CreatingThreadInSameClass {

	public static void main(String[] args) {
		
		System.out.println("-------");
		Thread t2 = new Thread(()->{
			Thread t= Thread.currentThread();
			System.out.println(t);
		});
		t2.start();
		Thread t3 = new Thread(()->{
			Thread t= Thread.currentThread();
			System.out.println(t);
		});
		t3.start();
	}
	

}
