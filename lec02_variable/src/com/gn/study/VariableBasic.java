package com.gn.study;

public class VariableBasic {
	// ctrl + space -> "main"
	public static void main(String[] args) {
		// 1. 변수 선언
		int number;
		// 2. 변수 초기화
		int age;
		age = 100;
		int age2 = 100;
		// 3. 변수 표준출력
		System.out.println(age);
		// 4. 변수의 재할당
		int score = 90;
		System.out.println("1 : "+score);
		score = 95;
		System.out.println("2 : "+score);
		// 변수 명명 규칙
		// 예약어를 변수 이름으로 사용할 수 없음
		// 변수 이름에는 영문자, 숫자, 특수문자, 한글 사용 가능
		// 특수문자는 _ 언더바와 $ 달러만 사용 가능
		// 변수의 첫글자는 소문자
		// 여러 단어 이름은 단어의 첫 알파벳을 대문자 변수는 대소문자 구분
		// 변수 이름에는 공백 포함 불가능
		
		
		
		//5. 문자열 변수의 초기화
		String str1 = new String("감사");
		String str2 = "합니다.";
		// 6. 기본형과 문자열 비교
		int num1 = 2;
		int num2= 2;
		System.out.println(num1 == num2);
		String text1 = new String("apple");
		String text2 = new String("apple");
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2));
		
		//7. charAt()
		String word="Hello";
		char first = word.charAt(0);
		System.out.println(first);
		
		String name = "재갈민이에요!";
		char triple= name.charAt(2);
		System.out.println(triple);
		
		// 8. 업캐스팅 -(1)할당
		// 값은 범위가 작은 데이터 -> 큰 변수에 할당
		int a = 23;
		double b = a;
		System.out.println(b);
		
		// (2) 연산
		int c= 3;
		double d=20.5;
	
		System.out.println(c+d);
		
    	// 9. 다운캐스팅
		double d_num =13.4;
		int i_num = 4;
		System.out.println(d_num+i_num);
		System.out.println((int)d_num+i_num);
		
		// 10. char형변환
		// (1) 할당
		char test ='a';
		int su = test;
		System.out.println(su);
		
		// (2) 연산
		int e = 50;
		char f = '2';
		System.out.println(e+f);
		
		// 문자 형태로 작성된 숫자를
		// 온전한 숫자값으로 도출하는 방법
		System.out.println(f-'0');
		
		//대문자 소문자
		System.out.println( (char) ( (int)'a'-32) );
		System.out.println((int)'A');
		
		// 11. 상수
		final double PI = 3.14;
		final int MAX_SIZE = 100;
		
		int a1 = 10;
		double a2 = 5.7;
		int a3 = a1 +(int)a2;
		double a4 = a1 + a2;
		
				
		System.out.println(a3);
		System.out.println(a4);
	
		
	}

}
