package test.mypac;

public class MyRemocon2 implements Remocon {

	@Override
	public void up() {
		System.out.println("새로운 클래스 만들어서 올리기.");	
	}
	@Override
	public void down() {
		System.out.println("새로운 클래스 만들어서 내리기.");		
	}
}
