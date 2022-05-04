package test.mypac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   c:/acorn202203/myFolder/memo.txt 파일에 기록된 문자열을 읽어서 
 *   콘솔창에 출력해 보세요.
 *   
 *   - hint 
 *   FileReader 객체를 잘 활용해 보세요.
 */
public class MainClass12 {
   public static void main(String[] args) {
      //문자열을 저장할 파일을 만들기 위한 File 객체
      File memoFile=new File("c:/acorn202203/myFolder/memo.txt");
      
      try {
         FileReader fr=new FileReader(memoFile);
         
         while(true) {
            int code=fr.read();
            if(code==-1) {
               break;
            }
            char ch=(char)code;
            //개행기호 없이 출력 (println x print)
            System.out.print(ch);
            
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}

