package searching;

import java.util.Arrays;

public class OrderedLinearSearch {
	//Data should be sorted 
	public static void main(String[] args) {
		int[] i = {34,5,12,5,63,1};
		Arrays.sort(i);
		int index = search(i,5);
		System.out.println(index);
	}
	public static int search(int[] arr,int data){
		for(int i=0;i<arr.length;i++){
			if(data == arr[i]){
				return i;
			}else if(arr[i]> data){
				return -1;
			}
		}
		return -1;
	}
}
