package lambdawithcollections;

import java.util.ArrayList;
import java.util.List;

public class ListExamplesWithLambda {
	public static void main(String[] args) {
		List<Integer> ll1 = new ArrayList<Integer>();
		ll1.add(10);
		ll1.add(20);
		
		
		ll1.forEach(v->System.out.println("Value is "+v));
		
		//List<String> names = List.of("Ravi","Raj","Lokesh","John");
		//names.forEach(ele->System.out.println(ele));
	}
}
