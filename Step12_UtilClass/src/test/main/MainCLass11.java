package test.main;

public class MainCLass11 {
	//������ ���ѷ��� ������ Ư�� ���ǿ��� Ż���ϴ� �ݺ���
	
	public static void main(String[] args) {
		int count=0;
		//��Ȯ�� �ݺ�Ƚ���� �� �� ������ ����� �� �ִ� �ݺ���	
		while(true) {
			count++;
			System.out.println("�ݺ�Ƚ��"+count);
			if(count==1000) {
				break; //������ ���(�ݺ���) Ż��
			}
		}
	}
}
