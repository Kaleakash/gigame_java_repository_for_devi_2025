package thisandsuper;
class Test1 {
	Test1() {
		this(100);		// calling 1 parameter same class constructor 
		System.out.println("Test1 class empty constructor");
	}
	Test1(int id){
		System.out.println("Test1 (int) parameter");
	}
}
class Test2 extends Test1 {
	Test2() {				// default super call super class empty constructor 
		//this(100);
		//super(100);	// by default present 
		System.out.println("Test2 class empty constructor");
	}
	Test2(int id){
		this();
		System.out.println("Test2 (int) parameter");
	}
}
public class SuperParameterExample {

	public static void main(String[] args) {
		Test2 tt2= new Test2(100);

	}

}
