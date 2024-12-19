package com.gn.study.basic.controller;

//import java.util.Date;
//import java.util.Scanner;
 
 import java.util.*;
 // *로 util 내 모든 기능을 쓰겠다.
 
import com.gn.study.basic.model.vo.Car;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		//1. 참조변수 선언 
		// 여기까지 하면 Stack에 주소값 담을 공간 생김
		Car c1;
		// 2. new 연산자 사용해서 객체 생성
		c1 = new Car();
		// 3. 동시 진행(선언, 생성)
		// 위에 참조변수 선언과 객체 생성을 한번에 할 수 있다.
		Car c2 = new Car();
		// java.lang 패키지의 클래스는 import 없이 사용 가능
		//String, System, Object 등
		
		
		// 클래스 명은 같지만 
		// 패키지 위치는 다른 클래스 동시에 사용할 경우
		// 클래스 앞에 패키지 명을 붙여줘야함.
		
		com.gn.study.field.model.vo.Car c3 = 
				new com.gn.study.field.model.vo. Car();
	}

}
