package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		String str="abcde12345";
		int result =str.length(); //�޼ҵ��� return�Ǵ� ���� ������ ��Ƽ� Ȯ��.
		char result2=str.charAt(9);
		
		//�ݺ������� ���� �ѱ��ھ� �� Ȯ���ϴ� ��.
		for (int i=0; i<result; i++) {
			str.charAt(i);
			
		}
		
		/*
		 * String ��ü�� �޼ҵ带 Ȱ���ؼ�
		 * str���� �ȿ� �ִ� ���ڸ� ��� �빮��(UpperCase)�� ��ȯ�ؼ�
		 * str2��� �̸��� ������ ��� ������.*/
		
		String str2=str.toUpperCase();
		
		String greet="Hello! mimi, Bye! mimi";
		//String ��ü�� �޼ҵ带 Ȱ���ؼ�
		//���� ���ڿ����� mimi��� ���ڿ��� mama ��� ���ڿ��� ��ü ����� 
		//grret2 �� ��ƺ�����.
		
		String greet2=greet.replace("mimi", "mama");
		
		String message="My name is Kimgura";
		/*
		 * 1. ���� ���ڿ��� My��� ���ڿ��� ���� �ϴ��� ���� (true or false)��
		 * isStart��� ������ ��� ������.
		 * 
		 * 2. ���� ���ڿ����� i�� ���ڿ��� ���° �ε����� ��ġ�ϰ� �ִ�����
		 * index��� ������ ��ƺ�����.*/
		boolean isStart=message.startsWith("My");
		
		int index=message.indexOf("i");
		
	}
	  
}
