package com.gn.practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성적 입력 :");
		int a = sc.nextInt();	
		String grade;			
		if(a>90) {  
			//System.out.println();
			grade = "a";
		} else if(a>80) {
			//System.out.println();
			grade = "b";
	    } else if(a>70) {
	    	//System.out.println("당신의 학점은 C입니다.");
	    	grade = "c";
		} else if(a>60) {
			grade = "d";
			//System.out.println("당신의 학점은 D입니다.");
		} else {
			//System.out.println("나머지 f");
			grade = "f";
		}
	      
	}

}
