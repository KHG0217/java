package study.main;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		int isWrite=1;
		String[] msgs =new String[10];
		Scanner mum = new Scanner(System.in);
		
		while (isWrite==1) {		
			for (int i=0; isWrite==1; i++) {
				System.out.println("문자열 입력");
				String data=mum.nextLine();
				msgs[i]=data;
				System.out.println("계속 작성하시겠습니까? yes:1 no:아무숫자");
				Scanner choice = new Scanner(System.in);
				int num =choice.nextInt();
				isWrite=num;
			}
			
						
			
		}
			
		System.out.println("종료");
		for(int i=0; i<msgs.length; i++) {
			System.out.println(msgs[i]);
		}
		
	}
}
