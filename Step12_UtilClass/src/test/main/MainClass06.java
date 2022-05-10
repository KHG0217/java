package test.main;

import java.util.ArrayList;

import test.mypac.Member;

public class MainClass06 {
	public static void main(String[] args) {
		//1. Member ��ü�� ���� �� �ִ� ArrayList ��ü�� �����ؼ� �������� member ��� ���������� ��ƺ�����.
		ArrayList<Member> member = new ArrayList<>();
		
		//2. 3���� ȸ�������� Member ��ü�� ���� ��ƺ�����. (Member ��ü�� 3�� �����Ǿ�� ��)
		Member info1=new Member(1, "�豸��", "�뷮��");
		Member info2=new Member(2, "�ذ�", "��ŵ�");
		Member info3=new Member(3, "������", "������");
		
		//3. ������ ������ Member ��ü�� �������� member List ��ü�� ��� ��� ������.
		member.add(info1);
		member.add(info2);
		member.add(info3);
		
		/*
		 * member List ��ü�� ��� ������ �̿��ؼ� ȸ������� �Ʒ��� ���� ��������
		 * �ݺ��� ���鼭 ����� ������.
		 * 
		 * ��ȣ: 1, �̸�: �豸��, �ּ�: �뷮��
		 * ��ȣ: 2, �̸�: �ذ�, �ּ�: ��ŵ�
		 */
		for (int i=0; i<member.size(); i++) {
			System.out.println("��ȣ: "+member.get(i).num+", �̸�: "+member.get(i).name+", �ּ�:"+member.get(i).addr);
		}
		              //�迭�� ������
		for(Member tmp:member) {
			System.out.println("��ȣ: "+tmp.num+", �̸�: "+tmp.name+", �ּ�:"+tmp.addr);
		}
		

	}
}
