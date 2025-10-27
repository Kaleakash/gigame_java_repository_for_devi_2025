package abstractkeyword;
abstract class Bike {
	abstract void speed();
	void mailage() {
		System.out.println("Bike mileage is 50km/litre");
	}
}
abstract class Honda extends Bike {
	
}
class Activa extends Honda {
	@Override
	void mailage() {
		System.out.println("Activa bike mileage is 60km/litre");
	}
	@Override
	void speed() {
		System.out.println("Activa is running at speed 70km/h");
	}
}
class Pulsar extends Bike {
	@Override
	void mailage() {
		System.out.println("Pulsar bike mileage is 50km/litre");
	}
	@Override
	void speed() {
		System.out.println("Pulsar is running at speed 90km/h");
	}
}	
public class AbstractkeywordExample {
	public static void main(String[] args) {
	//	Honda honda = new Honda();
	//	honda.speed();
	// 	honda.mailage();

		Activa activa = new Activa();
		activa.speed();
		activa.mailage();
		Pulsar pulsar = new Pulsar();
		pulsar.speed();
		pulsar.mailage();

	}

}
