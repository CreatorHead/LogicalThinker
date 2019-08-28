package numbers;

import java.util.Arrays;

public class FindMissingNums {

	/**
	 * Find missing numbers
	 */
	public static void findMissingNums(int arr[],int from,int to){
		int loop = to-from;
		int count = 0;
		int index = 0;
		while(count < loop){
			if(index==arr.length)break;
			if(arr[index] != index+from){
				System.out.println(index+from+" is missing");
				from++;
				continue;
			}else{
				index++;
			}
			count++;
		}
	}	

}