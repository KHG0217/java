package test.main;

import java.util.Arrays;

public class Main  {
	static int[] nums= {1,2,7,6,4}; //�̰����ϴ� �迭
	static int[] result= new int[3]; //��� ���ڸ� ��Ƶ� �迭.
	static int answer;
	public static void main(String[] args) {	
		 Main ex = new Main();
		combination(0, 0);	
		System.out.println(answer);

	}
	private static void combination(int cnt, int idx) {
		// 3���� ���������Ƿ�, ����� ����ϰ� ��͸� �����Ѵ�.
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
		// ��� ������ �־��� �ε������� ��ȸ�ϸ� ���ڸ� �ϳ� �����Ѵ�.
		for (int i = idx; i < nums.length; i++) {
			// ���ڸ� ��´�.
			result[cnt] = nums[i];
			// �ڽ��� ��� ȣ���Ѵ�(�ڽ� ������ ���� �ߺ� �������� �ʵ��� �ε����� +1�Ͽ� ��͸� ȣ���Ѵ�).
			combination(cnt + 1, i + 1);
		}
	}
	
	
		
		//for(int i=0; i<nums.length; i++) {
			//���δٸ� 3 ���� ���� ��� ���ϰ� ����
			//int a =nums[i]+nums[i+1]+nums[i+2];
			//System.out.println(a);
			
			//�տ��� ���� 3���� ���ϰ�, �ڿ� ���� ��������
			//����Ǽ��� ���� ��� ���Ѵ�
			//if(i+1<nums.length && i+2<nums.length){
					
			//	int a =nums[i]+nums[i+1]+nums[i+2];
			//	System.out.println("i�����Ѽ���"+a); //1 4 8
			//	
			
			//		for(int e=1; e<nums.length; e++) {
			//			if(i+e<nums.length && i+e+1<nums.length) {
			//				int b = nums[i]+nums[i+e]+nums[i+e+1];
			//				System.out.println("e���� ���Ѽ���"+b);
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
			
			//����� 1�� �ڱ� �ڽŻ��� ��
			//if() {
				//result +1�ϱ�
			//	result+=result;
			//}
		//}
		
		
	//}

}