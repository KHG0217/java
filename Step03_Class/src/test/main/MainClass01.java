package test.main;
/*
 *  class 의 역활
 *  
 *  1.객체의 설계도
 *  
 *  2.data type의 역활
 *  
 *  3.static 필드와 메소드를 포함하는 역활.
 */
import test.mypac.Car; //mypac.* 하면 test.mypac에 모든 요소 가져오는것, 지금은 car 클래스만
//수입하기

public class MainClass01 {
	public static void main(String[] args) {
		Car car1=new Car(); //new car하고 컨트롤+스페이스로 찾을 수 있다. new 새로운 객체를 만드는것
	// 클래스 자체가 data type이기 때문에 car타입
		car1.name="BMW 530i"; //필드는 . 필드명 대입연사자 이용해서 만듬.
		car1.drive();
		car1.stop();
		
		
		Car car2=new Car();
		car2.name="람보르기니";
		car2.drive();
		car2.stop();
	}
}
