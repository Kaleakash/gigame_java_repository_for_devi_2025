package booking;

class TicketBooking implements Runnable{
	int avl = 3;
	@Override
	public void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
	System.out.println(name+" ready to book the ticket");
	
	
	synchronized (this) {
		
	
	if(avl>0) {
		System.out.println(name+" got the ticket");
		avl = avl-1;
	}else {
		System.out.println(name+" sorry no ticket");
	}
	
	}
	
	System.out.println(name+" ticket booking done may be success or failure");
	}
}
public class BookingApp {

	public static void main(String[] args) {
		TicketBooking tb1 = new TicketBooking();  // avl =3 
		//TicketBooking tb2 = new TicketBooking();  // avl =3 
		Thread t1 = new Thread(tb1,"Raj");
		Thread t2 = new Thread(tb1,"Ravi");
		Thread t3 = new Thread(tb1,"Ajay");
		Thread t4 = new Thread(tb1,"Vikash");
		Thread t5 = new Thread(tb1,"John");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
