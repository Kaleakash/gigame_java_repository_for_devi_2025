package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=0;
		int abc[]= {10,20,30,40};
			try {
				int result = a/b;
			System.out.println("REsult is "+result);
			int result1 = abc[9];
			System.out.println("REsult is "+result1);
			}catch(Exception e) {
//				System.out.println("I Take Care!");
//				System.out.println(e.getMessage());  // message 
				System.out.println(e.toString());	// name of the exception + message
//				e.printStackTrace();// line number, name and message 
			}
			
			
		System.out.println("Bye..");
		System.out.println("Bye..");
		System.out.println("Bye..");
	}

}
