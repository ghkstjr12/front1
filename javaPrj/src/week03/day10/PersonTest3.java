package week03.day10;

public class PersonTest3 {

	public static void main(String[] args) {
		//
		
		Person2 p = new Person2();
		/*
		p.age=40;
		p.name="james";
		p.child=3;
		p.isMarried=true;
		
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.equals(p));
		System.out.println(p.isMarried);
  */
		p.input(40, "이름", true, 3);
		p.printInfo();
		
	
	}

}
