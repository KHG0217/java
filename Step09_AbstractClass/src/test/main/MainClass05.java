package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	// static �ʵ弱�� , ��ü�� ���������ϴ�.
	static Weapon w;
	//Weapon�� �߻�Ŭ���� ���� �ϼ����������.
	static Weapon w1 = new Weapon() {
		@Override
		public void attack() {
			System.out.println("���� �𸣰����� ��������!");			
		}		
	};
	
	
	public static void main(String[] args) {
		useWEapon(w1);
		
		Weapon w2= new Weapon() {

			public void attack() {
				System.out.println("��? �̰͵� �����ع���");	
			}		
		};
		
		useWEapon(w2);
		
		useWEapon(new Weapon() {

			public void attack() {
				System.out.println("��? �̰͵� �����ع���");	
			}		
		});
	}
	
	public static void useWEapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
