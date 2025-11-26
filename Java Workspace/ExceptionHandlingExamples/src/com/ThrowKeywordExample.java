package com;

import java.util.Scanner;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		try {
			if(age<=21) {
				//throw new Exception();		exception generated without message 
				//throw new Exception("age must be >=21");	// exception generate with message 
				//throw new ArithmeticException();
				//throw new ArithmeticException("age must be >=21");
				//throw new InValidAgeException();		// custom exception
				throw new InValidAgeException("age must be >=21");	// parameterized constructor 
			}else {
				System.out.println("You can apply for job");
			}
		}catch(Exception e) {
			System.out.println("Catch block "+e.toString());
		}
		System.out.println("Normal Statement");
		

	}

}
