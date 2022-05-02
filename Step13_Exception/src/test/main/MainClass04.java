package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		File f= new File("c:/acorn202203/myFolder/memo.txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//위의 경로에 실제로 파일을 만들어 주는 file 객체의 메소드를 찾아서 실행하고
		//실제로 파일이 만들어 지는지 확인해 보세요.
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
