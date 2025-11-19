package typecastingobjectlevel.superinterface;
interface A {
	void display1();
}
class B implements A {
	public void display1() {
		System.out.println("B class overriding display1 method");
	}
	void display2() {
		System.out.println("B class its own display2 method");
	}	
}
public class Test {
	public static void main(String[] args) {
		//A obj1 = new A();
		A obj2 = new B();	// creating sub class object super interface reference possible 
		obj2.display1();
		B obj3 = (B)obj2;			// down level type casting 
		obj3.display1();
		obj3.display2();
	}

}
