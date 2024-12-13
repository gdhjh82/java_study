package com.gn.practice02;

public class Run {
	public static void main(String[] args) {
				//제네릭				      //매개변수 값 전달
		Pair<String, Integer> p = new Pair<>("Apple",10);
		
		System.out.println("first :"+ p.getFirst());
		System.out.println("Second :"+ p.getSecond());
		
	}

}
