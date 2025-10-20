
public class App {
	public static void main(String[] args) {
//		Car innova = new Car();	// memory created
//		innova.start();
//		innova.stop();
//		
//		Car swift = new Car();	// memory created
//		swift.start();
//		swift.stop();
		
//		Car innova = new Car();	// memory created
//		innova.color = "White";
//		innova.price = 3800000;
//		innova.wheel = 4;
//		innova.printCarDetails("Innova");
//		
//		double carPrice=	innova.getCarPrice();
//		System.out.println("Innova Price: " + carPrice);
//		System.out.println("--------------");
//		Car swift = new Car();	// memory created
//		swift.color = "Red";
//		swift.price = 1500000;
//		swift.wheel = 4;
//		swift.printCarDetails("Swift");
		
		Car innova =new Car();			// empty constructor 
		
		innova.printCarDetails("Innova");
		innova.color = "White";
		innova.price = 3800000;
		//innova.wheel = 4;
		innova.printCarDetails("Innova");
		System.out.println("--------------");
		Car swift =new Car();			// empty constructor
		swift.printCarDetails("Swift");
		swift.color = "Red";
		swift.price = 1500000;
		//swift.wheel = 4;
		swift.printCarDetails("Swift");
		System.out.println("--------------");
		Car baleno =new Car(4, 1400000, "Blue");	// parameterized constructor
		baleno.printCarDetails("Baleno");

		Car	 duster =new Car(4, 1600000, "Grey");	// parameterized constructor
		duster.printCarDetails("Duster");
	}
}
