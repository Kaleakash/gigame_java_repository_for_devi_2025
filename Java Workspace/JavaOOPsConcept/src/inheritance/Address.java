package inheritance;

import java.util.Scanner;

public class Address {
private String city;
private String state;
Scanner scanner = new Scanner(System.in);
public void readAddress() {
	System.out.print("Enter City: ");
	city = scanner.nextLine();
	System.out.print("Enter State: ");
	state = scanner.nextLine();	
}
public void displayAddress() {
	System.out.println("City: " + city);
	System.out.println("State: " + state);
}

}
