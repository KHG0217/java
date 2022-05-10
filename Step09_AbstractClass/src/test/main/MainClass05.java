package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	// static 필드선언 , 객체도 생성가능하다.
	static Weapon w;
	//Weapon은 추상클래스 여서 완성시켜줘야함.
	static Weapon w1 = new Weapon() {
		@Override
		public void attack() {
			System.out.println("뭔진 모르겠지만 공격하자!");			
		}		
	};
	
	
	public static void main(String[] args) {
		useWeapon(w1);
		
		Weapon w2= new Weapon() {

			public void attack() {
				System.out.println("엥? 이것도 공격해버려");	
			}		
		};
		
		useWeapon(w2);
		
		useWeapon(new Weapon() {

			public void attack() {
				System.out.println("엥? 이것도 공격해버려");	
			}		
		});
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
