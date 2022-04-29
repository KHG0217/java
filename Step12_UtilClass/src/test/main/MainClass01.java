package test.main;

import java.util.ArrayList;

/*
 * java에서 배열은 크기를 조절할 수 없는 고정배열이다.
 * 
 * 따라서 동적으로 item을 추가하고 삭제하는 작업을 하려면
 * 일반배열은 사용할 수 없다.
 * 
 * 그래서 해당 작업을 하려면 ArrayList객체를 사용하면 된다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// String type을 저장할 수 잇는 ArrayList 객체생성
		ArrayList<String> names=new ArrayList<>();
		//"김구라","해골"."원숭이" 3개의 String type을 저장해 보세요.
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		//저장값 불러오기 이값을 b에 담기.
		String item =names.get(0);
		
		//1번방의 아이템을 삭제하려면? (삭제하면 String타입을 반환함,a의저장)
		//뒤에숫자가 땡겨짐 0 1 2 => 0 1
		String b =names.remove(1);
		
		//0번방에 "에이콘"을 넣고 싶으면?
		names.set(0, "에이콘");
		
		//저장된 아이템의 갯수(size)
		int size =names.size();
		
		//저장된 모든아이템 전체삭제
		names.clear();
		
		
	}
}
