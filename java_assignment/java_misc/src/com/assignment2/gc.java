package com.assignment2;

public class gc {
	public static void main(String[] args) {
		String s = new String("hello");
		s=null;
		System.gc();
	}
}
