package backtracking;

import java.util.Arrays;

public class GenerateBinaryStrings {
	private static int[] arr;
	
	public static void main(String[] args) {
		int n = 2;
		arr = new int[n];
		binary(n);
	}
	
	public static void binary(int n) {
		if(n < 1) { //base case
			System.out.println(Arrays.toString(arr));
		}else { //recursive case
			arr[n-1] = 0;
			binary(n-1);
			arr[n-1] = 1;
			binary(n-1);
		}
	}
}
