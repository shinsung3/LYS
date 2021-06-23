package com.study.java;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		System.out.println(arr[2]);
//		System.out.println(arr[4]);
//		System.out.println(arr[6]);

		Scanner sc = new Scanner(System.in);
		char[] array = new char[10];
		for (int i = 0; i < 10; i++) {
			array[i] = sc.next().charAt(0);
		}
		System.out.println(Arrays.toString(array));
		System.out.println(array[0]);
		System.out.println(array[3]);
		System.out.println(array[6]);
	}
}
