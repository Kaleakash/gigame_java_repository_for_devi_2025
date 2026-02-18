package predefinedfunctioninterface;

import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>{
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		return t>5;
	}
}
public class MyPredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1 =new MyPredicate();
		System.out.println(p1.test(4));
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println(isEven.test(10));

		Predicate<Integer> isOdd = x -> x % 2 != 0;
		System.out.println(isOdd.test(10));
		
		Predicate<String> contains = x->x.contains("ee");
		System.out.println(contains.test("Reta"));
	}

}
