import java.util.HashMap;

/* 문제) 11장. 클래스와 객체.pdf의 no.14페이지
 */

class Product{
	
	private String name;
	private int price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class Ex11_02 {

	public static void main(String[] args) {
		/*
		 * 1.속성으로 자판기에서 취급하는 제
			품의 정보,가격을 저장하는 변수
			와 이를 다루기 위한 메서드를 갖
			는 자판기 클래스를 선언하고 다
			음과 같은 결과가 나오도록 객체
			(p) 생성 후 메소드를 호출하시오.
			(Ex11_02.java) 
			출력: 자판기 => 제품목록:
			커피 150원, 
			비타500 500원
		 */
		
		
		Product p = new Product(); // p객체 생성
		p.setName("커피"); p.setPrice(150);
		System.out.println("출력:자판기 => 제품목록");
		System.out.println(p.getName()+"\t"+p.getPrice()+"원,");
		
	
		p.setName("비타500"); p.setPrice(500);
		System.out.println(p.getName()+"\t" + p.getPrice()+"원,");
		
		
		
		
		

	}

}
