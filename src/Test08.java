/* 기본 자료형과 참조 즉 레퍼런스 자료형의 차이점
 * 
 */
class MyDate08{
	int year = 2022;
	int month = 6;
	int day = 1;
	
}
public class Test08 {
	public static void main(String[] args) {
	
		int x = 7;
		int y = x; // 값 7이 저장
		MyDate08 d = new MyDate08();
		MyDate08 t = d; // t참조변수에 d객체주소를 대입함. 즉 t,d는 같은 객체주소를 가리킴
		
		System.out.println("x="+x+",y=" + y); // 7,7
		System.out.println(d.year+" 년 "+d.month+" 월 "+d.day+" 일"); // 2022년 6월 1일
		System.out.println(t.year+" 년 "+t.month+" 월 "+t.day+" 일"); // 2022년 6월 1일
		System.out.println("\n============================\n");
		 
		y= 10; // x변수값은 변경안됌.
		System.out.println("x="+x+",y="+y); // 7,10
		
		d.year = 2023; d.month = 6; d.day = 8;
		System.out.println(d.year+"/"+d.month+"/"+d.day); //2023/6/8
		System.out.println(t.year+"/"+t.month+"/"+t.day); //2023/6/8
								//t와d가 같은 객체주소를 공유해서 같은 값 가진다
		
	}

}
