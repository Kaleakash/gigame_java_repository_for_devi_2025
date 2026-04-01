package com.stack;

public class Celebrity {

	// 3*3
	// matrix[0][0], [0][1] [0][1]
    static int matrix[][]={
            {0,1,1},	//0
            {0,0,0},	//1
            {1,0,0}	// 2
    };

    static boolean knows(int a,int b){
        return matrix[a][b]==1;		// true 
    }

    public static void main(String[] args){

        int n=3;

        StackArray stack=new StackArray(n);

        for(int i=0;i<n;i++)
            stack.push(i);	// 0,1,2
        stack.display();
        while(stack.top>0){

            int a=stack.pop();		//2
            int b=stack.pop();		//1

            if(knows(a,b))		//2,1
                stack.push(b);		// 1
            else
                stack.push(a);		// 2
        }

        System.out.println("Celebrity: "+stack.pop());
    }
}

