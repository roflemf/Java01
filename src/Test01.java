class Member01{
	/* 1. class 키워드로 클래스명 Member01을 정의
	 * 2. 클래스명 첫글자는 관례적으로 영문대문자로 한다.
	 */
	
	String name;
	int age;
	
}

class Thing {
	int x;
}


public class Test01 {
	public static void main(String[] args) {
	
		Member01 mem; //객체주소가 저장 안된 참조변수 즉 레퍼런스 변수
		mem = new Member01(); // 객체주소가 저장된 참조변수
		
		mem.name = "홍길동";
		mem.age = 33;
		
		System.out.println("이름 : " + mem.name + ", 나이 : " + mem.age);
		/* 1. System.out은 모니터 출력장치와 연결
		 * 2. print()는 출력하라는 메서드, ln은 줄바꿈
		 * 3. ;(세미콜론)은 한문장 끝을 의미함.
		 * 
		 * 
		 */
		
		System.out.println("===========================");
		Member01 b = new Member01();
		b.name = "펭귄";
		b.age = 12;
		
		System.out.println("이름:" + b.name + "\t나이:"+ b.age);
		
		System.out.println("===========================");
		Thing thing = new Thing();
		thing.x = 10;
		System.out.println("thing.x = " + thing.x);
		
		
		
	}
}
