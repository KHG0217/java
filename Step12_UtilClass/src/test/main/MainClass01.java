package test.main;

import java.util.ArrayList;

/*
 * java���� �迭�� ũ�⸦ ������ �� ���� �����迭�̴�.
 * 
 * ���� �������� item�� �߰��ϰ� �����ϴ� �۾��� �Ϸ���
 * �Ϲݹ迭�� ����� �� ����.
 * 
 * �׷��� �ش� �۾��� �Ϸ��� ArrayList��ü�� ����ϸ� �ȴ�.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type�� ������ �� �մ� ArrayList ��ü����
		ArrayList<String> names=new ArrayList<>();
		//"�豸��","�ذ�"."������" 3���� String type�� ������ ������.
		names.add("�豸��");
		names.add("�ذ�");
		names.add("������");
		
		//���尪 �ҷ����� �̰��� b�� ���.
		String item =names.get(0);
		
		//1������ �������� �����Ϸ���? (�����ϸ� StringŸ���� ��ȯ��,a������)
		//�ڿ����ڰ� ������ 0 1 2 => 0 1
		String b =names.remove(1);
		
		//0���濡 "������"�� �ְ� ������?
		names.set(0, "������");
		
		//����� �������� ����(size)
		int size =names.size();
		
		//����� �������� ��ü����
		names.clear();
		
		
	}
}
