package com.gn.study.model.vo;

public class Container<T>{
	private T item;
	
	//getter
	public T getItem() {
		return item;
	}
	
	//setter
	public void setItem(T item) {
		this.item = item;
	}

}
