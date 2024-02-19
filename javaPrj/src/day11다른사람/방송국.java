package day11다른사람;

public class 방송국 {
	//타입
	String 이름;
	String 대표;
	String 창립;
	String 프로그램;
	
	//생성자
	public 방송국() {
		
	}
	//생성자
	public 방송국(String 이름,String 대표, String 창립, String 프로그램) {
		this.이름=이름;
		this.대표=대표;
		this.창립=창립;
		this.프로그램=프로그램;
	}
	//출력
	public void printInfo(방송국 this) {
		System.out.println("회사명: "+this.이름);
		System.out.println("대표: "+this.대표);
		System.out.println("창립일: "+this.창립);
		System.out.println("프로그램: "+this.프로그램);
		System.out.println();
	}
	
}
