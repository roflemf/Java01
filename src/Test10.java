/* 매개변수 즉, 전달인자 타입이 기본자료형이어서 
 * 값 전달방식에 의한 호출예제
 * 즉, 주소를 공유하지 않는다.
 */
class Vm10{
	void change(int y) { // y 매개변수에 값이 전달됌 => y=x
		System.out.println("y " + y); // 7
		y =10;
		System.out.println("y = " + y); // 10
		
	}

//값 공유하려면?!
	void change2(MyDate10 md) {//md=t;t객체주소가 md참조변수에 대입
		md.x=1000;
	}

}

class MyDate10{
	int x=0;
}
//


public class Test10 {
	
	public static void main(String[] args) {
		
		Vm10 v=new Vm10();
		int x = 7;
		System.out.println("change()메서드 호출전:x = "+x);	//7
		v.change(x); // 값 전달
		System.out.println("change()메서드 호출후:x = "+x); // 주소값을 공유안해서 값도 공유 안함. 7
		
//값 공유하려면?!
		MyDate10 t  = new MyDate10();
		t.x=100;
		System.out.println("t.x="+t.x);//100
		v.change2(t);
		System.out.println("t.x="+t.x);//1000
//
	}
	

}
