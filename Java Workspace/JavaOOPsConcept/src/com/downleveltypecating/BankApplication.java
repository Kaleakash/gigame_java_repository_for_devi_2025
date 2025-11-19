package com.downleveltypecating;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Bank bb =	BankService.getInstance("sbi");
	bb.deposit();
	bb.withdraw();
	
	if(bb instanceof Hdfc) {
		Hdfc hdfc = (Hdfc)bb;		
		hdfc.hdfcBankPaymentProcess();
	}
	if(bb instanceof Sbi) {
		Sbi sbi = (Sbi)bb;
		sbi.sbiBankPaymentProcess();
	}
	}

}
