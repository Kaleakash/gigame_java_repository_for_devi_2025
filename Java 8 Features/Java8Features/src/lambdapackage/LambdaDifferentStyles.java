package lambdapackage;
interface Calcuation{
	public int add(int x, int y);
}
interface Info {
	public void hello();
}
interface Largest {
	public boolean findLargest(int x, int y);
}
public class LambdaDifferentStyles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// providing the body for function interface using lambda style 
		Calcuation c1 = (x,y)->x+y;
		System.out.println(c1.add(100, 200));
		Calcuation c2 = (int x, int y)->x+y;
		System.out.println(c2.add(10, 20));
		Calcuation c3 = (a,b)->a+b;
		System.out.println(c3.add(1, 2));
		Calcuation c4 = (x,y)-> {
			int sum = x+y;
			return sum;
		};
		System.out.println(c4.add(1000, 2000));
		Info i1 = ()-> {
			System.out.println("1st msg");
			System.out.println("2nd msg");
		};
		i1.hello();
		Largest l1 = (x,y)->{
			if(x>y) {
				return true;
			}else {
				return false;
			}
		};
		Largest l2 = (x,y)->x>y;
		System.out.println(l1.findLargest(100, 50));
		System.out.println(l2.findLargest(100, 50));
	}

}
