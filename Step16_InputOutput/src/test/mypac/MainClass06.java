package test.mypac;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		PrintStream ps=System.out;
		//�н��� ���ؼ� PrintStrem ��ü�� �θ�type OutputStream���� �޾ƺ���
		//OutputStream�� 1byteó�� ��Ʈ���̴�.
		OutputStream os =ps; // <-> InputStream
		// 2byteó�� ��Ʈ���̴�.
		OutputStreamWriter osw =new OutputStreamWriter(os);//<->InputStramRedear
		
		BufferedWriter bw=new BufferedWriter(osw);
		try {
			bw.write("�ϳ�");
			bw.write("\r\n");
			bw.write("��");
			bw.newLine(); //=bw.write("\r\n"); �����ȣ
			bw.write("��");
			bw.flush();
		} catch (IOException e) {		
			e.printStackTrace();
		}
		
		
		
		
	}
}
