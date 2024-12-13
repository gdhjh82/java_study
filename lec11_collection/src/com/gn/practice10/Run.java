package com.gn.practice10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {
	public static void main(String[] args) {
		
		Map<String, Planet> planet = new HashMap<String, Planet>();
		planet.put("Earth",new Planet("지구", 12742, 1.0));
		planet.put("Mars",new Planet("화성", 6779, 1.88));
		planet.put("Venus",new Planet("금성", 12104, 0.62));
		planet.put("Mercury",new Planet("수성", 4878, 0.24));
		System.out.println(planet);
		
		System.out.println("***keySet() 사용***");
		Set<String> keySet = planet.keySet();
		Iterator<String> itkey = keySet.iterator();
		while(itkey.hasNext()) {
			String key = itkey.next();
			Planet value = planet.get(key);
			String name = value.getName();
			int diameter = value.getDiameter();
			double salary = value.getSalary();
			System.out.println("행성이름 :"+key+"("+name+"), 지름 :"+diameter+"km, 공전주기 :"+salary+"년");
		}
		System.out.println("***entrySet() 사용***");
		Set<Entry<String,Planet>>entrySet = planet.entrySet();		
		Iterator<Entry<String,Planet>> itdey = entrySet.iterator();
		while(itdey.hasNext()) {
			Entry<String,Planet> entry = itdey.next();
			String key = entry.getKey();
			Planet value = entry.getValue();
			System.out.println("키 :"+key+value);
			
		}
		
		
	}

}
