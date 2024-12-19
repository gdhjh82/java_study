package com.gn.practice02;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class Run {
	public static void main(String[] args) {
		File f1 = new File("C:\\test\\sub");
		 /// replace 활용	
		String uuid = UUID.randomUUID().toString().replace("-", "");
		File f2 = new File(f1,uuid+".txt");
		try {
			if(f2.exists()==false) {
				f2.createNewFile();
			}			
		}catch(IOException e){
			e.printStackTrace();	
		}
	}

}
