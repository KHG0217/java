package test.Quiz.�Ҽ�;
public class �Ҽ����ϱ�_1  {
	static int answer;
	public static void main(String[] args) {	
		int[] nums= {1, 2, 3, 4}; //�̰����ϴ� �迭
		int[] result= new int[3]; //��� ���ڸ� ��Ƶ� �迭.
		combination(0, 0,nums,result);	
		System.out.println(answer);

	}
	public static void combination(int cnt, int idx, int[] nums, int[] result) {
		// 3���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
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
		// ��� ������ �־��� �ε������� ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = idx; i < nums.length; i++) {
			// ���ڸ� ��´�.
			result[cnt] = nums[i];
			// �ڽ��� ��� ȣ���Ѵ�(�ڽ� ������ ���� �ߺ� �������� �ʵ��� �ε����� +1�Ͽ� ��͸� ȣ���Ѵ�).
			combination(cnt + 1, i + 1,nums, result);
		}
	}
	
	

}