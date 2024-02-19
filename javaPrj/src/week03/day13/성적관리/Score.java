package week03.day13.성적관리;


//틀(붕어빵틀)
public class Score {
	private String name;
	private int kor;
	private int eng;
	private double avg;
	private char grade;
	
	//기본생성자는 선택사항 
	public Score() {
		// TODO Auto-generated constructor stub
	}
	
	//값의 초기화 => 생성자 
	public Score(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
	}
	
	private void calcAvg() {  // 이 클래스내에서만 사용하도록 private 
		int sum = kor+eng;
		avg = sum/2.0;
	}
	
	
	public void calcGrade() {
		/*
		//평균구한다
		//A, B, C, D
		int sum = kor+eng;
		avg = sum/2.0;
		*/
		
		calcAvg();
		if(avg>=90) {
			grade='A';
		}else if(avg>=80) {
			grade='B';
		}else if(avg>=80) {
			grade='C';
		}else {
			grade='F';
		}
		
	}
	
	// 멤버변수의 값을 가져오거나, 변경할 수 있는 메소드를 제공할 수 있다. 
	// 쎄터 setter, 게터 getter 역할을 하는 메소드를 만들어 사용할 수 있다. 
	// => 규칙을 가지고 만든다 
	public void setName(String name) { //세터 이름 규칙 => set대문자첫글자
		this.name = name;
	}
	
	public String getName() { //반환값 String 
		return name;
	}
	
	public void printInfo() {
		System.out.println(name+ " " + kor+ " " + eng+ " " +avg+ " " +grade);
	}
	
	
}
