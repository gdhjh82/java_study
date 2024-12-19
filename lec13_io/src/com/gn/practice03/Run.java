package com.gn.practice03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		
		File f1 = new File("C:\\test\\sub");
		if(f1.exists()==false) {
			f1.mkdirs();
		}
		
		File file = new File(f1,"애국가1.dat");
		
	
		FileOutputStream out = null;
		FileOutputStream set = null;
		try {
			out = new FileOutputStream(file);
			set = new FileOutputStream(file, true);
			String song = "동해물과 백두산이 마르고 닳도록 하느님이 보우하사"
					+ "\n우리나라 만세 무궁화 삼천리 화려강산"
					+ "\n대한사람 대한으로 길이 보전하세";
			String song2 = "\n남산위에 저 소나무 철갑을 두른듯"
					+ "\n바람서리 불변함은 우리기상 일세"
					+ "\n무궁화 삼천리 화려강산 "
					+ "\n대한사람 대한으로 길이보전하세";
			byte[] arr = song.getBytes();
			byte[] arr2 = song2.getBytes();
			out.write(arr);
			set.write(arr2);
			out.flush();
			set.flush();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(set !=null) {
					set.close();
				}
			}catch(IOException e){
				
			}
					
			
			try {
				if(out != null) {
					out.close();
				}
			}catch(IOException e){
				
			}
		}
		

	// 아예 그냥 트라이 캐치문을 나눠서 한번 해보면 될듯.
		
	
	
	
	
	}

}
