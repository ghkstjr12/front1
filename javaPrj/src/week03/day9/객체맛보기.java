package week03.day9;

public class 객체맛보기 {

	public static void main(String[] args) {
		// 고객정보
		//고객정보 (이름, 전화번호,주소) => 고객정보를 담을 수 있는 변수를 만들고 프로그래밍을 하는 역할
		
		
		//상자
		//밥그릇 =>변수 한개
		//구조가 있는 상자
		//구조가 있는 그릇(식판)
		
		//구조가 있는 변수를 만들기 위한 타입(자료형)을 class를 이용해서 자료형 만들어서 사용합니다.
		//사용자정의 자료형 =>자바는 class라는 문법으로 제공함
		
		String 이름="홍길동";
		String 전화번호="010-1111-2222";
		String 주소="서울시";
		
		//변수만들기
		Customer c = new Customer();
		
		//기억,이용
		//구조체변수
		c.이름="홍길동";
		c.전화번호="010=1111=2222";
		c.주소="서울시";
		
		
		//이용
		System.out.println(c.이름);
		System.out.println(c.전화번호);
		System.out.println(c.주소);
	}

}
