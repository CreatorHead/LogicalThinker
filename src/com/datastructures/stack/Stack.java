package com.datastructures.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   public Stack(int size) {
	      maxSize = size;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   
	   
	   public void push(long j) {
		   if(isFull()){
			   throw new RuntimeException("Stack Overflow");
		   }
	      stackArray[++top] = j;
	   }
	   
	   public long pop() {
		   if(isEmpty()){
			   throw new RuntimeException("Stack Underflow");
		   }
	      return stackArray[top--];
	   }
	   
	   
	   public long peek() {
	      return stackArray[top];
	   }
	   
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
}
