package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
//	Employee emp = new Employee();
//	emp.setId(100);
//	emp.setName("Ravi");
//	emp.setSalary(45000);
//	System.out.println(emp);
//	// once program finish object GC garbage collector 
//	FileOutputStream fos = new FileOutputStream("employee.ser");
//	ObjectOutputStream oos = new ObjectOutputStream(fos);
//	oos.writeObject(emp);
//	System.out.println("object serialization done successfully");
//		
	FileInputStream fis = new FileInputStream("employee.ser");
	ObjectInputStream ois = new ObjectInputStream(fis);
	Object obj= ois.readObject();
	// down level type casting 
	Employee emp2 = (Employee)obj;
	System.out.println(emp2);  // call toString method 
	}

}
