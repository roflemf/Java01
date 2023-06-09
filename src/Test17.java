//change()메서드 arr 매개변수 타입이 참조타입인 배열이어서 
//주소에 의한 전달 => 배열주소를 공유
class Mt17{
	public void change(int[] arr) { // arr매개변수 타입이 배열이면 참조타입이다. 즉 주소에 의한 전달
		arr[0] = 100;
		System.out.println("arr[0]= " + arr[0]);//100
	}
}
public class Test17 {
	public static void main(String[] args) {
		int y = 10;
		int[] x = {10}; // 배열크기가 1인 x -> x[0]=10;
		System.out.println("x[0] = " + x[0]);//10
		Mt17 mt = new Mt17();
	
		mt.change(x);// 배열주소가 전달 => 배열주소를 공유
		System.out.println("change()메서드 호출 후 x[0]= "+x[0]);//100
	}
}
