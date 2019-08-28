package sortings;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author User
 * Bubble sort has worst-case and average complexity both О(n2),
 *  where n is the number of items being sorted. There exist many sorting algorithms 
 *  with substantially better worst-case or average complexity of O(n log n). 
 *  Even other О(n2) sorting algorithms, such as insertion sort, 
 *  tend to have better performance than bubble sort. Therefore, 
 *  bubble sort is not a practical sorting algorithm when n is large.Performance of bubble sort over an already-sorted list (best-case) is O(n).
 *
 */
public class BubbleSortingVsDualPivotQuickSort {
	public static void main(String[] args) {
		int numbersToSort = 10000;
		int lineCounter = 0;
		int[] arr = new int[numbersToSort];
		int[] arr1 = new int[numbersToSort];
		for(int i=0;i<numbersToSort;i++){
			arr[i]=(int)(Math.random()*numbersToSort)+1;
			arr1[i]=arr[i];
		}
		
		System.err.println("Before Sorting...");
		
		for(int i:arr){
			if(lineCounter == 20){
				System.out.println();
				lineCounter = 0;
			}
			System.out.print(i+"  ");
			lineCounter++;
		}

		System.err.println("\n\nAfter Sorting...");
		
		Instant start = Instant.now();
		bubbleSort(arr);
		Instant end = Instant.now();
		Duration duration1 = Duration.between(start, end);

		for(int i:arr){
			if(lineCounter == 20){
				System.out.println();
				lineCounter = 0;
			}
			System.out.print(i+"  ");
			lineCounter++;
		}

		/*List<Integer> intList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++)
		{
		    intList.add(arr[index]);
		}
		Collections.sort(intList);
		 */

		System.out.print("\n\nTime taken for Bubble Sort: "+duration1.toMillis()+" Milli Seconds");
		Instant start2 = Instant.now();
		Arrays.sort(arr1);
		Instant end2 = Instant.now();
		Duration duration2 = Duration.between(start2, end2);

		System.out.println();
		System.out.print("Time taken for Dual Pivot Sort: "+duration2.toMillis()+" Milli Seconds");
		System.out.println();
		System.out.println("Exit..");
	}

	public static void bubbleSort(int[] arr){
		int length = arr.length;
		int temp = 0;
		for(int i=0;i<arr.length;i++){             //to create a bug for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++){       //for(int j=i+1;j<arr.length-1;j++)
				if(arr[j] < arr[i]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
