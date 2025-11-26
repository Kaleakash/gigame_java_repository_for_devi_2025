package com;

public class TryFinally {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int result = 100/0;
			System.out.println("reuslt "+result);
			System.out.println("No Exception");
		}finally {
			System.out.println("finally block ");
		}
		System.out.println("normal statement");
	}

}
