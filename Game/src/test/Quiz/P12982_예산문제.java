package test.Quiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
public class P12982_예산문제 {

	    public int solution(int[] d, int budget) {
	        int answer = 0;
	        List<Integer> set1=new ArrayList<>();
	        for(int i=0; i<d.length; i++) {
				set1.add(d[i]);
			}       
	        Collections.sort(set1);
			Iterator<Integer> it=set1.iterator();
			int a=it.next();
				while(budget-a>=0) {				
					if(budget-a==0) {
						answer++;
						break;
					}				
					budget=budget-a;			
					answer++;
					a=it.next();
				}
	        return answer;
	    }
	
}
