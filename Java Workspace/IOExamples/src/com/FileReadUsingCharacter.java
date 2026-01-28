package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadUsingCharacter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// read text data without buffer 
//		FileReader fr = new FileReader("C:\\Users\\akash\\OneDrive\\Desktop\\Maven Plugins.txt");
//		int data;
//		while((data = fr.read()) !=-1) {
//			System.out.print((char)data);
//		}
		
		
//		FileReader fr = new FileReader("C:\\Users\\akash\\OneDrive\\Desktop\\Maven Plugins.txt");
//		BufferedReader br = new BufferedReader(fr);
//		String data;
//		while((data = br.readLine()) !=null) {
//			System.out.println(data);
//		}
		
		FileReader fr = new FileReader("C:\\Users\\akash\\OneDrive\\Desktop\\Maven Plugins.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:\\mavendata1.doc");
		BufferedWriter bw  = new BufferedWriter(fw);
		String data;
		while((data = br.readLine()) !=null) {
			//fw.write(data);
			bw.write(data);
		}
		System.out.println("file copied");
		fr.close();
		br.close();
		fw.close();
		
	}

}
