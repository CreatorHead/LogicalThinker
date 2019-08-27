package com.strings;

import java.util.HashMap;

public class Anagram {
	
	public static void main(String[] args) {
		System.out.println(isAnagramQuick("Alert Him Now", "mother in law"));
//		isAnagram("a bcd", "bc da");
	}
	public static boolean isAnagramQuick(String str1, String str2) {
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		
		str1 = str1.trim().replaceAll(" ", "").toLowerCase(); 
		str2 = str2.trim().replaceAll(" ", "").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i=0;i<str1.length();i++) {
			map1.put(str1.charAt(i), map1.containsKey(str1.charAt(i))?map1.get(str1.charAt(i))+1:1);
			map2.put(str2.charAt(i), map2.containsKey(str2.charAt(i))?map2.get(str2.charAt(i))+1:1);
		}
		System.out.println(map1);
		System.out.println(map2);
		for(Character c:map1.keySet()) {
			if(map1.get(c) != map2.get(c)) {
				return false;
			}
		}
		return true;
	}
	public static void isAnagram(String str1, String str2)
	{
		int len, len1, len2, i, j, found=0, not_found=0;
		str1 = str1.trim();
		str2 = str2.trim();
		len1 = str1.length();
		len2 = str2.length();
		if(len1 == len2)
		{
			len = len1;
			for(i=0; i<len; i++)
			{
				found = 0;
				for(j=0; j<len; j++)
				{
					if(str1.charAt(i) == str2.charAt(j))
					{
						found = 1;
						break;
					}
				}
				if(found == 0)
				{
					not_found = 1;
					break;
				}
			}
			if(not_found == 1)
			{
				System.out.print("Strings are not Anagram to Each Other..!!");
			}
			else
			{
				System.out.print("Strings are Anagram");
			}
		}
		else
		{
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}
}
