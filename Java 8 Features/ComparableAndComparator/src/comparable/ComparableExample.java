package comparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;




public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Comparable interface part of lang package. 
//		List<Integer> ll = new ArrayList<Integer>();
//		ll.add(3);
//		ll.add(1);
//		ll.add(7);
//		ll.add(9);
//		System.out.println(ll);
//		Collections.sort(ll);	// Collections utitlity class which do sort
//		System.out.println(ll);
//		Collections.reverse(ll);
//		System.out.println(ll);
		// by defautl all Integer, Float, String internally implements Comparable interface 
		// and provided logic to do sorting 
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Raj", 45000));
		listOfEmp.add(new Employee(1, "Vikash", 40000));
		listOfEmp.add(new Employee(3, "Ajay", 43000));
		listOfEmp.stream().forEach(e->System.out.println(e));
		Collections.sort(listOfEmp);
		listOfEmp.stream().forEach(e->System.out.println(e));
	}

}
