package com.gn.practice05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Run {
	public static void main(String[] args) {
		
		File f1 = new File("C:\\test\\sub");
		
		File fl1 = new File(f1,"애국가1.dat");
		
		FileInputStream a = null;
		try {
			a = new FileInputStream(fl1);
			byte[] b = new byte[(int)fl1.length()];
			byte[] c = new byte[5];
			
			int idx = 0;
			while(true) {
				int data = a.read(c);
				if(data== -1) break;
				System.arraycopy(c, 0, b, idx, data);
				idx += data;
			}
			String str = new String(b);
			System.out.println(str);	
		}catch(IOException e){
			e.printStackTrace();
			
		}finally{
			try {
				if(a != null) a.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}
	
	}
}
