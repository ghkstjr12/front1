package week03.day11.패키지;

public class C {

	public static void main(String[] args) {
		
		//A클래스의 매서드1()가 default접근을 가지고 잇ㄷ면
		//같은 폴더(패키지)안에 있는 클래스들은 접근할 수 있다.사용할 수 있다
		//다른 패키지에서만 사용할 수 없다.
		A a =new A();
		a.매서드1();

	}

}
