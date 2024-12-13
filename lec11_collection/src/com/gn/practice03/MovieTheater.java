package com.gn.practice03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록"+seats);
		seats.add(2, "A3");
		System.out.println("A3 좌석 추가 후"+seats);
		System.out.print("예약좌석 :");
		String a = sc.nextLine();
		seats.set(2, a+"(예약)");
		System.out.println("좌석 예약 후"+seats);
		System.out.println("삭제 좌석 : B1");
		seats.remove(3);
		System.out.println("좌석 삭제 후 :"+seats);
		Collections.sort(seats);
		System.out.println("좌석 정렬 후 :"+seats);
		seats.clear();
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록 : "+seats);
		if(seats.contains("A3")) {
			
		}else {
			seats.add(2, "A3");
		}
		System.out.println("A3 좌석 추가 후 : "+seats);
		System.out.print("예약 좌석 :");
		String b = sc.nextLine();
		if(seats.contains(b)){

		}else {
			System.out.println(b+"은(는) 존재하지 않는 좌석입니다.");
		}
		System.out.println("좌석 예약 후 :"+seats);
		System.out.print("삭제 좌석 :");
		String c = sc.nextLine();
		if(seats.contains(c)) {
			
		}else {
			System.out.println(c+"좌석은 목록에 없습니다.");			
		}
		System.out.println("좌석 삭제 후 :"+seats);
		Collections.sort(seats);
		System.out.println("좌석 정렬 후"+seats);
	}

}
