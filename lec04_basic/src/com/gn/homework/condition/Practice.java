package com.gn.homework.condition;

import java.util.Scanner;

public class Practice {
	Scanner sc = new Scanner(System.in);
	// 1. 놀이동산 입장료 계산하기
	public void practice01() {
		System.out.println("===놀이동산 입장료 계산하기===");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int price;
		if(age<3){
			price = 0;
			System.out.println("당신의 요금은 "+price+" 원 입니다.");
		}else if(age>=3 && age<=12) {
			price = 10000;
			System.out.println("당신의 요금은 "+price+" 원 입니다.");
		}else if(age>=13 && age<=18){
			price = 20000;
			System.out.println("당신의 요금은 "+price+" 원 입니다.");
		}else if(age>=19 && age<=64){
			price = 30000;
			System.out.println("당신의 요금은 "+price+" 원 입니다.");
		}else if(age>=65) {
			price = 0;
			System.out.println("당신은 요금은 "+price+" 원 입니다.");
		}else {
			System.out.println("잘못된 계산입니다.");
		}
		
	}
	// 2. 일기 예보
	public void practice02(){
		System.out.println("===일기예보===");
		System.out.print("월 : ");
		int month = sc.nextInt();
		System.out.print("기온 : ");
		int temperature = sc.nextInt();
		if(month==12 || month==1 || month==2) {
			System.out.print("겨울");
			if(temperature<=-15){
				System.out.println(" 한파 경보");
			}else if(temperature<=-12) {
				System.out.println(" 한파 주의보");
			}else {
				System.out.println(" 없음");
			}
		}else if(month==6 || month==7 || month==8) {
			System.out.print("여름");
			if(temperature>=35) {
				System.out.println(" 폭염 경보");
			}else if(temperature>=33) {
				System.out.println(" 폭염 주의보");
			}else {
				System.out.println(" 없음");
			}
		}else if(month==3 || month==4 || month==5) {
			System.out.println("봄");
		}else if(month==9 || month==10 || month==11){
			System.out.println("가을");			
		}else {
			System.out.println("해당하는 계절이 없습니다.");
		}
	}
	// 3. 세개의 정수 비교하기
	public void practice03() {
		System.out.println("===세개의 정수 비교하기===");
		System.out.print("첫 번째 정수 :");
		int num = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int num1 = sc.nextInt();
		System.out.print("세 번째 정수 :");
		int num2 = sc.nextInt();
		int num3 =(num<num1)?(num<num2?num:num2):(num1<num2?num1:num2);
		System.out.println("세 수 중에서 가장 작은 수는 "+num3+"입니다.");
		 }
		// 4. 철수네 공장
	public void practice04(){
		System.out.println("===철수네 공장===");
		System.out.print("수집된 코드 : ");
		int code = sc.nextInt();
		switch(code) {
		case 400 : System.out.println("잘못된 요청입니다."); break;
		case 404 : System.out.println("요청하신 서비스를 찾을 수 없습니다."); break;
		case 500 : System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다."); break;
		case 503 : System.out.println("일시적인 서버 오류가 발생하였습니다."); break;
		default : System.out.println("알 수 없는 오류가 발생하였습니다."); break;
		}
	}
	// 5. 헬스 마니아 철수
	public void practice05() {
		System.out.println("===헬스 마니아===");
		System.out.println("1. 스쿼트");
		System.out.println("2. 데드리프트");
		System.out.println("3. 벤치 프레스");
		System.out.println("4. 풀업");
		System.out.println("5. 종료");
		System.out.print("");
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("스쿼트 운동 시간입니다.");
		}else if(num==2) {
			System.out.println("데드리프트 운동 시간입니다.");
		}else if(num==3) {
			System.out.println("벤치 프레스 운동 시간입니다.");
		}else if(num==4) {
			System.out.println("풀업 운동 시간입니다.");
		}else if(num==5) {
			System.out.println("오늘도 수고하셨습니다.");
		}else if(num<=0) {
			System.out.println("양수만 입력해주세요.");
		}else if(num>5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}else {
			
		}
			
		
	}
	// 6. 합격인가? 불합격인가?
	public void practice06() {
		System.out.println("===합격인가? 불합격인가?===");
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수 : ");
		int score = sc.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int score1 = sc.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int score2 = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수 : ");
		int score3 = sc.nextInt();
		System.out.print("정보시스템구축관리 점수 : ");
		int score4 = sc.nextInt();
		int totalScore = score+score1+score2+score3+score4;
		int scorePee = totalScore/5;
		if(score<40){
			System.out.println("소프트웨어 설계 과목 과락으로 불합격입니다.");
		}else if(score1<40) {
			System.out.println("소프트웨어 개발 과목 과락으로 불합격입니다.");
		}else if(score2<40) {
			System.out.println("데이터베이스 구축 과목 과락으로 불합격입니다.");
		}else if(score3<40) {
			System.out.println("프로그래밍언어 활용 과목 과락으로 불합격입니다.");
		}else if(score4<40) {
			System.out.println("정보시스템 구축 과목 과락으로 불합격입니다.");
		}else if(scorePee<60) {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		}else {
			System.out.println("합격을 축하합니다!");
		}
		
	}
}

	


