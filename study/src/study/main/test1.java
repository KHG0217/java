package study.main;

import study.mypac.Car;
import study.mypac.Info;
import study.mypac.Brand;

public class test1 {
	public static void main(String[] args) {
		Info m1=new Info(1, "������", true, "������", "ġŲ");
		Brand b1= new Brand();
		Car car1=new Car();
		b1.name="����Ű";
		car1.name="�׷���";
		m1.call();
		m1.callCB(car1,b1);
		
		Info m2=new Info(2,"��ƹ���",true,"����","???");
		Brand b2= new Brand();
		Car car2=new Car();
		b2.name="�Ƶ�ٽ�";
		car2.name="�ҳ�Ÿ";
		m2.call();
		m2.callCB(car2, b2);
		
		
				
	}
}