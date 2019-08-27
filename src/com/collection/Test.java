package com.collection;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import com.test.sortings.MergeSort;

public class Test {

	
	public static void main(String[] args) {
		System.out.println("Started");
		//Generating random numbers
		int[] arr1 = new int[10000];
		for(int i=0;i<arr1.length;i++){
			int random = (int) (Math.random()*100000);
			arr1[i] = random;
		}
		int arr2[] = Arrays.copyOf(arr1, arr1.length);
		int arr3[] = Arrays.copyOf(arr1, arr1.length);
		//System.out.println("Before Sort: "+Arrays.toString(arr));
		
		//bubble sort these numbers
		int temp = 0;
		Instant start = Instant.now();
		/*for(int i=0;i<arr1.length;i++){
			for(int j=i+1;j<arr1.length;j++){
				//swap
				if(arr1[i] > arr1[j]){
					temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}*/
		Instant end = Instant.now();
		Duration time = Duration.between(start, end);
		/*System.out.println(time.toMillis()+" Milli Seconds to "
				+ "Sort Using Bubble Sort ");*/
		
		start = Instant.now();
		Arrays.sort(arr2);
		end = Instant.now();
		time = Duration.between(start, end);
		System.out.println(time.toMillis()+" Milli Seconds to "
				+ "Sort Using Java People Sort Algo ");
		//System.out.println("After Sort: "+Arrays.toString(arr));
		
		start = Instant.now();
		new MergeSort().sort(arr3);
		end = Instant.now();
		time = Duration.between(start, end);
		System.out.println(time.toMillis()+" Milli Seconds to "
				+ "Sort Our Merge Sort ");
		System.out.println("Ended");
	}
}













