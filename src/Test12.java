/* change()메서드 매개변수 x 타입이 기본자료형 int이어서 값에 의한 전달
 */

class Data12{
	 int x;
	
	
}

class Value12{
	
	void change(int x) { //기본타입 매개변수 x -> 값이 전달됨

		System.out.println("x="+x); // 100
		x =1000;
		System.out.println("x="+x); // 1000
	}
	
}


public class Test12 {
	public static void main(String[] args) {
		
		Data12 d = new Data12();
		d.x = 100;
		System.out.println("change()메서드 호출전 :d.x="+d.x);//100
		
		Value12 v12 = new Value12();
		v12.change(d.x);//값 100전달
		System.out.println("change()메소드 호출후:d.x="+d.x);//100
		
		
	}

}
