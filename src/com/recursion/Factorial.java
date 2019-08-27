package com.recursion;

public class Factorial {
	
	public static int fact(int num){
		if(num==0){
			return 1;
		}
		return num * fact(num-1);
	}
}


