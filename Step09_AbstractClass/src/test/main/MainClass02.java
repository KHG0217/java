package test.main;

import test.mypac.MyWeapon2;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		//여러분이 직접 클래스를 만드고 객체 생성을 해서 아래 useWepon() 메소드를 호출해 보세요.
		Weapon khg =new MyWeapon2();
		MainClass02.useWeapon(khg);		 
	}
	//이 메소드는 아주 복잡한 동작을 하는 메소드라고 가정하자.
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();	
	
	}
}
