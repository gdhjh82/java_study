package com.gn.homework01;

public class Run {
	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] line = str.split("\n");
		
		Person[] persons = new Person[line.length];
		
		for(String a : line) {
			System.out.println(a);
		}
		for (int i = 0; i < line.length; i++) {
            String[] details = line[i].split(",");
            String name = details[0];
            int age = Integer.parseInt(details[1]);
            String address = details[2];
            String gender = details[3];
           
		}
		
		
			for (Person person : persons) {
            System.out.println(person);
        }
	}

}
