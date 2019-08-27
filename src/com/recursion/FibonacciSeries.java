package com.recursion;

public class FibonacciSeries {
	
	static int num1 = 0;
	static int num2 = 1;
	static int result = 0;
	
	public static void main(String[] args) {
		doFibonacci(10);
	}
	
	public static void doFibonacci(int count){
		if(count > 0){
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			System.out.println(result);
			doFibonacci(count - 1);
		}
	}
}
