 package com.test.mymethods;

public class ReturnRandomThings {
	
	private ReturnRandomThings() {
		
	}
	public static int[] randomNumbers(int size,int range){
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()* range)+1 ;
		}
		return arr;
	}
	
	public static char[] randomChars(int size){
		char[] arr = new char[size];
		for(int i=0;i<arr.length;i++){
			arr[i] = (char)(Math.random()* 127);
		}
		return arr;
	}
}
