package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import com.sun.glass.ui.View.Capability;

public class RecursionExample {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(capitalizeFirst(new String[] {"abc", "xyz", "pqr"})));
	}
	
	/**
	 * Write a recursive function called capitalizeFirst. Given an
	 * array of strings, capitalize the first letter of each string in the array.
	 */
	public static String[] capitalizeFirst(String[] arr) {
		int counter = 0;
		capReccur(arr, counter);
		return arr;
	}
	public static void capReccur(String[] arr, int counter) {
		if(arr.length == counter) {
			return;
		}
		StringBuilder s = new StringBuilder(arr[counter]);
		s.setCharAt(0, Character.toUpperCase(s.charAt(0)));
		arr[counter] = s.toString();
		capReccur(arr, ++counter);
	}
	
	/**
	 * IsPallindrome
	 */
	public static String revStr(String str) {
		if(str.length() == 1) {
			return str.charAt(0)+"";
		}
		return str.charAt(str.length()-1) + revStr(str.substring(0,str.length()-1));
	}
	
	
	/**
	 * Write a recursive function called reverse which accepts
	 * a String and return a new string in reverse.
	 */
	public static String reverse(String str) {
		String res = "";
		return reverseReoccur(str, res);
	}
	public static String reverseReoccur(String str, String res) {
		if(str.length() == 1) {
			return str.charAt(0)+ res;
		}
		res = str.charAt(0)+res;
		return reverseReoccur( str.substring(str.length() - (str.length()-1)),res );
	}
	
	
	
	/**
	 * Write a recursive function called fib which accepts
	 * a number and returns the nth number in the Fibonacci sequence.
	 * Recall that the Fibonacci sequence is the sequence of whole numbers
	 * 1,1,2,3,5,8... which starts with 1 and 1, and where
	 * every number thereafter is equal to the sum of the previous two numbers.
	 */
	public static int fib(int n) {
		if(n == 1 || n == 2 ) {
			return 1;
		}
		return fib(n-1) + fib(n-2);
	}
	
	/**
	 * Write a function called recursiveRange which accepts 
	 * a number and adds up all the numbers from 0 to the number
	 * to the function?
	 */
	public static int recursiveRange(int num) {
		if( 0==num) {
			return num;
		}
		return num + recursiveRange(--num);
	}
	
	/**
	 * Write a function called productOfArray which takes
	 * in an array of number returns the product of them all.
	 * @param num
	 * @param power
	 * @return
	 */
	static int productOfArrayNum = -1;
	public static long productOfArray(int[] arr) {
		productOfArrayNum++;
		if(arr.length-1 == productOfArrayNum) {
			return arr[productOfArrayNum];
		}
		return arr[productOfArrayNum] * productOfArray(arr);
	}
	
	public static long powerOf(long num,long power) {
		if(power != 0) {
			return num * powerOf(num,--power);
		}else {
			return 1;
		}
	}
	

	//recursion pattern
	public static List<Integer> findOdds(List<Integer> arr) {
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		oddReccur(arr, oddList);
		return oddList;
	}
	public static void oddReccur(List<Integer> list, List<Integer> res) {
		if(list.size() <= 0) {
			return;
		}
		if( (list.get(list.size()-1) % 2)!= 0 ){
			res.add(list.get(list.size()-1));
		}
		int index = (int)list.size()-1;
		list.remove(index);
		oddReccur(list,res);
	}

	public static int sumRange(int n) {
		if(n == 1) {
			return 1;
		}
		return n + sumRange(--n);
	}
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n * factorial(--n); 
	}

	public static void countDown(int num) {
		if(num <= 0) {
			return;
		}
		System.out.println(num);
		countDown(--num);
	}

	public static void countDownIterative(int num) {
		for(int i=num;i>=0;i--) {
			System.out.println(num--);
		}
	}
}
