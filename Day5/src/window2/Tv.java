package window2;

public class Tv {

//	정적특징 -> 변수
//	 - 모양, 받침대가 있다
	
	String shape;
	boolean stand;
	
//	동적특징 -> 메서드
//	 - 채널변경하다, 티비를 켜다
	
	public void change (int ch) {
		System.out.println(ch + "번호로 채널 변경하다.");
	}
	
	public void turnOn() {
		System.out.println("티비를 켜다.");
	}
	
	
	
	
}
