package test.main;

import test.mypac.MyUtil;

public class MainClass06 {
	public static void main(String[] args) {
		//Exception을 처리할 필요가 없다.
		MyUtil.draw();
		
		//send() 메소드에서 발생하는 Exception을 처리해야 한다.
		try {
			MyUtil.send();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
