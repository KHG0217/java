package test.mypac;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//�н��� ���ؼ� PrintStrem ��ü�� �θ�type OutputStream���� �޾ƺ���
		//OutputStream�� 1byteó�� ��Ʈ���̴�.
		OutputStream os =ps; // <-> InputStream
		// 2byteó�� ��Ʈ���̴�.
		OutputStreamWriter osw =new OutputStreamWriter(os);//<->InputStramRedear
		try {
			osw.write(44608);
			osw.write(54785);
			osw.write(44508);
			osw.write("�Դϴ�.");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
