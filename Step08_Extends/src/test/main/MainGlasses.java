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
		
		GlassesPro1 ex1 =g3; //����
		//GlassesPro2 ex2 =g2; //�Ұ��� �ڽİ�ü�� �θ�ü�� ����������
		
		
		
		//�Ȱ� ��� �߰�(ĳ����)
		Glasses g4= new GlassesPro2();
		GlassesPro2 g4Fix=(GlassesPro2)g4; 
		//g4�� pro2�� ��ɱ��� ������ �־ ĳ���ñ������ ����������Ʈ ��ɻ�밡��
		g4Fix.Function3();
		
		//�Ȱ����߰� ����
		//Glasses ex3 = new GlassesPro1();
		//GlassesPro1 ex3Fix=(GlassesPro2)ex3; 
		// ex3�� pro1������ ����� ������ �ִµ�, pro2�� ����� ���� ������.
		
		
		//�Ȱ� ��� ���� (������ Override)
		
		GlassesPro2Plus g5 = new GlassesPro2Plus();
		g5.Function4();
		g5.Music();
		g5.takePicture();
		
		
		
		
		
		
		
	
	}
}
