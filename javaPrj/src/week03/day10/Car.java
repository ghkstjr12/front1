package week03.day10;

//자동차정보를 담을 수 있는 자료형 정의
public class Car {
	//멤버변수
	private String 이름;
	private String 제조사;
	private int price;
	
	
	//입력
	public void input (String 이름, String 제조사,int price) {
		this.이름=이름;
		this.제조사=제조사;
		this.price=price;
	}
	//출력
	public void printInfo() {
		System.out.println(this.이름);
		System.out.println(제조사);
		System.out.println(this.price);
	}
}
