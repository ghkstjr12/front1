package week03.day10;

public class Score2 {

	private String name;
	private int kor;
	private int eng;
	private double avg;
	//입력
	public void input(String name, int kor ,int eng) {
		this.name = name;
		this.kor=kor;
		this.eng= eng;
	}
	//출력
	public void printInfo() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(avg);
	}
	//평균을 구하는 기능
	public void calcAvg() {
		int sum= kor+eng;
		avg = sum/2.0;
	}
}
