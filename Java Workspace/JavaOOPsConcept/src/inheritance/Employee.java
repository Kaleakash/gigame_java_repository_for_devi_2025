package inheritance;

import java.util.Scanner;

public class Employee {

private int id;
private String name;
private double salary;

Scanner scanner = new Scanner(System.in);

public void readEmp() {
	System.out.print("Enter Employee ID: ");
	id = scanner.nextInt();
	scanner.nextLine(); // Consume newline
	System.out.print("Enter Employee Name: ");
	name = scanner.nextLine();
	System.out.print("Enter Employee Salary: ");
	salary = scanner.nextDouble();
}

public void displayEmp() {
	System.out.println("Employee ID: " + id);
	System.out.println("Employee Name: " + name);
	System.out.println("Employee Salary: " + salary);
}

}