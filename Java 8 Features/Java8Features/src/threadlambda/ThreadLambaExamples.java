package threadlambda;

public class ThreadLambaExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()-> {
		    for (int i = 1; i <= 5; i++) {
		        System.out.println(i);
		    }

		};
		
		Thread t = new Thread(r);
		t.start();
		
		new Thread(() ->System.out.println("Thread running - lambda")).start();

	}

}
