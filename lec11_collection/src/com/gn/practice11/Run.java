package com.gn.practice11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Map<Integer, Fruit> fruit
		=new HashMap<Integer,Fruit>();
		fruit.put( 1, new Fruit("포도","강화도", 3 , 35000));
		fruit.put( 2, new Fruit("사과","영주", 5 , 20000));
		fruit.put( 3, new Fruit("귤","제주", 10 , 15000));
		fruit.put( 4, new Fruit("배","나주", 7 , 50000));
		System.out.println(fruit);
		
		System.out.println("===전체 데이터 조회===");
		Set<Integer, Fruit> keySet = fruit.keySet();
	}

}
