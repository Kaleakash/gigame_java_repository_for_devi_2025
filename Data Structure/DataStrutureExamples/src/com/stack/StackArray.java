package com.stack;

class StackArray {

    int maxSize;
    int top;
    int arr[];

    StackArray(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    void push(int data) {

        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " inserted");
    }

    int pop() {

        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return -1;
        }

        return arr[top];
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Stack Empty");
            return;
        }

        for (int i = top; i >= 0; i--)
            System.out.println(arr[i]);
    }
}

