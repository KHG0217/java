package test.mypac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   c:/acorn202203/myFolder/memo.txt ���Ͽ� ��ϵ� ���ڿ��� �о 
 *   �ܼ�â�� ����� ������.
 *   
 *   - hint 
 *   FileReader ��ü�� �� Ȱ���� ������.
 */
public class MainClass12 {
   public static void main(String[] args) {
      //���ڿ��� ������ ������ ����� ���� File ��ü
      File memoFile=new File("c:/acorn202203/myFolder/memo.txt");
      
      try {
         FileReader fr=new FileReader(memoFile);
         
         while(true) {
            int code=fr.read();
            if(code==-1) {
               break;
            }
            char ch=(char)code;
            //�����ȣ ���� ��� (println x print)
            System.out.print(ch);
            
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

