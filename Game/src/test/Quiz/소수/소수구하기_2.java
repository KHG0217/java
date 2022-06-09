package test.Quiz.소수;

import java.util.Arrays;

public class 소수구하기_2  {

	  public int solution(int[] nums) {
		    boolean[] isPrime = new boolean[1000 + 999 + 998 + 1];
		    int numOfPrimes = 0;

		    Arrays.fill(isPrime, true);

		    isPrime[0] = isPrime[1] = false;

		    for (int i = 2; i * i < isPrime.length; i++)
		      if (isPrime[i]) for (int j = 2; i * j < isPrime.length; j++) isPrime[i * j] = false;
		    
		    for (int i = 0; i < nums.length; i++)
		      for (int j = i + 1; j < nums.length; j++)
		        for (int k = j + 1; k < nums.length; k++)
		          if (isPrime[nums[i] + nums[j] + nums[k]]) numOfPrimes++;

		    return numOfPrimes;
		  }
		
}