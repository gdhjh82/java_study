package com.gn.practice;

import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 77;
		int b = 44;
		
		System.out.print("숫자(1) : ");
		int one = sc.nextInt();
		System.out.print("숫자(2) : ");
		int two = sc.nextInt();
		boolean c = a>b; 
	    System.out.println("첫번째 숫자가 두번째 숫자보다 큰가요?"+c);
	    
	}

}
