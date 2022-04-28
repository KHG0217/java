package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
 public static void main(String[] args) {
	 //MyObject 클래스에 정의된 3개 메소드를 차례로 호출하는 code를 작성해 보세요.
	 MyObject a=new MyObject();
	 a.walk();
	 int num=a.getNumber();	
	 String greet=a.getGreeting();
	 Car car=a.getCar();
	 
	 // .setNum()  .setName()   useCar() 메소드 3개를 호출하는 code 를 작성해 보세요
	 a.setNum(27);
	 a.setName("김혁규");
	 a.useCar(new Car());
	 
	 //.listenMusic() 메소드를 호출하는 code 를 작성해 보세요.
	 a.listenMusic(new Radio(),new Speaker());
	 
  }
}
