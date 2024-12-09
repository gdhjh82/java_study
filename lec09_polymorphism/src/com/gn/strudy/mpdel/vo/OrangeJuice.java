package com.gn.strudy.mpdel.vo;

public class OrangeJuice extends Beverage{

	@Override
	public void drink() {
		System.out.println("비타민 C");
	}
	
	public void fresh() {
		System.out.println("갓 짜낸 오렌지 주스");
	}

}
