package test.main;
/*
 *  class �� ��Ȱ
 *  
 *  1.��ü�� ���赵
 *  
 *  2.data type�� ��Ȱ
 *  
 *  3.static �ʵ�� �޼ҵ带 �����ϴ� ��Ȱ.
 */
import test.mypac.Car; //mypac.* �ϸ� test.mypac�� ��� ��� �������°�, ������ car Ŭ������
//�����ϱ�

public class MainClass01 {
	public static void main(String[] args) {
		Car car1=new Car(); //new car�ϰ� ��Ʈ��+�����̽��� ã�� �� �ִ�. new ���ο� ��ü�� ����°�
	// Ŭ���� ��ü�� data type�̱� ������ carŸ��
		car1.name="BMW 530i"; //�ʵ�� . �ʵ�� ���Կ����� �̿��ؼ� ����.
		car1.drive();
		car1.stop();
		
		
		Car car2=new Car();
		car2.name="���������";
		car2.drive();
		car2.stop();
	}
}
