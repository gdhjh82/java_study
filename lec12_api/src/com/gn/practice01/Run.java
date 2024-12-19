package com.gn.practice01;

import java.util.Random;

public class Run {
	public static void main(String[] args) {
		long befor = System.currentTimeMillis();
		
		// 크기가 1000000인 정수 배열 생성
		int size = 1000000;
		int[] src = new int[size];
		
		// 랜덤값으로 해당 배열 초기화.	
		for(int i = 0; i<src.length ; i++) {
			src[i] =(int)(Math.random()*100)+1;
		}
		
        // System.arraycopy()를 사용하여 이 배열의 절반을 새로운 배열로 복사.    
		int[] arr = new int[src.length/2];		
		// 복사된 배열의 값을 출력예시와 같은 모양으로 출력하세요.
		System.arraycopy(src, 0, arr, 0, arr.length);
		for(int i = 0; i<arr.length; i++) {
			if(i%10 == 9) {
				System.out.print(src[i]);
				System.out.println("");
			}else{
				System.out.print(src[i]+",");
			}
			
		}
		//System.curentTimeMills()를 사용하여 기능 구현에 소요되는
		// 시간을 측정하여 출력하세요.
		long after = System.currentTimeMillis();
		System.out.println("복사 작업 소요 시간 : "+(after-befor)+"ms");
	}

}
