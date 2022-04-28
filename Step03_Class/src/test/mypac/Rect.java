package test.mypac;

public class Rect {
	public int width;
	public int height;
	
	public void showArea(){
		System.out.println("사각형의 넓이는:"+this.width* this.height);
		
		//면적 얻어내기
		int area=width*height;
		
		System.out.println("면적"+area);
	}
	//면적을 메소르를 호출하곳으로 리턴해주는 메소드
	public int getArea() {
		int area=width*height;
		return area;
	}
}
