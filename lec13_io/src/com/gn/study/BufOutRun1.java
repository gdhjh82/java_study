package com.gn.study;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufOutRun1 {
	public static void main(String[] args) {
		
		File dir = new File("C:\\test\\sub\\241219");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		File file = new File(dir,"sample3.dat");
		
		// 스트림 생성 / 버퍼드
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String str = "how are you? \n"
					+ "I'm fine thank you\n";
			bos.write(str.getBytes());
			bos.write(str.getBytes());
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
