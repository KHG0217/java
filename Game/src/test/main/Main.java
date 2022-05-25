package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;


public class Main {
	public static void main(String[] args) {
		List<Integer> set1=new ArrayList<>();
		int budget=10;
		int result=0;
		int [] d=new int[4];
		d[0]=2;
		d[1]=2;
		d[2]=3;
		d[3]=3;
		
		
		for(int i=0; i<d.length; i++) {
			set1.add(d[i]);
		}
			 
		Collections.sort(set1);
		Iterator<Integer> it=set1.iterator();
		int a=it.next();
			while(budget-a>=0) {				
				if(budget-a==0) {
					result++;
					break;
				}
				
				budget=budget-a;			
				result++;
				a=it.next();
											
			}
			
	
			System.out.println(result);	

    }
}