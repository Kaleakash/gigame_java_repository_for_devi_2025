package callableandrunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable{
	@Override
	public void run() {
		System.out.println("Thread using Runnable ");
		
	}
}
class Task2 implements Callable<String>{
	
	@Override
	public String call() throws Exception {
		System.out.println("Thread using Callable");
		return "Done";
	}
}
public class SimpleExample {

	public static void main(String[] args) {
		// start the thread using Runnable 
		Task1 tt1 = new Task1();
			Thread t1 = new Thread(tt1);
			t1.start();
		
		// when class implements Callable 
		Task2 tt2= new Task2();
		
			ExecutorService executor = Executors.newSingleThreadExecutor();  // create only one thread equal to line 27
				executor.submit(tt2);						// like start 	// equal to like 28 
		
	}

}
