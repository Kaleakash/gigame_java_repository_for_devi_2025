package com.main;

import java.util.List;
import java.util.Scanner;

import com.bean.Product;
import com.service.ProductService;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService ps = new ProductService();
		int pid;
		String pname;
		float price;
		String con;
		String result;
		do {
			System.out.println("1:Add product 2: delete product 3 : update product price 4: display product");
			System.out.println("Plz enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Add Product");
			      System.out.println("Enter the product id");
			      pid = sc.nextInt();
			      System.out.println("Enter the product name");
			      pname = sc.next();
			      System.out.println("Enter the product price");
			      price = sc.nextFloat();
			      
			      Product p = new Product();
			      p.setPid(pid);
			      p.setPname(pname);
			      p.setPrice(price);
			      result = ps.addProduct(p);
			      System.out.println(result);
				break;
			case 2:System.out.println("Enter the product id");
		      	pid = sc.nextInt();
		      	result = ps.deleteProduct(pid);
		      	System.out.println(result);
				break;
			case 3:System.out.println("Updated Product Price");
		      System.out.println("Enter the product id");
		      pid = sc.nextInt();
		      System.out.println("Enter the product price");
		      price = sc.nextFloat();
		      
		      Product p1 = new Product();
		      p1.setPid(pid);
		     
		      p1.setPrice(price);
		      result = ps.updateProductPrice(p1);
		      System.out.println(result);
				break;
			case 4:List<Product> listOfProduct = ps.findAllProducts();
			     for(Product product : listOfProduct) {
			    	 System.out.println(product);   // it call toString method
			     }
				break;
			default: System.out.println("wrong choice");
				break;
			}
			System.out.println("do you want to continue(y/n)");
			con = sc.next();
		} while (con.equals("y"));
		System.out.println("Thank you");
	}

}
