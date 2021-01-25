package com.cybage.character;

import java.io.FileWriter;

public class WritingExample {
	public static void main(String[] args) throws Exception {
		FileWriter writer = null;
		String data ="write data using filewriter";
		
		writer = new FileWriter("charstream.txt");
		writer.write(data);
		writer.close();
	}
}
