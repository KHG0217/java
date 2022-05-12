package study.main;

import study.mypac.Car;
import study.mypac.Info;
import study.mypac.Brand;

public class test1 {
	public static void main(String[] args) {
		Info m1=new Info(1, "김혁규", true, "광진구", "치킨");
		Brand b1= new Brand();
		Car car1=new Car();
		b1.name="나이키";
		car1.name="그렌져";
		m1.call();
		m1.callCB(car1,b1);
		
		Info m2=new Info(2,"김아무개",true,"서울","???");
		Brand b2= new Brand();
		Car car2=new Car();
		b2.name="아디다스";
		car2.name="소나타";
		m2.call();
		m2.callCB(car2, b2);
		
		
				
	}
}