package com.gnc.study;

import java.util.Scanner;

public class ConditionStmt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = 7;
		switch(month) {
		case 1,3,5,7,8,10,12 : System.out.println("31일"); break;
		case 4,6,9,11 : System.out.println("30일"); break;
		case 2: System.out.println("28일"); break;
		default: System.out.println("존재하지 않는 달입니다."); break;
		}
		// 날아가서 급하게 적어놓음 if문도 원래는 있었는데..
		
	}

}
