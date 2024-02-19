package week01.day5;

public class 상수와리터럴 {

	public static void main(String[] args) {
		
		
		//상수
		int a=10;
		a=5; //변수 : 다른값으로 변경 가능
		
		final int MAX =10; //가독성, 유지보수성 
		
		//리터널 (상수라고도 부름, 값자체!!)
		//리터널도 크기를 갖는다.
		int b=20; //b라는 변수(공간 확보),20 (값도) 저장되어서 사용됨
		//상수영역이 따로 존재함
		// 정수형-> int 
		// 실수형 ->double
		
		int amount = 2100000000;//21억
		//long amount2 = 220000000;
		//=> 상수영역에 22억이 저장될 때 문제가 발생하는 경우
		// (정수는 상수역역에 저장될 때 int 형 크기이므로 22억이 저장이 안되고 있음)
		
		long amount2 = 22000000l; //long형 상수임을 알리는 L을 붙여야함
		// 상수영역이 22억이 long 형으로 저장됨
	}

}
