package predefinedfunctioninterface;

import java.util.function.Consumer;

class MyConsumer implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("You pass the value as "+t);
	}
}
public class MyConsumerTest {

	public static void main(String[] args) {
		Consumer<String> c1 = new MyConsumer();
		c1.accept("Hello");
		
		Consumer<String> c2 = (msg)->System.out.println("You pass the value as "+msg);
		c2.accept("Hi");
	}

}
