package polymorphism;
class Bike {
	
	void speed() {
		System.out.println("Bike is running at speed 60km/h");
	}
}
class Honda extends Bike {
	void mailage() {
		System.out.println("Honda bike mileage is 70km/litre");
	}
}
class Pulsar extends Bike {
	void mailage() {
		System.out.println("Pulsar bike mileage is 50km/litre");
	}
	@Override
	void speed() {
		System.out.println("Pulsar is running at speed 90km/h");
	}
}	
public class MethodOverridingExample {

	public static void main(String[] args) {
		Honda hondaBike = new Honda();
		hondaBike.speed();  // Inherited method from Bike class
		hondaBike.mailage(); // Honda class method
		Pulsar pulsarBike = new Pulsar();
		pulsarBike.speed();  // Inherited method from Bike class
		pulsarBike.mailage(); // Pulsar class method

	}

}
