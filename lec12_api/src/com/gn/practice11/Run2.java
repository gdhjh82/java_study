package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run2 {
	public static void main(String[] args) {
		// 오늘 날짜 출력
		LocalDate today = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		System.out.println("오늘 날짜 : "+today.format(dtf));
		
		LocalDate release =LocalDate.of(2024, 12, 25);
		System.out.println("영화 개봉까지 남은 날 : "+ChronoUnit.DAYS.between(today, release)+"일");
		
		int yoil = release.getDayOfWeek().getValue();
		System.out.println("영화 개봉일의 요일 : "+getKoreanDayOfWeek(yoil));
		
	}

	public static String getKoreanDayOfWeek(int day) {
        System.out.println(day);
        String result = "";
		switch (day) {
         case 1: result = "월요일"; 
		 case 2: result = "화요일";  
		 case 3: result = "수요일";
		 case 4: result = "목요일";       
		 case 5: result = "금요일";
         case 6: result = "토요일";
         case 7: result = "일요일";
        }
		return result;
	}
}
