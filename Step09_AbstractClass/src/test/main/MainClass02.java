package test.main;

import test.mypac.MyWeapon2;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//�������� ���� Ŭ������ ����� ��ü ������ �ؼ� �Ʒ� useWepon() �޼ҵ带 ȣ���� ������.
		Weapon khg =new MyWeapon2();
		MainClass02.useWeapon(khg);		 
	}
	//�� �޼ҵ�� ���� ������ ������ �ϴ� �޼ҵ��� ��������.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();	
	
	}
}
