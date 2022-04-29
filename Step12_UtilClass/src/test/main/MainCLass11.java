package test.main;

public class MainCLass11 {
	//외형상 무한루프 이지만 특정 조건에서 탈출하는 반복문
	
	public static void main(String[] args) {
		int count=0;
		//정확한 반복횟수를 알 수 없을때 사용할 수 있는 반복문	
		while(true) {
			count++;
			System.out.println("반복횟수"+count);
			if(count==1000) {
				break; //인접한 블록(반복문) 탈출
			}
		}
	}
}
