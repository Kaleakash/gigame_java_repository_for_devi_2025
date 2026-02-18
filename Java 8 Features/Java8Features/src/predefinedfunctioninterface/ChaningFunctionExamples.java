package predefinedfunctioninterface;

import java.util.function.Function;

public class ChaningFunctionExamples {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = x -> x-2;
		Function<Integer, Integer> f2 = x -> x + 10;

		System.out.println(f1.andThen(f2).apply(2));


		f1.andThen(f2).apply(10);
	}

}
