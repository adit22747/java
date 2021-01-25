package com.cybage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExample {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = null;
		String data = "writing data in the file"+"\n";
		try{
			output = new FileOutputStream("myfile.txt", true); //true for appending into the file
			output.write(data.getBytes());
		}catch(FileNotFoundException fe){
			System.out.println(fe.getMessage());
		}catch(IOException ioe){
			System.out.println(ioe.getMessage());
		}finally{
			output.close();
		}
	}

}
