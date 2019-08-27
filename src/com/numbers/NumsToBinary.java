package com.numbers;

public class NumsToBinary {
	/**
	 * Display binary representation of a Number
	 */
	public static String decimalToBinary(int num){
		String result = "";
		while(num != 0){
			result = result+num%2;
			num = num/2;
			}
		StringBuilder b = new StringBuilder(result);
		b.reverse();
		return b.toString();
		}
}
