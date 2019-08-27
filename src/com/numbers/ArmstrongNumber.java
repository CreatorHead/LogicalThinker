package com.numbers;

public class ArmstrongNumber {

	/**
	 * Checks If a Number is A ArmStrong Number
	 */
	public static boolean isArmstronNumber(int num){
		int originalNum = num;
		int result = 0;
		int remainder = 0;
		while(num != 0){
			remainder = num % 10;
			result = result + remainder*remainder*remainder;
			num = num/10;
		}
		if(result == originalNum){
			return true;
		}
		return false;
	}
}
