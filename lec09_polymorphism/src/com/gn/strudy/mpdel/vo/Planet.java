package com.gn.strudy.mpdel.vo;

public class Planet {
	public void description() {
		System.out.println("태양 주위를 공존하는 천체");
	}
	                        //오버로딩
	public void description(int age) {
		System.out.println(age+"억년");
	}

	
	
	public void material() {
		System.out.println("행성마다 물질이 달라요.");
	}
}
