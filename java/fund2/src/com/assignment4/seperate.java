package com.assignment4;

import java.util.Scanner;

public class seperate {
	public static void main(String[] args) {
		System.out.println("enter value");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int n1 = input / 100000 % 10; 
		int n2 = input / 10000 % 10; 
		int n3 = input / 1000 % 10; 
		        int n4 = input / 100 % 10;
		         int n5 = input / 10 % 10; 
		        int n6 = input % 10; 
		      System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5 + " " + n6);
	}
}
