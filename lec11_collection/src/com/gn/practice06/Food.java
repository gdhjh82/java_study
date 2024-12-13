package com.gn.practice06;

import java.util.Objects;

import com.gn.practice05.Song;

public class Food {
	private String name;
	private int price;
	
	public Food() {}

	public Food(String name, int price) {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj instanceof Food) {
			Food a =(Food)obj;
			if(a.name.equals(name) && a.price == price) {
				result = true;
			}
		}
		return result;
	}
	@Override
	public String toString() {
		return 
		
	}
}
