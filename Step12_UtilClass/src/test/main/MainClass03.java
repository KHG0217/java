package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 * 	Scanner ��ü�� �̿��ؼ� �ݺ��� ���鼭 ģ�� �̸��� 3�� �Է� �޾Ƽ�
		 *  �̸����� �̸��� ArrayList ��ü�� ������� ������ �ϴ� ���α׷����� �غ�����.
		 *  
		 *  - hint
		 *  Scanner scan = new Scanner(System.in)
		 */
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		
		for (int i=0; i<3; i++ ) {
			System.out.println("ģ���̸� �Է�");
			String info= scan.nextLine();
			names.add(i+"."+info);
		}
		//System.out.println("ģ���̸����: "+names);
		
		//����� ������ �ݺ��� ���鼭 ������� ����ϱ�
		for (int i=0; i<names.size(); i++) {
			//i��° item
			//.get(0 �޼ҵ尡 �������ִ� type�� String�� ������?
			//ArrayList<String>�̱� �����̴�.
			String tmp = names.get(i);
			System.out.println(tmp);
		}
		
		System.out.println("-----------");
		
		//Ȯ�� for ��
		             //names�迭�� ������
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
