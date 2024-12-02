package com.gn.practice;
 
import java.util.Scanner;
 
public class Practice11 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String str = sc.nextLine();
	
	/*for(int a = 0; a < str.length(); a++ ) {
		if (str.charAt(a)== ' ') {
			continue;
		}
		System.out.print(str.charAt(a));
	
	}*/
	
	for(int a = 0; a < str.length(); a++) {
		if (str.charAt(a)== ' ') {
			continue;
		}
		System.out.print(str.charAt(a));
	}
 }

}
