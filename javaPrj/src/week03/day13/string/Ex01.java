package week03.day13.string;

public class Ex01 {

	public static void main(String[] args) {
		
		String str = "자바는 객체지향언어다. class(캡슐화), 상속, 오버라이드, 다형성";
		
		
		// 다형성
		// 하나의 메시지 -> 다르게 동작하는 것 
		
		//19명의 학생
		//학생 -> 춤추세요(); // 각기 다른 춤을 추는 동작을 볼 수 있다. 
		
		//문자열 => 문자집합, 문자배열 
		//자바는 String클래스 제공함 
		char result = str.charAt(0);
		char result2 = str.charAt(4);
		System.out.println(result);
		System.out.println(result2);
		
		
		Object o = str; // 업캐스팅 //우리가 만든 클래스가 아니어도 Object 상속됨 
		
		int count = ((String)o).length(); //다운캐스팅 
		System.out.println(count);
		
	}

}
