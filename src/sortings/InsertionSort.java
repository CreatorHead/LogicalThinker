package sortings;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] i = {3,2,54,2,1,656,23,1};
		System.out.println("Before Sorting:"+Arrays.toString(i));
		i = insertionSsort(i);
		System.out.println("After Sorting:"+Arrays.toString(i));
	}
	
	public static int[] insertionSsort(int[] arr){
		if(arr.length == 2) {
			if(arr[0] > arr[1]) {
				int temp = arr[0];
				arr[0] = arr[1];
				arr[1] = temp;
			}
		}
		int i,j,value;
		for(i=2;i<=arr.length-1;i++) {
			value = arr[i];
			j = i;
			while(arr[j-1] > value && j>1) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = value;
		}
		return arr;
	}
	
	
	
}
