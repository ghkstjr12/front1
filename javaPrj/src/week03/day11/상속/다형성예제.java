package week03.day11.상속;

public class 다형성예제 {

	public static void main(String[] args) {
		// 학생은 사람이다
		// StudentWorker는 Person이다
		// Reserarcher는 Person이다
		// Professor는 Person이다.
		
		
		Person s1 =new Student();
		s1.먹기();
		Person s2 = new StudentWorker();
		s2.먹기();
		Person s3 = new Resercher();
		s3.먹기();
		Person s4 = new Professor();
		s4.먹기();
		
		//상속관계에서 자식의 객체를 부모형으로 다룰 수 있다. 부모형 참조형 변수에 저장할 수 있다.
		//아래와 같은 표현이 가능하다
		//왜?
		//자료형 ->해석의 도구
		//업캐스팅이라고 부른다(upcasting)
		Person p =new Student();
		Person p2 = new StudentWorker();
		Person p3 = new Resercher();
		Person p4 = new Professor();
		
		
		Person[] persons = new Person[4];
		persons[0] = new Student();
		persons[1] = new StudentWorker();
		persons[2] = new Resercher();
		persons[3] = new Professor();
		
		for (int i=0; i<persons.length; i++) {
			persons[i].먹기();
		}
		//
		
	}

}
