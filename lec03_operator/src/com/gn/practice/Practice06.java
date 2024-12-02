package com.gn.practice;

import java.util.Scanner;

public class Practice06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int small = 4;
		int big = 57;
		int big2 = 70;
		boolean result = 4<57;
		int max = 4 < 57 ? 4 : 57;
		int max1 = 4 > 57 ? (4> 70 ? 4 : 70) : (57 > 70 ? 57 : 70);
	
		System.out.print("첫번째 :");
		int a = sc.nextInt();
		System.out.print("두번째 :");
		int b = sc.nextInt();
		System.out.print("세번째 :");
		int c = sc.nextInt();
		
		System.out.println("두 수 중에서 더 작은 수는 ? : "+ max);
		System.out.println("세 수 중에서 가장 큰 수는 ? : "+max1);
		
	
	}

}
