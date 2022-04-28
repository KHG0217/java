package study.main;

public class study01 {
	public static void main(String[] a) {
		System.out.println("Hello, World!");
		
		byte num1=10;
		short num2=10;
		int num3=1000;
		long num4=10;
		
		byte tmp1=(byte)num2;
		int tmp2=(int)num4;
		byte tmp3=(byte)num3;
		
		float num5=10.1f;
		double num6=10.2d;
		double num7=10.3;
		
		float tem4=(float)num7;
		
		boolean is=true;
		if(is) {
			System.out.println("복습해보자!");
		}
		is=10>15;
		
		if(is==false) {
			System.out.println("flase로 바뀌었네?");
			System.out.println("논리연산으로 얻어진값으로도 바뀌는구나");
		}
		
		
		
		
		
	}
}
