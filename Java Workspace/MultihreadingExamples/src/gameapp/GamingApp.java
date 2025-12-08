package gameapp;

class Car implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<=10;i++) {
			System.out.println(name+" is moving with speed as "+(i+50)+"km");
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}
public class GamingApp {

	public static void main(String[] args) throws Exception{
	Car cc = new Car();
	Thread t1 = new Thread(cc);
	Thread t2 = new Thread(cc);
	Thread t3 = new Thread(cc);
	Thread t4 = new Thread(cc);
	t1.setName("Car 1");
	t2.setName("Car 2");
	t3.setName("Car 3");
	t4.setName("Car 4");
	System.out.println("car 1 "+t1.isAlive());
	System.out.println("car 2 "+t2.isAlive());
	System.out.println("car 3 "+t3.isAlive());
	System.out.println("car 4 "+t4.isAlive());
	Thread.sleep(1000);
	System.out.println("1...");
	
	Thread.sleep(1000);
	System.out.println("2...");
	Thread.sleep(1000);
	System.out.println("3...");
	System.out.println("Game Start");
	t1.start();
	t2.start();
	t3.start();
	t4.start();
	System.out.println("car 1 "+t1.isAlive());
	System.out.println("car 2 "+t2.isAlive());
	System.out.println("car 3 "+t3.isAlive());
	System.out.println("car 4 "+t4.isAlive());
	t1.join(); // it is waiting to finish the t1 it car 1 thread to destroy 
	t2.join();
	t3.join();
	t4.join();
	System.out.println("Game End");
	}

}
