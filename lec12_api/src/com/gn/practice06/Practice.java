package com.gn.practice06;

public class Practice {
	public String test() {
		StringBuilder sb = new StringBuilder("WELCOME TO JAVA");
		
		sb.append("!");
		sb.insert(0, "<<");
		//  이 방식도 있긴 한데
	    //	sb.delete(10, 12+1);
		
		// 이런식으로도 응용해서 써봐라.
		int idx1 = sb.indexOf(" ");
		  int idx2 = sb.lastIndexOf(" ");
		    sb.delete(idx1, idx2);
		 System.out.println(sb);
		
		 
		return sb.reverse().toString();
	
	}
}
