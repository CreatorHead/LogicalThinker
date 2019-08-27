package com.strings;

import java.util.LinkedHashMap;

public class MyStrings {
	public static void main(String[] args){
		System.out.println(naiveFindMatch("AAAAABAAABA", "AAAA"));
	}



	/**
	 * Find the substring in a given string and its frequency.
	 * findMatch("wowomgzomgfghomggjgomggom", "omg")
	 */
	public static int naiveFindMatch(String str, String sub) {
		if(str.length() < sub.length()) {
			return 0;
		}
		int count = 0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<sub.length();j++) {
				int index = i+j;
				if(index > str.length()-1)return count;
				if(sub.charAt(j) != str.charAt(index)) {
					break;
				}
				if(j == sub.length()-1) {
					count++;
				}
			}
		}
		return count;
	}



	/**
	 * Write a method to count number of chars in a String
	 */
	public static void countChars(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),
					( map.containsKey(str.charAt(i)) )?(map.get(str.charAt(i))+1):1 );
		}
		System.out.println(map);
	}

	public static void countChars2(String str) {
		char[] chars = str.toCharArray();
		char[] characters = new char[255];
		for(int i=0;i<chars.length;i++) {
			characters[chars[i]] ++;
		}
		for(int i=0;i<characters.length;i++) {
			if(characters[i] > 0) {
				char c = (char)i;
				System.out.println(c + " is repeated " + ((int)characters[i]) + " times");
			}
		}
	}

	/**
	 * Find duplicate character on a string
	 */
	public static void findDuplicates(String str){
		int[] ch = new int[128];
		for(int i=0;i<str.length();i++){
			ch[str.charAt(i)]++; 
		}
		char c =' ';
		for(int i=0;i<ch.length;i++){
			if(ch[i]>1){
				c = (char)i;
				System.out.println("'"+c+"'"+ " is repeated "+ch[i]+" times");
			}
		}
	}

	/**
	 * sort string on characters
	 */
	public static String sort(String str){
		char[] ch = new char[str.length()];
		ch = str.toCharArray();
		char c = ' ';
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i] > ch[j]){
					c=ch[i];
					ch[i] = ch[j];
					ch[j] = c;
				}
			}
		}
		return new String(ch);
	}

	/**
	 * Check if the String Anagram
	 */
	public static boolean isAnagram(String str1,String str2){
		str1 = str1.toLowerCase();
		str1 = str1.replace(" ", "");
		System.out.println(str1);

		str2 = str2.toLowerCase();
		str2 = str2.replace(" ", "");
		System.out.println(str2);

		if(str1.length() == str2.length()){
			str1 = sort(str1);
			str2 = sort(str2);
			if(str1.equals(str2)){
				return true;
			}else{
				return false;
			}
		}
		return false;
	}

	/**
	 * Reverse a word
	 */
	public static String reverseWord(String str){
		String str2 = "";
		for(int i=str.length()-1;i>=0;i--){
			str2 = str2+(str.charAt(i));
		}
		return str2;
	}

	/**
	 * Reverse a String
	 */
	public static String reverseString(String str){
		String[] sArr = str.split(" ");
		String result = "";
		for(int i=0;i<sArr.length;i++){
			sArr[i] = reverseWord(sArr[i]);
			result = result+sArr[i]+" ";
		}
		return result;
	}
}
