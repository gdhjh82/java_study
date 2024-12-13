package com.gn.strudy.mpdel.vo;

public interface Alarm {
	// 상수 필드 -> 인터페이스 안에서는 앞에 public static final 생략 가능
	// 상수이면 상수 필드는 변수명 대문자, 스네이크 케이스를 사용한다.
	public static final int MAX_VOLUME = 10;
	//int MAX_VOLUME = 10;
	//추상 메소드 -> 인터페이스 안에서는 public abstract 생략 가능
	public abstract void soundAlarm();
	// void soundAlarm();

}
