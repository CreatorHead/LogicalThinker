package sortings;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(selectionSort(new int[] {6,2,7,2,1,7})));
	}
	
	public static int[] selectionSort(int arr[]) { //{6,2,7,2,1,7}
		
		int index = 0;
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i];
			for(int j=i;j<arr.length-1;j++) {
				if(arr[j+1] < min) {
					min = arr[j+1];
					index = j+1;
				}
			}
			if(arr[i] != min) {
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
}
