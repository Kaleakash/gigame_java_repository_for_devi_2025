package implementsrunnableinterface;

class A implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int i=0;i<10;i++) {
			System.out.println("i = "+i);
			try {
			Thread.sleep(500);
			}catch(Exception e) {}
		}
		
	}
	
}
class B implements Runnable{

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		for(int j=0;j<10;j++) {
			System.out.println("j = "+j);
			try {
				Thread.sleep(800);
				}catch(Exception e) {}
		}
		
	}
	
}
public class ImplementsRunnableInterfaceExample {

	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
	
		Thread t1 = new Thread(obj1);		// Thread class constructor ready to take the parameter of that class which implements Runnable 
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
	}

}
