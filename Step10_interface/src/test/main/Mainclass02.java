package test.main;

import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class Mainclass02 {
	public static void main(String[] args) {
		//직접 클래스를 test.mypac 패키지에 파일로 만들어서
		//useRemocon()메소드를 여기서 호출해 보세요.
		MyRemocon2 r1 = new MyRemocon2();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
