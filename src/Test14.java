/*0609
 *비트연산자
 * 피연산자를 이진수로 표현했을 때
 * |(OR 연산자)  : 피연산자 중 한 쪽의 값이 이면 결과값으로 1을 얻는다 . 그 외에는 0을 얻는다.
 * &(AND 연산자) : 피연산자 양쪽이 모두 인 경우는 결과로 1을 얻는다 . 그 외에는 0을 얻는다.
 * ^(XOR 연산자-> 배타적 XOR) : 피연산자의 값이 서로 다를 때만 결과값으로 1을 얻는다. 같을 때는 0을 얻는다.
 * 비트전환연산자 : 피연산자를 진수로 표현했을 때 0은 1로,  1은 0으로 바꾼다
 * 비트 단위 쉬프트 연산자:
 * 	<< A << B
	A 정수를 B 비트만큼 왼쪽으로 이동시키고 오른쪽 비트는 항상 0으로 채운다.
=> A*(2의B승)과 같은 결과

 *  >> A >> B
	정수 를 비트만큼 오른쪽으로 이동시키고 왼쪽 비트는 양 A B ,
	수일 경우 으로 음수일 경우 로 채운다 0 , 1 . 
	
 *  >>> A >>> B
	정수 를 비트만큼 오른쪽으로 이동시키고 왼쪽 비트는 항 A B ,
	상 으로 채운다 0 .
 */
public class Test14 {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 20;
		int result = 0;
		
		result = a | b; // 비트 or 연산자 => |
		System.out.println(a+" | " + b + " = "+ result); // 28
		
		result = a & b; // 비트 and 연산
		System.out.println(a + " & " + b + " = "+ result); // 4
		
		result = a ^ b; // 배타적 xor 연산
		System.out.println(a+" ^ " + b + " = "+ result); // 24
		
		result = ~a; // 비트 전환
		System.out.println("~" + a + " -> " + result); // -13
		
		byte x = 15;
		System.out.println("15 << 2 = "+ (x << 2)); // 60
		System.out.println("15 >> 2 = "+ (x >> 2)); // 3
		
		
		
	}

}
