package com.numbers;

public class PrimeNumber {
	/**
	 * Check if the number is prime or not
	 */
	public static boolean isPrime(int num){
		for(int i=2;i<num;i++){
			if((num % i) == 0){
				return false;
			}
		}
		return true;
	}
}	
