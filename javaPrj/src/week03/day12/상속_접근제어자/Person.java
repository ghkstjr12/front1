package week03.day12.상속_접근제어자;

public class Person {
	 private String name;
	 private String id;

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
	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
}
