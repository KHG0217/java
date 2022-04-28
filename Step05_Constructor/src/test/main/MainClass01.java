package test.main;

import test.mypac.Member;
import test.mypac.Student;

public class MainClass01 {
	 public static void main(String[] args) {
		 Student s1=new Student();
		// new className() <->methoodName()
		// 생성자 콜               메쏘드 콜
		 s1.study();
		 s1.study();
		 s1.study();
		 
		 Member m1=new Member(1, "김구라", "노량진");
		 Member m2=new Member(2, "해골", "행신동");
		 Member m3=new Member();
		 m3.num=3;
		 m3.name="원숭이";
		 m3.addr="동물원";
		 
				 
		 

		 
		 //지역변수에 담지않고 일회용으로 사용하는 것
		 new Student().study();
		 new Student().goSchool();
	 }
	

}
