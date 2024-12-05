package com.gn.study.controller;

import com.gn.study.constructor.Car;
import com.gn.study.field.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		//기본생성자
		// Car c1 = new Car();
		
		//매개변수 생성자
		Car c2 = new Car("현대","회색",2024);
		
		// Run 클래스에 Book 객체 생성
		Book b1 = new Book(15900);
		Book b2 = new Book(2000)
	
		String[] students = {"김철수","이영희","홍길동");
		for(int i = 0; i < students.length ; i++) {
			
			Student s =new Student();
			s.printInfo(i);
			s.printInfo(students[i]);
			s.printInfo(i,students[i]);
		}
		
		System.out.println("=====케이크=====");
		Cake c = new Cake();
		System.out.println(c.flavor);
		System.out.println(c.price);

  }
	
}
