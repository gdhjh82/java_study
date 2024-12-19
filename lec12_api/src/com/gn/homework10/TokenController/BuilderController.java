package com.gn.homework10.TokenController;

public class BuilderController {
	//기본 생성자
	public BuilderController() {}
	
	// 1. 공백 제거 후 문자열 반환
	public String afterReplace(String str) {
		return str.replace(" ","");
		
	}
	// 2. 첫 글자만 대문자로 바꾼 문자열 반환
	public String firstCap(String input) {
		if(input == null || input.isEmpty()) {
			return input;
		}
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}
	// 3. 특정 문자 개수 찾기
	public int findCar(String input,char one) {
		 int count = 0;
	        for (int i = 0; i < input.length(); i++) {
	            if (input.charAt(i) == one) {
	                count++;
	            }
	        }
	        return count;
	} 
}
