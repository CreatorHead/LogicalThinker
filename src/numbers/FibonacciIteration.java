package numbers;

public class FibonacciIteration {
	/**
	 * Display Fibonacci Series
	 */
	public static int[] fibonacciNumber(int range){
		int[] fibonacciNumbers = new int[range];
		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;
		for(int i=2;i<range;i++){
			fibonacciNumbers[i] = fibonacciNumbers[i-1]+ fibonacciNumbers[i-2];
		}
		return fibonacciNumbers;
	}
}
