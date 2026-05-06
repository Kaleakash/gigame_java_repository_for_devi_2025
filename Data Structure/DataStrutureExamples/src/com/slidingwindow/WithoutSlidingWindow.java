package com.slidingwindow;

class WithoutSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int k = 3;

        for(int i = 0; i <= arr.length - k; i++) {

            int sum = 0;

            // calculate from scratch
            for(int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            System.out.println("Sum = " + sum);
        }
    }
}

