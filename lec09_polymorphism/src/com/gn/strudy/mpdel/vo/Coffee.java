package com.gn.strudy.mpdel.vo;
                   //상속
public class Coffee extends Beverage{
	@Override
	public void drink() {
		System.out.println("잠이 번쩍!!");
	}
	
	public void ice() {
		System.out.println("얼어 뒤져도 아이스");
	}

}
