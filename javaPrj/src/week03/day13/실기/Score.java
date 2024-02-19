package week03.day13.실기;

public class Score { //문제9

	String name;
	int kor;
	int eng;
	double avg;
	char grade;
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		calcAvg();
		calcGrade();
	}

	public void calcAvg() {
		int sum= kor+ eng;
		avg = sum/2.0;
	}
	
	public void calcGrade() {
		
		if(avg>=90) {
			grade='A';
		}else if(avg>=80) {
			grade='B';
		}else if(avg>=70) {
			grade='C';
		}else {
			grade='F';
		}
		
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", grade=" + grade + "]";
	}
	
	
}
