package com;

public class ThrowsExample {

	static void display1() throws Exception{
		//try {
		int result = 100/0;
		//}catch(Exception e) {}
		System.out.println("display1");
	}
	static void display2() throws Exception{
		//try {
		display1();
		//}catch(Exception e) {}
		System.out.println("dispay2");
	}
	public static void main(String[] args) throws Exception{
		//try {
		display2();	
		//}catch(Exception e) {}
		System.out.println("main");
	}

}
