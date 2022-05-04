package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		//필요한 참조값을 담을 지역변수를 미리 만든다.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.png");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied.jpg");
			//byte 알갱이를 읽어낼 byte[]객체 생성 한번에 1024byte씩 복사
			byte[] buffer=new byte[1024];
			while(true) {
				//배열을 저달해서
				int readedByte=fis.read(buffer);
				System.out.println("readedByte:"+readedByte);
				if(readedByte==-1) {
					break; //반복문 탈출
				}
				//byte[]에 있는 데이터를 0번방에서부터 읽은만큼(readedBute)출력하기
				fos.write(buffer, 0, readedByte);
				fos.flush();
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
