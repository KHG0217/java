package test.main;

import test.mypac.Car;
import test.mypac.MyObject;
import test.mypac.Radio;
import test.mypac.Speaker;

public class MainClass01 {
 public static void main(String[] args) {
	 //MyObject Ŭ������ ���ǵ� 3�� �޼ҵ带 ���ʷ� ȣ���ϴ� code�� �ۼ��� ������.
	 MyObject a=new MyObject();
	 a.walk();
	 int num=a.getNumber();	
	 String greet=a.getGreeting();
	 Car car=a.getCar();
	 
	 // .setNum()  .setName()   useCar() �޼ҵ� 3���� ȣ���ϴ� code �� �ۼ��� ������
	 a.setNum(27);
	 a.setName("������");
	 a.useCar(new Car());
	 
	 //.listenMusic() �޼ҵ带 ȣ���ϴ� code �� �ۼ��� ������.
	 a.listenMusic(new Radio(),new Speaker());
	 
  }
}
