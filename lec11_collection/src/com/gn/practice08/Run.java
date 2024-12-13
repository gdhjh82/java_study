package com.gn.practice08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Run {
	public static void main(String[] args) {
		Set<Person> p1 = new HashSet<Person>();
		p1.add(new Person("홍길동", 20));
		p1.add(new Person("이순신", 25));
		p1.add(new Person("유관순", 22));
	
		
		Set<Person> p2 = new HashSet<Person>();
		p2.add(new Person("유관순", 22));
		p2.add(new Person("강감찬", 27));
		p2.add(new Person("을지문덕", 30));
		
		Set<Person> union = new TreeSet <Person>(p1);
		union.addAll(p2);
		
		System.out.println("===합집합===");
		Iterator<Person> iterator = union.iterator();
		while(iterator.hasNext()) {
			Person per = iterator.next();
			System.out.println(per);
		}
		System.out.println("===교집합===");
		Set<Person> union1 = new TreeSet <Person>(p1);
		union1.retainAll(p2);
		Iterator<Person> it1 = union1.iterator();
		while(it1.hasNext()) {
			Person per1 = it1.next();
			System.out.println(per1);
		}
		System.out.println("===차집합===");
		Set<Person> union2 = new TreeSet <Person>(p1);
		union2.removeAll(p2);
		Iterator<Person> it2 = union2.iterator();
		while(it2.hasNext()) {
			Person per2 = it2.next();
			System.out.println(per2);
	}	
		
		
  }
}
