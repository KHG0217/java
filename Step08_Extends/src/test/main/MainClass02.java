package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

/*
 * 	지역변수나 필드앞에 선언하는 data type은 (참조 데이터 type 한에서)
 * 
 * 	그 안에 들어있는 참조값의 사용 설명서라고 생각하면 된다.
 * 
 * 	그렇기 떄문에 그 지역변수나 필드에 .을 찍으면 사용 설명서에 명시된 기능만 사용할 수 있다.
 * 
 * 	java의 모든객체는 다형성을 가질 수 있다.
 * 
 * 	다형성은 type이 여러개라는 의미이다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//다형성 확인
		HandPhone p1=new HandPhone();
		
		
		//어떤객체의 참조값을 부모type으로 받을 수 있다.
		Phone p2=new HandPhone();
		Object p3=new HandPhone();
	    //사용설명서느낌   //만들어진객체
	    //핸드폰이지만 object설명서를 가진 핸드폰
		
		
		
	}
}
