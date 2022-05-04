package test.mypac;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStrem 객체를 부모type OutputStream으로 받아보기
		//OutputStream도 1byte처리 스트림이다.
		OutputStream os =ps; // <-> InputStream
		
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.flush(); //방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
