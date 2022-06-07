package test.Quiz.소수;
public class 소수구하기_1  {
	static int answer;
	public static void main(String[] args) {	
		int[] nums= {1, 2, 3, 4}; //뽑고자하는 배열
		int[] result= new int[3]; //대상 숫자를 담아둘 배열.
		combination(0, 0,nums,result);	
		System.out.println(answer);

	}
	public static void combination(int cnt, int idx, int[] nums, int[] result) {
		// 3개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
		if (cnt == 3) {
			int a=0;
			//System.out.println(result[0]+" "+result[1]+" "+result[2]);
			for(int i=1; i<=result[0]+result[1]+result[2]; i++) {
				if((result[0]+result[1]+result[2])%i==0) {									
					a=a+1;										
				}
			}
			if(a==2) {
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
			combination(cnt + 1, i + 1,nums, result);
		}
	}
	
	

}