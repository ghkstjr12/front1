package week03.day12.상속_생성자;

public class Person {
	String name;
	String id;

	//매개변수가 있는 생성자
	public Person(String name,String id) {
		this.name= name;
		this.id= id;
		System.out.println("매개변수가 있는 생성자");
	}
	
	//기본 생성자
	public Person() {
		System.out.println("person 기본생성자");
	}
	public void printInfo() {
		System.out.println(name + "" + id);
	}
}
