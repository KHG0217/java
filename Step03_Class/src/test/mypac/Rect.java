package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void showArea(){
		System.out.println("�簢���� ���̴�:"+this.width* this.height);
		
		//���� ����
		int area=width*height;
		
		System.out.println("����"+area);
	}
	//������ �޼Ҹ��� ȣ���ϰ����� �������ִ� �޼ҵ�
	public int getArea() {
		int area=width*height;
		return area;
	}
}
