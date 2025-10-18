
public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;	// normal variable
		a=200;
		int num[]= {10,20,30,40,50,60,70,80,90,100};// array variable
		System.out.println(a);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		String names[]= {"John","Smith","David","Peter","Jane"};
		System.out.println(names[0]);
		int abc[]=new int[5]; // array memory created
		System.out.println(abc[0]);
		System.out.println(abc[4]);
		//System.out.println(abc[5]);
		abc[0]=100;
		abc[1]=200;
		abc[2]=300;
		abc[3]=400;
		abc[4]=500;
		System.out.println(abc[0]);
		System.out.println(abc[4]);
	}

}
