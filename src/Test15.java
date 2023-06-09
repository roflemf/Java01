
public class Test15 {
	public static void main(String[] args) {
		int i;
		int a; // 반복문 제어변수
		
		for(a =1; a<=5; a++) {
			for(i=1; i<=5; i++) {
				if(i % 3 == 0) {
					break; // 맨 안쪽 for 반복문만 중단
				}
				System.out.println("\ti->"+ i);
			}//inner for
			System.out.println("\n a->" + a);
		}//outer for
		System.out.println("\n====================>\n");
		
		exit_for: //바깥 for 반복문까지 완전히 중단하기 위한 임의의 레이블명 (이름 붙는 반복문)을 줌
			for(a=1;a<=3;a++) {
				for(i=1;i<=3;i++) {
					if(i%3==0) {
						break exit_for;  // 안쪽, 바깥쪽 반복문까지 모두 중단
						
					}
					System.out.print("\t i->" + i);
				}//inner for
				System.out.println("\n a->" + a);
			}//outer for
	}

}
