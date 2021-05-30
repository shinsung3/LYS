package com.study.java;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(power(a, b));
		
		
	}

	public static int power(int a, int b) {
		int c = a;
		for (int i = 1; i < b; i++) {
			c *= a;
		}
		return c;
	}

	public static int Sum(int a) {
		int sum = 0;
		for (int i = a; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}

	public static int divide(int a, int b) {
		
		return a / 2;
	}
	
	public static int multi(int a, int b ) {
		
		return a*2;
	}

}
