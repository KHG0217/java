package study.main;

import java.util.Scanner;

public  class  Main{
	public static void main(String[] args) {
		System.out.println(" �������� �ܼ��� �Է��ϼ���:");
		Scanner inputnum = new Scanner(System.in);
		int num=inputnum.nextInt();
		
		for(int i=1; i<10; i++) {
			int result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
	}
}
