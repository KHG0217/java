package test.Quiz;

import java.util.Arrays;

public class P71682_다트문제 {
	public int solution(String dartResult) {
        int answer = 0;
        int[] scores = new int[3];
            
      for (int round = 0; round < 3; round++) {
         if (dartResult.startsWith("10")) { 
            scores[round] = 10;
            dartResult = dartResult.substring(2); 
         } else {

            scores[round] = dartResult.charAt(0) - '0';
            dartResult = dartResult.substring(1);
         }
                 
         char area = dartResult.charAt(0); 
         if (area == 'S' || area == 'D' || area == 'T') {
            if (area == 'S' ) {
               scores[round] = (int)Math.pow(scores[round], 1);
               dartResult = dartResult.substring(1);
               
            } else if (area == 'D') {
               scores[round] = (int)Math.pow(scores[round], 2);
               dartResult = dartResult.substring(1);
            } else {
               scores[round] = (int)Math.pow(scores[round], 3);
               dartResult = dartResult.substring(1);
            }
         }
         
         if (!dartResult.isEmpty() && (dartResult.charAt(0) == '*' || dartResult.charAt(0) == '#')) {
            if (dartResult.charAt(0) == '*') {
               scores[round] *= (2);
               if (round > 0) {
                  scores[round - 1] *= 2;                
               }
               dartResult = dartResult.replaceFirst("[*]", "");
            } else {
               scores[round] *= (-1);
               dartResult = dartResult.replaceFirst("[#]", "");
            }            
         }                  
      }      
      answer=Arrays.stream(scores).sum();
        return answer;
    }
}

