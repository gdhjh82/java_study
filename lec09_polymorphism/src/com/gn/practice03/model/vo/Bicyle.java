package com.gn.practice03.model.vo;

public class Bicyle extends Vehicle{
	@Override
	public void go() {
		System.out.print("다리힘으로 ");
		super.go();
	}

}
