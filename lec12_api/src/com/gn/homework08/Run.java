package com.gn.homework08;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 소수점이 있는 숫자 출력
		System.out.print("소수점이 있는 숫자: ");
		double pi = sc.nextDouble();
		// 10의 제곱수 구하는 출력
		System.out.print("10의 제곱수 : ");
		int pi2 = sc.nextInt();
		//double pi3 = Math.round(pi*Math.pow(10,pi2));
		System.out.print("반올림된 결과 : "+(Math.ceil(pi*Math.pow(10,pi2))/Math.pow(10, pi2)));;
		
	}

}
