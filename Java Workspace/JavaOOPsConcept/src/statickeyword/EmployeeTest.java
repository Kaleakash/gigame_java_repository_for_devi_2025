package statickeyword;
class Employee {
	int empId;		// instance variable 
	static int mgrId;	// static variable , only one copy of mgrId;
	void display() {
		System.out.println("id is "+empId);
		System.out.println("mgrid is "+mgrId);
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
	Employee emp1 = new Employee();	// heap memory created empId=0,
	Employee emp2 = new Employee();	// heap memory created empId=0;
		emp1.empId=100;				//		empId in 1st memory 100
	emp2.empId=200;				// empId in 2nd memory 200 
	emp1.mgrId=300;				// in one copy mgrId  -300;
	emp2.mgrId=400;				// in same memory mgrId 400
	Employee.mgrId=500;			// in same memory mgrId 500
	emp1.display();    // empId = 100, mgrId = 500
	emp2.display();    // empId = 200, mgrId = 500
	}
	

}
