package com.gn.study.mathod.controller;

import com.gn.study.mathod.Library;
import com.gn.study.mathod.model.vo.Hospital;
import com.gn.study.mathod.model.vo.SmartPhone;

public class Run {
	public static void main(String[] args) {
		//객체 생성
		//인스턴스화
		SmartPhone myPhone = new SmartPhone();
		
		System.out.println("==========");
		myPhone.checkWork();
		System.out.println("==========");
		// 1. 반환형 x, 매개변수 x
		myPhone.openApp();
		
		// 2. 반환형 0 , 매개변수 x
		int battery = myPhone.checkBattery();
		System.out.println("잔량 배터리 : "+battery);
		
		System.out.println(myPhone.checkBattery());
		
		// 3. 반환형 x, 매개변수 o
		myPhone.setVolume(15);
		
		// 4. 반환형 o , 매게변수 o
		String result = myPhone.sendMsg("자니?");
		System.out.println(result);
		
		// 객체화
		Library library = new Library();
		
		library.borrowBooks("해리포터","반지의 제왕","채식주의자");
		library.returnBooks(1000,"1984");
		
		// 객체화
		Hospital hospital = new Hospital();
		
		hospital.emergencyCall();
		/*hospital.doctorCall();
		hospital.staffAnnouncement();
		hospital.personalRecord();*/
		
		// 인스턴스를 생성하지 않고 메소드 호출 가능
		Hospital.hospitalInfo();
		Math.random();
		
		
	}

}
