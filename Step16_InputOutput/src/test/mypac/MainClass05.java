package test.mypac;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStrem 객체를 부모type OutputStream으로 받아보기
		//OutputStream도 1byte처리 스트림이다.
		OutputStream os =ps; // <-> InputStream
		// 2byte처리 스트림이다.
		OutputStreamWriter osw =new OutputStreamWriter(os);//<->InputStramRedear
		try {
			osw.write(44608);
			osw.write(54785);
			osw.write(44508);
			osw.write("입니다.");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
