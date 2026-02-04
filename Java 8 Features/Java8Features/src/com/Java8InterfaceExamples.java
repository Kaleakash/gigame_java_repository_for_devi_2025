package com;

@FunctionalInterface
interface Abc {
	void dis1();		// abstract method 
	
	default void dis2() {
		System.out.println("dis2 default method");
	}
	default void dis3() {
		System.out.println("dis3 default method logic");
	}
	static void dis4() {
		System.out.println("dis4 static method");
	}
	static void dis5() {
		System.out.println("dis5 default method");
	}
}
class Test implements Abc {
	@Override
	public void dis1() {
	System.out.println("need to provide the body for dis1 method because abstract method");
	}
	@Override
	public void dis2() {
		System.out.println("defult method ie dis2 can be override");
	}
}
public class Java8InterfaceExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test tt = new Test();
		tt.dis1();
		tt.dis2();
		tt.dis3();
		Abc.dis4();	// static need to call using interface name 
		Abc.dis5();
	}

}
