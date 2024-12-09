package com.gn.practice02.controller;

import com.gn.practice02.model.vo.SchoolMember;
import com.gn.practice02.model.vo.Staff;
import com.gn.practice02.model.vo.Student;
import com.gn.practice02.model.vo.Teacher;

public class Run {
	public static void main(String[] args) {
		
		SchoolMember s1 = new Student();
		SchoolMember s2 = new Teacher();
		SchoolMember s3 = new Staff();
				
		SchoolMember[] arr = new SchoolMember[3];
		Student stu = new Student();
		arr[0] = stu;
		Teacher tea = new Teacher();
		arr[1] = tea;
		Staff sta = new Staff();
		arr[2] = sta;
		
		for(SchoolMember s : arr) {
			s.introduce();
			if(s instanceof Student) {
				((Student)s).study();
			}else if(s instanceof Teacher) {
				((Teacher)s).teach();
			}else if(s instanceof Staff) {
				((Staff)s).work();
			}
		}
				
	}

}
