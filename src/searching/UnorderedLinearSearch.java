package searching;

public class UnorderedLinearSearch {
	
	public static void main(String[] args) {
		int arr[] = {34,22,5,2,26,64};
		System.out.println(search(arr, 2));
	}
	
	
	public static int search(int[] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
}
