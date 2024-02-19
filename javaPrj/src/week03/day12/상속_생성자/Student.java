package week03.day12.상속_생성자;

public class Student extends Person {
	
	int classNo;
	
	//생성자
	
	//상속관계에서 자식의 생성자에서 기본적으로 (무조건) 부모의 기본생성자를 호출합니다.
	//자식의 생성자 맨 첫줄에서..
	//자식의 생성자가 호출되면 부모의 생성자(기본생성자)를 호출하는 코드 자동으로 추가된다.
		public Student(){
		
		}
		
		public Student(String name, String id, int classNo) {
			/* this.name= name;
			this.id= id;
			
			*/
			//부모의 생성자 호출방법 super()키워드 사용
			super(name,id); //부모의 생성자 중에서 매겨변수 있는 생성자 호출하는 코드
			this.classNo=classNo;
		}
		//정보출력
		
		public void print() {
			System.out.println(name + "" + id + " "+ classNo);
			
		}
		
}
