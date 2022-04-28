package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		//자식에게 사준 일반 핸드폰(인터넷이 안됨)
		HandPhone p1=new HandPhone();
		//             여기타입의 객체가 없는건 캐스팅안됨
		
		//SmartPhone 사주셈
		
		//설명서 갖고 옴 이제 그폰 SmartPhone임
		SmartPhone p2=(SmartPhone)p1;
		//     여기선 HandPhone이라 SmartPhone객체가 없어서 오류
		//           ClassCastException 발생 
		
		//X
		p2.doInternet();
		
	}
}
