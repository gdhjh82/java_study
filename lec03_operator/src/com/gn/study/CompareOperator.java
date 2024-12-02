package com.gn.study;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 =5;
		int num2 =10;
		
		// 1. 등호
		System.out.println(num1==num2);
		boolean same = num1==num2;
		
		// 2. (부)등호
		boolean diff = num1!=num2;
		
		// 3. 크다, 작다
		boolean big = num1 > num2;
		boolean small = num1 < num2;
		
		// 4. 크거나 같다, 작거나 같다.
		boolean bigSame = num1>=num2;
		
		// 5. char와 비교 연산자
		char c1= 'a';
		char c2= 'A';
		System.out.println(c1 < c2);
		System.out.println( (int) c1+"<"+(int)c2 );
		// int는 괄호 치고 등호는 " " 붙히고 양 옆에 + 붙히기
		
		// 6. equals
		String str1 = "apple";
		String str3 = new String("apple");
		
		// 같은 표현
		boolean bool = str1.equals(str3);
		bool = str3.equals(str1);
		
		//7. 논리 연산자
		int a = 6;
		int b = 5;
		int c = 7;
		
		//
		
		// (1) AND : 6은 5보다 크고, 그리고 6은 7보다 큰가요?
		boolean andBool = a > b && a > c;
		System.out.println(andBool);
		
		// (2) OR : 6은 5보다 크고, 또는 6은 7보다 큰가요?
		boolean orBool = a > b || a > c;
		System.out.println(orBool);
		// 비교연산자를 동시에 안되지만 그걸 위해 필요한게 && , ||
		
		// 9 논리 부정 연산자
		boolean isTrue = true;
		boolean isFalse = !isTrue;
		System.out.println(isFalse);
		
		// 논리 연산자(&& , ||) 와 함께 사용 했을 때
		boolean test1 = 3<5; // true
		boolean test2 = 6<5; // false
		// true && false -> false -> true
		System.out.println(!(test1 && test2) );
		// true && !false -> true && true = true
		System.out.println(test1 && !test2);
		
		//9. 삼항 연산자
		int x = 5;
		int y = 10;
		boolean result = x> y;
		// x랑 y중에서 더 큰 값을 출력 하고 싶다.
		// 조건식 ? true 일 때 결과 : faise 일 때의 결과
		int max = x > y ? x : y;
		System.out.println(x > y ? x : y);
		
		int z = 3;
		// 3개의 정수 중에서 가장 큰 수 찾기
		int big2 = x > y ? (x > z ? x : z) : (y > z ? y : z);
		
		
		
 	
	}

}
