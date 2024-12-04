package com.gn.study.basic.controll;

//import java.util.Date;
import java.util.*;

import com.gn.study.basic.model.vo.car;

public class Run {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		
		// 1. 참조변수 선언 -> Stack에 주소값 담을 공간 생김
		Car c1;
		//2. new연산자 사용해서 객체 생성
		c1 = new Car();
		// 3. 동시 진행(선언, 생성)
		Car c2 = new Car();
		
		// String str;
		// str = new String();
		
		com.gn.study.field.model.vo.Car c3
		= new com.gn.study.field.model.vo.Car();
	
	}

}
