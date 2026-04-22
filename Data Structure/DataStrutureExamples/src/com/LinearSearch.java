package com;

public class LinearSearch {
	static int linearSearch(int[] arr, int key) {
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == key) {
	            return i;
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {5,1,3,8,7,4};
		int searchElement = 40;
		int result = linearSearch(num, searchElement);
		if(result==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("element present index position as "+result);
		}
	}

}
