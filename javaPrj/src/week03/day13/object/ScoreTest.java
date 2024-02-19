package week03.day13.object;

public class ScoreTest {

	public static void main(String[] args) {
		

		Score s= new Score("홍길동",100,99);
		
		// 오버라이드 toString이 없으면 부모(여기서는 Object)의 toString이 출력된다. 
		System.out.println(s.toString());  
		System.out.println(s);

		// getter로 각 항목(필드) 정보 출력하기 
		System.out.println(s.getAvg());
		System.out.println(s.getName());
		System.out.println(s.getEng());
		
		// setter로 각 항목(필드) 정보 변경하기  
		s.setName("홍길순");
		s.setKor(97);
		s.setEng(100);
		
		s.calcAvg();
		System.out.println(s.getAvg());
		System.out.println(s);
	}

}
