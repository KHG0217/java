package test.Quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ2048_�ֻ������� {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// BufferedReader ���� Scanner�� ������
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * �Է� readLine() �޼��� Ư¡1.���ϰ��� String���� ���� -> �ٸ�Ÿ�� ��ȯ�� ����ȯ �ʼ� Ư¡2.����ó�� throw���<-?
		 * Ư¡3.read�� �����ʹ� Line ������ �������⿡ ������� �����Ͱ��� x ->�Ϸ��� String.split()�Լ� Ȱ�� �迭��
		 * ��������� ���� �ְ� ���
		 */

		// StringTokenizer�� nextToken()�Լ��� readLine()�� ���� �Է¹��� ����
		// ��������� �����Ͽ� ������� ȣ�� ����
		StringTokenizer st = new StringTokenizer(bf.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = (a == b) || (a == c) ? a : b;

		if ((a == b) && (a == c)) {
			System.out.println(10000 + a * 1000);
			int big = (a > b) && (a > c) ? a : (c > b ? c : b);
		} else if ((a == b) || (a == c)) {

		} else {
			// Math.man(int a, int b) ũ�� a �ƴϸ� b ����
			int big = Math.max(a, Math.max(b, c));
			System.out.println(big * 100);
		}
	}
}