package test.main;

import java.util.Arrays;

public class Main  {
	static int[] nums= {1,2,7,6,4}; //뽑고자하는 배열
	static int[] result= new int[3]; //대상 숫자를 담아둘 배열.
	static int answer;
	public static void main(String[] args) {	
		 Main ex = new Main();
		combination(0, 0);	
		System.out.println(answer);

	}
	private static void combination(int cnt, int idx) {
		// 3개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 3) {
			String a=Arrays.toString(result);
			int num1=Integer.parseInt(String.valueOf(a.charAt(1)));
			int num2=Integer.parseInt(String.valueOf(a.charAt(4)));
			int num3=Integer.parseInt(String.valueOf(a.charAt(7)));

			if((num1+num2+num3)%2!=0 && (num1+num2+num3)%3!=0)  {
				answer++;
			}

			//System.out.println(Arrays.toString(result));
			return;
		}
		// 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
		for (int i = idx; i < nums.length; i++) {
			// 숫자를 담는다.
			result[cnt] = nums[i];
			// 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
			combination(cnt + 1, i + 1);
		}
	}
	
	
		
		//for(int i=0; i<nums.length; i++) {
			//서로다른 3 개의 수가 모두 더하게 만들어서
			//int a =nums[i]+nums[i+1]+nums[i+2];
			//System.out.println(a);
			
			//앞에서 부터 3개씩 더하고, 뒤에 수가 더있으면
			//경우의수를 따져 모두 더한다
			//if(i+1<nums.length && i+2<nums.length){
					
			//	int a =nums[i]+nums[i+1]+nums[i+2];
			//	System.out.println("i를더한숫자"+a); //1 4 8
			//	
			
			//		for(int e=1; e<nums.length; e++) {
			//			if(i+e<nums.length && i+e+1<nums.length) {
			//				int b = nums[i]+nums[i+e]+nums[i+e+1];
			//				System.out.println("e까지 더한숫자"+b);
			//			}
					
			//	}
				
				/*
					nums[0]+nums[1]+nums[2] = i i+1 i+2 1 10
					nums[0]+nums[1]+nums[3] = i i+1 i+3 2 9
					nums[0]+nums[1]+nums[4] = i i+1 i+4 3  7
					
					nums[0]+nums[2]+nums[3] = i i+2 i+3 4 14
					nums[0]+nums[2]+nums[4] = i i+2 i+4 5 12
					
					nums[1]+nums[2]+nums[3] = i+1 i+2 i+3 6 15
					nums[1]+nums[2]+nums[4] = i+1 i+2 i+4 7 13
					 
					nums[2]+nums[3]+nums[4] = i+2 i+3 i+4 8 17
					
				*/ 
					
				
		//	}
			
			//약수가 1과 자기 자신뿐인 수
			//if() {
				//result +1하기
			//	result+=result;
			//}
		//}
		
		
	//}

}