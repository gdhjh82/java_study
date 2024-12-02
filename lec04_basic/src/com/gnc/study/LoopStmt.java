package com.gnc.study;

public class LoopStmt {
	public static void main(String[] args) {
		// 1~10 까지 숫자 모두 출력
		// 초기식 -> 출발점(1)
		// 조건식 -> 도착점 (10)
		// 증감식 -> step (몇걸음씩)
		// for(초기식; 조건식; 증감식) {}
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
			// for문은 시작과 끝이 있는 100m 달리기와 같음.
		}
		// 2. 초기식 생략
		int a = 1;
		for(; a <= 5; a++) {
			System.out.println(a);
		}
		
		// 무한루프
		// 3. 조건식 생략
		for(int i = 1; ; i++) {
			System.out.println(i);
			if(i>=10) {
				break;
			}
		}
		
		int sum = 0;
		sum += 1;
		sum += 2;
		sum += 3;
		System.out.println(sum);
		
		// 4. 중첩 for 문
		// i는 1~2 까지 하나씩 커지면서 반복
		// j는 1~3 까지 하나씩 커지면서 반복
		// A B B B C A B B B C
		
		for(int i = 1; i <= 2 ; i++) {
			System.out.print("A ");
			for(int j=1 ; j<= 3 ; j++) {
				System.out.print("B ");
			}
			System.out.print("C ");
		}
		
		// 5. 중첩 for문 활용
		// ****
		// ****
		for(int i = 1 ; i <= 2 ; i++) {
			for(int j =1; j<= 4 ; j++) {
				System.out.println("*");
		  }
		  System.out.println("\n");
		}
		
		//6. break를 사용한 중첩 for문
		// 외부 : 0에서 부터 2미만(=제외) 1 씩 커지면서 반복
		// 내부 : 0에서 부터 3미만(=제외) 1씩 커지면서 반복
		// for(초기식; 조건식; 증감식) {}
		for(int i=0; i < 2 ; i++) {
			System.out.println("1 ");
			 //break;
			for(int j = 0 ; j< 3 ; j++) {
				System.out.println("2 ");
				// break; 
			}
			System.out.println("3\n");
			//break;
		}
		
		// 7. while 문
		int start = 1;
//		while(start <= 10) {
	//		System.out.println(start);
		//	start++;
		
//}
		while(true) {
			System.out.println(start);
			start++;
			if(start > 10) {
				break;
			}
		}
		
		// 8. do ~ while문.
		int count1 = 10;
		while(count1 > 0 && count1 < 10 ) {
		System.out.println("while문 출력");
		count1 --;
	
	}
	
	     /*int count2 = 10;
	     do {
	    	 System.out.println("do~while문 출력");
	    	 count2 --;*/
	     
	 //9. continue
		for(int i =1; i <= 10 ; i++) {
			if(i % 2 ==0) {
				continue;
			}
			System.out.println(i);
		}
		
		String str = "김철수";
	 for(int i = 0; i< str.length(); i++) {
		 System.out.println(str.charAt(i));
		 
	 }
  }
}