package test.main;
import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 그 참조값을 p1 이라는 이름의 HandPhone type 지역변수에 대입하기
		HandPhone p1=new HandPhone();
		
		//p1안에 있는 참조값을 p2라는 Phone type 지역함수에 대입하기.
		Phone p2 =p1;
		
		//p1안에 있는 참조값을 p3라는 Object type 지역함수에 대입하기.
		Object p3=p1;
		
		//자식객체의 참조값은 부모 type변수나 필드에 자연스럽게 담긴다.
		Phone p4 = new SmartPhone();
		
		//부모객체를 자식 type에 담을수는 없다.
		//SmartPhone p5 = new Phone(); x
		
		
	
	}
}
