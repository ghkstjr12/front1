package week03.day11.스태틱변수;

public class Score {

	String name;
	int kor;
	int eng;
	double avg;
	String teacher;
	static int cnt=0;
	
	
	//기본생성자
	public Score() {
		/* this.name="아무개";
		this.kor=10;
		this.eng=20;
		this.avg= (this.kor + this.eng)/2.0; */
		this("아무개",10,10,"우주연");
	}
	public Score(String name,int kor,int eng, String teacher) {
		this.name= name;
		this.kor = kor;
		this.eng=eng;
		this.avg = (this.kor + this.eng)/2.0;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(avg);
		System.out.println(teacher);
		
	}
	
	public static void printTitle() {
		System.out.println("++++++++++++++++++++");
		System.out.println("+++++++++++++성적표++++++");
		System.out.println("+++++++++++++++++++++++");
	}
}
