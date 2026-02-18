package predefinedfunctioninterface;

import java.util.function.Function;

public class MyFunctionsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> f = x -> "Value: " + x;

		System.out.println(f.apply(10));

		Function<String, String> convertUpper = v->"Welcome Mr "+v.toUpperCase();
		System.out.println(convertUpper.apply("akash"));
		
		Function<Integer,Double> grossSalary = salary->{			
			double grosssalary = salary+salary*0.10;
			return grosssalary;
		};
		System.out.println(grossSalary.apply(56000));
		
	}

}
