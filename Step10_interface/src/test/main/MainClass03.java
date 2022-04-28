package test.main;

import test.mypac.Remocon;

public class MainClass03 {
	
	static class YourRemocon implements Remocon{
		@Override
		public void up() {
			System.out.println("����Ŭ������ ���� �÷���");			
		}
		
		@Override
		public void down() {
			System.out.println("����Ŭ������ ���� ������");			
		}
		
	
	}
	
	public static void main(String[] args) {
		YourRemocon r1 = new YourRemocon();
		
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
	}
	
}
