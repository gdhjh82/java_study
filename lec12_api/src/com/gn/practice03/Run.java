package com.gn.practice03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] strArr = sentence.split(" ");
		System.out.println(strArr);
		System.out.print("문자열 입력 :");
		String a = sc.nextLine();
		
		if(sentence.contains(a)){
			System.out.println(a);
		}else{
			System.out.println("존재하지 않는 단어입니다.");
		}
	}
	
}