package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
	public static void main(String[] args) {
		String path = "G:/Files/write.txt";
		try {
			FileWriter writer = new FileWriter(path);
			writer.write("Hello World");
			writer.flush();
			writer.close();
			System.out.println("File writing is done... Check Your File");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
