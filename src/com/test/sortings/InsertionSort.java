package com.test.sortings;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] i = {2,3,1};
		System.out.println("Before Sorting:"+Arrays.toString(i));
		i = sort(i);
		System.out.println("After Sorting:"+Arrays.toString(i));
	}
	
	public static int[] sort(int[] a){
		int index=0, prevIndex=0, key=0;
		for(index=1; index<a.length; index++)
		{
		  key = a[index];
		  prevIndex = index-1;
		  while( (prevIndex>=0) && (key<a[prevIndex]) )
		  {
		    a[prevIndex+1] = a[prevIndex];
		    prevIndex--;
		  }
		  a[prevIndex+1] = key;
		}
		return a;
	}
	
	
	
}
