package test.main;

import java.util.Random;

/*
 * 
 * 	1.cherry, apple, banana, melon, 7
 * 	5���� ���ڿ� �߿��� 1���� �����ϰ� ��µǰ� �غ�����.
 * 
 * 	2. 5���� ���ڿ� �߿��� 3���� ���ٿ� �ѹ��� �����ϰ� ��µǰ� �� ������.
 * 		��)cherry | apple | cherry
 * 			7    | apple | melon
 *          7    | 7     | 7
 *          
 *      -hint
 *      
 *      String[] items={"cherry","apple","banana","melon","7"}
 *      Random ran=new Random();
 *      int ranNum=ran.nextInt(5);
 */

public class MainClass07 {
	public static void main(String[] args) {	
		String[] items={"cherry","apple","banana","melon","7"};
		Random ran= new Random();
		int a =ran.nextInt(5);
		System.out.println(items[a]);
		
		int b =ran.nextInt(5);
		int c =ran.nextInt(5);
		int d =ran.nextInt(5);
		
		//����� ���ڿ��� �����ϱ�
		String line=items[b]+"|"+items[c]+"|"+items[d];
		System.out.println(line);
		
		//�迭�� �����Ҷ� + ,�ƴ�
		System.out.println(items[b]+items[c]+items[d]);
				
		
	}
}
