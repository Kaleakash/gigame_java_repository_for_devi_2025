package waitandnotify;
class Task implements Runnable{
	@Override
	public synchronized void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(500);
				System.out.println(name+" "+i);
				if(i==4 && name.equals("Ravi")) {
					wait();
				}
				if(i==6 && name.equals("Raj")) {
					notify();
					wait();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
public class WaitAndNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tt= new Task();
		Thread t1 = new Thread(tt,"Ravi");
		Thread t2 = new Thread(tt,"Raj");
		Thread t3 = new Thread(tt,"Ram");
		t1.start();
		t2.start();
		t3.start();
	}	

}
