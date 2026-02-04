package lambdapackage;

interface Hello {
	public void sayHello();
	
}
class HelloImp implements Hello {
	@Override
	public void sayHello() {
		System.out.println("Provided body for sayHello method using separate class.");
	}
}
interface Printer {
	public void print();
}
public class LambdaExamples {

	public static void main(String[] args) {
		// 1st way 
		Hello obj1 = new HelloImp();
		obj1.sayHello();
		// 2nd way providing body for sayHello method using anonymous class 
		Hello obj2 = new Hello() {
			@Override
			public void sayHello() {
				System.out.println("Provided body for sayHello method using anonymous class with 1st say");
			}
		};
		obj2.sayHello();
		
		Hello obj3 = new Hello() {
			@Override
			public void sayHello() {
				System.out.println("Provided body for sayHello method using anonymous class with 2nd say");
			}
		};
		obj3.sayHello();
		Printer p1 = new Printer() {
			
			@Override
			public void print() {
			System.out.println("Print message in black and white");
				
			}
		};
		p1.print();
		Printer p2 = new Printer() {
			
			@Override
			public void print() {
			System.out.println("Print message in color");
				
			}
		};
		p2.print();
		
		// providing body for sayHello method using anonymous method ie lambda 
		Hello obj4 = ()->System.out.println("Provided body for sayHello method using lambda style");
		obj4.sayHello();
	}

}
