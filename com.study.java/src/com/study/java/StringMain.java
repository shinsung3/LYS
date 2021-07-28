package com.study.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMain {
	public static void main(String[] args) {
		String str = "Hello World";
		int len = str.length();
		System.out.println("String�� length() : "+len);
		String s1 = str.substring(3);
		System.out.println("s1�� begin SubString() : "+s1);
		String s2 = str.substring(3, 5); // beginIndex ����, endIndex ����x
		System.out.println("s2�� begin, end SubString(): "+s2);
		String[] s3 = str.split("l");
		System.out.println("l�� �������� split(): " +Arrays.toString(s3));
		char s4 = str.charAt(0);
		char s5 = str.charAt(10);
		System.out.println("charAt(index): "+s4);
		System.out.println("charAt(index): "+s5);
		String s6 = str.toUpperCase();
		String s7 = str.toLowerCase();
		System.out.println("UpperCase: "+s6);
		System.out.println("LowerCase: "+s7);
		String s8 = str.substring(6);
		System.out.println(s8);
		System.out.println("1. �����Ѱ���?");
		if(str.equals(s8)) {
			System.out.println("��");
		}else {
			System.out.println("�ƴϿ�");
		}
		System.out.println("2. ���Եǳ���?");
		if(str.contains(s8)) {
			System.out.println("��");
		}else {
			System.out.println("�ƴϿ�");
		}
		
		List<String> list = new ArrayList<String>();
		list.add("ABC");
		list.add("aa");
		list.add("bb");
		System.out.println(list);
		
//		ABC,aa,bb
		String s9 = "";
		for(int i=0; i<list.size(); i++) {
			s9 += list.get(i);
			if(i!=list.size()-1)
				s9 += ",";
		}
		System.out.println("String�� ���� ���Ѵ�: "+s9);
		String s10 = String.join(" - ", list);
		System.out.println("String.join�� �̿��غ���: "+ s10);
		
		StringBuilder s11 = new StringBuilder();
		for(int i=0; i<list.size(); i++) {
			s11.append(list.get(i));
			if(i!=list.size()-1)
				s11.append(",");
		}
		System.out.println("StringBuilder: "+s11.toString());
		
		String s13 = str+"\n";
		String s12 = s13.repeat(5);
		System.out.println("�ݺ��غ��ô�: "+s12);
		
//		String s13 = str.replace("l", "K");
//		System.out.println("replace: "+s13);
		
		
		//indexOf , valueOf
	}
}
