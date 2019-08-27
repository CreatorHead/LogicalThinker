package com.test.mymethods;

import java.time.Instant;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.InterningXmlVisitor;

public class MyRandomNumbers {
	public static void main(String[] args) {
		nextInt(7,8);
	}
	public static void nextInt(int from, int to){
		
		Instant now = Instant.now();
		String s = ""+now.getNano();
		int random = Integer.parseInt(""+s.charAt(0));
		System.out.println(random);
	}
}
