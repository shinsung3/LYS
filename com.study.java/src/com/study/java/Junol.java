package com.study.java;

import java.util.Scanner;

public class Junol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		551 : �ݺ����3 - �ڰ�����4
//		int x = sc.nextInt();
//		for (int i = 0; i < x; i++) {
//			for (int j = 0; j < x-i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		552 : �ݺ����3 - �ڰ�����5
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
//			System.out.println(key); //ASCII �ڵ� ��
//		}

//		149 : �ݺ����3 - ������A
//		int a = sc.nextInt();
//		int key = 1;
//		for(int i=0; i<a; i++) {
//			for(int j=0; j<a; j++) {
//				System.out.print(key+" ");
//				key = (key+2)%10;
//			}
//			System.out.println();
//		}

//		143 : �ݺ����3 - ������4
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

		// 144 : �ݺ����3 - ������5
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
