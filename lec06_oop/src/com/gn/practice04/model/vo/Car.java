package com.gn.practice04.model.vo;

public class Car {
	public void startEngine() {
		System.out.println("자동차 시동이 켜졌습니다.");
	}
	public int chekSpeed() {
		return 50;
	}
	public void setSpeed(int speed) {
		System.out.println("속도가 "+speed+"km/h로 설정되었습니다.");
		
	}
	public String setDestination(String destination) {
			return "목적지가 설정되었습니다 : "+destination;
	}
}
