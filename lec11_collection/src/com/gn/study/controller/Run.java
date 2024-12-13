package com.gn.study.controller;

//util 아래에 있는 모든 데이터를 가져다 쓰겠다. -> . *;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.gn.study.model.vo.Container;
import com.gn.study.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		// Boxing 기본형이 참조형으로 바뀌는 것.
		Integer iNum = 100;
		// Unboxing 참조형이 기본형으로 바뀌는 것.
		int num = iNum;
		// parse 메소드
		String str1 = "123";
		String str2 = "456";
		System.out.println(str1+str2);
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1+num2);
		
		str2 = "1.34";
		System.out.println(str2+str2);
		double num3 = Double.parseDouble(str2);
		System.out.println(num3+num3);
		
		
		//NumberFormatException
		try {
			String[] arr = new String[3];
			arr[0] = "일";
			int arrNum = Integer.parseInt(arr[0]);		
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
		System.out.println("숫자가 아닌 문자열을 쓰셨네요 ㅋ");
		
		
		// ClassCastException
		try {
			Object o = 9;
			String oStr = (String)o;			
		}catch(ClassCastException e) {
			e.printStackTrace();
		}
		System.out.println("선넘은 형변환을 하셨네요 ㅋ");
		
		//제네릭
		Container<Integer> con = new Container();
		con.setItem(50);
		Container<String> tain = new Container();
		tain.setItem("안녕하세요.");
		
		//List(ArrayList)
		// 1. 선언과 생성
		List<String> list = new ArrayList<String>();
		
		// 2. 추가 -> .add
		List<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		System.out.println(meal);
		// 인덱스 뒤로 밀어버릴수 있다. 
		meal.add(1,"간식");
		System.out.println(meal);
		// 삭제 
		meal.remove(1);
		// .remove = 오브젝트 기준으로 지워라.
		// 인덱스 기준으로 지우게 하는게 더 좋다.
		System.out.println(meal);
		// .clear 아 몰랑 다 지워버령.
		meal.clear();
		System.out.println(meal);
		
		// 4. 요소 변경
		// 우리가 배열한 순서대로 출력.
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(15);
		nums.add(10);
		nums.add(23);
		System.out.println(nums);
		// .set (인덱스 위치, 그리고 바꾸고 싶은 데이터.)
		nums.set(1, 500);
		System.out.println(nums);
		
		// 5. 요소 조회
		// .get (출력문(이 안에 넣어라));
		System.out.println(nums.get(0));
		
		// size를 쓴다 인덱스 길이 볼려고 할때.
		for(int i = 0 ; i < nums.size(); i++) {
			System.out.println(i+" : "+nums.get(i));
		}
		// 하나하나 불러보겠다.
		// Integer라 부르든 int라 부르든 상관없다.
		for(int n : nums) {
			System.out.println(n);
		}
		
		// ArrayList의 정렬
		System.out.println("정렬전 : "+nums);
		//오름차순 정렬
		Collections.sort(nums);
		System.out.println("오름차순 : "+nums);
		//내림차순 정렬            ==========이 부분을 추가해라==   
		Collections.sort(nums, Collections.reverseOrder());
		System.out.println("내림차순 : "+nums);
		
		
		// ArrayList<객체>
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("김철수", 50));
		
		System.out.println(students);
		
		if(students.contains(new Student("김철수",50))) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		if(students.indexOf(new Student("김철수",50))!= -1) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
	
		students.add(new Student("이영희", 40));
		students.add(new Student("홍길동", 30));
		
		System.out.println("정렬 전 : "+students);
		Collections.sort(students);
		System.out.println("정렬 후 : "+students);
	
	
		Set<String> city = new HashSet<String>();
		city.add("서울");
		city.add("부산");
		city.add("광명");
		System.out.println(city);
		// 중복 데이터 추가 시도
		city.add("서울");
		System.out.println(city);
		
		
		for(String str : city) {
			System.out.println(str);
		}
		
		
		
		
		
		// 삭제
		city.remove("서울");
		System.out.println("삭제후 : "+city);
		city.clear();
		System.out.println("비우기 : "+city);
		
		Set<Student> set1 = new HashSet<Student>();
		set1.add(new Student("김철수",30));
		set1.add(new Student("이영희",40));
		set1.add(new Student("홍길동",50));
		set1.add(new Student("김철수",30));
		
		System.out.println(set1);
		//두가지 메소드가 true여야 같다고 인식한다.
		
		set1.remove(new Student("김철수", 30));
		System.out.println("삭제 후 : "+set1);
		
		
	}

}
