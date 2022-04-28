package test.main;

import java.util.Random;

/*
 * 
 * 	1.cherry, apple, banana, melon, 7
 * 	5개의 문자열 중에서 1개가 랜덤하게 출력되게 해보세요.
 * 
 * 	2. 5개의 문자열 중에서 3개가 한줄에 한번에 랜덤하게 출력되게 해 보세요.
 * 		예)cherry | apple | cherry
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
		
		//출력할 문자열을 구성하기
		String line=items[b]+"|"+items[c]+"|"+items[d];
		System.out.println(line);
		
		//배열값 나열할땐 + ,아님
		System.out.println(items[b]+items[c]+items[d]);
				
		
	}
}
