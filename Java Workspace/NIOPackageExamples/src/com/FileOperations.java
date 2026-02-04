package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FileOperations {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		// 1st Examples 
//		File file = new File("data.txt");
//		if (file.exists()) {
//		    System.out.println("File exists");
//		}else {
//			System.out.println("file not exists");
//		}

//		Path path = Paths.get("data.txt");
//		if (Files.exists(path)) {
//		    System.out.println("File exists");
//		}else {
//			System.out.println("File not exists");
//		}

//		File dir = new File("logs");		// check path present or not 
//		dir.mkdir();			// if not it create folder as logs. 
//		File file = new File("logs/app.log");
//		file.createNewFile();

//		Path dir = Paths.get("logs1");
//		Files.createDirectories(dir);
//
//		Path file = dir.resolve("app.log");
//		Files.createFile(file);

//		BufferedReader br =new BufferedReader(new FileReader("logs/app.log"));
//
//		String line;
//		while ((line = br.readLine()) != null) {
//		    System.out.println(line);
//		}
//		br.close();
		// but using Java 8 
//		Path path = Paths.get("logs/app.log");
//		Files.lines(path).forEach(System.out::println);
		
		//Stream<String> data = Files.lines(path);

//		BufferedWriter bw =new BufferedWriter(new FileWriter("audit.txt", true));
//		bw.write("doing some task");
//		bw.newLine();
//		bw.close();
		
//		List<String> listOfAutitsData = new ArrayList<String>();
//		listOfAutitsData.add("First Audit");
//		listOfAutitsData.add("Second Audit");
//		listOfAutitsData.add("Third Audit");
//		listOfAutitsData.add("Fourth Audit");
//		Path path = Paths.get("audit1.txt");
		
		// 1st path, listof data, file mode is create and then append new data. 
		//Files.write(path,listOfAutitsData,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		//List.
		//Files.write(path,,StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		//Files.write(path,List.of("A"),StandardOpenOption.CREATE,StandardOpenOption.APPEND);

		
	}

}
