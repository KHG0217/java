package test.auto;

public class Grandeur extends Car {

	public Grandeur(Engine engine) {
		super(engine);
	}
	
	public void Info() {
		System.out.println("2021 �׷��� �Դϴ�.");
		
	}
	@Override
	public void drive() {
		/*
		 * ������(�������̵�) �� �θ� �޼ҵ带 ȣ���ؾ� ���� ������
		 * ��Ȳ�� ���� �ٸ���.
		 * � ��쿡�� �θ��� �޼ҵ带 ȣ���� ���� ������ ��ü��
		 * ����� ������ ���ϴ� ��찡 �ִ�.
		 * �׷� ��쿡�� �θ��� �޼ҵ带 �ݵ�� ȣ���� �־�� �Ѵ�.
		 */
		super.drive(); //super�� �θ�Ŭ������ ����Ŵ
		
		System.out.println("������ �޷���.");
	}
}
