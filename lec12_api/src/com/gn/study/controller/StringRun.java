package com.gn.study.controller;

public class StringRun {
	public static void main(String[] args) {
		
		// 1. 리터럴 -> " "
		// 값이 같으면 hashCode 동일, == 비교 연산자 사용 가능
		String str = "Hello";
		//개발자가 오버라이드 할 수 없는 메소드. identity...
		System.out.println("Hello(1) : "+System.identityHashCode(str));
		// "Hello World" 라는 새로운 객체가 탄생  
		// 불변객체
		//str += "World";
		System.out.println(System.identityHashCode(str));
		
		// 리터럴 같은 경우 값을 기준으로 헤쉬코드를 구분.
		String str1 = "Hello";
		System.out.println("Hello(2) : "+System.identityHashCode(str1));
		if(str==str1) {
			System.out.println("같다!!");
		 }
		// 2. new 연산자 -> 객체
		// ==비교 불가 , equals 사용가능.
		String str2 = new String("Hello");
		System.out.println(System.identityHashCode(str2));
	 
		// 3. equals
		System.out.println("equals() : "+("Hi".equals(str2)));
		// 4. length()
		System.out.println("length() : "+str2.length());
		// 5. charAt()
		System.out.println("cahrAt() : "+str2.charAt(0));
		// 6. toCharArray()
		char[] arr = str2.toCharArray();
		System.out.println((int) 'a'+"~"+(int)'z');
		System.out.println((int) 'A'+"~"+(int)'Z');
		// 7. contains()
		System.out.println("contains() : "+str2.contains("lo"));
		// 8. compareTo() -> Hello
		System.out.println("compareTo() :"+str2.compareTo("ZZZ"));
		// 9. concat 
		// 불변객체의 특징. 원본값 수정 불가능. 리터널.
		String test = "우리는";
		// 앞에 test = 하고 값을 재할당해야 붙어서 출력된다.
		test = test.concat("할수있다.");
		System.out.println(test);
		
		
		// 10. indexOf
		test = "2024.12.16.12.43";
		System.out.println(test.indexOf("."));
		System.out.println(test.indexOf("12"));
		System.out.println(test.lastIndexOf("12"));
		
		// 11. split()
		String name = "김-철-수";
		String[] nameArr = name.split("-");
		for(String n : nameArr) {
			System.out.println(n);
			
		String a = "a+b+c+d";
		String[] arrA = a.split("\\+");
		String b = "e.f.g.h";
		String[] arrB = b.split("\\.");
		
		}		
		
		// 문자열 바꾸기.
		String ide = "eclipse";
		ide = ide.replace("e","a");
		System.out.println(ide);
		
		String id = "김 철 수";
		id = id.replace(" ","");
		System.out.println(id);
		
		// (1) 비어있는지 확인.
		String empty1 = "";
		String empty2 = " ";
		//실제 값으로 뭐가 들어있냐
		System.out.println("(1) : "+empty1.isBlank());
		System.out.println("(2) : "+empty2.isBlank());
		// 뭐라도 들어가 있냐
		System.out.println("(3) : "+empty1.isEmpty());
		System.out.println("(4) : "+empty2.isEmpty());
		
		System.out.println(empty1.length()==0);
		empty2 = empty2.replace(" ","");
		System.out.println(empty2.length()==0);
		
		// trim(); 중앙 빼고 맨앞 맨뒤 띄어쓰기 없애버리기.
		String empty3 = " 안 녕 ";
		empty3 = empty3.trim();
		System.out.println(empty3);
		
		
		// 2) isBlank()
		// 값이 아예 없는 경우 : true
		// 띄어쓰기만 있는 경우 : true
		
		// 3) isEmpty()
		// 값이 아예 없는 경우 : true
		// 띄어쓰기만 있는 경우 : false
		
		// 4) test.length()==0
		// 값이 아예 없는 경우 확인.
		
		
		
		//문자열 붙히기
		String[] students = {"철수","영희","길동"};
		String allStudent = String.join("-", students);
		System.out.println(allStudent);
		//문자열 자르기
		String cutTest = "hello world";
		System.out.println(cutTest.substring(6));
		System.out.println(cutTest.substring(0,5));
		// cutTest.charAt(3);
		System.out.println(cutTest.substring(3,4));
		
		// 위치 바꾸기.
		String file = "test.jpg";
		String ex = file.substring(file.lastIndexOf(".")+1);
		String file_name = file.substring(0,file.lastIndexOf("."));
		System.out.println(ex+" : "+file_name);
		
		// valueOf
		// 자료형을 문자열로 바꾸기.
		double pi = 3.14;
		String piStr = String.valueOf(pi);
		System.out.println(piStr);
	
	
		// StringBulider
		// 추가하겠다.
		StringBuilder sb = new StringBuilder("Hello");
	    sb.append("World!!");
	    System.out.println(sb);
	    
	    // 한칸 띄우고 중간에 삽입하겠다.
	    sb.insert(5, " Java ");
	    System.out.println(sb);
	
	    //문자열 삭제(1).
	    sb.delete(11, 16+1);
	    System.out.println(sb);
	    
	    //문자열 삭제(2) 한 글자만 지우는 기능. indexOf와 함께 사용.
	    int idx = sb.indexOf("!");
	    sb.deleteCharAt(idx);
	    System.out.println(sb);
	    
	    // 문자열 뒤집기.  ex : Hello Java -> avaJ olleH
	    sb.reverse();
	    System.out.println(sb);
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
