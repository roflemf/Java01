//change() d매개변수 타입이 레퍼런스 타입 Data13 클래스형이어서 t객체주소를 공유

class Data13{
	int a ; //기본값 0으로 초기화
	
}

class Value13{
	void change(Data13 d) {//매개변수 타입이 참조타입이어서 객체주소값 전달
		d.a = 1000;
	}
	
}

public class Test13 {
	public static void main(String[] args) {
		
		Data13 t = new Data13();
		t.a = 100;
		System.out.println("t.a="+t.a); //100
		Value13 v13 = new Value13();
		v13.change(t);// t객체주소를 전달
		System.out.println("t.a = "+ t.a);//t객체주소가 공유되어서 1000
	}

}
