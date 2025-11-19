package thisandsuper;
class A {
	int n=100;		// super class variable 
}
class B extends A {
	int n=200;		// sub class variable 
	public void display() {	
		int n=300;		// local variable 
		System.out.println("local variable "+n);
		System.out.println("instance variable "+this.n);
		System.out.println("super class variable "+super.n);
	}
}
public class ThisAndSuperKeywordExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj1 = new B();
		obj1.display();
	}

}
