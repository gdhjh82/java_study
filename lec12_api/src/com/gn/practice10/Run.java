package com.gn.practice10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Run {
	public static void main(String[] args) {
		// 오늘 기준 한주 뒤에 날짜 정보 출력
		Calendar today = Calendar.getInstance();
		today.add(Calendar.DATE, 7);
		Date date = today.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf.format(date));
		// 오늘 기준 한달 뒤에 날짜 정보 출력
		Calendar today1 = Calendar.getInstance();
		today1.add(Calendar.MONTH, 1);
		Date date1 = today1.getTime();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM월 dd일 E요일");
		System.out.println(sdf1.format(date1));
		
		
		
		
		
		
		
		
		
		
		
	}

}
