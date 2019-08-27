package com.io;

import java.io.BufferedReader;
import java.io.FileReader;


public class FileReading {
	public static void main(String[] args) {
		String path = "G:/Files/data.txt"; //give the path of the file which you want to read
		
		try {
			//FileReader throws FileNotFoundException and FileReader is only able to read char by char.
			FileReader fileReader = new FileReader(path);
			//BufferedReader is used with file reader for efficiency. BufferedReader can read line by line
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = "";
			while( (line=reader.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
