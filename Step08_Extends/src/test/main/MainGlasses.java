package test.main;

import test.mypac.Glasses;
import test.mypac.GlassesPro1;
import test.mypac.GlassesPro2;
import test.mypac.GlassesPro2Plus;

public class MainGlasses {
	public static void main(String[] args) {
		Glasses g1 = new Glasses();
		g1.Function();
		
		GlassesPro1 g2 = new GlassesPro1();
		g2.Function();
		g2.Function2();
		g2.call();
		
		GlassesPro2 g3 = new GlassesPro2();
		g3.Function3();
		g3.Music();
		g3.SunGlasses();
		g3.takePicture();
		
		GlassesPro1 ex1 =g3; //가능
		//GlassesPro2 ex2 =g2; //불가능 자식객체가 부모객체를 담을순없음
		
		
		
		//안경 기능 추가(캐스팅)
		Glasses g4= new GlassesPro2();
		GlassesPro2 g4Fix=(GlassesPro2)g4; 
		//g4는 pro2의 기능까지 가지고 있어서 캐스팅기능으로 설명서업데이트 기능사용가능
		g4Fix.Function3();
		
		//안경기능추가 오류
		//Glasses ex3 = new GlassesPro1();
		//GlassesPro1 ex3Fix=(GlassesPro2)ex3; 
		// ex3는 pro1까지의 기능을 가지고 있는데, pro2의 기능을 가질 순없음.
		
		
		//안경 기능 수정 (재정의 Override)
		
		GlassesPro2Plus g5 = new GlassesPro2Plus();
		g5.Function4();
		g5.Music();
		g5.takePicture();
		
		
		
		
		
		
		
	
	}
}
