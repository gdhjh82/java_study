package com.gn.homework02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {
	//- 기능 제공용 클래스 Practice를 생성하세요.
	//- 실행용 클래스 Run을 생성합니다.
	//- Practice에는 파일의 위치 정보를 매개변수로 받고, 소요 시간을 반환하는 메소드가 2개 있습니다.
	//- method1
	//    - FileInputStream만 사용하여 `C:\\test\\sub` 폴더에서파일 읽어서 출력하기
	//    - 파일명 “나비야1.dat”
	//- method2
	//   - BufferedInputStream을 함께 사용하여`C:\\test\\sub` 폴더에 있는 파일 읽어서 출력하기
	//    - 파일명 “나비야2.dat”
	public void method1() {
		File dir = new File("C:\\test\\sub");
        if (!dir.exists()) {
            dir.mkdirs();  // 디렉토리 없으면 생성
        }
	
        try (FileInputStream fos = new FileInputStream("C:\\test\\sub\\나비야1.dat")) {
        	
        }catch(IOException e) {
        	e.printStackTrace();
        }
	} 
        public void method2(){
            File dir = new File("C:\\test\\sub");
            if (!dir.exists()) {
                dir.mkdirs();  // 디렉토리 없으면 생성
            }
            try (BufferedInputStream bos = new BufferedInputStream(new FileInputStream("C:\\test\\sub\\나비야2.dat"))) {
             
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        
        
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
