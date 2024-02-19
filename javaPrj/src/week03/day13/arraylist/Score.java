package week03.day13.arraylist;

public class Score {
	String name;
	int kor;
	int eng;
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override 
	public String toString() { //생성된 객체의 정보를 반환 (하나씩 꺼내고 싶으면 게터, 세터)
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}
	

	public void printInfo() {
		System.out.println( name + kor + " " + eng );  //업캐스팅하면 쓸 수 없다. toString은 사용 가능 
	}
	
}
