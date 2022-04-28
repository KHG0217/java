package test.main;

public class MainClass03 {
	/*
	 *  [ Java 기본 데이터 type ]
	 *  
	 *  2. 논리형 (boolean)
	 *  
	 *  - true, false 두가지 값중 하나이다.
	 *  - true, false 를 직접 쓰거나 비교연산 혹은 논리 연산의 결과로 얻어낼수 있다. 
	 *  - 참과 거짓을 나타내는 데이터 type 
	 */
	// run 했을때 실행의 흐름이 실행되는 특별한 main 메소드(기본 메소드)
	// main 메소드 -> 실행의 첫 시작점.
	public static void main (String[] args) {
		//논리형 변수 선언과 동시에 값 대입하기
		boolean isRun=true;
		if(isRun) {
			System.out.println("달려요");
		}
		
		//비교 연산의 결과로 얻어진 boolean 값 담기
		boolean isGreter=10>1;
		//논리 연산의 결과로 얻어진 boolean 값 담기
		boolean result=true||false;
		
		//한번 선언한 변수는 다시 선언할수 없다.
		//boolean result=false;
		result=false; //변수에 다른 값을 대입 할수 있다.(동일한 type 인 경우)
		//result=10;
	}
}
