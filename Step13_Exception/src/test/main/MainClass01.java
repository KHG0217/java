package test.main;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("�����Է�:");
		//���� ������ ���ڿ��� �Է� �޴´� "10" "20" "10.1"��
		String inputNum=scan.nextLine();
		try {
			//�Է��� ���ڸ�(���ڿ�) ���� ���ڷ� �ٲ۴�.
			double num=Double.parseDouble(inputNum);
			//�Է��� ���ڿ� 100�� ���Ѵ�.
			double result=num+100;
			System.out.println("�Է��� ���� +100 : "+result);
		}catch(NumberFormatException nfe) {
			//���� ��ü�� ���� ���� �޼����� ����
			String msg=nfe.getMessage();
			//�ܼ�â�� ����ϱ�
			System.out.println(msg+"�� ���ڰ� �ƴմϴ�.");
			//�ڼ��� ���� ������ ���ܰ�ü�� �ܼ�â�� ����ϰ� �ϱ�
			 nfe.printStackTrace();
		}

		
		System.out.println("���� �߿��� ������ �۾��� �ϰ� main �޼ҵ尡 ���� �˴ϴ�.");
	}
}