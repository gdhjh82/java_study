package com.gn.study;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderRun {
	public static void main(String[] args) {
		
		// 읽어들일때는 디렉토리, 파일 뭐 다 안 써도 된다.
		// 1. 디렉토리, 파일 생성
		File file = new File("C:\\test\\sub\\sample.txt");
		
		// 2. 파일 입력 스트림 선언(텍스트)
		FileReader fr = null;
		try {
			// 3. 파일 입력 스트림 생성	
			fr = new FileReader(file);
			// 4. 읽을 단위 지정
			StringBuilder sb = new StringBuilder();
		
			// (1) int 형태로 읽어볼게
		//	while(true) {
		//		int data = fr.read();
		//		if(data == -1) break;
		//		sb.append((char)data);
		//	}
			
			// (2) char[]을 사용하는 방법
			char[]std = new char[3];
			while(true) {
				int data = fr.read(std);
				if(data == -1) break;
				sb.append(std, 0, data);
				
			}
					
			System.out.println(sb.toString());
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr != null) fr.close();				
			}catch(IOException e) {
				e.printStackTrace();				
			}
		}
		
		
	}

}
