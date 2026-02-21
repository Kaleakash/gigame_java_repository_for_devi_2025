package comparatorexamle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp.add(new Employee(2, "Raj", 45000));
		listOfEmp.add(new Employee(1, "Vikash", 40000));
		listOfEmp.add(new Employee(3, "Ajay", 43000));
//		listOfEmp.stream().forEach(e->System.out.println(e));
//		Collections.sort(listOfEmp,new SortByIdDesc());
//		listOfEmp.stream().forEach(e->System.out.println(e));
//		
//		Collections.sort(listOfEmp,(e1,e2)->(int)(e1.getSalary()-e2.getSalary()));
//		listOfEmp.stream().forEach(e->System.out.println(e));
		listOfEmp.stream().sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary())).forEach(e->System.out.println(e));
	}

}
