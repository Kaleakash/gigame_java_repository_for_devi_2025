package com;

import java.util.*;

public class QuickSortExample {

    static int partition(int arr[],int low,int high){
    		System.out.println("Array value in partition ");
    		System.out.println();
    		for(int i=0;i<arr.length;i++) {
    			System.out.print(arr[i]+" ");
    		}
        int pivot=arr[high];
        System.out.println("pivot value "+pivot);
        int i=low-1;

        for(int j=low;j<high;j++){

            if(arr[j]<pivot){

                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    static void quickSort(int arr[],int low,int high){
    		System.out.println();
        if(low<high){
        		System.out.println("low "+low+" high "+high);
            int pi=partition(arr,low,high);
            System.out.println("Pi value "+pi);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
        System.out.println();
    }

    public static void main(String args[]){

        int arr[]={10,7,8,9,1,5};
        System.out.println("Before Sort ");
        for(int i:arr)
            System.out.print(i+" ");
        quickSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After sort");
        for(int i:arr)
            System.out.print(i+" ");
    }
}

