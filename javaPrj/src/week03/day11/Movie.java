package week03.day11;

public class Movie {
	
	//기본 Type
	String 영화제목;
	String 감독;
	String 상영날짜;
	String 배우;
	String 장르;
	String 상영시간;
	String 평점;
	
	//기본 생성자
	public Movie() {
	}
	
	//입력
	public void input(String 영화제목, String 감독, String 상영날짜, String 배우, String 장르, String 상영시간, String 평점) {
		this.영화제목=영화제목;
		this.감독=감독;
		this.상영날짜=상영날짜;
		this.배우=배우;
		this.장르=장르;
		this.상영시간=상영시간;
		this.평점=평점;
	}
	
	//매개변수 생성자
	public Movie(String 영화제목, String 감독, String 상영날짜, String 배우, String 장르, String 상영시간, String 평점) {
		this.영화제목=영화제목;
		this.감독=감독;
		this.상영날짜=상영날짜;
		this.배우=배우;
		this.장르=장르;
		this.상영시간=상영시간;
		this.평점=평점;		
	}
	
	
	//출력
	public void print() {
		System.out.println("영화:"+영화제목+" ");
		System.out.print(감독+" ");
		System.out.print(상영날짜+" ");
		System.out.print(배우+" ");
		System.out.print(장르+" ");
		System.out.print(상영시간+" ");
		System.out.print(평점+" ");
		System.out.println(" ");
		System.out.println(" ");
	}
	
}

