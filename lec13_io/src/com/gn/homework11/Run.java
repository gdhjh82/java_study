package com.gn.homework11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LocalDateTime start = LocalDateTime.now();
		DateTimeFormatter dtf = 
				DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		System.out.println("기준 : "+start.format(dtf));
		
		while(true) {			
			System.out.print("입력 : ");
			String a1 = sc.nextLine();
		if(a1.equals("y")  || a1.equals("Y")) {
			long time = ChronoUnit.SECONDS.between(start,LocalDateTime.now());
					System.out.println("경과(초) : "+time);
			}else if(a1.equals("n") || a1.equals("N")) {
				System.out.println("종료합니다.");
				break;	
		}else {
			System.out.println("다시 입력해주세요.");
			}
		}		
		
	}

}
