package week03.day13.object;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private double avg;
	
	
	//
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcAvg(); // 이 코드는 new할 때만 평균을 한 번 구하고 끝 
	}
	
	public void calcAvg() {
		int sum = kor+eng;
		avg = sum/2.0;
	}
	
	public Score() {
		// TODO Auto-generated constructor stub
	}

	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	
	//
	
	@Override  // 오버라이드 하지 않으면 부모의 것이 상속되어 출력된다. Score의 부모는 Object(상속받지 않는 클래스들의 부모) 
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}
	
	
	
}
