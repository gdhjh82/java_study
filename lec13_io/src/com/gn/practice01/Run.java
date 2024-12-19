package com.gn.practice01;

import java.io.File;
import java.time.LocalDate;

public class Run {
	public static void main(String[] args) {
		LocalDate l1 = LocalDate.now();
		File f1 = new File("C:\\test\\sub");
		File f2 = new File("C:\\test\\sub\\"+l1.getYear()+"\\"+l1.getMonthValue()+"\\"+l1.getDayOfMonth()+"");
		f1.mkdirs();
		if(!f2.exists()) {
			if(f2.mkdirs()) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}
		}else {
			System.out.println("이미 존재하는 디렉토리");
		}
			
		Practice p1 = new Practice();
		File dir = new File("C:\\test\\sub");
		 
		p1.deleteFile(dir);
		
		
		
		
		
		
		
		
		
		
	}

}
