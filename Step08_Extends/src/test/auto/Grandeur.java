package test.auto;

public class Grandeur extends Car {

	public Grandeur(Engine engine) {
		super(engine);
	}
	
	public void Info() {
		System.out.println("2021 그렌저 입니다.");
		
	}
	@Override
	public void drive() {
		/*
		 * 재정의(오버라이드) 한 부모 메소드를 호출해야 할지 말지는
		 * 상황에 따라 다르다.
		 * 어떤 경우에는 부모의 메소드를 호출해 주지 않으면 객체가
		 * 제대로 동작을 안하는 경우가 있다.
		 * 그런 경우에는 부모의 메소드를 반드시 호출해 주어야 한다.
		 */
		super.drive(); //super는 부모클래스를 가르킴
		
		System.out.println("빠르게 달려요.");
	}
}
