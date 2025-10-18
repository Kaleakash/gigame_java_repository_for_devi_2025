import java.util.Scanner;
public class ArrayDynamicValue {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("how many numbers you want to store?");
	int n= sc.nextInt();
	int num[]=new int[n];
	for(int i=0;i<n;i++) {
		System.out.println("Ener the number "+(i+1)+":");
		num[i]=sc.nextInt();
	}
//	System.out.println("All number are :");
//	for(int i=0;i<n;i++) {
//		System.out.println(num[i]);	
//	}
	int sum =0;
	int evenSum=0;
	int oddSum=0;
	for(int i=0;i<num.length;i++) {
		sum = sum +num[i];
		if(num[i] %2==0) {
			evenSum = evenSum +num[i];
		}else {
			oddSum = oddSum +num[i];
		}
	}
	System.out.println("The sum of all numbers is :"+sum);
	System.out.println("The sum of even numbers is :"+evenSum);
	System.out.println("The sum of odd numbers is :"+oddSum);
	}
}
