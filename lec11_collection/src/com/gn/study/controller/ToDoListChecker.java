package com.gn.study.controller;

import java.util.*;

public class ToDoListChecker {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		
		// 1. 리스트가 비어있는지 확인
		// 안이 비어있습니까 라고 묻는거임. ㅇㅋ?
		if(list.isEmpty()) {
			System.out.println("할 일이 아직 없습니다.");
		}
		
		// 2. 할 일 추가
		// 0번 인덱스
		list.add("운동하기");
		// 1번 인덱스
		list.add("책 읽기");
		
		// 3. 특정 항목 있는지 확인.
		if(list.contains("코딩 공부하기")) {
			System.out.println("O");
		}else {
			System.out.println("X");
			list.add("코딩 공부하기");
		}
		// list에 추가한 것들 다 보기.
		System.out.println(list);	
		
		// "코딩 공부하기" 가 몇 번 인덱스에 있는지 묻기.
		System.out.println(list.indexOf("코딩 공부하기"));
		
		//만약에 인덱스에 영화보기가 없다면 추가해버리기~
		if(list.indexOf("영화보기")== -1) {
			list.add("영화보기");
		}
		// 마지막 모두 출력해버리기~
		System.out.println(list);
	
	}
}
