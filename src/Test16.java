import java.util.Scanner;

// 이중 반복문을 
// 완전히 중단하기 위한 실습
public class Test16 {
	public static void main(String[] args) {
	
		int menu = 0;
		int num = 0;
		
		Scanner scan = new Scanner(System.in);
		
		outer_while://이중 반복문 중단하기 위한 임의의 레이블명 지정
			while(true) {// 무한루프문
				System.out.println("\n1- 비빔밥");
				System.out.println("2- 고등어 자반");
				System.out.println("3- 오징어 볶음");
				System.out.print("원하는 메뉴 (1~3)를 선택하세요. 종료는 0>> ");
				
				String tmp = scan.nextLine(); // 문자열로 입력받음
				menu = Integer.parseInt(tmp); // 입력받은 문자를 정수숫자로 변경
				
				if(menu == 0) {
					System.out.println("메뉴판 프로그램을 종료합니다");
					break; //while 반복문 중단
				}else if(!(1<= menu && menu <=3)) {
					System.out.println("메뉴를 잘못 선택했습니다. 종료는 0");
					continue; // 아래쪽문장을 실행안함
					
				}//if else if
				
				for(;;) { //for무한루프문
					System.out.print("\n음식 계산할 값을 입력(계산 종료는 0, 전체종료는 99)>>");
					num = Integer.parseInt(scan.nextLine());//입력받은 문잘르 정수숫자로 변경
				
					if(num == 0) {
						break; // for반복문 종료 => 계산종료
					}
					
					if(num == 99) {
						System.out.println("메뉴시스템 전체종료!");
						break outer_while; // 전체종료 => for반복문, while 반복문 모두 종료
					}
					
					switch(menu) {
					case 1:
						System.out.println("비빔밥값 = " + num);
						break;
					case 2:
						System.out.println("고등어자반값 = "+ num*2);
						break;
					case 3:
						System.out.println("오징어볶음값 = "+ (num*3));
						break;
					}
					break;		
				}
				//for 

		}//while
		
	}
}
