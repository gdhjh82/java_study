package com.gn.practice;

public class Practice03 {
	public static void main(String[] args) {
		int[] attend = {1,1,1,1,1,0,1,0,0,1};
		int sum =0;
		for(int i = 0; i <attend.length; i++) {
			sum += attend[i];
		}
		System.out.println("출석한 학생의 수 : "+sum);
		
	}
}
