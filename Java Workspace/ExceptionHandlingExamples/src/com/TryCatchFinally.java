package com;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/0;
			System.out.println("reuslt "+result);
			System.out.println("No Exception");
		}catch(Exception e) {
			System.out.println("Catch block"+e.toString());
		}finally {
			System.out.println("finally block ");
		}
		
		
		System.out.println("normal statement");

	}

}
