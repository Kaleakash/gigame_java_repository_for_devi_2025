package com;

//Stack Implementation using Linked List (Java)
class Node {
 int value;	
 Node next;
 
 public Node(int value) {
     this.value = value;
     this.next = null;
 }
}

class LinkedListStack {
 private Node top;
 private int size;
 
 public LinkedListStack() {
     top = null;
     size = 0;
 }
 
 public void push(int value) {
     Node newNode = new Node(value);		// node object created...
     newNode.next = top;				// next is top 
     top = newNode;					// top = newNode 
     size++;						// + 2, 100 200 the top is last node 
 }
 
 public int pop() {
     if (isEmpty()) {
         System.out.println("Stack Underflow");
         return -1;
     }
     int value = top.value;
     top = top.next;
     size--;
     return value;
 }
 
 public int peek() {
     if (isEmpty()) {
         System.out.println("Stack is empty");
         return -1;
     }
     return top.value;
 }
 
 public boolean isEmpty() {
     return size == 0;
 }
 
 public int getSize() {
     return size;
 }
 
 public void print() {
     if (isEmpty()) {
         System.out.println("Stack is empty");
         return;
     }
     Node current = top;
     System.out.println("Stack contents (top to bottom):");
     while (current != null) {
         System.out.println(current.value);
         current = current.next;
     }
 }
}
public class StackExamplesUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack stack = new LinkedListStack();
		stack.push(100);
		stack.push(200);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
