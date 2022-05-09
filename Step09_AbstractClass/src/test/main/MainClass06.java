package test.main;

import test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("����!");
				
			}
		};
		
		useWeapon(new Weapon() {			
			@Override
			public void attack() {
				System.out.println("�����ع���");				
			}
		});
		w1.attack();
	}
	
	
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
