package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public static String myName = "�豸��";
	
	public void test() {
		System.out.println("test() ȣ���");
	}
	public static void main(String[] args) {
		MyUtil.send();
		//test.mypac.MyUtil.send(); ��Ű������ �ҷ����°�� import�� ���� �����ϴ�.
		MyUtil.version="1.0";
		
		new MainClass02().test(); 
		//����ƽ�����̾ƴ� Mainclass02���������� �����  test��
		//static main �������� new�� �̿��ؼ� ��ü�� ���� �� ��������
		
		System.out.println(MainClass02.myName);
		//����ƽ������ ����� my Name�� static �������� Ŭ���������� �ٷ� ��������.
		System.out.println(myName);
		//���������� �ִ� Ŭ�������� ���� �����ϴ�.
		
		
	}
	
}
