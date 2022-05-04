package test.mypac;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass16 {
	public static void main(String[] args) {
		//�ʿ��� �������� ���� ���������� �̸� �����.
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("c:/acorn202203/myFolder/1.png");
			fos=new FileOutputStream("c:/acorn202203/myFolder/copied.jpg");
			//byte �˰��̸� �о byte[]��ü ���� �ѹ��� 1024byte�� ����
			byte[] buffer=new byte[1024];
			while(true) {
				//�迭�� �����ؼ�
				int readedByte=fis.read(buffer);
				System.out.println("readedByte:"+readedByte);
				if(readedByte==-1) {
					break; //�ݺ��� Ż��
				}
				//byte[]�� �ִ� �����͸� 0���濡������ ������ŭ(readedBute)����ϱ�
				fos.write(buffer, 0, readedByte);
				fos.flush();
			}
			System.out.println("���缺��");
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
