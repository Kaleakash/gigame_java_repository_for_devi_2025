package com.slidingwindow;

class WithSlidingWindow {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int k = 3;

        int sum = 0;

        // first window
        for(int i = 0; i < k; i++) {
            sum += arr[i];
        }

        System.out.println("1st Sum = " + sum);

        
        // slide window
        for(int i = k; i < arr.length; i++) {

            sum = sum - arr[i - k] + arr[i];

            System.out.println("next Sum = " + sum);
        }
    }
}

