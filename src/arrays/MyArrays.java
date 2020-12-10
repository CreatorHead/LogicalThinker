package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MyArrays {
	
	public static void main(String[] args) {
		int[] i = new int[] {1,2,54,5,2,6,2,6,2,1,2,9,8,10,1,5};
		System.out.println(findDuplicateNums(i));
	}
	
	public static String findDuplicateNums(int[] arr) {
		int temp[] = Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		String res = "";
		int p1 = 0;
		int p2 = 1;
		while(p2 < temp.length) {
			if(temp[p1] == temp[p2]) {
				p2++;
			}else {
				if(p2-p1 > 1) {
					res = res + temp[p1];					
				}
				p1 = p2;
				p2= p1+1;
			}
		}
		return res;
	}
	
	//Sliding window
	public static int maxSubArraySum(int[] arr, int num) {
		if(arr.length < num ) return 0;
		int maxSum = 0;
		for(int i=0;i<num;i++) {
			maxSum += arr[i];
		}
		int temp = 0;
		for(int i=num;i<arr.length;i++) {
			temp = maxSum - arr[i-num] + arr[i];
			maxSum = Math.max(temp, maxSum);
		}
		return maxSum;
	}
	
	
	public static int countUniqueValues2(int[] arr) {
		int i = 0;
		int j = 1;
		while(j < arr.length) {
			if(arr[i] == arr[j]) {
				j++;
			}else {
				arr[i+1] = arr[j];
				i++;
				j++;
			}
		}
		return i+1;
	}
	
	public static int countUniqueValues(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		int first = 0;
		int second = 1;
		int count = 1;
		while(second < arr.length) {
			if(arr[first] == arr[second]) {
				second++;
			}else {
				first = second;
				second = first + 1;
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Write a function called sumZero which accepts a sorted array of integers.
	 * The function should find the first pair where the sum is 0. Return an array 
	 * that includes both values that sum to zero or undefined if a pair does not exist.
	 * sumZero([-3,-2,-1,0,1,2,3]) [-3,3]
	 * sumZero([-2,0,1,3]) //undefined
	 * sumZero([1,2,3]) // undefined
	 */
	
	//Multiple Pointers Pattern
	public static void sumZero(int[] sortedArr) {
		int left = 0;
		int right = sortedArr.length-1;
		while(left<right) {
			if( (sortedArr[left] + sortedArr[right]) == 0) {
				System.out.println("First Pairs: [" + sortedArr[left]
												+", " + sortedArr[right] + "]");
				break;
			}else if( (sortedArr[left] + sortedArr[right]) > 0) {
				right--;
			}else {
				left++;
			}
		}
	}
	
	
	
	/**
	 * Write a function called same, which accepts two arrays. 
	 * The function should return true if every value
	 * in the array has it's corresponding value squared in the
	 * second array. The frequency of values must be the same.
	 * @param arr1
	 * @param arr2
	 * @return
	 */ //[2,3,2,1] and [4,4,1,9] returns true
	
	
	
	//Frequency Counter
	public static boolean same(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) return false;
		HashMap<Integer, Integer> map1 = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			map1.put(arr1[i],(map1.containsKey(arr1[i]))?map1.get(arr1[i])+ 1:1);
		}
		for(int i=0;i<arr2.length;i++) {
			map2.put(arr2[i],(map2.containsKey(arr2[i]))?map2.get(arr2[i])+ 1:1);
		}
		System.out.println(map1);
		System.out.println(map2);
		
		for(Integer i: map1.keySet()) {
			if(map1.get(i) != (map2.get(i * i))) {
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * Bubble Sort
	 */
	public static int[] bubbleSort(int arr[]){
		int temp = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * Remove Duplicate from arrays
	 */
	public static int[] removeDuplicate(int arr[]){
		Integer[] result = new Integer[arr.length];
		
		//to copy values from arr to result
		for(int i=0;i<arr.length;i++){
			result[i] = arr[i];
		}
		System.out.println(Arrays.toString(result));
		
		//assign duplicates as null values
		for(int i=0;i<result.length;i++){
			for(int j=i+1;j<result.length;j++){
				if(result[i]==result[j]){
					result[j] = null;
				}
			}
		}
		System.out.println(Arrays.toString(result));
		
		//count duplicate
		int duplicates=0;
		for(Integer i:result){
			if(i==null){
				duplicates++;
			}
		}
		
		//create int[] of rightSize (after no duplicates)
		int[] noDup = new int[arr.length-duplicates];
		int index = 0;
		for(int i=0;i<arr.length;i++){
			if(result[i]!=null){
				noDup[index] = result[i];
				index++;
			}
		}
		return noDup;
	}

	/**
	 * To find the pairs of Number of a sum in an given array
	 */
	public static void findPairsOfSum(int arr[],int num){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if((arr[i]+arr[j]==num)){
					System.out.println("The pairs are "+arr[i]+ " and "+arr[j]+" for "+num);
				}
			}
		}
	}

	/**
	 * To find the lowest Number in an array
	 */
	public static int findLowestNum(int arr[]){
		int lowest = arr[0];//Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(lowest > arr[i]){
				lowest = arr[i];
			}
		}
		return lowest;		
	}

	/**
	 * To find the highest Number in an array
	 */
	public static int findHighestNum(int arr[]){
		int highest = 0;
		for(int i=0;i<arr.length;i++){
			if(highest < arr[i]){
				highest = arr[i];
			}
		}
		return highest;
	}

	/**
	 * Finding the missing numbers
	 */
	public static void findMissingNumbers(int arr[]){
		int counter = 1;
		for(int i=0;i<arr.length;i++){
			if(arr[i] != i+counter){
				System.out.println((i+counter)+" is missing");
				counter++;
			}
		}
	}

	/**
	 * Printing Duplicates Numbers is Integer Array
	 */
	public static int findDuplicates(int[] arr){
		int duplicates=0;
		arr = bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			if(i+1==arr.length)break;
			if(arr[i]==arr[i+1]){
				duplicates++;
			}
		}
		return duplicates;
	}
}
