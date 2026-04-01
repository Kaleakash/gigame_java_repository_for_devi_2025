package com.stack;

import java.util.*;

public class BubbleSortExample {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        for(int i=0;i<n-1;i++){			
            boolean swapped=false;

            for(int j=0;j<n-i-1;j++){			
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            System.out.println("pass "+(i+1));
            for(int k=0;k<n;k++)
            	System.out.print(arr[k]+" ");
            if(!swapped)
                break;
            System.err.println("");
        }
    }

    public static void main(String[] args) {

        int arr[] = {5,2,9,1};
        System.out.println("Before Sort Array:");

        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
        bubbleSort(arr);
        System.out.println();
        System.out.println("Sorted Array:");

        for(int i:arr)
            System.out.print(i+" ");
    }
}

