package test.main;

import test.mypac.Car;
import test.mypac.CarFactory;

/*
 * �Ʒ��� ���� CarFactory ��� �̸��� Ŭ������ ����� ������
 * 
 * CarFactory ��ü�� getCar()��� �޼ҵ尡 �ְ�
 * 
 * �ش� �޼ҵ带 ȣ���ϸ� Car type ��ü�� �������� �����ϵ��� �޼ҵ带 ����� ������.
 */
public class MainClass06 {
	public static void main(String[] args) {
		//CarFactory ��ü�� �̿��ؼ� Car ��ü�� �������� ���ͼ�
		CarFactory cf=new CarFactory();
		//�� ��ü�� ���� �̸��� �ְ�
		Car car=cf.getCar();
		car.name="�ҳ�Ÿ";
		//drive() �޼ҵ带 ȣ���� ������.
		car.drive();
	}
}
