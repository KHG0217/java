package test.main;

import java.util.ArrayList;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {			
			@Override
			public void up() {
				
				System.out.println("new Remocon 만들면서 익명의클레스 바로 만들어서 올리셈");
			}			
			@Override
			public void down() {
				
				System.out.println("new Remocon 만들면서 익명의클레스 바로 만들어서 내리셈");
			}
		};
		useRemocon(r1);
		
		useRemocon(new Remocon() {	
			@Override
			public void up() {
				System.out.println("메소드에서 클래스 만들어서 바로올려요");
				
			}		
			@Override
			public void down() {
				System.out.println("메소드에서 클래스 만들어서 바로내려요");
				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
		
	}
	
}
