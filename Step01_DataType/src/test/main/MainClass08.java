package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result =str.length(); //메소드의 return되는 값을 변수에 담아서 확인.
		char result2=str.charAt(9);
		
		//반복문으로 만들어서 한글자씩 다 확인하는 법.
		for (int i=0; i<result; i++) {
			str.charAt(i);
			
		}
		
		/*
		 * String 객체의 메소드를 활용해서
		 * str변수 안에 있는 문자를 모두 대문자(UpperCase)로 변환해서
		 * str2라는 이름의 변수에 담아 보세요.*/
		
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		//String 객체의 메소드를 활용해서
		//위의 문자열에서 mimi라는 문자열을 mama 라는 문자열로 교체 결과를 
		//grret2 에 담아보세요.
		
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is Kimgura";
		/*
		 * 1. 위의 문자열이 My라는 문자열로 시작 하는지 여부 (true or false)를
		 * isStart라는 변수에 담아 보세요.
		 * 
		 * 2. 위의 문자열에서 i가 문자열의 몇번째 인덱스에 위치하고 있는지를
		 * index라는 변수에 담아보세요.*/
		boolean isStart=message.startsWith("My");
		
		int index=message.indexOf("i");
		
	}
	  
}
