package com.gn.homework;

import java.util.Scanner;

public class Homework3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 :");
		String a = sc.next();
		
		char o = a.charAt(0);
		char p = a.charAt(1);
		char q = a.charAt(2);
		System.out.println("첫번째 문자 :"+ o);
		System.out.println("두번째 문자 :"+ p);
		System.out.println("세번째 문자 :"+ q);
	}

}
