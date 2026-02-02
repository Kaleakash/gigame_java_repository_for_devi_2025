package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationWrite {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		   BankAccount acc =new BankAccount(55501, 45000.50, "Internal Audit Note");

	        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("bank.dat"));

	        oos.writeObject(acc);
	        oos.close();

	        System.out.println("Bank data saved");
		
//        ObjectInputStream ois =
//                new ObjectInputStream(new FileInputStream("bank.dat"));
//
//        BankAccount acc =
//                (BankAccount) ois.readObject();
//
//        ois.close();
//
//        System.out.println("Account No: " + acc.accountNo);
//        System.out.println("Balance: " + acc.balance);
//        System.out.println("Remarks: " + acc.internalRemarks); // null


	}

}
