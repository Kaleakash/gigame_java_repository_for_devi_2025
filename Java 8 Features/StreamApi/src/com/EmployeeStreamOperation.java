package com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeStreamOperation {

	public static void main(String[] args) {
	List<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(2, "Raj", 45000));
	listOfEmp.add(new Employee(1, "Vikash", 48000));
	listOfEmp.add(new Employee(3, "Ajay", 43000));
//	listOfEmp.stream().forEach(v->System.out.println(v));
	//listOfEmp.stream().filter(e->e.getSalary()>=45000).forEach(v->System.out.println(v));
	//listOfEmp.stream().map(v->v.getName()).forEach(v->System.out.println(v));
	//listOfEmp.stream().sorted((e1,e2)->e1.getId()-e2.getId()).forEach(e->System.out.println(e));
	
//	List<Employee> result = listOfEmp.stream().filter(e->e.getSalary()>45000).collect(Collectors.toList());
////	System.out.println(result);
//	List<Integer> ll = new ArrayList<Integer>();
//	ll.add(10);
//	ll.add(20);
//	ll.add(30);
//	ll.add(40);
//	int result = ll.stream().reduce(0,(sum,value)->{
//		//System.out.println(sum+" "+value);
//		return sum+value;
//	});
//	System.out.println(result);
	
	listOfEmp.stream().findFirst().get();
	
	
	}

}
