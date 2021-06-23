package com.study.java;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		System.out.println(func(a));
//        int a = sc.nextInt();
//        int b = sc.nextInt();

//        System.out.print(firstOne(a,b));
//        System.out.print(" ");
//        System.out.print(secondOne(a,b));

		String str = sc.nextLine();
		int answer = calculate(str);
		System.out.println(str+" = "+answer);
//		int b = sc.nextInt();
//		System.out.println(power(a, b));

	}

	//
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

	public static int multi(int a, int b) {

		return a * 2;
	}

	public static int func(int a) {
		int answer = 2;
		for (int i = 1; i < a; i++) {
			answer *= 2;
		}
		return answer;
	}

	public static void createSquare(int n) {

		int a = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a = a + 1;
				System.out.print(a);
			}
			System.out.println();
		}
	}

	public static int firstOne(int a, int b) {
		int c = 0;
		int d = 0;

		if (a > b) {
			c = a / 2;
			d = b * 2;
		} else if (b > a) {
			c = b / 2;
			d = a * 2;
		}

		System.out.println(c + " " + d);
		return d;

	}

	public static int secondOne(int a, int b) {
		int c = 0;
		int d = 0;

		if (a > b) {
			c = a / 2;
			d = b * 2;
		} else if (b > a) {
			c = b / 2;
			d = a * 2;
		}

		return c;

	}

	static int calculate(String str) {
		int answer = 0;
		if (str.contains("+")) {
			String arr[] = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			answer = a + b;
		} else if (str.contains("-")) {
			String arr[] = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			answer = a - b;
		} else if (str.contains("/")) {
			String arr[] = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			answer = a / b;
		} else if (str.contains("*")) {
			String arr[] = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[2]);
			answer = a * b;
		} else {
			answer = 0;
		}
		return answer;
	}

}
