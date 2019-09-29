package strings;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsetOfString {
	public static void main(String[] args) {
//		System.out.println(printSubsetsChars("ABC".toCharArray()));
		System.out.println(printSubsetsInts(new int[] {1,2,4}));
	}
	
	static List<List<Integer>> printSubsetsInts(int set[]) { 
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		int n = set.length; 

		// Run a loop for printing all 2^n 
		// subsets one by one
		for (int i = 0; i < (1<<n); i++) { 
			// Print current subset 
			List<Integer> subsets = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				// (1<<j) is a number with jth bit 1 
				// so when we 'and' them with the 
				// subset number we get which numbers 
				// are present in the subset and which 
				// are not 
				if ((i & (1 << j)) > 0) {
					subsets.add(set[j]);
				}
			}
			result.add(subsets);
		} 
		return result;
	} 
	
	static List<List<Character>> printSubsetsChars(char set[]) { 
		List<List<Character>> result = new ArrayList<List<Character>>();
		
		int n = set.length; 

		// Run a loop for printing all 2^n 
		// subsets one by one
		for (int i = 0; i < (1<<n); i++) { 
			// Print current subset 
			List<Character> subsets = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				// (1<<j) is a number with jth bit 1 
				// so when we 'and' them with the 
				// subset number we get which numbers 
				// are present in the subset and which 
				// are not 
				if ((i & (1 << j)) > 0) {
					subsets.add(set[j]);
				}
			}
			result.add(subsets);
		} 
		return result;
	} 
}
