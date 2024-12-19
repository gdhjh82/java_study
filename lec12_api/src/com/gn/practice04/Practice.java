package com.gn.practice04;

public class Practice {
	public String deleteBlank(String p) {
		p = p.trim();
		p = p.replace(" ", "");
		return p;
	}
}
