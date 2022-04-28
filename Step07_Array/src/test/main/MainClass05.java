package test.main;

import java.util.Scanner;

public class MainClass05 {
	 public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		 //키보드로부터 입력받을 수 있는 객체생성	
		Scanner scan=new Scanner(System.in);
		//한줄 입력 받은 뒤
		System.out.println("문자열 입력:");
		String str=scan.nextLine();
		//입력받은 문자열을 콘솔에 출력하고
		System.out.println(str);
		//종료
		System.out.println("main 메소드가 종료 됩니다.");
		
    }
}
