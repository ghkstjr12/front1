package week03.day11.스태틱변수;

public class ScoreTest {

	public static void main(String[] args) {
		Score s = new Score("유원준", 100 , 100 , "우주연");
		s.printInfo();
		Score s2 = new Score("장유니", 99 , 100 , "우주연");
		s2.printInfo();
		Score s3 = new Score("유원준", 99 , 100 , "우주연");
		s3.printInfo();
		
		int result = Score.cnt;
		System.out.println(result);
	}

}
