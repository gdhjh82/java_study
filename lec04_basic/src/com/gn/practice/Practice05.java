package com.gn.practice;

import java.util.Scanner;

public class Practice05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ctrl +shift + 'o' import ~ 자동 완성
		System.out.print("조명의 밝기를 입력하세요(0~3) : ");
		int light = sc.nextInt();	
		switch(light) {
		case 0 : System.out.println("현재 조명의 밝기 : 조명을 끕니다."); break;
		case 1 : System.out.println("현재 조명의 밝기 : 어두운 조명입니다."); break;
		case 2 : System.out.println("현재 조명의 밝기 : 밝은 조명입니다."); break;
		case 3 : System.out.println("현재 조명의 밝기 : 매우 밝은 조명입니다."); break;
		default : System.out.println("올바른 입력이 아닙니다."); break;
		}
		String text = " ";
		text += "현재 조명의 밝기 :" ;
		switch(light) {
		case 2 : text += "밝은 조명."; break;
		case 3 : text += "매우 밝은 조명"; break;		
		} 
	}
}
