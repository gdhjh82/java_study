package com.gn.practice05;

public class Run {
	public static void main(String[] args) {
		String[] words = {"java", "application", "programming", "interface"};
		
		String a = "";
        for (int i = 0; i < words.length; i++) {
            a += words[i];  // 단어를 연결
            if (i < words.length - 1) {
                a += " ";  // 마지막 단어 뒤에는 공백을 넣지 않음
            }
        }
		
        // 2. 두 번째, 세 번째, 네 번째 단어의 첫 글자를 대문자로 변환
        String b = "";
        for (int i = 1; i <= 3; i++) {  // 두 번째, 세 번째, 네 번째 단어의 첫 글자 추출
            b += Character.toUpperCase(words[i].charAt(0));  // 첫 글자를 대문자로 변환하여 추가
        }
		
		System.out.println("문장 : "+a);
		System.out.println("변환 : "+b);
		
		
	}

}
