package com.gn.strudy.mpdel.vo;

// 추상 클래스 ab
public abstract class Animal {
	//추상 메소드 ab
	public abstract void sound();
	
	public void breath() {
		System.out.println("동물은 숨을 쉽니다.");
	}
}
