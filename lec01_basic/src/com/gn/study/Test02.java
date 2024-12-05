package com.gn.study;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		/*int num = 0;
		for(int i =1; ;i++) {
			num+=i;
			System.out.println(num);
			if(num>100) {
				System.out.println(num);
				break;
			}
		}*/
		//for(int i = 1 ; i <= 10 ; ) {
			//System.out.println(i);
		 //	i = (++i) % 2;
		//}
		
		/*System.out.println("===== 별찍기 ======");
		for(int i = 0 ; i < 2 ; i++){
			for(int j = 0 ; j < 4 ; j++){
				System.out.print("*");
			}
			System.out.println();*/
		
	 	    System.out.print("정수: ");
	 	    int num = sc.nextInt();
	 	    for(int i= 1 ; i<=num ; i++) {
	 	    	for(int j=1; j<=i ; j++) {
	 	    		System.out.print("*");
	 	    	}
	 	    	System.out.println("1");
	 	    }
		
	}

}
