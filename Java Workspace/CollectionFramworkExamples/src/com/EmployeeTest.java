package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		// it store employee object. 
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(45000);
		
		Employee emp2 = new Employee(101, "Raju", 46000);
		System.out.println("Number of object are "+listOfEmployee.size());
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(new Employee(102, "Ajay", 49000));
		System.out.println("Number of object are "+listOfEmployee.size());
		System.out.println("remove object using index");
		//listOfEmployee.remove(0);
		//System.out.println("Number of object are "+listOfEmployee.size());
		System.out.println("Display all object details one by one");
		Iterator<Employee> li = listOfEmployee.iterator();
		while(li.hasNext()) {
			Employee emp = li.next();
			System.out.println(emp);   // it call to String method
			//System.out.println("id is "+emp.getId()+" name is "+emp.getName()+" salary is "+emp.getSalary());
		}
		// remove object using id property 
		Iterator<Employee> li1 = listOfEmployee.iterator();
		while(li1.hasNext()) {
			Employee emp = li1.next();
			if(emp.getId()==100) {
				li1.remove();
			}
		}
		System.out.println("After remvoved");
		System.out.println("number of object are "+listOfEmployee.size());
	}
}
