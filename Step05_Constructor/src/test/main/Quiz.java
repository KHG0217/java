package test.main;

import java.util.Random;
import java.util.stream.IntStream;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * ������ ������ ���ڸ� ���� �ʹٸ�
		 * Random ��ü�� �ҿ��ؾ� �Ѵ�
		 * ���� new Random()�ؼ� ��ü�� ������
		 * ��ü�� �޼ҵ带 �̿��ؼ� ������ ���ڸ� �� ����
		 */
		Random num1=new Random();				
		//0~10 ������ ������ ���� �ϳ��� ���� ranNum�̶�� ���� ������ ��ƺ�����.
		int ranNum = num1.nextInt(11);
		System.out.println(ranNum);
		//1~45 ������ ������ ���� �ϳ��� ���� ranNum2��� ���� ������ ��ƺ�����.
		int ranNum2 = num1.nextInt(45)+1;
		System.out.println(ranNum2);
		//true or false �߿� ������ boolean���� ���� isRun�̶�� ���������� ��� ������.
		boolean isRun = num1.nextBoolean();
		System.out.println(isRun);
	}
}
