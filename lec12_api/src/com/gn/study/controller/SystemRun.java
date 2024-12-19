package com.gn.study.controller;

public class SystemRun {
	public static void main(String[] args) {
		long befor = System.currentTimeMillis();
		// 1. arraycopy()
		int[] src = {10,15,20,25,30};
		// 배열의 길이를 가져온다.
		int[] dst = new int[src.length];
	//	for(int i = 0; i < src.length; i++) {
//			dst[i] = src[i];
//		}
		//
		System.arraycopy(src, 0, dst, 0, src.length);
		for(int d : dst) {
			System.out.print(d+" | ");
		}
		// 2. currentTimeMillis()
		// 보통 long으로 한다.
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		
		
		
		long after = System.currentTimeMillis();
		System.out.println((after-befor)+"밀리초 걸림");
	}

}
