package interfaceexample;
interface Abc {				// super interface 
	int A=100;
	void dis1();
}
interface Xyz {					// super interface 
	int B=200;
	void dis2();
}
interface Mno extends Abc,Xyz{		// sub interface 
	int C=300;
	void dis3();
}
class Test implements Abc,Xyz {
	@Override
	public void dis1() {
			System.out.println("Abc interface method");
	}
	@Override
	public void dis2() {
		// TODO Auto-generated method stub
		System.out.println("Xyz interface method");
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
		Test tt = new Test();
		tt.dis1();
		tt.dis2();

	}

}
