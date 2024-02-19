package week03.day10;

public class ScoreTest2 {

	public static void main(String[] args) {
		
		//static 이 붙지않는 메서드를 사용하는 방법
		//1. 객체를 생성한다. Score2 s= new Score2();
		//2. 객체.매서드이름();
		
		
		Score2 s = new Score2();

		
		s.input("홍길동", 99, 88);
		s.printInfo();
		s.calcAvg();
		s.printInfo();
	}

}
