package test.mypac;

public class Car {
	//저장소(field), class안에 선언한 변수는 지역변수 x
	public String name; //저장소 , name은 null 상태임.
	
	
	//달리는 기능(method)
	public void drive() {
		System.out.println(this.name+"이(가)달려요!");
		//               설계단계에선 알 수없고 사용되어서 참조값이 생겼을때 알 수있다.
	}
	//멈추는 기능(method)
	public void stop() {
		System.out.println("멈춰요!");
	}
}
