class Tv03{
	String color; //Tv 색상
	int channel; //채널 번호
	/* 클래스 소속 멤버변수에서 String 타입 변수는 null, int 타입 변수 channel은 0으로 각각 기본값으로 
	 * 초기화가 된다.
	 * 
	 */
	
	void channelUp() {
		++channel; // 채널번호 선행증가
	}
	
	void channelDown() {
		--channel; // 채널번호 선행감소
	}
}
public class Test03 {

	public static void main(String[] args) {
		Tv03 t01 = new Tv03();
		Tv03 t02 = new Tv03(); //t01과 t02 객체주소는 서로 다르다.
		
		System.out.println("tv01채널번호="+t01.channel+",tv02채널번호="+t02.channel);
		
	}

}
