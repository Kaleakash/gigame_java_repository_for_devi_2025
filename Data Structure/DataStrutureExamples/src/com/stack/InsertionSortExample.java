package com.stack;

import java.util.*;

public class InsertionSortExample {

    public static void insertionSort(int arr[]) {

        for(int i=1;i<arr.length;i++){

            int key = arr[i];
            int j = i-1;	//0,1,2,3

            while(j>=0 && arr[j] > key){
                arr[j+1]=arr[j];
                j--;
            }
            System.out.println("Pass "+(i));
            for(int n:arr)
                System.out.print(n+" ");
            
           System.out.println("");
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {

        int arr[]={5,2,9,1};
        System.out.println("Before Sort");
        
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        insertionSort(arr);

        for(int i:arr)
            System.out.print(i+" ");
    }
}

