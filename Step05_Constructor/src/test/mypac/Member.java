package test.mypac;

public class Member {
	public int num;
	public String name;
	public String addr;
	
	/*
	 * �⺻ �����ڵ� �ʿ��ϴٸ� ������ �� �ִ�.
	 * �����ڴ� �������ǰ� �����ϴ�.
	 * ���� ��ü�� �����ϴ� ����� ���������� �� ���� �ִٴ� ���̴�.
	 */
	public Member() {}
	
	
	//�ʵ忡 ������ ���� �����ϴ� ������
	public Member(int num, String name, String addr) {
		            //���⼭ num,name,addr�� ��������
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
}