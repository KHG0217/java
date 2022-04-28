package test.mypac;

public class GlassesPro2Plus extends GlassesPro2 {
	
	public GlassesPro2Plus() {
		System.out.println("안경프로2 플러스 버전이 호출됩니다.");
	}
	
	public void Function4() {
		System.out.println("사진찍기 기능에 동영상 촬영도 추가됩니다.");
		System.out.println("노래듣기 기능에 노이즈캔슬링 기능이 추가됩니다.");
	}
	
	@Override
	public void takePicture() {
		System.out.println("일반사진을 촬영합니다.");
		System.out.println("동영상으로 촬영합니다.");
	}
	
	@Override
	public void Music() {
		System.out.println("노래리스트에서 노래를 불러옵니다.");
		System.out.println("노이즈 캔슬링모드가 실행됩니다.");
	}
}
