package thisandsuper;
class Employee {
	private int id;
	private String name;
	private float salary;
	public Employee() {
		this.id=100;
		this.name = "Unknown";
		this.salary = 8000;
	}
	public Employee(int id) {
		this();
		this.id=id;
		this.name = "Unknown";
		this.salary = 8000;
	}
	public Employee(int id,String name) {
		//this.id=id;
		this(id);
		this.name = name;
		this.salary = 8000;
	}
	public Employee(int id,String name, float salary) {
		//this.id=id;
		//this.name = name;
		this(id,name);		// calling 2 parameter constructor 
		this.salary = salary;
		
	}
	public void display() {
		System.out.println("id is "+id+" name is "+name+" salary is "+salary);
	}
}
public class ThisParameterExamples {

	public static void main(String[] args) {
	Employee emp1 = new Employee();
	Employee emp2 = new Employee(123);
	Employee emp3 = new Employee(234, "Ravi");
		Employee emp4 = new Employee(345, "Mahesh", 34000);
	emp1.display();
	emp2.display();
	emp3.display();
	emp4.display();
	}

}
