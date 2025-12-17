package callableandrunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Callable<Thread>{
	@Override
	public Thread call() throws Exception {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println(t);
		return t;
	}
}
public class ExecutorServiceExamples {

	public static void main(String[] args) {
		Task tt = new Task();
		//ExecutorService es =Executors.newSingleThreadExecutor(); // only one thread task 5 
		//ExecutorService es =Executors.newFixedThreadPool(3);	// 3 thread task 5 
		//ExecutorService es =Executors.newCachedThreadPool();
		ExecutorService es =Executors.newScheduledThreadPool(3);
		for(int i=0;i<10;i++) {
			es.submit(tt);
		}
		
		
		es.shutdown(); // terminate 
	}

}
