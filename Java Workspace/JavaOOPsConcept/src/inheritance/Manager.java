package inheritance;

public class Manager extends Employee {
private int numberOfEmployees;

public void readMgr() {
	System.out.print("Enter Number of Employees Managed: ");
	numberOfEmployees = scanner.nextInt();
}
public void displayMgr() {
	System.out.println("Number of Employees Managed: " + numberOfEmployees);
}
}
