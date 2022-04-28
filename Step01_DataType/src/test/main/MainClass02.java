package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		
		//국어점수
		int kor=95;
		//영어점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.
		//소수점 까지 입력해줘야 소수점까지 결과가 나온다.
		double ave=(kor+eng)/2.0; //2d, 2f(float형)
		System.out.println("평균:"+ave);
	}
}
