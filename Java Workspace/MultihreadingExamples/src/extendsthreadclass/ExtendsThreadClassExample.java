package extendsthreadclass;
class A extends Thread{

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
class B extends Thread{
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
public class ExtendsThreadClassExample {

	public static void main(String[] args) throws Exception{
		A obj1 = new A();		// obj1 is a thread class reference. because is a type of thread 
		B obj2 = new B();		// obj2 is a thread class reference 
		obj1.start();			// read to run. 
		obj2.start();
		Thread.sleep(2000);
		Thread t = Thread.currentThread();
		System.out.println(t);
	}

}
