package com.gn.practice07;

import java.util.Objects;

import com.gn.study.model.vo.Student;

public class Equipment {
	private String name;
	private int pricePerDay;
	
	public Equipment() {
		
	}
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay =pricePerDay;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerDay);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Equipment) {
			Equipment other = (Equipment)obj;
			if(other.name.equals(name)&&other.pricePerDay == pricePerDay) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return name+",가격:"+pricePerDay;
	}
}
