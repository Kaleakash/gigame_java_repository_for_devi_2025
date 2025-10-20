
public class Car {
	int wheel;
	double price;
	String color;		// instance variable 
	
	Car() {
		System.out.println("Car object created");
		wheel = 4;
		price = 1000000;
		color = "Black";
	}
	// parameterized constructor, parameters are local variables
//	Car(int wheel1, double price1, String color1) {	// wheel1, price1, color1 are local variables
//		System.out.println("Car object created - with parameters");
//		wheel = wheel1;			// instance variable = local variable
//		price = price1;
//		color = color1;
//	}
	// local variable and instance variable have same name
	Car(int wheel, double price, String color) {	// wheel1, price1, color1 are local variables
		System.out.println("Car object created - with parameters");
		this.wheel = wheel;			// instance variable = local variable
		this.price = price;
		this.color = color;
	}
	
	void start() {
		System.out.println("Car started");
	}
	void stop() {
		System.out.println("Car stopped");
	}
	void printCarDetails(String carName) {
		String msg="Car Details: ";				// local variable 
		msg = msg + carName;
		System.out.println(msg);
		System.out.println("Car color: " + color);
		System.out.println("Car price: " + price);
		System.out.println("Car wheel: " + wheel);
	}
	
	double getCarPrice() {
		return price;
	}
}
