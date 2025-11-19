package com.downleveltypecating;

public class Hdfc implements Bank{

	@Override
	public void withdraw() {
		System.out.println("Hdfc Bank withdraw logic");
	}

	@Override
	public void deposit() {
		System.out.println("Hdfc Bank deposit logic");
	}
	public void hdfcBankPaymentProcess() {
		System.out.println("payment done throug hdfc bank");
	}
}
