package com.gn.homework;

import java.util.Scanner;

public class Homrwork01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게(kg) :");
		double one = sc. nextDouble();
		System.out.print("키(m) :");
		double two = sc. nextDouble();
		System.out.printf("BMI 지수 :"+(one)/(two*two));
		
		//뭐가 문제인지 모르겠네
		
		System.out.print("가로 :");
		double a = sc.nextDouble();
		System.out.print("세로 :");
		double b = sc.nextDouble();
		System.out.println("면적 :"+a*b);
		System.out.println("둘레 :"+(a+b)*2);
		
		// 나이스
		System.out.println("문자열을 입력하세요 :");
		int c = sc.nextInt();
		String word = "apple";
		char o = word.charAt(0);
		char p = word.charAt(1);
		char q = word.charAt(2);
		System.out.println("첫번째 문자 :"+ o);
		System.out.println("두번째 문자 :"+ p);
		System.out.println("세번째 문자 :"+ q);
		
		
	}

}
