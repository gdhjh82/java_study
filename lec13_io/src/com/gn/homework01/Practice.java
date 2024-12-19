package com.gn.homework01;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class Practice {
    
    // method1: FileOutputStream만 사용하여 파일에 저장
    public void method1(String song) {
        File dir = new File("C:\\test\\sub");
        if (!dir.exists()) {
            dir.mkdirs();  // 디렉토리 없으면 생성
        }

        try (FileOutputStream fos = new FileOutputStream("C:\\test\\sub\\나비야1.dat")) {
            fos.write(song.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method2: BufferedOutputStream과 FileOutputStream을 함께 사용하여 파일에 저장
    public void method2(String song) {
        File dir = new File("C:\\test\\sub");
        if (!dir.exists()) {
            dir.mkdirs();  // 디렉토리 없으면 생성
        }

        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\test\\sub\\나비야2.dat"))) {
            bos.write(song.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
