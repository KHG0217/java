package test.main;

public class MainClass03 {
	/*
	 *  [ Java �⺻ ������ type ]
	 *  
	 *  2. ���� (boolean)
	 *  
	 *  - true, false �ΰ��� ���� �ϳ��̴�.
	 *  - true, false �� ���� ���ų� �񱳿��� Ȥ�� �� ������ ����� ���� �ִ�. 
	 *  - ���� ������ ��Ÿ���� ������ type 
	 */
	// run ������ ������ �帧�� ����Ǵ� Ư���� main �޼ҵ�(�⺻ �޼ҵ�)
	// main �޼ҵ� -> ������ ù ������.
	public static void main (String[] args) {
		//���� ���� ����� ���ÿ� �� �����ϱ�
		boolean isRun=true;
		if(isRun) {
			System.out.println("�޷���");
		}
		
		//�� ������ ����� ����� boolean �� ���
		boolean isGreter=10>1;
		//�� ������ ����� ����� boolean �� ���
		boolean result=true||false;
		
		//�ѹ� ������ ������ �ٽ� �����Ҽ� ����.
		//boolean result=false;
		result=false; //������ �ٸ� ���� ���� �Ҽ� �ִ�.(������ type �� ���)
		//result=10;
	}
}
