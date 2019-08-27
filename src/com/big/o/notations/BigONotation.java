package com.big.o.notations;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class BigONotation {
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(doubleIt(new int[] {2,5,6,2})));
	}
	
	public static int[] doubleIt(int[] arr) {
		int[] newArr = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newArr[i] = 2 * arr[i];
		}
		return newArr;
	}
	
	public static Long sum(long[] arr) {
		Long total = 0L;
		for(long l=0L;l<arr.length;l++) {
			total += arr[(int)l];
		}
		return total;
	}
	
	public static void countingDuration() {
		Long number = 900000000L;
		Instant start = Instant.now();
		addUpTo(number);
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();
		Double seconds = duration/1000.00;
		System.out.println("addUpTo: " + seconds + " Seconds");
		
		start = Instant.now();
		addUpToQuick(number);
		end = Instant.now();
		duration = Duration.between(start, end).toMillis();
		seconds = duration/1000.00;
		System.out.println("addUpToQuick: " + seconds + " Seconds");
	}
	
	public static void printAllPairs(Long n) {
		for(Long l=0L;l<n;l++) {
			for(Long k=0L;k<n;k++) {
				System.out.println(l + " " + k);
			}
		}
	}
	
	public static void countUpAndDown(Long n) {
		System.out.println("Counting Up");
		for(Long l=1L;l<=n;l++) {
			System.out.println(l);
		}
		System.out.println("Counting Down");
		for(Long l=n-1;l>0;l--) {
			System.out.println(l);
		}
	}
	
	public static Long addUpTo(Long number) {
		Long total = 0L;
		for(Long i = 0L;i<=number;i++) {
			total += total;
		}
		return total;
	}
	
	public static Long addUpToQuick(Long number) {
		return number * (number + 1)/2;
	}
}
