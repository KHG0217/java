package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		
		//�ڽĿ��� ���� �Ϲ� �ڵ���(���ͳ��� �ȵ�)
		HandPhone p1=new HandPhone();
		//             ����Ÿ���� ��ü�� ���°� ĳ���þȵ�
		
		//SmartPhone ���ּ�
		
		//���� ���� �� ���� ���� SmartPhone��
		SmartPhone p2=(SmartPhone)p1;
		//     ���⼱ HandPhone�̶� SmartPhone��ü�� ��� ����
		//           ClassCastException �߻� 
		
		//X
		p2.doInternet();
		
	}
}
