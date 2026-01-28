package com;

import java.io.*;

public class ReadCSVExample {
    public static void main(String[] args) throws Exception {
    		FileReader fr = new FileReader("employees.csv");	// char 
        BufferedReader br =new BufferedReader(fr);		// read data line by line

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");		// delimeter is ,
            System.out.println("ID: " + data[0] +
                               " Name: " + data[1] +
                               " Salary: " + data[2]);
        }

        br.close();
    }
}

