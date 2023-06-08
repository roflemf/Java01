import java.util.Scanner;

/*
 * 메서드 오버로딩이란?
 * 	같은 클래스내에 동일 메서드명을 여러번 중복해서 정의하는 것을 메서드 오버로딩이라고 함.
 * 
 * 	동일 메서드 오버로딩 구분요건)
 * 	  가. 전달인자 자료형을 다르게 한다.
 * 	  나. 전달인자(매개변수) 개수를 다르게 한다.
 * 	  다. 전달인자 순서를 다르게 한다.
 *  
 */
class Mt04{
	int abs(int data) {
		if(data<0)
			data = -data;
		return data;
		
	}
	
	double abs(double data) {
		if(data<0) {
			data = -data;
		}
		return data;
	}//전달인자 타입(자료형)을 다르게 한 메서드 오버로딩
}
public class Test04 {
	public static void main(String[] args) {
		
		Mt04 mt = new Mt04();
		int result = mt.abs(-100);
		System.out.println("-100의 절대값="+result);
		
		
		 /* 문제) Scanner를 사용해서 음의 실수값을 입력받은 다음 double abs(double data){} 
		  * 오버로딩된 메서드를 호출한 다음 양의 절대치 실수 숫자 결과값을 구하는 코드 완성
		  */
		
		System.out.println("\n============================\n");
		
		Scanner scan= new Scanner(System.in);
		/* 1. System.in은 키보드 입력장치와 연결됌.
		 */
		System.out.print("음의 실수값 입력 >> ");
		double data = scan.nextDouble(); //실수 숫자만 입력
		System.out.println(data+" 의 양의 절대치 실수 숫자값 = " + mt.abs(data));
		
		
		
		
	}
}
