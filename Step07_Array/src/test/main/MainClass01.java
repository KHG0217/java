package test.main;
/*
 *  java에서 배열도 객체이다.
 *  즉 배열은 참조데이터 type이다.
 *  배열을 나열하는 것 자체가 heap영역에 개체가 만들어진다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		// int type 5개
		int[] nums={10, 20, 30, 40, 50};
		// double type 5개를 저장하고 있는 배열
		double[] nums2= {10.1, 10.2, 10.3, 10.4, 10.5};
		// boolean type 5개를 저장하고 있는 배열
		boolean[] truth= {true,false,false,true,true};
		// String type (참조데이터 type)5개를 저장하고 있는 배열
		String[] name={"김구라","해골","원숭이","주뎅이","덩어리"};
		
		//배열의 각가의 방 참조 하기
		int result1=nums[0]; //10
		double result2=nums2[1]; //10.2
		boolean result3=truth[2]; //false
		String result4=name[3]; //"주뎅이"
		
		//배열 객체의 메소드와 필드 사용해 보기
		int[] clined=nums.clone();
		int size=nums.length;
	}
}
