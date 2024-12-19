package com.gn.study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutRun1 {
	public static void main(String[] args) {
		// 1. 디렉토리 생성
		File dir = new File("C:\\test\\sub");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		
		//FileNotFoundException은 FileOutputStream 떔에
		//IOException은 out.write 땜에.
		
		// 2. 파일 생성
		File file = new File(dir,"sample1.dat");
		// 3. FileOutputStream 생성
		
		//선언과 생성을 안에서 다 하는게 하니라
		//선언은 밖에 생성은 안에
		
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(file);
			//4. 출력할 데이터 구성
			String str = "hello";
			byte[] arr = str.getBytes();
			//5. 출력
			out.write(arr);
			//6. 플러싱 (선택)
			out.flush();
			System.out.println(file.length()+"크기의 "+file.getParent()+"파일 생성");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 7. 스트림 닫기.
				if(out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
