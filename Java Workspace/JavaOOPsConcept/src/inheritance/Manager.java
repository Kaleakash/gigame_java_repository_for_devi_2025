package inheritance;

public class Manager extends Employee {
private int numberOfEmployees;

public void readMgr() {
	System.out.print("Enter Number of Employees Managed: ");
	numberOfEmployees = scanner.nextInt();
	address.readAddress();			// Employee HAS-A Address
}
public void displayMgr() {
	System.out.println("Number of Employees Managed: " + numberOfEmployees);
	address.displayAddress();		// Employee HAS-A Address
}
}
