package test.mypac;

public class Car {
	//�����(field), class�ȿ� ������ ������ �������� x
	public String name; //����� , name�� null ������.
	
	
	//�޸��� ���(method)
	public void drive() {
		System.out.println(this.name+"��(��)�޷���!");
		//               ����ܰ迡�� �� ������ ���Ǿ �������� �������� �� ���ִ�.
	}
	//���ߴ� ���(method)
	public void stop() {
		System.out.println("�����!");
	}
}
