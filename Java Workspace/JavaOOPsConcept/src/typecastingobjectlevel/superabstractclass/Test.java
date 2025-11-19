package typecastingobjectlevel.superabstractclass;

abstract class A {
	abstract void display1();
}
class B extends A {
	
	void display1() {
		System.out.println("B class overriding display1 method");
	}
	void display2() {
		System.out.println("B class its own display2 method");
	}	
}
public class Test {

	public static void main(String[] args) {
//		A obj1 = new A();	// creating super class object 
//		obj1.display1();		// A class its own method 
			B obj2 = new B();	// creating sub class object 
		obj2.display1();		// override method 
		obj2.display2();		// B class its own method 
			A obj3 = new B();	// creating sub class object super class reference possible super class can be abstract class.
			obj3.display1();
				B obj4 = (B)obj3;		// down casting 
			obj4.display1();
			obj4.display2();
//		//B obj4 = new A();		// not possibl e

	}

}
