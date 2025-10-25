package encapsulation;

public class Employee {
	private int id;
	private String name;
	public void setValue(int id, String name) {
	//	this.id = id;
		if(id >0) {
			this.id = id;
		} else {
			this.id = 1;
			System.out.println("Invalid ID. ID should be positive.");
		}
		this.name = name;
	}
	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
}
