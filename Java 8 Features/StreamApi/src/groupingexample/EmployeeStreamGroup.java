package groupingexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamGroup {

	public static void main(String[] args) {
	
	List<Employee> listOfEmp = new ArrayList<Employee>();
	listOfEmp.add(new Employee(1, "Raj", 45000, "IT"));
	listOfEmp.add(new Employee(2, "Ravi", 46000, "NON-IT"));
	listOfEmp.add(new Employee(3, "Ramesh", 49000, "IT"));
	listOfEmp.add(new Employee(4, "Rajesh", 43000, "NON-IT"));
	listOfEmp.add(new Employee(5, "Ram", 42000, "IT"));

	listOfEmp.stream().forEach(e->System.out.println(e));
	System.out.println("-----");
//	Map<String, List<Employee>> groupByDept = listOfEmp.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
//	System.out.println(groupByDept);
	listOfEmp.parallelStream().forEach(e->System.out.println(e));
	}

}
