package com;

import java.util.Arrays;

public class BinarySearchExamples {

	static int binarySearch(int[] arr, int key) {
	    int low = 0;				
	    int high = arr.length - 1;		
	    System.out.println();
	    while (low <= high) {
	        int mid = low + (high - low) / 2;
	        System.out.println("low "+low+" high "+high+" mid "+mid);
	        if (arr[mid] == key) {
	            return mid;
	        } else if (arr[mid] < key) {
	            low = mid + 1;
	        } else {
	            high = mid - 1;
	        }
	    }
	    return -1;
	}

	
	public static void main(String[] args) {
		int num[]= {2,5,1,6,9,4};
		Arrays.sort(num);
		System.out.println("After sorted");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int result = binarySearch(num, 2);
		System.out.println();
		if(result==-1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element present at index position "+result);
		}
	}

}
