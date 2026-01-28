package com;

import java.io.*;

public class DataStreamExample {
    public static void main(String[] args) throws Exception {
    		// DataOutputStream is a type of class help to store primitive data. 
//    		FileOutputStream fos = new FileOutputStream("account.dat");
//    		
//        DataOutputStream dos =new DataOutputStream(fos);
//        dos.writeInt(101);
//        dos.writeUTF("Ravi");
//        dos.writeDouble(25000.75);
//        dos.close();
//        System.out.println("Data stored as primitive");
    		FileInputStream fis = new FileInputStream("account.dat");
        DataInputStream dis =new DataInputStream(fis);
        System.out.println(dis.readInt());
        System.out.println(dis.readUTF());
        System.out.println(dis.readDouble());
        dis.close();
    }
}

