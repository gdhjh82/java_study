package com.gn.study;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		
		// 1. HashMap 생성
		
		// 양쪽 제네릭 동일, 
		Map<String,Object> flower = new HashMap<String, Object>();
		
		// 2. HashMap 요소 추가
		flower.put("name","샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
		
		// 중복된 key 사용
		// 위에 키값을 덮어 씌워 버림. 
		// 특정 조건이 성립 혹은 성립 되지 않을 때 키 값을 변환할 수도 있다.
		// if문을 또 ㅈㄴ게 응용해서 쓰라는 거겠지.
		
		flower.put("price", 50000);
		System.out.println(flower);
		
		// 3. HashMap<Key, 객체 > 요소 추가
		Map<String, Snack> snackMap = new HashMap<String, Snack>();
		
		// 다이제 = 뭐뭐뭐 하고 출력됨.
		snackMap.put("다이제", new Snack("초코맛", 1700));
		snackMap.put("새우깡", new Snack("매운맛", 900));
		snackMap.put("포테이토칩", new Snack("양파맛", 500));
		System.out.println(snackMap);
		
	/*	// 4. HashMap 요소 조회(1)
						//스트링으로 낮춰주겠다.
		String f_name =(String)flower.get("name");
		System.out.println(f_name);
		// 이렇게도 쓴다.
		System.out.println(flower.get("lang"));
		
		// 6. HashMap 요소 조회(2)
		// (1) HashMap 요소들의 key값으로 Set 만들기.
		
		// flower의 정보가 키셋에 들어감.
		Set<String> keySet = flower.keySet();
		// (2) Iterator 만들기
		Iterator<String> itkey = keySet.iterator();
		// (3) 손을 집어넣는다 -> hasNext()
		while(itkey.hasNext()) {
			// (4) 확인한다 -> next()
			String key = itkey.next();
//			System.out.println(key);
			///<... , .... > 확인
			Object value = flower.get(key);
			System.out.println(key+":"+value);
		}
		
		// (1) HashMap 요소들의 key+value 값으로 entrySet 만들기
		Set<Entry<String,Object>> entrySet = flower.entrySet();
		// (2) Iterator 만들기.
		Iterator<Entry<String,Object>> itEntry = entrySet.iterator();
		// (3) hasNext()
		while(itEntry.hasNext()){
			// next()
			Entry<String,Object> entry = itEntry.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"="+value);
		}
		*/
		
		
		// 5. HashMap<key, 객체> 요소 조회(1)
		// 변수로 쓸 수 있다.
		Snack s1 = snackMap.get("다이제");
		//자체로 투 스트링임. 호출 가능
		System.out.println(s1);
		//세터 가능. 키 값 여러개 불가능하기 때문에 바꿀수도 있다.
		s1.setFlavor("기본맛");
		System.out.println(snackMap);
		// 포테이토칩 양파맛을 소금맛으로 바꾸고 싶다.
		// 연속해서 쓸 수 없다.
		// 이런 식으로 간단하게 쓸 수 있다. 위에꺼를 줄인 느낌
		snackMap.get("포테이토칩").setFlavor("소금맛");
		System.out.println(snackMap);
		
		
		// 7 . HashMap<객체> 요소 조회(2)
		
		//(1) KeySet()
		Set<String> keySet = snackMap.keySet();
		Iterator<String> itkey = keySet.iterator();
		while(itkey.hasNext()) {
			String key = itkey.next();
			Snack value = snackMap.get(key);
			System.out.println(key+"::"+value);
		}
		//(2) entrySet()
		Set<Entry<String,Snack>>entrySet = snackMap.entrySet();
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key+"=="+value);
		}
		
		
		
		// 8. HashMap 요소 삭제
		// 조회하는 법.
//		System.out.println(flower.size()+" : "+flower);
		//선택해서 삭제
//		flower.remove("price");
//		System.out.println(flower.size()+" : "+flower);
		// 다 삭제
//		flower.clear();
//		System.out.println(flower.size()+" : "+flower);
	
		
		// 9. HashMap 요소 검색
		// 두개 다 값을 알면 왠만하면 key값으로 ㄱ
		if(flower.containsKey("price")) {
			System.out.println(" O ");
		}else {
			System.out.println(" x ");
		}
		
		if(flower.containsValue(40000)) {
			System.out.println("싸다!!");
		}else {
			System.out.println("비싸다~!");
		}
		
		// 10. HashMap<객체> 요소 검색
		if(snackMap.containsValue(new Snack("매운맛", 900))) {
			System.out.println("다 내꺼");
			
			
		// 11. LinkedHashMap
			Map<String, Object> flower2
	//		= new HashMap<String,Object>();
			= new LinkedHashMap<String, Object>();
			flower2.put("price", 20000);
			flower2.put("lang", "고백");
			flower2.put("name", "튤립");
			System.out.println(flower2);
			
		}
			Map<String, Object> flower3
			=new TreeMap<String,Object>(Collections.reverseOrder());
			// Collections.reverseOrder() 내림차순
			flower3.put("price", 20000);
			flower3.put("lang", "고백");
			flower3.put("name", "튤립");
			System.out.println(flower3);
	}
}
