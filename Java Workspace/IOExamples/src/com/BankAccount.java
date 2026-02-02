package com;

import java.io.*;

public class BankAccount implements Externalizable {

    int accountNo;
    double balance;
    String internalRemarks; // not needed to store

    public BankAccount() {
        // mandatory no-arg constructor
    }

    public BankAccount(int accountNo, double balance, String remarks) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.internalRemarks = remarks;
    }

   
 @Override
    public void writeExternal(ObjectOutput out) throws IOException {
       if(accountNo<0) {
    	   System.out.println("Accno didn't store becuase it is -ve");
       }else {
    	 
    	   out.writeInt(accountNo);
       }
        out.writeDouble(balance);
    }
    @Override
    public void readExternal(ObjectInput in)
            throws IOException {
        accountNo = in.readInt();
        balance = in.readDouble();
    }
}

