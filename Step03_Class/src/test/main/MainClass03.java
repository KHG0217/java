package test.main;

import test.mypac.Member;

/*
 *		�Ѹ��� ȸ�� ������ ���� �� �ִ� ��ü�� ������
 *		Member Ŭ������ test.mypac ��Ű���� ����� ������.
 */
public class MainClass03 {
	public static void main(String[] args) {
		//Member Ŭ������ "��ü"(new �ؾ��ϴ±���)�� �����ؼ� �������� m1 �̶�� ������ ���.
		Member m1=new Member();
		m1.num=1;
		m1.name="�豸��";
		m1.addr="�뷮��";
		
		
		/*
		 * ���� ����� �۾��� javascript�� �Ѵٸ�?
		 * 	 let m1={};
		 *   num=1;
		 * 	 name="�豸��";
		 *   addr="�뷮��";
		 *   
		 *   or
		 *   
		 *   let m1={num:1, name:"�豸��", addr:"�뷮��";};
		 */
		
		
		//2.�ذ�, ��ŵ� �̶�� ȸ�������� Member ��ü�� ��� ������.
		Member m2=new Member();
		m2.num=2;
		m2.name="�ذ�";
		m2.addr="��ŵ�";
		
		//m1 �ȿ� �ִ� �������� �̿��ؼ� �ܼ�â�� �豸���� ������ �Ʒ��� ���� �������� ����� ������.
		//��ȣ:1,�̸�:�豸��,�ּ�:�뷮��
		System.out.println("��ȣ:"+m1.num+",�̸�:"+m1.name+",�ּ�:"+m1.addr);
	
	}
}
