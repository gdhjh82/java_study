package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		 String song = "나비야, 나비야 이리 날아오너라"
                 + "\n노랑나비, 흰 나비 춤을 추며 오너라"
                 + "\n봄바람에 꽃잎도 방긋방긋 웃으며"
                 + "\n참새도 짹짹짹 노래하며 춤춘다";
     
     // Practice 객체 생성
     Practice practice = new Practice();

     // method1 실행 시간 측정
     long startTime1 = System.nanoTime();
     practice.method1(song);
     long endTime1 = System.nanoTime();
     System.out.println("method1 실행 시간: " + (endTime1 - startTime1) + " 나노초");

     // method2 실행 시간 측정
     long startTime2 = System.nanoTime();
     practice.method2(song);
     long endTime2 = System.nanoTime();
     System.out.println("method2 실행 시간: " + (endTime2 - startTime2) + " 나노초");
	}
}


