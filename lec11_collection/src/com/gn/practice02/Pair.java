package com.gn.practice02;
				//제네릭
public class Pair<T,U> {
	private T first;
	private U second;
	
	//기본 생성자
	public Pair() {}	
	
	//매개변수 생성자
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	
	//getter
	public T getFirst() {
		return first;
	}
	
	public U getSecond() {
		return second;
	}
}  
