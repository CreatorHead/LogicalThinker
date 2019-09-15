package sortings;

import java.util.Arrays;

/**
 * @author User
 * Bubble sort has worst-case and average complexity both О(n2),
 *  where n is the number of items being sorted. There exist many sorting algorithms 
 *  with substantially better worst-case or average complexity of O(n log n). 
 *  Even other О(n^2) sorting algorithms, such as insertion sort, 
 *  tend to have better performance than bubble sort. Therefore, 
 *  bubble sort is not a practical sorting algorithm when n is large.Performance of bubble sort over an already-sorted list (best-case) is O(n).
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Optimized");
		System.out.println(Arrays.toString(bubbleSortOptimized(new int[] {1,4,5,4,7,7,7,6,8})));
		System.out.println("**************************************");
		System.out.println("Without optimization");
		System.out.println(Arrays.toString(bubbleSort(new int[] {1,4,5,4,7,7,7,6,8})));
	}



	public static int[] bubbleSort(int[] arr) {
		int temp = 0;
		for(int i=arr.length-1;i>=0;i--) {
			for(int j=0;j<=i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static int[] bubbleSortOptimized(int[] arr) {
		int temp = 0;
		boolean noSwap = true;
		for(int i=arr.length-1;i>=0;i--) {
			noSwap = true;
			for(int j=0;j<=i-1;j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					noSwap = false;;
				}
			}
			if(noSwap) {
				break;
			}
		}
		return arr;
	}

}
