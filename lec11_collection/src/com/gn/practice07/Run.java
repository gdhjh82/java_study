package com.gn.practice07;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		Set<Equipment> storage1 = new HashSet<Equipment>();
		storage1.add(new Equipment("라켓", 15000));
		storage1.add(new Equipment("배트", 6000));
		storage1.add(new Equipment("축구공", 3000));
	
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트", 6000));
		storage2.add(new Equipment("야구공", 5000));
		storage2.add(new Equipment("글로브", 9000));
		
		Set<Equipment> union = new HashSet<>(storage1);
		union.addAll(storage2);
		
		System.out.println("***합집합***");
		Iterator<Equipment> iterator = union.iterator();
		while(iterator.hasNext()) {
			Equipment ele = iterator.next();
			System.out.println("- "+ele);
		}
		
		System.out.println("***교집합***");
		// 교집합 로직
		
	}
	
}
