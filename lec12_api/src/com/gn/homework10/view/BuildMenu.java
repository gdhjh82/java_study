package com.gn.homework10.view;

import java.util.Scanner;

import com.gn.homework10.TokenController.BuilderController;

public class BuildMenu {
	Scanner sc = new Scanner(System.in);
	BuilderController bc = new BuilderController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("메뉴 번호 입력 받기");
			System.out.println("1. 지정 문자열 사용");
			System.out.println("2. 입력 문자열 사용");
			System.out.println("3. 프로그램 끝내기");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : builderMenu();
			break;
			case 2 : inputMenu();
			break; 
			case 3 : System.out.println("프로그램을 종료합니다.");
			 return;
			 default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			  }
			}
		}
	 
	
	public void builderMenu() {
		String str = "J a v a P r o g r a m";
		String str1 = bc.afterReplace(str);
		System.out.println("띄어쓰기 제거 처리 후 글자: "+str1);
		System.out.println("띄어쓰기 제거 처리 후 글자 개수: "+str1.length());
		System.out.println("결과를 모두 대문자로 변환 한 것: "+str1.toUpperCase());
	}

	public void inputMenu() {
		System.out.print("문자열 입력 받기 : ");
		String input = sc.nextLine();
		
		String input1 = bc.firstCap(input);
		System.out.println("첫 글자 대문자: "+input1);
		
		System.out.println("찾을 문자를 입력하세요: ");
		char input2 = sc.next().charAt(0);
		
		int input3 = bc.findCar(input, input2);
		System.out.println("문자 '"+input2+"'의 개수: "+input3);
		
	}
	
	
}
