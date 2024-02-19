package week03.day11.스태틱변수;

public class 변수정리 {

	public static void main(String[] args) {
		//지역변수 :stack:함수반환되면 자동해제 :함수안에서 만들어진 변수
		//멤버변수(인스턴트변수) :heep : 참조를 잃었을 때
		//static변수 :static :시작 ->종료
		
		int a =10;
		
		Customer c = new Customer("t001","0000","홍길동"); //객체,인스턴트가 생성됨
		Customer c2 = new Customer("a001","1234","김길동");
		
		String result = c.toString();
		System.out.println(result);
		
		System.out.println(c2.toString());

	}

}
