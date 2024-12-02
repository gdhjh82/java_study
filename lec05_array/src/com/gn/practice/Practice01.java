package com.gn.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 철수는 친구들의 이름을 배열에 넣고 싶어졌어요.
		// 친구들 이름이 아래와 같다고 할때
		// 친구들의 이름을 담고 있는 배열 friends를 구성하게요.
		// 박지영, 김태우, 이지훈, 최유진, 정승호
		// 인덱스, 선언 + 초기화.
		
		
		String[] freinds = new String[] {"1 : 박지영 ", "2 : 김태우 ","3 : 이지훈 ","4 : 최유진 ","5 : 정승호 "};
		for(int i = 0 ; i < freinds.length ; i++) {
			if((i+1)%2 !=0) {
				
				System.out.println(freinds[i]);
			}
		}
	
	}
		}
