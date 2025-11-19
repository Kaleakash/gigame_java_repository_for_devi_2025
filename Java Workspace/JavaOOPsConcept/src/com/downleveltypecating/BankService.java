package com.downleveltypecating;

public class BankService {

	public static Bank getInstance(String typeOfBank) {
		if(typeOfBank.equalsIgnoreCase("hdfc")) {
			return new Hdfc();
		}else if(typeOfBank.contentEquals("sbi")) {
			return new Sbi();
		}else {
			return null;
		}
	} 
}
