package test.main;

import java.util.Random;
import java.util.stream.IntStream;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 랜덤한 무작위 숫자를 얻어내고 싶다면
		 * Random 객체를 할용해야 한다
		 * 따라서 new Random()해서 객체를 생성후
		 * 객체의 메소드를 이용해서 무작위 순자를 얻어내 보자
		 */
		Random num1=new Random();				
		//0~10 사이의 랜덤한 정수 하나를 얻어내서 ranNum이라는 지역 변수에 담아보세요.
		int ranNum = num1.nextInt(11);
		System.out.println(ranNum);
		//1~45 사이의 랜덤한 정수 하나를 얻어내서 ranNum2라는 지역 변수에 담아보세요.
		int ranNum2 = num1.nextInt(45)+1;
		System.out.println(ranNum2);
		//true or false 중에 랜덤한 boolean값을 얻어내서 isRun이라는 지역변수에 담아 보세요.
		boolean isRun = num1.nextBoolean();
		System.out.println(isRun);
	}
}
