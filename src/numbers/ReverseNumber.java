package numbers;

public class ReverseNumber {
	/**
	 * Display a number in reverse order
	 */
	public static int reverseNum(int num){
		int reverse = 0;
		while( num  !=  0){
			reverse = (reverse*10)+(num%10);
			num = num/10;
		}
		return reverse;
	}
}
