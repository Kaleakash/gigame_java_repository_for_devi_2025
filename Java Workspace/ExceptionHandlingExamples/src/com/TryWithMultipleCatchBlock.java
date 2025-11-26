package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		String str = "a10";
		int abc[]= {10,20,30,40};
			try {
				int result = a/b;
			System.out.println("REsult is "+result);
			int result1 = abc[1];
			System.out.println("REsult is "+result1);
			System.out.println(10+str);
			System.out.println(10+Integer.parseInt(str));
			System.out.println("No Exeption");
			
			}catch(ArithmeticException e) {
				System.out.println("Divided by zero "+e.toString());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index "+e.toString());
			}
			catch(NumberFormatException e) {
				System.out.println("Number Format "+e.toString());
			}catch(Exception e) {
				System.err.println("Generic "+e.toString());
			}
			
			
		System.out.println("Bye..");
		System.out.println("Bye..");
		System.out.println("Bye..");

	}

}
