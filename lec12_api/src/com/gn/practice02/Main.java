package com.gn.practice02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열(1):" );
		String str1 = sc.nextLine();
		System.out.print("문자열(2):" );
		String str2 = sc.nextLine();
		System.out.print("문자열(3):");
		String str3 = sc.nextLine();
		String a = str1;
		
		if (str2.length() > a.length() || 
				(str2.length() == a.length() && 
				str2.compareTo(a) > 0)){
			
		a = str2;
		}
		if (str3.length() > a.length() || 
				(str3.length() == a.length() && 
				str3.compareTo(a) > 0)){
			
		a = str3;
		}
		System.out.println(a+a);
		
		System.out.print("문자열(1):" );
		String str4 = sc.nextLine();
		System.out.print("문자열(2):" );
		String str5 = sc.nextLine();
		System.out.print("문자열(3):");
		String str6 = sc.nextLine();
		String b = str1;
		
		if (str5.length() > b.length() || 
				(str5.length() == b.length() && 
				str5.compareTo(b) > 0)){
			
		b = str5;
		}
		if (str6.length() > b.length() || 
				(str6.length() == b.length() && 
				str6.compareTo(b) > 0)){
			
		b = str6;
		}
		System.out.println(b+b);
		
		
		
	}	
}     
		
		
	


