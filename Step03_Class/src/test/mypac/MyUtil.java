package test.mypac;

public class MyUtil {
	//필드
	public static String version;
	
	//메소드
	public static void send() {
		//static 이라는 예약어가 붙으면 객체를 생성할 필요가 없다. Myutil.send()
		System.out.println("전송합니다.");
	}
}
