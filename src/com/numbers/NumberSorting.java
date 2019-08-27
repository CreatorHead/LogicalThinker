package com.numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberSorting {
	public static void main(String[] args) {
		order(new int[] {1,1,1,2,2,2,5,5,5,5,3,3,9,9,9,9});
	}

	public static void order(int[] nums) {
		int temp = 0;
		for(int i=0;i<nums.length;i++){             
			for(int j=i+1;j<nums.length;j++){      
				if(nums[j] > nums[i]){
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		int[] counts = new int[10];

		for(int i = 0 ;i < nums.length; i++) {
			counts[nums[i]]++;
		}

		int max = 0;
		for(int i = 0 ;i < counts.length; i++) {
			if(counts[i]>max) {
				max = counts[i];
			}
		}
		
		for(int i=max;i>0;i--) {
			for(int j=0;j<counts.length;j++) {
				if(counts[j] == i) {
					for(int k = 0;k<i;k++) {
						System.out.print(j);
					}
				}
			}
		}
	}
}
