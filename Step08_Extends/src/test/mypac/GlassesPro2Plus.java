package test.mypac;

public class GlassesPro2Plus extends GlassesPro2 {
	
	public GlassesPro2Plus() {
		System.out.println("�Ȱ�����2 �÷��� ������ ȣ��˴ϴ�.");
	}
	
	public void Function4() {
		System.out.println("������� ��ɿ� ������ �Կ��� �߰��˴ϴ�.");
		System.out.println("�뷡��� ��ɿ� ������ĵ���� ����� �߰��˴ϴ�.");
	}
	
	@Override
	public void takePicture() {
		System.out.println("�Ϲݻ����� �Կ��մϴ�.");
		System.out.println("���������� �Կ��մϴ�.");
	}
	
	@Override
	public void Music() {
		System.out.println("�뷡����Ʈ���� �뷡�� �ҷ��ɴϴ�.");
		System.out.println("������ ĵ������尡 ����˴ϴ�.");
	}
}
