package test.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BOJ8958_1_OX���� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int count=Integer.parseInt(br.readLine());		

		
			for(int i=0; i<count; i++) {			
				boolean b=false;
				int jumsu=0;
				int sum=0;
				String s=br.readLine();			
				String[] arrayWord;
				arrayWord = s.split("");
				for(int j=0; j<arrayWord.length; j++) {																								
						//�ּҸ� ����Ű�� ��.
					if(b=arrayWord[j].equals("O")) {										
						jumsu +=++sum;
					}else {
							sum=0;
					 }						
				}
				System.out.println(jumsu);

			}					

	}
		
}