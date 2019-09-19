package searching;

public class BinarySearch {
	
	public static void main(String[] args) {
		int[] arr = new int[] {2,5,6,7,8,9};
		System.out.println(binarySearch(arr,0,arr.length-1,7));
	}
	
	
	//Recursive solution
	public static int binarySearch(int[] arr,int low,int high,int data) {
		int mid = low + (high - low)/2;
		if(low <= high) {
			if(arr[mid] == data) {
				return mid;
			}else if(arr[mid] < data) {
				return binarySearch(arr,mid+1,high,data);
			}else {
				return binarySearch(arr,low,mid-1,data);
			}
		}
		return -1;
	}
	
	
	//Iterative Solutions
	public static int binarySearch(int[] inputArr, int key) {

		int start = 0;
		int end = inputArr.length - 1;
		while (start <= end) {
			int mid = start + (end-start)/2;
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}
}
