package com.gn.practice;

public class Practice07 {
	public static void main(String[] args) {
		System.out.println("===2단===");
		for(int a = 1; a<=9 ; a++) {
			int b = a*1;
			System.out.println("2*"+(a)+" = "+(a+b));
			
		}
	


    for(int i = 2 ; i <=9 ; i++) {
    	System.out.println("===" +i+ "단 ===");
    	for(int j =2; j <=9 ; j++) {
    		System.out.println(i+"*"+j+"="+(i*j));
    	}
    }
  }
}