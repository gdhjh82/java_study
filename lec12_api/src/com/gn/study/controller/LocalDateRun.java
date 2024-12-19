package com.gn.study.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateRun {
	public static void main(String[] args) {
		// 1. localDateRun
		// (1) 현재 날짜 구하기			now라는 메소드.   
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		//(2) 특정 날짜 설정
		LocalDate date2 = LocalDate.of(2024, 12, 25);
		System.out.println(date2);
		//(3) 필드 조회
		System.out.println(date1.getYear()); // 년
		System.out.println(date1.getMonthValue()); // 월 + 숫자값
		System.out.println(date1.getDayOfMonth()); // 일 
		System.out.println(date1.getDayOfWeek().getValue()); //요일 + 숫자값
		//(4) 필드 증가.
		LocalDate date3 = date1.plusWeeks(1); // 1주 뒤. ++		
		System.out.println(date3);
		//(5) 필드 감소
		LocalDate date4 = date1.minusDays(3); // 3일 전. --
		System.out.println(date4);
		
		
		// 2. LocalTime
		// (1) 현재 시간
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		// (2) 특정 시간 지정
		LocalTime time2 = LocalTime.of(12, 50, 5);
		System.out.println(time2);
		// (3) 필드 조회
		System.out.println(time1.getMinute());
		System.out.println(time1.getHour());
		// (4) 필드 증가
		LocalTime time3 = time1.plusHours(7); // 시
		System.out.println(time3);
		// (5) 필드 감소
		LocalTime time4 = time1.minusMinutes(20); // 분
		System.out.println(time4);
		
		// 3. LocalDateTime 
		LocalDateTime datetime1 = LocalDateTime.now();
		System.out.println(datetime1);
		// (2) 특정 날짜와 시간
		LocalDateTime datetime2 = LocalDateTime.of(2025, 1,1,6,30,45);
		System.out.println(datetime2);
		
		
		// 4. DateTimeFormatter
		// 날짜와 시간을 문자열로 변환
		// 문자열을 날짜/시간 객체로 파싱.
		// 간단한 패턴의 문자열 사용
		
		LocalDateTime now1 = LocalDateTime.now();
		DateTimeFormatter dtf1 =
		DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초");
		now1.format(dtf1);
		// 변수 만들어서 세팅하거나, 출력문 안에 넣던가.
		System.out.println(now1.format(dtf1));
		
		// (2) 문자열 -> 날짜와 시간
		String str2 = "2024-12-24 13:50:26";
		DateTimeFormatter dtf2
		= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime3 = LocalDateTime.parse(str2,dtf2);
		System.out.println(dateTime3);
		
		// 5. ChronoUnit 
		// 두 날짜 사이의 시간을 손쉽게 구할 수 있다.
		LocalDate startDate = LocalDate.of(2024,  1, 1);
		LocalDate endDate = LocalDate.of(2024, 12, 31);
		
		long daysBetween = 
				ChronoUnit.DAYS.between(startDate,endDate);
		System.out.println(daysBetween);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//LocalDate date1 = LocalDate.of(2024, 12, 18);
		
		
		
		
		
		
	}

}
