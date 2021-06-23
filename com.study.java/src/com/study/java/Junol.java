package com.study.java;

import java.util.Scanner;

public class Junol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		551 : 반복제어문3 - 자가진단4
//		int x = sc.nextInt();
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		552 : 반복제어문3 - 자가진단5
//		int x = sc.nextInt();
//		for(int i=0; i<x; i++) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<x-i; j++) {
//				System.out.print("*");
//			}
//			for(int j=0; j<x-i-1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		char key = 'A';
//		for(int i=0; i<10; i++) {
//			int a = key + 1;
//			key = (char) a;
//			System.out.println(key); //ASCII 코드 값
//		}

//		149 : 반복제어문3 - 형성평가A
//		int a = sc.nextInt();
//		int key = 1;
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(key+" ");
//				key = (key+2)%10;
//			}
//			System.out.println();
//		}

//		143 : 반복제어문3 - 형성평가4
//		int a = sc.nextInt();
//
//		for (int i = 0; i < a; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(" ");
//			}
//			for (int j = 0; j < 2 * a - 1 - i * 2; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for (int i = a-2; i >=0; i--) {
////			for (int j = 0; j < i; j++) {
////				System.out.print(" ");
////			}
////			for (int j = 0; j < 2 * a - 1 - i * 2; j++) {
////				System.out.print("*");
////			}
////			System.out.println();
//			for (int j = i; j >0; j--) {
//				System.out.print(" ");
//			}
//			for (int j = 2 * a - 1 - i * 2; j >0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 144 : 반복제어문3 - 형성평가5
//		int a = sc.nextInt();
//
//		for (int i = a-1; i >=0; i--) {
//			int key = 2 * a - 1 - i * 2;
//			for(int j=0; j<a*2-1-key; j++) {
//				System.out.print(" ");
//			}
//			for (int j = key; j >0; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
	}
	static int findMax(int a, int b, int c) {
		return Math.max(Math.max(a, b),c);
	}
}
