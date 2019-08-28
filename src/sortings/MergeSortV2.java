package sortings;

public class MergeSortV2 {
	private int[] array;
	private int counter;
	
	public static void main(String[] args) {
		
	}
	
	public void sort(int[] arr) {
		array = new int[arr.length];
	}
	
	public void merge(int[] arr1, int[] arr2) {
		int i=0; int j=0; 
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				array[counter] = arr1[i];
				counter++; i++;
			}else {
				array[counter] = arr2[j];
				counter++;j++;
			}
		}
		while(i<arr1.length) {
			array[counter] = arr1[i];
			counter++;i++;
		}
		while(j<arr2.length) {
			array[counter] = arr2[j];
			counter++;j++;
		}
	}
}
