package com.gn.practice01.controller;

import com.gn.practice01.model.vo.Employee;
import com.gn.practice01.model.vo.Person;
import com.gn.practice01.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		//다형성의 형변환
		Person p1 = new Student();
		Person p2 = new Employee();
		
		
		// 객체 배열
		Person[] arr = new Person[3];
		
		Person per = new Person();
		arr[0] = per;
		
		Student stu = new Student();
		arr[1] = stu;
		
		Employee emp = new Employee();
		arr[2] = emp;
		
		//for each로 호출
		for(Person p : arr) {
			p.introduce();
		}
		
		
	}

}
