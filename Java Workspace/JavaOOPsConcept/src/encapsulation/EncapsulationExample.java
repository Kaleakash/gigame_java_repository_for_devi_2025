package encapsulation;

public class EncapsulationExample {
	public static void main(String[] args) {
		Employee emp = new Employee();
		//emp.id=-100;
		//emp.name="John Doe";
		emp.setValue(101, "John Doe");
		emp.display();
	}
}
