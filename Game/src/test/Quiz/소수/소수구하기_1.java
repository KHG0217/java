package test.Quiz.�Ҽ�;

import java.util.Arrays;

public class �Ҽ����ϱ�_1  {
	static int answer;
	static boolean primeNumber[]=delete();
		
	public static void main(String[] args) {	
 		int[] nums= {1, 2, 3, 4}; //�̰����ϴ� �迭
		int[] result= new int[3]; //��� ���ڸ� ��Ƶ� �迭.
		combination(0, 0,nums,result);
		System.out.println(answer);
				
	}
	
	public static boolean[] delete() {
		//1000������ �� 1000, �ι�°�� 999, ����° �� 998 (�Ѱ��� ����߱⿡ -1)
		boolean[] delete = new boolean[2998];
		
		//����Ʈ ���� false �̹Ƿ� true�� ��ȯ
		Arrays.fill(delete, true);
		//0,1�� �Ҽ��� �ƴϱ⶧���� false
		delete[0]=delete[1]=false;
		
		//2���� ���� i*i => 2x4 , 4x2�� ���⶧���� �ߺ�����?
		for(int i=2; i*i<delete.length; i++) {
			if(delete[i]) {
				//����x2,3,4,5,6,7,8 ... �Ҽ��� �ƴϱ⋚���� ���� false
				for(int j=2; i*j<delete.length; j++) {
					delete[i*j]=false;
				}
			}
		}	
		return delete;		
	}
	
	public static void combination(int cnt, int idx, int[] nums, int[] result) {
		// 3���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
		if (cnt == 3) {

			//System.out.println(result[0]+" "+result[1]+" "+result[2]);
			if( primeNumber[result[0]+result[1]+result[2]]) answer++;
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