package study.mypac;

public class Info {
	public int num;
	public String name;
	public boolean gender;
	public String addr;
	public String food;
	

	public Info (int num,String name, boolean gender, String addr, String food) {
		this.num =num;
		this.name=name;
		this.gender=gender;
		this.addr=addr;
		this.food=food;	
	}
	
	public void call() {
		System.out.println("ȸ������:"+this.num+","+this.name+","+this.gender+","+this.addr+","+this.food);
	}
	
	public void callCB(Car c, Brand b) {

		System.out.println(this.name+"�Բ��� "+b.name+"���԰� "+c.name+"��(��) Ÿ�� ���̽��ϴ�.");
	}
	
	
	

	
	
	
}
