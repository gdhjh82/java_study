package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LocalDate date = LocalDate.now();
		LocalDate startDate = LocalDate.of(2024,  12, 25);
		
		long daysBetween = 
				ChronoUnit.DAYS.between(date,startDate);		
		
		DateTimeFormatter dtf =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		date.format(dtf);		
		DateTimeFormatter dtf1 =
				DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		startDate.format(dtf1);
		
		String koreanDayOfWeek = getKoreanDayOfWeek(startDate.getDayOfWeek().getValue());
		
		
		while(true) {
			System.out.println("1. 오늘 날짜 출력");
			System.out.println("2. 영화 개봉까지 남은 날 출력");
			System.out.println("3. 영화 개봉일의 요일 출력");
			System.out.println("4. 개봉일 출력");
		
			int choice = sc.nextInt();
			switch(choice) {
			case 1 : System.out.println("오늘 날짜 :"+date.format(dtf));
			break;
			case 2 : System.out.println("영화 개봉까지 남은 날 :"+daysBetween+"일");
			break;
			case 3 : System.out.println("영화 개봉일의 요일 :"+koreanDayOfWeek);
			break;
			case 4 : System.out.println("개봉일 :"+startDate);
			break;
			case 5 : System.out.println("프로그램 종료");
			 sc.close();
			 return;
			 default :
				 System.out.println("다시 입력해라 뒤지기 싫으면");
			}
		}	
		
	}
	public static String getKoreanDayOfWeek(int day) {
		switch(day) {
		 case 1: return "월요일";
         case 2: return "화요일";
         case 3: return "수요일";
         case 4: return "목요일";
         case 5: return "금요일";
         case 6: return "토요일";
         case 7: return "일요일";
         default: return "";
		}	
	}	
}
