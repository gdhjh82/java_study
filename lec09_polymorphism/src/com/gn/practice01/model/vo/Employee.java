package com.gn.practice01.model.vo;
                      //상속
public class Employee extends Person{
	
	//overide로 쓰겠다.
	@Override
	public void introduce() {
	System.out.println("저는 직장인입니다.");
		
	}

}
