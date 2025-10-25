package inheritance;

class A{
	void display1() {
		System.out.println("Class A method called");
	}
}

class B extends A{
	void display2() {
		System.out.println("Class B method called");
	}
}

public class InheritanceDemoExample {
	public static void main(String[] args) {
	A obj1 = new A();
	B obj2 = new B();
	obj1.display1();
	//obj1.display2();
	obj2.display2();
	obj2.display1();
	}

}
