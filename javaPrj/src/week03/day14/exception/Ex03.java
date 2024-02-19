package week03.day14.exception;

public class Ex03 {

	public static void main(String[] args) {
		Object o = new A(); //상속관계에서 upcasting 
		
		try {
		((A)o).놀기();
		
		((B)o).공부하기(); //잘못된 다운캐스팅
	}catch(Exception e ) { 
		System.out.println(e.getMessage());
		System.out.println("형변환 문제");
	}
		System.out.println("프로그램 정상 종료");
	}

}
