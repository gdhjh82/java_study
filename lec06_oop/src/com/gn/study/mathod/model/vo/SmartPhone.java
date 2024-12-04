package com.gn.study.mathod.model.vo;

public class SmartPhone {
	// 1. 반환형 x, 매개변수 x,
	// -> 앱 열림 메시지
	public void openApp() {
		System.out.println("앱이 열렸습니다.");
	}
	
	//2. 반환형O, 매개변수 x
	// -> 배터리 잔량 리턴
	public int checkBattery() {
		return 85;
	}
	
	//3. 반환형 x, 매개변수 o
	// -> 볼륨 입력하면 출력
	public void setVolume(int volume) {
		System.out.println("볼륨이"+volume+"으로 설정되었습니다.");
	}
	
	// 4. 반환형o, 매개변수o
	// -> 메시지 전송
	public String sendMsg(String msg) {
		return "메시지 \'"+msg+"\'가 전송되었습니다.";
	}
	
	public void checkWork() {
		Hospital hospital = new Hospital();
		hospital.emergencyCall();
		hospital.doctorCall();
		hospital.staffAnnouncement();
	}
}
