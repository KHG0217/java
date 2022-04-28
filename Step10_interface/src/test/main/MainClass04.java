package test.main;

import java.util.ArrayList;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {			
			@Override
			public void up() {
				
				System.out.println("new Remocon ����鼭 �͸���Ŭ���� �ٷ� ���� �ø���");
			}			
			@Override
			public void down() {
				
				System.out.println("new Remocon ����鼭 �͸���Ŭ���� �ٷ� ���� ������");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {	
			@Override
			public void up() {
				System.out.println("�޼ҵ忡�� Ŭ���� ���� �ٷο÷���");
				
			}		
			@Override
			public void down() {
				System.out.println("�޼ҵ忡�� Ŭ���� ���� �ٷγ�����");
				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
	}
	
}
