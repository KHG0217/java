package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass15 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.png");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied.jpg");
			while(true) {
				try {
					int d=fis.read();
					if(d==-1)
						break;				
					fos.write(d);
					fos.flush();//방출 -> 안해주면 모여있다가 한번에 나감
					System.out.println("복사성공");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("복사성공");
		} catch (Exception e) {		
			e.printStackTrace();	
		}finally {
				try {
					if(fis!=null)fis.close();
					if(fos!=null)fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}	
		}				
	}
}
