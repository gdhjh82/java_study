package com.gn.study.field.controller;

import com.gn.study.field.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		
		// 1. 객체 생성
		Car c1 = new Car();
		// 2. 값 대입
		// 인스턴스 변수(필드)에 값을 넣었다.
		c1.name = "소방차";
		// 3. 값 호출
		// c1 하나만 넣거나, name 하나만 넣거나 하지 말자.
		System.out.println(c1.name);
		
		// static 예약어
		// 브랜드 명을 가진 인스턴스 변수를 클래스 변수로 바꾸었기 때문에
		// c2 든 c3 든 가져가서 쓸 수 있다.
		// 반대로 name 명을 가진 인스턴스 변수는 불가능했다.
		Car c2 = new Car();
		Car c3 = new Car();
		c2.brand = "현대";
		System.out.println(c1.brand);
		System.out.println(c2.name);
		System.out.println(c2.brand);
		System.out.println(c3.brand);
	}

}
