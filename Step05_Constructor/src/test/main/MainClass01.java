package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	 public static void main(String[] args) {
		 Student s1=new Student();
		// new className() <->methoodName()
		// ������ ��               �޽�� ��
		 s1.study();
		 s1.study();
		 s1.study();
		 
		 Member m1=new Member(1, "�豸��", "�뷮��");
		 Member m2=new Member(2, "�ذ�", "��ŵ�");
		 Member m3=new Member();
		 m3.num=3;
		 m3.name="������";
		 m3.addr="������";
		 
				 
		 

		 
		 //���������� �����ʰ� ��ȸ������ ����ϴ� ��
		 new Student().study();
		 new Student().goSchool();
	 }
	

}
