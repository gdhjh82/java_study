package com.gn.study.mathod.model.vo;
    //반환형
public class VendingMachin {
	// 1. 인사
	public void sayHI() {
		System.out.println("환영합니다~");
	}
	// 2. 남아있는 잔돈 리턴
	public int getBalance() {
		int balance = 500;
		return balance;
	}
	// 3. 음료수 종류[배열] 리턴
	public String[] sodaList() {
		String[] arr = new String[] {"콜라","사이다","오렌지 주스"};
		return arr;
	}
	// 4. 선택된 음료수 객체(클래스) 리턴.
	public Soda selesctedSoda() {
		Soda s1 = new Soda();
		return s1;
		
	}
}

