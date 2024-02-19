package day11다른사람;

public class Book {
	String 제목;
	String 작가;
	String 출판사;
	double 평점;
	
	// 기본 생성자
	public Book() {		
	}
	
	
	public Book(String 제목, String 작가, String 출판사, double 평점) {
		this.제목 = 제목;
		this.작가 = 작가;
		this.출판사 = 출판사;
		this.평점 = 평점;
	}
	
	//출력 메서드
	public void print(Book this) {
		System.out.println("제목 : "+this.제목);
		System.out.println("작가 : "+this.작가);
		System.out.println("출판사 : "+this.출판사);
		System.out.println("평점 : "+this.평점);
	}
}



