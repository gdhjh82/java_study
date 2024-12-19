package com.gn.homework09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
	/*	1) 문제
	철수는 새로운 카페를 준비중인 점주입니다. 
	가게 오픈까지 남은 준비 기간 동안의 일정을 관리해야합니다.
	카페 오핀일은 2025년 1월 24일입니다. 
	오픈 준비를 위해 아래 일정을 확인해주세요. 
	오늘 날짜 기준으로 카페 오픈일까지 남은 날짜 수
	카페 오픈일이 속한 달의 마지막 날
	카페 오픈일의 요일
	2) 출력 예시
	언제 문제를 푸느냐에 따라서 2개의 결과는 달라집니다.
	오늘 날짜 : OOOO년 OO월 OO일
	카페 오픈일까지 남은 날 : OO일
	오픈달의 마지막 날 : 31일
	카페 오픈일의 요일 : 금요일
	*/	
		//오늘 날짜 예쁘게 구하기.
		Calendar today = Calendar.getInstance();
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("오늘 날짜 : yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));
		
		
		//오늘 날짜에서 카페 오픈일까지 남은 날 구하는 법.
		Calendar open = Calendar.getInstance();
		open.set(2025, 1-1,24);
		long diff = open.getTimeInMillis()-today.getTimeInMillis();
		long days = diff/(1000*24*60*60);
		System.out.println("카페 오픈일까지 남은 날 : "+days+"일");
		int last = open.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("오픈달의 마지막 날 : "+last+"일");
		Date date2 = open.getTime();
		SimpleDateFormat sdf2 = new SimpleDateFormat("카페 오픈일의 요일 : E요일");
		System.out.println(sdf2.format(date2));
		
	}

}
