package statickeyword;

class Abc {
	int a;	// instance variable 
	static int b;	// static variable
	void display1() {
		System.out.println("Non static method");
		System.out.println("a "+a);
		System.out.println("b "+b);
	}
	static void display2() {
		System.out.println("static method");
		//System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class StaticConceptExamples {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.a=100;
		Abc.b=200;		// class name ie static 
		obj1.display1(); 
		Abc.display2(); // class name ie static 

		obj1.b=300;			// static with object 
		obj1.display2();		// static with object 
	}

}
