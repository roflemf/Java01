/* 전달인자 개수를 다르게 한 메소드 오버로딩
 * 
 */

class Mt05{
	void pr(int a, int b) {
		System.out.println(a+"\t"+b);
		
	}
	void pr(int a) { // 전달인자 개수를 다르게 한 메서드 오버로딩
		System.out.println(a);
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Mt05 mt = new Mt05();
		mt.pr(100);
		mt.pr(100, 200);

	}

}
