package day10문제;

public class BandMember {
	private String name; // 이름
	private int age; // 나이
	private String addr; // 주소
	
	private String position; // 다룰 수 있는 악기 (드럼, 피아노 등)
	private String style; // 연주 스타일 (재즈, 클래식, 힙합)
	private int career; // 경력(년) (1, 2) 
	
	
	
	
	//생성자
	public BandMember(String name, int age, String addr, String position, String style, int career) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		
		this.position = position;
		this.style = style;
		this.career = career;
	}
	
	public BandMember() {
	}
	
	public void printInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("주소 : " + this.addr);
		
		System.out.println("다룰 수 있는 악기 : " + this.position);
		System.out.println("연주 스타일 : " + this.style);
		System.out.println("경력(년) : " + this.career);
		
		System.out.println("===============");
		
	}
}
