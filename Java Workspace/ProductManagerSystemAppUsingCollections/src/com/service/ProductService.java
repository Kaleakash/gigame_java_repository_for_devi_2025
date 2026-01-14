package com.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;

public class ProductService {

	private List<Product> listOfProducts = new ArrayList<Product>();
	
	public String addProduct(Product product) {
		int flag = 0;
		if(listOfProducts.size()==0) {
			listOfProducts.add(product);
			return "product added successfully";
		}
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();		// one product, then 
			if(p.getPid()==product.getPid()) {
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			listOfProducts.add(product);
			return "product added successfully";
		}else {
			flag=0;
			return "product id must be unique";
		}
	}
	
	public String deleteProduct(int pid) {
		int flag = 0;
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();		// one product, then 
			if(p.getPid()==pid) {
				li.remove();
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			return "Product not present";
		}else {
			flag=0;
			return "product details deleted successfully";
		}

	}
	public String updateProductPrice(Product product) {		// pid and price 
		int flag = 0;
		
		Iterator<Product> li = listOfProducts.iterator();
		while(li.hasNext()) {
			Product p = li.next();		// one product, then p hold each record present arraylist 
			if(p.getPid()==product.getPid()) {
					p.setPrice(product.getPrice());		// we set new price 
				flag++;
				break;
			}
		}
		
		if(flag==0) {
			return "Product not present";
		}else {
			flag=0;
			return "product details updated successfully";
		}

	}

	public List<Product> findAllProducts() {
		return listOfProducts;
	}
}
