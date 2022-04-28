package test.main;

import test.mypac.MyUtil;

public class MainClass02 {
	
	public static String myName = "김구라";
	
	public void test() {
		System.out.println("test() 호출됨");
	}
	public static void main(String[] args) {
		MyUtil.send();
		//test.mypac.MyUtil.send(); 패키지명을 불러오는경우 import는 생략 가능하다.
		MyUtil.version="1.0";
		
		new MainClass02().test(); 
		//스태틱영역이아닌 Mainclass02지역변수로 선언된  test는
		//static main 영역에서 new를 이용해서 객체를 만든 후 참조가능
		
		System.out.println(MainClass02.myName);
		//스태틱영역에 선언된 my Name은 static 영역에서 클래스명으로 바로 참조가능.
		System.out.println(myName);
		//같은공간에 있는 클래스명은 생략 가능하다.
		
		
	}
	
}
