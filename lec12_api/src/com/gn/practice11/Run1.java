package com.gn.practice11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Run1 {
    public static void main(String[] args) {
         
        LocalDate date = LocalDate.now();  // 오늘 날짜
        
        LocalDate startDate = LocalDate.of(2024, 12, 25);  // 영화 개봉일
        
        // 영화 개봉일까지 남은 날 계산
        long daysBetween = ChronoUnit.DAYS.between(date, startDate);  
        
        // 날짜 형식 지정
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        
        // 날짜 포맷 적용
        String todayFormatted = date.format(dtf);
        String startDateFormatted = startDate.format(dtf);
        
        // 영화 개봉일의 요일을 한글로 변환
        String koreanDayOfWeek = getKoreanDayOfWeek(startDate.getDayOfWeek().getValue());
        
       
        System.out.println("오늘 날짜: " + todayFormatted); // 오늘 날짜 출력
        System.out.println("영화 개봉까지 남은 날: " + daysBetween + "일"); // 개봉일까지 남은 날짜 출력
        System.out.println("영화 개봉일의 요일: " + koreanDayOfWeek); // 개봉일의 요일 출력
        System.out.println("개봉일: " + startDateFormatted); // 개봉일 출력
        
    }
    
    public static String getKoreanDayOfWeek(int day) {
        switch (day) {
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