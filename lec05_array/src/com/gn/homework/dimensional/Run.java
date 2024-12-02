package com.gn.homework.dimensional;

public class Run {
	public static void main(String[] args) {
		int[] name = {152, 180, 165, 159, 171};
		for(int i =0 ; i>name.length-1; i++ ) {
			for(int j = i+1 ; j > name.length; j++) {
				System.out.println(i+" : "+j);
				if(name[i]>name[j]) {
					int exam = name[i];
					name[i] = name[j];
					name[j]	= exam;	
					
				}
			}
			for(int d : name) {
				System.out.println(d+" , ");
			}
		}
	}

}
