package com.gn.practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int one = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int two = sc.nextInt();
		System.out.println("덧셈 : "+(one+two));
		System.out.println("뺄셈 : "+(one-two));
		System.out.println("곱셈 : "+(one*two));
		System.out.println("몫 : "+(one/two));
		System.out.println("나머지 :"+(one%two));
		
		// int plus = one+two;
		
		// 2
	}

}
