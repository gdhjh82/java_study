package com.gn.practice09;

import java.util.Calendar;

public class Run {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		cal1.set(2024,1-1,1);
		//cal1.set(Calendar.MILLISECOND, 0);
		long diff = today.getTimeInMillis()-cal1.getTimeInMillis();			
		long days = diff/(1000*24*60*60);
		System.out.println(days);
		
		
		/*String cal1 = "2024-01-01";
		String[] temp = cal1.split("-");
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Integer.parseInt(temp[0]),
				Integer.parseInt(temp[1])-1,
				Integer.parseInt(temp[2]));
		cal2.add(Calendar.MONTH,-1);
		Calendar today = Calendar.getInstance();
		long diff = today.getTimeInMillis()
				-cal2.getTimeInMillis();
		diff = diff/1000;
		long days = diff/(24*60*60);
		System.out.println(days);
		*/
		
		
	}

}
