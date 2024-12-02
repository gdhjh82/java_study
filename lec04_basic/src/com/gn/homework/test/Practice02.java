package com.gn.homework.test;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int checkNum;
		System.out.print("입력 : ");
		checkNum = sc.nextInt();
		if(checkNum>0) {
			System.out.println("숫자 :" + checkNum);
			System.out.println("양수입니다.");
		}
	}
}
