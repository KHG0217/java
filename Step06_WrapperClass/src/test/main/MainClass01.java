package test.main;
/*
 * [�⺻ data type�� ���� data type]
 * 
 * byte : Byte
 * short : Short
 * int : Integer
 * long : Long
 * 
 * float : Float
 * double : Double
 * 
 * char : Character
 * boolean: Boolean
 *         [Wrapper Class]
 * 
 *  - ���δ� �⺻������ type �� ���������� type�� �ʿ��Ҷ��� �ִ�.
 *  - �⺻������ type�� ��ü�� ����(boxing)�ϴ� �����̴�.
 *  - boxing�� unboxing�� �ڵ����� �Ǳ� ������ ���α׷��Ӱ� �Ű��� �� �ʿ�� ����.
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main �޼ҵ尡 ���� �Ǿ����ϴ�.");
		//�⺻ ������ type
		int num1=10;
		//���� ������ type
		Integer num2=10;
			
		//���� ������ type ������ �⺻ ������ typeó�� ����� �� �ִ�.
		int result1=num2+1;
		int result2=num1+num2;
		
		//���ڸ� ���ڷ� �ٲٱ� 10 => "10"
		String strNum=num2.toString();
		
		//���ڸ� ���ڷ� �ٲٱ�
		String strNum2="999";
		int result4=Integer.parseInt(strNum2);
	}
}
