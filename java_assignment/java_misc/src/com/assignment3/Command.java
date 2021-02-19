package com.assignment3;

import java.util.Arrays;

public class Command {
	public static void main(String[] args) {
		int arr[] = {};
		for (int i = 0; i < args.length; i++) {
			arr[i]=Integer.parseInt(args[i]);
		}
		Arrays.sort(arr);
		System.out.println("sorted array: " + Arrays.toString(arr));
	}
}
