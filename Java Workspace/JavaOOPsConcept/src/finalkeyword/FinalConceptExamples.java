package finalkeyword;

final class Bus {
	public final void speed() {
		System.out.println("80km/hr");
	}
}
//class AcBus extends Bus {
////	@Override
////	public void speed() {
////		System.out.print("100km/hr");
////	}
//}
public class FinalConceptExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int A=100;
		System.out.print(A);
		System.out.println("");
		//A=200;
//		AcBus ab = new AcBus();
//		ab.speed();
		Bus bb = new Bus();
		bb.speed();
	}

}
