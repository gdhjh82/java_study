package com.gn.study.controller;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
	/* arraycopy() 메소드
	 * 1) 특징 
	 * 배열의 깊은 복사를 수행하는 메소드
	 * 속도가 빠르고 효율적
	 * 특정 범위의 배열 요소를 복사할 수 있음.
	 * 2)사용법
	 * System.arraycopy(원본 배열, 원본 시작 위치, 대상 배열, 대상 시작 위치, 복사할 길이)
	 * 
	 * 	currentTimeMillis() 메소드
	 * 1) 특징 
	 * 시스템의 현재 타임스탬프 값 반환
	 * 현재 시간을 1970년 1월 1일 00:00:00 UTC부터 밀리초 단위로 반환하는 메소드
	 * 실행할 때마다 값이 달라짐
	 * 2) 활용
	 * 코드 실행에 얼머나 소요되었는지 검사할 때 많이 사용
	 * 가장 마지막에 작업한 실습의 실행 클래스 시작과 끝
	 *  
	 *  identityHashCode()메소드
	 *  1) 특징
	 *  hashCode()와 유사한 메소드
	 *  두 메소드 모두 객체의 주소값 리턴
	 *  2) 예시
	 *  동일한 값을 가지지만 선언방식이 다른 문자열 3개 선언
	 * 	
	 * 
	 * 
	 * 
	 * 	
	 * 	  
	 */
		int[] src = {10,15,20,25,30};
		int[] dst = new int[src.length];
		// 원래 가장 깊은 복사 방법
		for(int i = 0; i<src.length ; i++) {
			dst[i] = src[i];
			System.out.println(dst[i]);
		}
		// System 클래스 활용하기
		System.arraycopy(src, 0, dst, 0, src.length);
		for(int d : dst) {
			System.out.println(d);
		}
	
	  // ==================================================
		long before = System.currentTimeMillis();
		
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		long after = System.currentTimeMillis();
		System.out.println((after-before)+"밀리초 걸림");
		
	//  ======================================================
		
		long start = System.currentTimeMillis();
		
		int[] intArr = new int[1000000];
		for(int i = 0 ; i <intArr.length; i++) {
			intArr[i] = (int)(Math.random()*100)+1;
		}
		int[] strArr = new int[intArr.length/2];
			
		System.arraycopy(intArr, 0, strArr, 0, strArr.length);
		
		long end = System.currentTimeMillis();
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.print(strArr[i]);
			if((i+1)%10 == 0) {
				System.out.print("\n");
			}else {
				System.out.print(",");
			}
		}
		System.out.println("복사 작업 소요 시간 : "+(end-start)+"ms");
	
	 // ===================================================
		String h1 = "수박";
		String h2 = new String("수박");
		String h3 = new String("수박");
		// hashCode()를 사용하여 주소값 출력
		// 
	
	
	
	
	
	
	
	
	
	
	}

}
