package test.main;

import java.io.PrintStream;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone ��ü�� �����ؼ� �� �������� p1 �̶�� �̸��� HandPhone type ���������� �����ϱ�
		HandPhone p1=new HandPhone();
		
		//p1�ȿ� �ִ� �������� p2��� Phone type �����Լ��� �����ϱ�.
		Phone p2 =p1;
		
		//p1�ȿ� �ִ� �������� p3��� Object type �����Լ��� �����ϱ�.
		Object p3=p1;
		
		//�ڽİ�ü�� �������� �θ� type������ �ʵ忡 �ڿ������� ����.
		
		SmartPhone p4=(SmartPhone)p1;
	}
}
