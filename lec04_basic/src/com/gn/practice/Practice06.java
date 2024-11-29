package com.gn.practice;

public class Practice06 {
	public static void main(String[] args) {
		int a = 0;
		for(int b = 1; ; b++) {			
		a += b;
		System.out.println(a);
			if(a>=100) {
				System.out.println("초과된 합 :" + a);
				break;		
			}
		}
	}

}
