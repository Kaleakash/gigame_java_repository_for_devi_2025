package comparatorexamle;

import java.util.Comparator;

public class SortByIdAsc implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId()-o2.getId();
	}

}
