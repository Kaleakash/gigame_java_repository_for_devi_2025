package inheritance;

public class EmployeeTestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details:");
		Employee emp = new Employee();
		emp.readEmp();
		emp.displayEmp();
		System.out.println("\n-----------------------\n");
		System.out.println("\nManager Details:");
		Manager mgr = new Manager();
		mgr.readEmp();	// id,name,salary
		mgr.readMgr();	// numberOfEmployees
		
		mgr.displayEmp(); // id,name,salary
		mgr.displayMgr(); // numberOfEmployees
	}

}
