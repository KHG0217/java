package test.main;

import java.util.HashMap;
import java.util.Map;

public class MainClass07 {
	public static void main(String[] args) {
		//      key,values
		final HashMap<String, Object> map1=new HashMap<>();
		//     Map������Ÿ�Ե� ����
		//final= map1�� �������� ������� �״�� ���� ��
		/*
	     *  HashMap<key ���� type, value ���� type>
	     *  
	     *  key �� generic class �� String ���� �����ϴ°��� �Ϲ����̴�.
	     *  value �� generic class �� ���� ������ type �� �����ϸ�ȴ�.
	     *  �������� type �� ��� �����Ÿ� Object �� �����ϸ� �ȴ�.  
         *
		 * 	������ ������ HashMap ��ü�� ������ ���� ���� 3������ ��ƺ�����.
		 * 	��ȣ:	1
		 * 	�̸�:	�豸��
		 * 	�������� ����: true
		 */
		map1.put("num", 1);
		map1.put("name", "�豸��");
		map1.put("isMan", true);
		System.out.println(map1);
		/*
		 * value�� Generic Ŭ������ Object�� ���� �Ǿ� �ֱ⶧����
		 * ���ϵǴ� Object type�� ���� type���� casting �ؾ��Ѵ�.
		 */
		
		//map1�� ��� ��ȣ�� num, �̸��� name, �������� ���δ� isMan �̶�� ���������� ��ƺ�����.
		int num=(int)map1.get("num");
		String name=(String)map1.get("name");
		boolean isMan=(boolean)map1.get("isMan");
		
		//������ key������ �ٽ� ������ ����
		map1.put("name", "������");
		
		//Ư�� key������ ��䳻�� ����, �����ϸ� true, �����ϸ� false ����
		map1.remove("isMan");
		
		//��λ���
		map1.clear();
	}
}
