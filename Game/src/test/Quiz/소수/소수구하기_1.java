package test.Quiz.소수;

import java.util.Arrays;

public class 소수구하기_1  {
	static int answer;
	static boolean primeNumber[]=delete();
		
	public static void main(String[] args) {	
 		int[] nums= {1, 2, 3, 4}; //뽑고자하는 배열
		int[] result= new int[3]; //대상 숫자를 담아둘 배열.
		combination(0, 0,nums,result);
		System.out.println(answer);
				
	}
	
	public static boolean[] delete() {
		//1000까지의 수 1000, 두번째수 999, 세번째 수 998 (한개씩 사용했기에 -1)
		boolean[] delete = new boolean[2998];
		
		//디폴트 값이 false 이므로 true로 변환
		Arrays.fill(delete, true);
		//0,1은 소수가 아니기때문에 false
		delete[0]=delete[1]=false;
		
		//2부터 시작 i*i => 2x4 , 4x2는 같기때문에 중복제거?
		for(int i=2; i*i<delete.length; i++) {
			if(delete[i]) {
				//숫자x2,3,4,5,6,7,8 ... 소수가 아니기떄문에 전부 false
				for(int j=2; i*j<delete.length; j++) {
					delete[i*j]=false;
				}
			}
		}	
		return delete;		
	}
	
	public static void combination(int cnt, int idx, int[] nums, int[] result) {
		// 3개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 3) {

			//System.out.println(result[0]+" "+result[1]+" "+result[2]);
			if( primeNumber[result[0]+result[1]+result[2]]) answer++;
			//System.out.println(Arrays.toString(result));
			return;
		}
		// 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
		for (int i = idx; i < nums.length; i++) {
			// 숫자를 담는다.
			result[cnt] = nums[i];
			// 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
			combination(cnt + 1, i + 1,nums, result);
		}
	}
	
	
}