package com.gn.practice;

public class Practice05 {
	public static void main(String[] args) {
		int[] ages = {20, 18 , 22, 19, 21};
		int num = ages[0];
		int num2 = ages[0];
		for(int i = 0 ; i<ages.length; i++) {
			if(ages[i]<num2) {
				num2 = ages[i];
			}
		}
		for(int i = 0; i<ages.length; i++) {
			if(ages[i]>num) {
				num = ages[i];
			}
		}
		System.out.println("가장 나이가 많은 학생의 나이 : "+num);
		System.out.println("가장 어린 학생의 나이 : "+num2);
	}
}
