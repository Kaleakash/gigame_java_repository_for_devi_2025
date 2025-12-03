package copyconstructor;
class Employee {
	String name;
	float salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, float salary) {
		this.name=name;
		this.salary=salary;
	}
	// shallow copies. 
	public Employee(Employee copyEmp) {
		this.name = copyEmp.name;
		this.salary= copyEmp.salary;
	}
	void display() {
		System.out.println("name is "+name);
		System.out.println("salary is "+salary);
	}
}
public class CopyConstructorExamples {

	public static void main(String[] args) {
		Employee emp1= new Employee("Ravi",34000);	// new memory 
	Employee emp2 = new Employee("Raju", 17000);		// new memory 
			Employee emp3 = emp1;		// 				emp3, emp1 refer to same memory deep copies. 
		emp1.display();
		emp2.display();
		emp3.display();
		emp3.salary=35000;
		emp1.display();
		emp3.display();
	Employee emp4 = new Employee(emp2);
		System.out.println("After copy constructor");
		emp4.display();
		emp2.display();
		emp4.salary=18000;
		emp4.display();
		emp2.display();
	}

}
