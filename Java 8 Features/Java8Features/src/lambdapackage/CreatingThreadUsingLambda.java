package lambdapackage;

public class CreatingThreadUsingLambda {

	public static void main(String[] args) {
			// provided body using anonymous class 
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("Thread is running");
			
		}
	};
	
	Thread t = new Thread(r);
	t.start();
	
	// provided body using lambda method 
	Thread t2 = new Thread(()->System.out.println("Provided body for run method "));
	t2.start();
	
	Thread t3 = new Thread(()->{
		System.out.println("Provided body for run method ");
		System.out.println("Provided body for run method with multi line");
		});
	t3.start();
	}

}
