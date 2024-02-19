package day11다른사람;


public class 스테틱함수 {
	public static void main(String[] args) {
		//객체 생성
		Player S = new Player("손흥민", 40, 100, 130, 50, 100);
		
		//메소드 사용(객체생성 안하면 사용 불가)
		S.printInfo();
		
		//스테틱 메소드 사용
		Player.StaticTest();
		
		//스테틱 메소드 사용
		Player.printInfo2("아무개", 40, 100, 130, 50, 100);
	}
}
