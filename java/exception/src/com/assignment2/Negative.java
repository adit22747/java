package com.assignment2;

import java.util.Scanner;

public class Negative {
	public static void main(String[] args) {
		int number=0;
		double res=0;
		System.out.println("enter a number to find squareroot");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		try {
			if ( number > 0 ) {
				res = Math.sqrt(number);
				System.out.println(res);
			}
			else {
				throw new Exception("only positive numbers");
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}

