package week03.day10;

public class ScoreTest {

	public static void main(String[] args) {
	 
		
		Score s = new Score();
		
		s.name="홍길동";
		s.kor=99;
		s.eng=88;
		s.avg   =  ( s.kor + s.eng) / 2.0;
		
		
		
		System.out.println(  s.name);
		System.out.println(  s.kor );
		System.out.println(  s.eng );
		System.out.println(  s.avg);
		
		

	}

}
