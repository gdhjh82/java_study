package com.gn.study.controller;

public class MathRun {
	public static void main(String[] args) {
		// 1. abs() : 절대값
		int num = -37;
	   //num = num < 0 ? -num : num;
		num = Math.abs(num);
		System.out.println(num);
		// 37이 나온다.
		
		// 2. pow(a,b) : n제곱 구하기
		// double
		double dnum = Math.pow(5, 2);
		System.out.println(dnum);
		// 반복문을 써서도 출력이된다.
		double result = 1;
		for(int i =1 ; i<=2 ; i++) {
			result *=5;
		}
		System.out.println(result);
		// 25.0이 출력된다.
		
		// 3. Math.round() -> 실수의 첫번째 자리를 반올림하여 정수(long)로 리턴
		double pi = 3.141592653578;
		// (1) 원하는 자리수만큼 10의 지수 곱하기
		double pi2 = pi*Math.pow(10, 3);
		System.out.println(pi2);
		// (2) 반올림 처리
		double half = Math.round(pi2);
		System.out.println(half);
		// (3) 10의 지수 만큼 나누기
		double div = half/Math.pow(10, 3);
		System.out.println(div);
	
		// 정리
		double after = Math.round(pi*Math.pow(10, 2))/100.0;
		System.out.println(after);
	
		
		// 4. 올림  무조건 올림.
		// 0을 올릴수는 없다. 
		double up = Math.ceil(pi);
		System.out.println(up);
				
		// 5. 내림
		double down = Math.floor(pi);
		System.out.println(down);
	
		 // 주의사항
		// 뭐라도 실수 형태로.
		System.out.println(Math.ceil(1/2.0));
		// 소수점 처리 가능
		System. out.println(Math.ceil(pi*Math.pow(10, 2))/Math.pow(10, 2));
	
		// 6. Math.random()
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
