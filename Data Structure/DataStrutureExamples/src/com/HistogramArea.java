package com;

public class HistogramArea {

    public static void main(String[] args) {

        int hist[]={60, 20, 50, 40, 10, 50, 60};
        System.out.println(hist.length);
        StackArray stack=new StackArray(hist.length);

        int max=0,i=0;

        while(i<hist.length){

            if(stack.isEmpty() || hist[stack.peek()]<=hist[i])
                stack.push(i++);

            else{

                int top=stack.pop();

                int area=hist[top]*(stack.isEmpty()?i:i-stack.peek()-1);

                if(area>max)
                    max=area;
            }
        }

        System.out.println("Max Area: "+max);
    }
}

