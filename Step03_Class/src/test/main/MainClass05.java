package test.main;

import test.mypac.Rect;

/*
 *  Rect ��� �̸��� Ŭ������ ������� �Ѵ�.
 *  
 *  �ش� Ŭ������ ��ü�� �����ϰ�
 *  
 *  �簢���� ����(width), ���̸�(hight) �� �ʵ忡 �����ϰ�
 *  
 *  showArea()�� ȣ���ϸ� �簢���� ���̰� �ܼ�â�� ��µɼ� �ֵ���
 *  
 *  Rect Ŭ������ ������ ������.
 *  
 *  
 */

public class MainClass05 {
	public static void main(String[] args) {
		Rect qua=new Rect();
		qua.height=10;
		qua.width=20;
		
		qua.showArea();
		
		//�޼ҵ尡 �������ִ� ���� ������ ��ƺ���.
		int sum=qua.getArea();
	}
}
