package com.maventic;

public class Maventic {
	public static void main(String[] args) {
		String s1 = "programming";
		String s2 = "computer";
		System.out.println(getMaventicOutput(s1,s2));
		
	}
	public static void getMaventicOutputRaw(char[] c1,char[] c2, int count){
		
	}
	
	public static String getMaventicOutput(String s1, String s2){
		String res = "";
		for(int i=0;i<s2.length();i++){
			boolean state = true;
			for(int j=0;j<s1.length();j++){
				if(s1.charAt(j) == s2.charAt(i)) state = false;
			}
			if(state) res = res+ s2.charAt(i);
		}
		return res;
	}
}
