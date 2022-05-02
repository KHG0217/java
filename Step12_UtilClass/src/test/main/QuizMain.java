package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/*
 *  run �� ������ �ζǹ�ȣ 6 ���� �����ϰ� ����ϴ� �ڵ带 �ۼ��� ������.
 *  
 *  1~45 ������ ���� �߿� 
 *  ���� ���;� �ϸ�
 *  �ߺ��Ǵ� ���ڰ� ������ �ȵǰ�
 *  ���� ���ں��� ū���� ���� ���ı��� �ؼ� ����� ������.
 *  
 */
public class QuizMain {
   public static void main(String[] args) {
      Random ran=new Random();
      
      //�ߺ��� �����Ͱ� ������� �ʴ� ������ �����Ҽ� �ִ� HashSet ��ü ����
      Set<Integer> st=new HashSet<>();
      
      //���� ���� ���鼭 
      while(true) {
         //������ ���ڸ� ���� 
         int ranNum=ran.nextInt(45)+1;
         //Stack ��ü�� ���� ��Ű��
         st.add(ranNum);
         //��ȣ�� 6���� �Ǹ�
         if(st.size()==6) {
            break; //�ݺ��� Ż��
         }
         
      }
      //Set�� �ִ� �����͸� ArrayList�� ���.
      List<Integer> nums=new ArrayList<>(st);
      //�����ϱ�.
      Collections.sort(nums);
      
      //����ϱ�
      for(int tmp:nums) {
    	  System.out.println(tmp+",");
      }
      
   }
}
