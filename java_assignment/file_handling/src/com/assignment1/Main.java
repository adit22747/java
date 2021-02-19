package com.assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		String value;
		int data;
		System.out.println("enter string");
		Scanner sc = new Scanner(System.in);
		value = sc.nextLine();
		FileOutputStream output = null;
		FileInputStream input = null;
		try {
			output = new FileOutputStream("file1.txt",true);
			output.write(value.getBytes());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
		
		try {
			input = new FileInputStream("file1.txt");
			output = new FileOutputStream("file2.txt",true);
			while( (data = input.read()) != -1){
				output.write(data);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			output.close();
			input.close();
			sc.close();
		}
	}
}
