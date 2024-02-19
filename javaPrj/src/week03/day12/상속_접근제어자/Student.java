package week03.day12.상속_접근제어자;

public class Student extends Person {
	
	int classNo;
	

		public Student(){
		}
		
		public Student(String name, String id, int classNo) {
			super(name,id); 
			this.classNo=classNo;
		}
	
		
		public void print() {
			System.out.println(getName() + "" + getId() + " "+ classNo);
			
		}
		
}
