package test.main;

import test.mypac.MyRemocon2;
import test.mypac.Remocon;

public class Mainclass02 {
	public static void main(String[] args) {
		//���� Ŭ������ test.mypac ��Ű���� ���Ϸ� ����
		//useRemocon()�޼ҵ带 ���⼭ ȣ���� ������.
		MyRemocon2 r1 = new MyRemocon2();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
