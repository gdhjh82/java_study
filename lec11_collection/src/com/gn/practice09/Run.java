package com.gn.practice09;

import java.util.HashMap;
import java.util.Map;

public class Run {
	public static void main(String[] args) {
		Map<String, Information> informap = new HashMap<String, Information>();
		informap.put("Tom",new Information("555-123-4567", 4600000));
		informap.put("Emma",new Information("987-654-3210", 2300000));
		informap.put("John",new Information("123-456-7890", 3800000));
		System.out.println("변경 전"+informap);
		
		informap.put("John",new Information("123-456-7890", 4100000));
		System.out.println("변경 후"+informap);
		
		informap.get("Emma").setPhone("111-111-1111");
		
		System.out.println("====Emma의 정보===");
		System.out.println("전화번호 :"+informap.get("Emma").getPhone());
		System.out.println("월급 :"+informap.get("Emma").getSalary());
	}

}
