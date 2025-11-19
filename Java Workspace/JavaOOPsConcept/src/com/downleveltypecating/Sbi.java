package com.downleveltypecating;

public class Sbi implements Bank{

	@Override
	public void withdraw() {
		System.out.println("Sbi withdraw logic");
	}
	@Override
	public void deposit() {
		System.out.println("Sbi deposit logic");
	}
	public void sbiBankPaymentProcess() {
		System.out.println("payment done throug sbi bank");
	}
}
