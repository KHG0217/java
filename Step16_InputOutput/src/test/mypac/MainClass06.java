package test.mypac;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//학습을 위해서 PrintStrem 객체를 부모type OutputStream으로 받아보기
		//OutputStream도 1byte처리 스트림이다.
		OutputStream os =ps; // <-> InputStream
		// 2byte처리 스트림이다.
		OutputStreamWriter osw =new OutputStreamWriter(os);//<->InputStramRedear
		
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("하나");
			bw.write("\r\n");
			bw.write("둘");
			bw.newLine(); //=bw.write("\r\n"); 계행기호
			bw.write("셋");
			bw.flush();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		
		
		
	}
}
