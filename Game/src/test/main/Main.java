package test.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	 public static void main(String[] args) throws NumberFormatException, IOException {		   
		 //BufferedReader 선언 Scanner와 유사함
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 /*
		  * 입력 readLine() 메서드
		  *	특징1.리턴값이 String으로 고정 -> 다른타입 변환시 형변환 필수
		  *	특징2.예외처리 throw사용<-?
		  *	특징3.read한 데이터는 Line 단위로 나눠지기에 공백단위 데이터가공 x
		  *	->하려면 String.split()함수 활용 배열에 공백단위로 끊어 넣고 사용
		  */
		 
		 //StringTokenizer의 nextToken()함수는 readLine()을 통해 입력받은 값을
		 //공백단위로 구분하여 순서대로 호출 가능
		 StringTokenizer st = new StringTokenizer(bf.readLine());
 
		 int a =Integer.parseInt(st.nextToken());
		 int b =Integer.parseInt(st.nextToken());
		 int c =Integer.parseInt(st.nextToken());
		 
		 
	            	  
	      if((a==b)&&(a==c)) {
	         System.out.println(10000+a*1000);
	      }else if((a==b)||(a==c)) {
	         System.out.println(1000+a*100);
	      }else if((b==c)) {
	         System.out.println(1000+b*100);
	      }else if((a!=b)&&(a!=c)) {
	         int big = (a>b)&&(a>c)?a:(c>b?c:b);
	         System.out.println(big*100);
	      }
	   }
	}